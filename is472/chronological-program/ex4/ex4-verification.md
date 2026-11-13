# IS 472 Exercise 4: Verification Note

- Course: IS 472 Software Security, Prof. Sreedevi Sampath, Fall 2026
- Student: Yaswant Kakarla
- Handout: Coding Exercise 4, Validating the Input, Blacklist characters (`fall2026-audit/extracted/coding_exercise_4_blacklist_chars.txt`)
- Checklist: `fall2026-audit/is472/ex4-requirement-checklist.md`, items R1 to R14
- Gradebook status (verified live Nov 12): Ex 4 is 0/10, never submitted, 1 attempt left. No Blackboard rubric exists for any IS 472 item.
- Written: Nov 12, 2026

## Deliverables

- `UiService-Ex4-fragment.java`: the corrected constant, `isBlackList`, and `cleanseInput`. A fragment to paste into `UiService.java`, not a complete class. Do not compile it on its own.
- `ex4-verification.md`: this file.

## Requirement results

### R1. Read Figure 9-3 in the Coding practices reading (15 minutes, individual)

- FAIL. The requirement is Yaswant's own reading. This work read Figure 9-3 from the Ch9.pdf to model the code, which does not satisfy the individual-reading requirement.
- Source note: the audit text file `Ch9.txt` holds no text (19 bytes, form-feed characters only). Figure 9-3 was read from the scanned `Ch9.pdf` in the workspace browser downloads, book page 158.

### R2. Discuss the reading with a neighbor (20 minutes)

- FAIL. No neighbor discussion took place. Only Yaswant can do it.

### R3. isBlackList returns TRUE if a blacklist character is found, FALSE if not

- PASS. Evidence: `UiService-Ex4-fragment.java` lines 19 to 24. The loop returns true at line 21 on the first matching character and falls through to return false at line 24 when no character matches.
- Basis: code review only. No execution test was run here; no JDK exists in this VM. Runtime confirmation is still open under R13.

### R4. Blacklist characters are exactly `* [ ] # $`

- PASS. Evidence: `UiService-Ex4-fragment.java` line 11, `BLACK_LIST_INPUT = "*[]#$"`, five characters: `*`, `[`, `]`, `#`, `$`. The set is taken from the handout, not from the Oct 30 sketch.

### R5. Pseudocode in a Google Doc, submitted on Blackboard as part of the submission (10 minutes, individual)

- FAIL. No Google Doc was written and nothing was submitted on Blackboard. The pseudocode is individual work only Yaswant can write and submit. No pseudocode is included in this deliverable.

### R6. Discuss the solution with the neighbor; report backs to the class may follow

- FAIL. Not done. Only Yaswant can do it.

### R7. Work in the BankingApplication folder, not BankingApplicationInitial; open UiService.java in VIM

- FAIL. His BankingApplication folder is on his Mac, which is offline. The fragment header (lines 5 to 8) states the required folder and path. The VPN, terminal, and VIM steps were not performed.

### R8. Add the isBlackList method to UiService.java, between the open and close bracket of the class, not inside another method

- FAIL, not yet merged. Evidence: the method exists as a fragment (lines 14 to 25) with placement stated in the header (lines 2 to 4). It is not yet inside his `UiService.java`. Merge is pending Mac access.

### R9. Compile after adding isBlackList and fix errors before moving on

- FAIL. No compile was run against his program. No JDK exists in this VM (`javac` and `java` both absent, no `/usr/lib/jvm`), so no compile was run here either. Syntax was checked by line-by-line review against Figure 9-3 only.

### R10. cleanseInput calls isBlackList; takes the user-supplied string; returns TRUE when isBlackList returns true, FALSE when false; prints a message when blacklist characters are found

- PASS. Evidence: `UiService-Ex4-fragment.java` lines 29 to 35. It calls `isBlackList` at line 30, prints at line 31, returns true at line 32, and returns false at line 34.
- Basis: code review only. Runtime confirmation is still open under R13.
- Message wording is not fixed by the handout. The wording used, "Blacklist character found in input.", is generic and does not echo the input or name the character found.

