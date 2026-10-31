# DRAFT — IS 472 Quiz Prep: Coding Practices + Exception Handling
## Status: PREP ONLY. These are practice questions for Yaswant to study from — not the quizzes themselves, which must be taken by him in Blackboard (LockDown Browser).
## Topics come from the Blackboard instructions and exercise descriptions (Oct 30 read). No quiz questions were copied from Blackboard — Blackboard showed no question text for these quizzes.

## Part A — Coding Practices (input validation, entry points, cleansing)
1. Q: Why is blacklist validation (rejecting known-bad characters) weaker than allowlist validation (accepting only known-good input)?
   A: A blacklist only blocks patterns the developer thought of; any missed pattern passes through. An allowlist defines exactly what is permitted, so anything unexpected — including novel attack payloads — is rejected by default.
2. Q: What does "protecting entry points" mean in the context of the banking application?
   A: Every place untrusted input enters the program (login fields, account operations, any user-supplied value) must be validated and cleansed before use — not just the main login path. An attacker will find the one unchecked entry point.
3. Q: In Exercise 5, what does the OWASP sanitizer policy Sanitizers.FORMATTING.and(Sanitizers.LINKS) allow, and why must the sanitized value replace the original variable?
   A: It allows safe formatting and link HTML while stripping dangerous markup. If the code keeps using the original unsanitized variable after sanitizing, the sanitization has no effect — the rest of initialLogin/authenticateAdmin must use the sanitized values.
4. Q: An input like `<csea><html><man>` is submitted as a username and the application sanitizes it to `cseaman`. What happened, and why can login still succeed with the correct password?
   A: The sanitizer stripped the HTML tags and kept the text content. The resulting plain-text username is what the application then authenticates — so a legitimate user whose name sanitizes to the same text can still log in, while the injected markup never executes.
5. Q: What two SQL-injection patterns does Exercise 6's detectSQLInjection check for, and why are they dangerous?
   A: `--` (SQL comment — truncates the rest of a query, letting an attacker bypass conditions) and `'` (single quote — breaks out of a string literal so attacker-controlled SQL can be appended). Either can let an attacker alter query logic, e.g. revealing the users table.
6. Q: Why does Exercise 6 wire detectSQLInjection into cleanseInput rather than checking only at login?
   A: cleanseInput is the single cleansing checkpoint for every input. Checking there means SQL-injection protection applies to all entry points, not just the ones the developer remembered.
7. Q: What is the difference between validating input and cleansing (sanitizing) it?
   A: Validation decides whether input is acceptable (reject it if not). Cleansing transforms input into a safe form (e.g., stripping tags) so it can be used. Secure code typically does both: reject what should never be accepted, sanitize what is kept.
8. Q: A quiz-style trap: "If Exercises 4/5 are not completed, get those working first before starting Exercise 6." Why does the order matter?
   A: Exercise 6 builds on the cleansing pipeline (isBlacklist + cleanseInput) from Exercises 4/5. Without that pipeline in place, there is nothing correct for detectSQLInjection to wire into.

## Part B — Exception Handling
1. Q: What is the basic security idea behind handling exceptions gracefully instead of letting a program crash with a raw error?
   A: Raw errors and stack traces can reveal internals — file paths, code structure, database details, versions — that help an attacker. Controlled error handling lets the developer decide exactly what information is revealed.
2. Q: How do you design your own exception in Java, as Exercise 7 requires?
   A: Create a new class in the exceptions directory that extends Exception (e.g., MaliciousInputException), with a constructor that takes a message and passes it to super(message). The program then throws that exception type for the specific failure it represents.
3. Q: In Exercise 7's cleanseInput2, why throw an exception on malicious input instead of just returning a true/false flag?
   A: Throwing forces the caller to deal with the failure explicitly (handle or declare it) and carries a controlled message. A boolean flag can be ignored by a caller, silently letting malicious input through.
4. Q: What is the difference between the message shown to the user and the information logged for developers when an error occurs?
   A: The user sees a generic, safe message ("Invalid input") with no internals. Developers get the detailed log (what input, which check fired, where) for debugging. Mixing them up — showing internals to users — is itself a vulnerability.
5. Q: Why is "more control over error messages lets you control what information is revealed" a security point, not just good style?
   A: Error messages are an information channel to attackers. Probing with malicious input and reading the errors teaches an attacker about the system's internals, validation logic, and data model. Controlling the channel limits that learning.
6. Q: What should happen, step by step, when cleanseInput2 receives input containing `--`?
   A: The blacklist/SQL checks run; detectSQLInjection finds the `--` pattern and returns true; cleanseInput2 throws the custom exception with the defined constant message; the caller handles it (safe user message + developer log) and the malicious input is never processed further.
7. Q: What is wrong with catching a broad Exception and continuing as if nothing happened?
   A: It hides failures — including security failures — so the program proceeds in an unknown or unsafe state, and neither the user nor the developer learns that malicious input was attempted.
8. Q: Exercise 7 says to test with malicious input and observe the error messages. What are you checking in that test?
   A: Two things: (1) malicious input is actually caught and produces the controlled exception/message, and (2) the message shown reveals nothing useful to an attacker (no internals, no stack trace, no data-model hints).
