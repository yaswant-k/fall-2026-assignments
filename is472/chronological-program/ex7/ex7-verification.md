# IS 472 Exercise 7: Verification Note

Student: Yaswant Kakarla. Course: IS 472 Software Security, Prof. Sreedevi Sampath, Fall 2026.
Date: Nov 12, 2026. Gradebook status: Ex 7 is 0/10, never submitted, 1 attempt left. No Blackboard rubric exists for any IS 472 item.
Deliverables: `MaliciousInputException.java` and `UiServiceEx7Additions.java` in `is472-chronological-program/ex7/`.
Nothing in this note was submitted or uploaded by Muse. Ex 10 was not touched. No browser work was done.

## Result

8 PASS, 7 FAIL, out of checklist items R1 to R15.

PASS means the delivered files contain code that satisfies the requirement as written in the handout. FAIL means the requirement needs his Mac source, a compile or run, or an action by him, or no evidence for it exists. A PASS here is not verification against his BankingApplication program. Final verification against his Mac source is still pending; see "How this was done".

## Requirement checks

| Item | Verdict | Evidence |
|---|---|---|
| R1. Read Ch9 pages 160 and 161 and the refresher reading on exception handling | FAIL | No evidence the reading was done. `fall2026-audit/extracted/Ch9.txt` was checked and contains only form-feed characters, no usable content, so pages 160 and 161 were not available in the workspace. Only Yaswant can do this reading. |
| R2. New Java class in a new file in the exceptions directory, application-specific exception for finding malicious input | PASS | `MaliciousInputException.java` is a new file. Line 5: `public class MaliciousInputException extends Exception`. The name is a free choice under Step 1, so the kept name is not a mismatch. Placement into his exceptions directory and confirmation that the name does not collide with an existing class are still pending Mac verification. |
| R3. Three instance variables: developer-error-message, user-error-message, inputString; inputString is also the constructor parameter | PASS | `MaliciousInputException.java` lines 7 to 9: `private String developerErrorMessage;`, `private String userErrorMessage;`, `private String inputString;`. Constructor parameter is `String inputString` (line 11). This fixes sketch defect V-Ex7-1, which had zero instance variables. |
| R4. Constructor calls super with NO parameters; reads the incoming parameter into inputString; assigns the developer message and the user message | PASS | `MaliciousInputException.java` lines 11 to 16: `super();` with no parameters on line 12; `this.inputString = inputString;` on line 13; developer message assigned on line 14; user message assigned on line 15. This fixes sketch defect V-Ex7-2, which called `super(message)`. |
| R5. Getters for all instance variables | PASS | `MaliciousInputException.java` lines 18 to 28: `getDeveloperErrorMessage()`, `getUserErrorMessage()`, `getInputString()`. The sketch had no getters. |
| R6. Compile the exception class after Step 1 and again after Step 2 | FAIL | No compilation was run. His source and build setup are on his Mac, which is offline. Only he can compile. |
| R7. In UiService: import the new exception class; define a constant indicating developer or user mode, any data type; set it to developer mode to start | PASS | `UiServiceEx7Additions.java` block 1: `import exceptions.MaliciousInputException;`. Block 2: `private static final boolean DEVELOPER_MODE = true;`. Boolean is a permitted data type under Step 3, and true is developer mode. This fixes sketch defect V-Ex7-3, which had a message constant instead of a mode constant. The real package must still be confirmed against his exceptions folder. |
| R8. cleanseInput2 calls isBlackList and detectSQLInjection like cleanseInput, throws the new exception instead of printing, return type void | PASS | `UiServiceEx7Additions.java` block 3: `public void cleanseInput2(String input) throws MaliciousInputException`, calls `isBlackList(input)` and `detectSQLInjection(input)`, throws `new MaliciousInputException(input)` when either returns true, and returns nothing. This fixes sketch defect V-Ex7-4, which declared boolean and returned false. |
| R9. In UiService, comment out the code where cleanseInput was called earlier, so it stays available for grading previous exercises | FAIL | The fragment shows the representative commented line `// cleanseInput(input);` in block 4, but his actual cleanseInput calls were not available and were not commented out. Whether those calls exist at all is undetermined: Ex 4 is 0/10 and never submitted. Only he can comment out his own calls. |
| R10. Add cleanseInput2 calls wherever cleanseInput was called; try/catch/finally; try holds the call; catch prints the developer or user message depending on the mode constant; finally can be empty but must be there | PASS | `UiServiceEx7Additions.java` block 4 contains the complete block as written: try holds `cleanseInput2(input)`; catch prints `getDeveloperErrorMessage()` when `DEVELOPER_MODE` is true and `getUserErrorMessage()` otherwise; an empty `finally` block is present. Installation at each of his actual call sites is still pending, since his call sites are on his Mac. |
| R11. The UiService program stops when malicious input is found and the exception is thrown | PASS | Block 4 catch prints the message and then calls `System.exit(1)`. The stop is therefore in the delivered code as written. It has not been run or tested. The handout names no stop mechanism; `System.exit(1)` in the catch is the chosen implementation, not a handout-specified mechanism. See "Undetermined". |
| R12. Compile UiService, then compile the entire application | FAIL | No compilation was run. His source is on his Mac. Only he can compile. |
| R13. Test with malicious input in developer mode: exception error messages printed and program exits | FAIL | No test was run. Testing also depends on his isBlackList (Ex 4) and detectSQLInjection (Ex 6), both unverified against his code. Only he can run this test. |
| R14. Change the mode constant to user mode and test again: the corresponding user error message is printed | FAIL | No test was run. The constant to change is `DEVELOPER_MODE` in block 2, set to false for user mode. The user message as written, "Invalid input. Please try again.", contains no parameter, attribute, database field, file, or method names, per the handout security rule. Only he can run this test. |
| R15. Tag the work "Ex7Submitted" and push it to the accessible repository | FAIL | No tag and no push were made. Only he can tag and push his own work. |