### R11. Compile after adding cleanseInput and fix errors before moving on

- FAIL. Same as R9. No compile was run.

### R12. Call cleanseInput wherever usernames and passwords are entered; at the call site, the application exits when the username or password contains a blacklisted character; call it for both customer and admin user types

- FAIL. No call sites are written into his code. The real signatures and bodies of `initialLogin` and `authenticateAdmin` are unverified: the handout flow chart says those methods read username and password from the user, while the Oct 30 sketch assumed `(String username, String password)` parameters. A call-site pattern to adapt is given below; it is a pattern, not code fitted to his file.

### R13. Compile from src/main/java and run; test with inputs that contain blacklist characters and inputs that do not

- FAIL. No compile, run, or test of the full program exists. No JDK in this VM.

### R14. Tag the work "Ex4Submitted" and push it to the accessible repository; follow Github instructions Part 2, steps 2 and 3

- FAIL. Not done. Only Yaswant can tag and push his own repository.

## Corrections made against the Oct 30 sketch

Findings cited are from `fall2026-audit/is472/ex4-ex7-sketch-verification.md`, Ex 4 section.

- V-Ex4-1, wrong blacklist set: fixed. The sketch used `"<>\""` as a placeholder. The fragment uses the handout set `"*[]#$"` (line 11).
- V-Ex4-2, cleanseInput missing from the Ex 4 section: fixed. `cleanseInput` is present (lines 29 to 35).
- V-Ex4-3, the Ex 6 section's cleanseInput did not print: fixed for Ex 4. The print statement is at line 31.
- V-Ex4-8, misleading pointer on where the set comes from: corrected. The set comes from the handout, not from his deck or code.
- V-Ex4-6, null input returns false: kept, copied from Figure 9-3 (lines 15 to 18). The handout is silent on null. See the undetermined items below.
- V-Ex4-4, method name spelling, and V-Ex4-5, file name spelling: see handout inconsistencies below.
- V-Ex4-7, call sites and exit behavior: still open. R12 FAIL above.

## Handout inconsistencies and how each was resolved

- Method spelling: the handout spells it `isBlackList` in Instructions 1 and 3 and `isBlacklist` in Instructions 4. Used `isBlackList`. Basis: the spelling in Instructions 1 and 3, the Oct 30 draft, and the task statement. Final check: the spelling in his own `UiService.java` governs when merging.
- File spelling: the handout spells it `UiService.java` in Instructions 2 and 3 and `UiServices.java` in the flow chart. Used `UiService.java`. Final check: the name in his BankingApplication folder governs.
- cleanseInput sense: the handout states cleanseInput returns TRUE when isBlackList returns true. Kept that sense (lines 30 to 34). Did not flip it. The call-site exit logic depends on true meaning a blacklist character was found.

## Undetermined by the handout

No item below was guessed. Each states the decision taken in the fragment and what would settle it.

- Null input behavior. The handout does not state it. Decision in the code: null returns false, copied from Figure 9-3. A null username or password likely indicates a different error path. Yaswant should confirm this behavior against his own code.
- cleanseInput message wording. The handout requires a printed message but does not fix the words. The wording used is generic and does not echo the input.
- Static vs instance. The handout does not state it. The methods are written `public static` to match Figure 9-3 (`public static boolean isWhiteList`). If his existing `isBlackList` is an instance method, drop `static` when merging.
- Exit mechanism and status code at the call site. The handout requires the application to exit but does not name the call or the status code. The pattern below uses `System.exit(1)`; the status code is a choice, not a handout requirement.
- Signatures and bodies of `initialLogin` and `authenticateAdmin`. The flow chart says they read username and password from the user. Whether they take parameters or read input themselves is unverified against his code.
- The whitelist constant in Figure 9-3 (lowercase plus uppercase letters only) has no bearing on Ex 4. Ex 4 uses the handout blacklist set only.

## Call-site pattern for R12

Adapt to his method bodies. Variable names are placeholders for whatever his methods use for the username and password.

