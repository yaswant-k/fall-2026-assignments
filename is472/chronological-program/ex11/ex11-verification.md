# Exercise 11 verification note

IS 472, Yaswant Kakarla, Prof. Sreedevi Sampath. Draft, November 12, 2026.

## How this was done

Method: read the Ex 10-11 JUnit deck (`exercise10-11-JUnit.pdf`), the two
instructor starter files, and the exception-pattern file, then read the
Exercise 10 plan (`IS472_Ex10_Test_Plan_Yaswant_Kakarla.docx`) case by
case and wrote one `@Test` method per case, following the starter files'
conventions. The BankingApplication source lives on Yaswant's Mac, which
is offline, so no test was checked against `UiService.java`,
`CustomerController.java`, or `AccountRepository.java` itself. Every
place where the real source must supply a signature, name, or behavior
is marked VERIFY-AGAINST-SOURCE in the code and listed below. Cases with
no defined outcome are written as `@Ignore` methods with no assert,
rather than as guesses.

Sources:

- `browser_downloads/sess-2839738408/browser-download-20261112T140340.962862113Z-0-exercise10-11-JUnit.pdf`
- `browser_downloads/sess-2839738408/browser-download-20261112T152909.527001821Z-7-UiServiceTest.java`
- `browser_downloads/sess-2839738408/browser-download-20261112T152920.276654687Z-8-AccountRepositoryTest.java`
- `browser_downloads/sess-2839738408/browser-download-20261112T152928.167015554Z-9-testcaseforamethod-thatthrowsexception.txt`
- `your_files/IS472_Ex10_Test_Plan_Yaswant_Kakarla.docx` (the authority
  for every expected value)
- `your_files/is472-ex8-ex11-complete-guide-2026-11-12.md`, Part A (prior
  guide; built on, not redone)

## Checked against the handouts and the plan

- AccountRepositoryTest: copied verbatim from the Blackboard file,
  including its package, imports, test body, and empty catch/finally
  blocks. Verified byte for byte in structure against the source file
  read on November 12. The only addition is a header comment stating it
  is the instructor file unchanged.
- UiServiceTest: the instructor example `testIsBlackList` is kept
  unchanged, including the commented out `assertTrue` alternative.
  Package, imports, and the MaliciousInputException import warning are
  as delivered.
- BL-01 to BL-16: inputs and expected booleans match the plan table
  exactly. BL-11 uses the string `"*[]#$"`, all five blacklist
  characters together. BL-13 uses `"abc<def"`, BL-14 uses
  `"pass(word)"`, both expected false as non-members of the set.
  BL-16 builds 500 `a` characters plus a trailing `$` with a loop, so
  it does not depend on a Java version newer than the project's.
- MW-01 to MW-04, MW-06, MW-07: amounts and expected balances match
  the plan table exactly (0.00 stays 100.00; 0.01 gives 99.99; 50.00
  gives 50.00; 99.99 gives 0.01; 100.01 and 200.00 throw
  InsufficientFundsException with the balance unchanged).
- Fixture: `@Before setUp` rebuilds the 100.00 balance account before
  each test, as the plan requires. No test depends on state left by an
  earlier test.
- Amounts use `(float)` literals and asserts use a delta of 0,
  matching the instructor's AccountRepositoryTest. Float is the
  project's balance type in the examples given.
- JUnit 4 conventions from the deck: `org.junit.Assert` and `@Test`,
  test class named after the class under test plus `Test`, one test
  method per test case, `@Before` for fixture setup.
- Placement paths and commands follow the deck: `mkdir -p
  test/java/swsec/bank/services/repositories`, the three target folders
  under `src/test/java/swsec/bank`, `mvn install` from the `pom.xml`
  directory, and the tag `Ex11Submitted` with a capital S.

## Key decisions

- Exception cases: MW-06 and MW-07 use try/catch with `fail()` so the
  test checks both the exception and the unchanged balance in one
  method. The `@Test(expected = ...)` form from the Blackboard file
  cannot also assert the balance, because code after the throwing call
  never runs. MW-06b and MW-07b keep the taught annotation form on
  record for the same cases.
