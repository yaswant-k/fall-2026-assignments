# Exercise 8 verification note

IS 472, Yaswant Kakarla, Prof. Sreedevi Sampath. Draft, November 12, 2026.

## How this was done

Method: read the Ex 8 handout (`coding_exercise_8_Logging.pdf`) and
`LoggerExample.java` line by line, then wrote the smallest set of code
blocks that carries out handout parts 2 to 5 exactly as written. Nothing
was taken from any other source. The BankingApplication source lives on
Yaswant's Mac, which is offline, so no block was checked against
`UiService.java` itself. Each place where the real source must supply a
name, flag, or message is marked VERIFY-AGAINST-SOURCE in the snippet
file and listed below.

Sources:

- `browser_downloads/sess-2839738408/browser-download-20261112T152753.408040867Z-2-coding_exercise_8_Logging.pdf`
- `browser_downloads/sess-2839738408/browser-download-20261112T152803.158870668Z-3-LoggerExample.java`
- `your_files/is472-ex8-ex11-complete-guide-2026-11-12.md`, Part B (prior
  guide; built on, not redone)
- `is472-chronological-program/ex7/UiServiceEx7Additions.java` and
  `is472-chronological-program/ex7/MaliciousInputException.java` (the
  program's own Exercise 7 drafts, used for the mode flag, the
  exception getters, and the catch sites; both are themselves
  unverified against the real source)

## Checked against the handout and LoggerExample

- Imports: `java.io.IOException` and `java.util.logging.*` are the two
  imports LoggerExample uses that UiService needs. LoggerExample's
  `java.util.Scanner` import is deliberately not copied; it serves the
  example's demo loop only.
- Logger field: `Logger.getLogger(UiService.class.getName())`, with
  UiService substituted for LoggerExample, placed after the class header
  and before the instance variables, as the handout instructs.
- Constructor setup: `setUseParentHandlers(false)`, the `fileHandler`
  declaration, the first try/catch/finally, and the `LOGGER.info`
  statement are copied from LoggerExample. The try block keeps the
  example's `FileHandler("./IS472.log")`, `SimpleFormatter`,
  `addHandler`, `setLevel(Level.ALL)`, `config("Configuration done.")`,
  and `log(Level.FINE, "Finer logged")` lines, and the catch keeps the
  example's SEVERE log of "Error occur in FileHandler." with the
  exception attached.
- Part 4 rule: developer mode logs the developer error message and the
  input string to the file and prints both to the terminal; user mode
  prints only the user error message to the terminal and logs nothing.
  The helper implements exactly that split.
- 5W-H format: each log record carries Who (user id), What (ERROR),
  Where (class and method), When (timestamp added by the logger),
  Why (developer error message), and How (the rejected input string).
- Log level for the malicious input record is SEVERE, matching the
  level LoggerExample uses for caught exceptions. The handout does not
  name a level for this record; the choice is recorded here as a
  decision, not as a handout requirement.
- No log output goes to the console through parent handlers, because
  `setUseParentHandlers(false)` is in the constructor setup.
- The tag name is `Ex8submitted`, lowercase `submitted`, as the
  handout states. It differs from Exercise 11's `Ex11Submitted`.

## Key decisions

- Duplicate handler guard: a static `logHandlerAdded` flag keeps the
  FileHandler setup to the first construction. LoggerExample runs once
  from `main`, so it never faces a second construction; UiService can be
  constructed more than once in one JVM (tests construct it repeatedly),
  and each extra FileHandler would duplicate every record. This guard is
  a draft addition, not a handout instruction, and it is flagged as such
  in the snippet file.
- The log path stays `./IS472.log`, copied unchanged. The handout says
  the file should appear in `src/main/java`; that holds only if the
  working directory at run time is the project root in the layout the
  handout assumes. If the file appears elsewhere, the working directory
  is the cause, not the code.
- The raw input string is logged only in developer mode, at SEVERE, to
  the file, as the handout instructs. The handout also warns that
  sensitive data logged during development must be marked DEBUG or TRACE
  and must not be visible in production. An input string can be a
  password, so this logging must never be enabled in user mode and the
  log file must not leave the development machine.
- The catch sites are not enumerated from the handout, because the
  handout does not list them. The program's Exercise 7 draft places
  the `cleanseInput2` calls in `initialLogin` and `authenticateAdmin`
  (per the Ex 4 flow chart). Block 5 gives the shape for those sites;
  every catch of the malicious input exception in UiService.java must
  be confirmed in the source and updated. The logging block does not
  replace the rest of the catch body: the Ex 7 draft exits the program
  there, and that behavior is left untouched by this draft.

## VERIFY-AGAINST-SOURCE (must be resolved from UiService.java)

1. Developer/user mode: the flag is `DEVELOPER_MODE`, taken from the
   program's Exercise 7 draft, where true is developer mode and false
   is user mode. That draft is itself unverified against UiService.java,
   so confirm the flag exists with that name and meaning in the real
   source. The Ex 8 handout and LoggerExample name no mode flag.
2. Developer and user error message wording and the input string: the
   draft reads them from the exception via `getDeveloperErrorMessage`,
   `getUserErrorMessage`, and `getInputString`, per the program's
   Exercise 7 exception draft. Confirm those getters and their wording
   against the real exception class. Note the starter UiServiceTest
   imports the exception from `swsec.bank.exceptions` while the Ex 7
   draft declares it in package `exceptions`; that package difference
   is also unresolved until the source is read.
3. User id lookup for the Who field: the handout names the instance
   variables `thisCust`, `thisAcct`, and others but gives no getter.
   `currentUserId` currently returns "unknown".
4. Every catch site for the malicious input exception, the enclosing
   method name for each, and the input variable at each site. The
   program's Exercise 7 draft names `initialLogin` and
   `authenticateAdmin` as the `cleanseInput2` call sites, per the Ex 4
   flow chart; confirm both in the source and check for any further
   catch sites.
5. That the UiService constructor is still empty, as the handout
   states. If it is not, the Block 3 statements must be merged with
   what is already there instead of pasted into an empty body.

## Not checked

- Nothing was compiled or run. The BankingApplication source, the
  `pom.xml`, and Maven are all on Yaswant's Mac.
- `IS472.log` was not created or inspected here; that check waits for a
  run on his machine.
- Exercise 8 Part 1 (group log design) is not covered by these files.
- Nothing was committed, tagged, or pushed. The `Ex8submitted` tag
  step belongs to Yaswant, after the run check passes.