```java
// In initialLogin, after the username and password are read:
if (cleanseInput(username)) {
    System.exit(1);
}
if (cleanseInput(password)) {
    System.exit(1);
}

// In authenticateAdmin, after the username and password are read:
if (cleanseInput(username)) {
    System.exit(1);
}
if (cleanseInput(password)) {
    System.exit(1);
}
```

Notes on the pattern: `cleanseInput` already prints the message when it finds a blacklist character, so the call site prints nothing extra. Each input is checked in its own `if` so both are checked even when the first one is blacklisted. Both methods get the check because the handout requires it for both user types. If his methods take username and password as parameters instead of reading them, place the same check at the top of each method.

## How this was done

### Method

1. Read the Ex 4 handout in full.
2. Read the Ex 4 requirement checklist (R1 to R14) and the Ex 4 sections of the sketch verification.
3. Read the Oct 30 draft file, Ex 4 section.
4. Read Figure 9-3 from the scanned Ch9.pdf, book page 158, since the audit text file holds no text. Transcribed method: `public static boolean isWhiteList(String val)`; null returns false; loop over `val.length()`; `if (Constants.WHITE_LIST_INPUT.indexOf(val.charAt(i)) < 0)` return false; return true at the end. The constant shown is `WHITE_LIST_INPUT`, lowercase plus uppercase letters.
5. Wrote the corrected fragment by inverting the Figure 9-3 loop (`indexOf >= 0` returns true; fall-through returns false) and replacing the whitelist constant with the handout blacklist constant declared locally in the program, with the `Constants.` prefix removed as the handout directs.
6. Checked the fragment by line-by-line review against Figure 9-3 and the handout. No compile or run test was done: no JDK exists in this VM. No test output is claimed.
7. Checked both deliverable files for em dashes: none found.

### Sources used

- `fall2026-audit/extracted/coding_exercise_4_blacklist_chars.txt` (Ex 4 handout)
- `fall2026-audit/is472/ex4-requirement-checklist.md` (R1 to R14)
- `fall2026-audit/is472/ex4-ex7-sketch-verification.md` (Ex 4 findings V-Ex4-1 to V-Ex4-9)
- `browser_downloads/sess-2992668786/browser-download-20261112T064708.754058719Z-7-Ch9.pdf`, book page 158 (Figure 9-3; the `Ch9.txt` extraction is empty)
- `your_files/is472-exercise-code-drafts-2026-10-30.md` (Oct 30 draft, Ex 4 section)
- No other sources. Yaswant's BankingApplication source was not available to this work.

### Key decisions

- Blacklist set from the handout only: `* [ ] # $`, as the string `"*[]#$"`.
- `isBlackList` modeled line by line on Figure 9-3, with the test inverted: `indexOf >= 0` returns true, fall-through returns false.
- Null returns false, copied from Figure 9-3, flagged as handout-undetermined.
- `cleanseInput` returns the `isBlackList` result unchanged and prints a generic message that does not echo the input.
- Spelling `isBlackList` (handout Instructions 1 and 3); file `UiService.java` (handout Instructions 2 and 3).
- Methods written `public static` to match Figure 9-3; drop `static` on merge if his code uses instance methods.
- Call sites left as a pattern in this note, not as code, because the `initialLogin` and `authenticateAdmin` signatures and bodies are unverified.
- No pseudocode written: the Google Doc pseudocode is individual work only Yaswant can submit.

### Submission note

Course AI policy, quoted in the handout: AI should not be used for the exercises, and the syllabus states that submitting AI-generated code constitutes academic dishonesty. This fragment is a corrected draft built from the handout and Figure 9-3. Yaswant decides what he submits. The merge, compile, test, and submission steps are his.

### Pending: final verification against his Mac source is still pending

Yaswant's BankingApplication source is on his Mac, which is offline. The following stay open until he opens the Muse app on his Mac and the source is read: the spelling of `isBlackList` in his code, whether his existing method (if any) is static or instance, the signatures and bodies of `initialLogin` and `authenticateAdmin`, the merge of this fragment into his `UiService.java`, compilation, the run test with blacklisted and clean inputs, the tag `Ex4Submitted` and push, and the pseudocode Google Doc submission. Nothing in this deliverable is submitted or uploaded anywhere.
