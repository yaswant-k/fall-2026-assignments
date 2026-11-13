# Exercise 8, Logging: apply notes

IS 472, Yaswant Kakarla, Prof. Sreedevi Sampath. Draft, November 12, 2026.

## Files here

- `UiService-logging-snippets.java`: the code blocks to insert into
  `UiService.java`, in apply order. It is a commented snippet file, not a
  compilable class.
- `ex8-verification.md`: what was checked against the handout and
  LoggerExample, and every item that still needs the real source.
- This file: how to apply the snippets.

## Apply order

Work in the `BankingApplication` folder, not `BankingApplicationInitial`.
The target file is `src/main/java/swsec/bank/services/UiService.java`.

1. Block 1: add the imports (`java.io.IOException`,
   `java.util.logging.*`) at the beginning of `UiService.java`.
2. Block 2: add the logger field just after the class header, before the
   instance variables (`thisCust`, `thisAcct`, and others).
3. Block 3a and 3b: add the guard field at class level, then put the
   setup statements inside the UiService constructor.
4. Block 4: add the `handleMaliciousInput` helper and the
   `currentUserId` helper. Resolve every VERIFY-AGAINST-SOURCE marker
   in Block 4 before compiling: the `DEVELOPER_MODE` flag and the
   exception getters come from the program's Exercise 7 drafts, which
   are themselves unverified against the real source, and the user id
   lookup has no source at all yet.
5. Block 5: find every place that catches the malicious input
   exception and replace the catch body with the call shown. Pass the
   real input variable and the real enclosing method name at each site.
6. Compile and run. Check that `IS472.log` is created and holds the
   developer error messages. In developer mode the terminal should also
   show the developer message and the input string. In user mode the
   terminal should show only the user error message.
7. Only when the run check passes: commit, tag `Ex8submitted`
   (lowercase `submitted`, no capital S), and push. Tagging and pushing
   are Yaswant's steps, from his machine.

## Out of scope for this draft

- Part 1 of Exercise 8 is a group exercise: one scenario, four
  questions, a shared Google Doc with all group member names, submitted
  as a link on Blackboard. Groups are formed by the professor. Nothing
  in this folder covers Part 1, and no group members are invented here.
- Nothing here is submitted or uploaded by Muse. These are files only.