## Known sketch defects: fixed or not

| Sketch defect (from ex4-ex7-sketch-verification.md) | Status in the corrected files |
|---|---|
| V-Ex7-1: exception class had zero instance variables; constructor took a message parameter, not the input string | Fixed. Three String instance variables declared; constructor parameter is the input string, saved to inputString. |
| V-Ex7-2: constructor called super with a parameter | Fixed. Constructor calls `super();` with no parameters. |
| V-Ex7-3: message constant instead of a developer/user mode constant; guessed import package | Fixed in shape. A boolean mode constant `DEVELOPER_MODE = true` replaces the message constant, and the import line is present. The package `exceptions` is still the sketch guess and must be confirmed against his exceptions folder. |
| V-Ex7-4: cleanseInput2 returned boolean instead of void | Fixed. Return type is void; no value is returned. The throw trigger is unchanged: throw when isBlackList or detectSQLInjection returns true. |
| V-Ex7-5: no call sites, no try/catch/finally, no mode-dependent printing, no stop behavior | Partly fixed. The complete try/catch/finally block with mode-dependent printing and a stop is written in block 4 of the UiService additions file. It is not installed at his actual call sites, and the commented-out cleanseInput calls are not applied to his code. That part stays FAIL under R9 and pending under R10. |

## Undetermined items

The handout does not determine these, so they are listed here rather than guessed as settled:

- Package name. The files use `exceptions`, taken from the sketch. The real package must match his exceptions folder and his existing exception classes. Confirm before compiling.
- Field names, getter names, message wording, and the mode constant name and data type. The handout fixes the roles, not the names or text. The choices in these files are: fields `developerErrorMessage`, `userErrorMessage`, `inputString`; getters `getDeveloperErrorMessage`, `getUserErrorMessage`, `getInputString`; constant `DEVELOPER_MODE`, boolean, true for developer mode.
- Message content. Developer message: "Malicious input detected. Input received: " plus the input string, shown only in developer mode during debugging. User message: "Invalid input. Please try again.", which contains no parameter, attribute, database field, file, or method names.
- Call-site locations and variable names. The Ex 7 handout does not name them. The Ex 4 flow chart places the cleanseInput calls in initialLogin and authenticateAdmin. Block 4 must be repeated at each of his actual call sites using the variable name at that site.
- Stop mechanism. The handout states the program should stop but names no mechanism. `System.exit(1)` in the catch block after printing is the implementation chosen here.
- Null input behavior. The handout is silent on null. cleanseInput2 passes the input to isBlackList and detectSQLInjection unchanged; null handling is theirs, not set here.
- isBlackList and detectSQLInjection behavior. Both are Ex 4 and Ex 6 methods, unverified against his code. Ex 4 is 0/10 and Ex 6 is 0/8, both never submitted. cleanseInput2 cannot be meaningfully tested until his own versions of both methods exist and behave as their handouts require.
- Whether `MaliciousInputException` collides with an existing class name in his project. Not checkable without his source.

## AI policy note

Two facts apply and both are recorded here. The Ex 7 requirement checklist records the Ex 4 handout AI policy: AI should not be used, and the syllabus states that submitting code generated by ChatGPT or other AI tools for the exercises constitutes academic dishonesty. Separately, Yaswant's Nov 12 in-class report records that Sampath allows AI in the entire class, with the condition not to blindly use it, and that the syllabus no-AI line is reused from last semester. These files are a corrected reference. He must place them in his own project, match them to his actual code, compile, test, and tag and push the work himself.

## How this was done

Method: read the Ex 7 handout in full; read the Ex 7 requirement checklist (R1 to R15) and the Ex 7 findings (V-Ex7-1 to V-Ex7-7) in the sketch verification document; read the Exercise 7 section of Yaswant's Oct 30 draft code; rewrote the exception class and the UiService additions from the handout steps, correcting each listed sketch defect; checked every checklist item against the rewritten files and marked it PASS or FAIL under the rule stated above.

Sources used:
- `fall2026-audit/extracted/coding_exercise_7_Exceptions.txt`, the Ex 7 handout, read in full.
- `fall2026-audit/is472/ex7-requirement-checklist.md`, 146 lines, R1 to R15.
- `fall2026-audit/is472/ex4-ex7-sketch-verification.md`, Exercise 7 section, findings V-Ex7-1 to V-Ex7-7.
- `your_files/is472-exercise-code-drafts-2026-10-30.md`, Exercise 7 section, the sketch being corrected.
- `fall2026-audit/extracted/Ch9.txt`, checked for context on the exception usage. It contains only form-feed characters and no usable content, so no Ch9 material was used.

Key decisions:
- Kept the class name `MaliciousInputException` because the handout leaves the name free and the name itself was not a defect.
- Chose a boolean mode constant, `DEVELOPER_MODE = true`, because Step 3 permits any data type and boolean makes the developer/user switch explicit. Set to developer mode to start, per Step 3.
- Included the input string in the developer message only, for debugging value, and kept the user message free of any parameter, field, file, or method names, per the handout security rule.
- Chose `System.exit(1)` in the catch block after printing, so the catch both prints the mode message (R10) and stops the program (R11). The handout does not name this mechanism.
- Delivered the UiService work as insertion fragments in `UiServiceEx7Additions.java`, not as a fabricated complete UiService.java, because his UiService.java was not available and inventing the rest of the class would have created code that is not his.

Final verification against his Mac source is still pending. The BankingApplication source lives on his Mac, which is offline. Until he opens the Muse app on his Mac, the following cannot be confirmed: the real exceptions folder and package, the model exception classes and their getter style, the real isBlackList and detectSQLInjection methods, the real cleanseInput call sites, compilation of the exception class and the full application, and developer-mode and user-mode testing with malicious input. None of those steps were claimed as done in this note.