- Ignored, not guessed: BL-15, MW-05, MW-08, MW-09, and MW-10 are
  `@Ignore` methods with no assert. Each carries a
  VERIFY-AGAINST-SOURCE note stating what must be confirmed and what
  the assert should be once it is. An ignored test that contains a
  guessed assert would pass or fail on invented evidence; these contain
  none.
- MW-10 candidate values are recorded only in comments and in this
  note, not as an assert: the plan's stored amount and resulting balance
  are unknown until the source is read, and (float) 10.005 is not exact
  in binary, so any assert needs a delta chosen from the real stored
  value.
- The empty catch in AccountRepositoryTest is the instructor's and is
  kept, per the part 1 instruction to copy the file. No new test in
  this delivery uses an empty catch.
- No test method declares a throws clause it does not need. The
  MW-01 to MW-05 and MW-10 methods declare
  `throws InsufficientFundsException` because the plan states
  makeWithdrawal throws it; if the exception is unchecked in the
  source, the clause is harmless but should be removed for tidiness.

## VERIFY-AGAINST-SOURCE (must be resolved from the source)

1. `isBlackList` spelling in UiService.java: `isBlackList` versus
   `isBlacklist`. The tests call `isBlackList`, matching the starter
   file. If the source spells it differently, change every call.
2. Exception class name in the UiServiceTest import: the starter file
   itself warns the name must be changed if a different name was used
   in Exercise 7. Confirm `swsec.bank.exceptions.MaliciousInputException`.
   Note a conflict: the program's Exercise 7 draft declares the
   exception in package `exceptions` (`import
   exceptions.MaliciousInputException`), while the starter test imports
   it from `swsec.bank.exceptions`. Only the real source settles which
   package is correct.
3. BL-15 null input: what `isBlackList(null)` does. Returns false,
   returns true, or throws. Remove `@Ignore` and write the assert only
   after this is read from the source.
4. CustomerController constructor: arguments, if any. The draft uses a
   no-argument construction as a placeholder in `setUp`.
5. `makeWithdrawal` signature: amount type (float or double), return
   type, and whether InsufficientFundsException is checked. The draft
   calls it with a (float) amount and declares the throws clause.
6. How the balance is read after a withdrawal: the draft reads it with
   `accountRepository.getBalance(ACCOUNT_ID)`, the read the
   instructor's test uses. If makeWithdrawal updates only the Account
   object, read it from the account instead.
7. `InsufficientFundsException` package: the draft imports it from
   `swsec.bank.exceptions`, by analogy with MaliciousInputException.
   Confirm the package and the class name.
8. MW-05 amount equal to balance: allowed with balance 0.00, or
   InsufficientFundsException with balance unchanged.
9. MW-08 and MW-09 negative amounts: the rejection mechanism. No
   exception is named for this case in any handout.
10. MW-10 rounding: how 10.005 is stored and what balance results.
11. Whether the `Account` constructor `new Account(1234, (float) 100)`
    and `getBalance(int)` behave in the test context exactly as in the
    instructor's AccountRepositoryTest. Both are taken from that file,
    not from the project source.

## Not checked

- Nothing was compiled or run. No `mvn install` was executed here:
  the source, `pom.xml`, and Maven are on Yaswant's Mac, and no JDK
  is installed in this environment, so `javac` was not available
  either. What was checked here: delimiter balance across the three
  test files (braces, parentheses, brackets all balance) and a
  line-by-line review. That covers shape only, not behavior against
  the real BankingApplication.
- The failing-change experiment from part 1 was not performed; it
  needs the real project and must be undone before moving on.
- One page of the JUnit deck (page 5) is an image page that text
  extraction could not read. The deck text covers parts 1 to 4 in full,
  and nothing in the extracted text refers to page 5 for an
  instruction, but its content was not verified.
- Nothing was committed, tagged, or pushed. The `Ex11Submitted` tag
  step belongs to Yaswant, after `mvn install` passes on his machine.
