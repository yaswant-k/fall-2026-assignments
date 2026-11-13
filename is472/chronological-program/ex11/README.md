# Exercise 11, JUnit coding: placement and run notes

IS 472, Yaswant Kakarla, Prof. Sreedevi Sampath. Draft, November 12, 2026.

## Files here

- `AccountRepositoryTest.java`: instructor starter file, unchanged.
  Part 1.
- `UiServiceTest.java`: instructor example test kept, plus BL-01 to BL-16
  from the Exercise 10 plan. Part 2.
- `CustomerControllerTest.java`: new file, MW-01 to MW-10 from the
  Exercise 10 plan. Part 3.
- `ex11-verification.md`: what was checked, key decisions, and every
  item that still needs the real source.
- This file: where the files go and how to run them.

## Placement

Work in the `BankingApplication` folder, not `BankingApplicationInitial`.
Target paths, from the deck:

- `src/test/java/swsec/bank/services/repositories/AccountRepositoryTest.java`
- `src/test/java/swsec/bank/services/UiServiceTest.java`
- `src/test/java/swsec/bank/controllers/CustomerControllerTest.java`

Create the folders first if they do not exist, for example
`mkdir -p test/java/swsec/bank/services/repositories` from the `src`
directory, and `mkdir controllers` from
`src/test/java/swsec/bank`.

## Before running

Resolve every VERIFY-AGAINST-SOURCE marker in `UiServiceTest.java` and
`CustomerControllerTest.java` against the real source. The blocking ones
are: the spelling of `isBlackList`, the exception class name in the
UiServiceTest import, the CustomerController constructor, the
makeWithdrawal signature and amount type, and how the balance is read
back. Five test methods are marked `@Ignore` until their source behavior
is confirmed: BL-15, MW-05, MW-08, MW-09, and MW-10. Do not remove an
`@Ignore` until its item is confirmed and its assert is written.

## Run

From the directory where `pom.xml` lives: `mvn install`. It compiles the
tests and runs them, and fails the build if any test does not pass.

Part 1 also asks for a deliberate failing change to AccountRepositoryTest
to see what failure looks like. Do that, watch it fail, then undo it
before moving on. No test is left deliberately failing.

## Finish

Only when `mvn install` passes with no compiler errors and every
non-ignored test passes: add, commit, tag `Ex11Submitted` (capital S),
and push. Confirm the tag is visible on the remote. Tagging, committing,
and pushing are Yaswant's steps, from his machine. Nothing here is
submitted or uploaded by Muse.
