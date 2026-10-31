# PROMPT PACK — IS 472: Software Security (Sreedevi Sampath, Fall 2026)
## How to use this file
Paste one assignment block into any model and fill every [FILL] placeholder first. Each block contains the due date, points, status, instructions, deliverable format, and a paste-ready prompt. Blackboard shows NO rubric with point values for any IS 472 item — grading follows the instructions and deliverables below, plus the syllabus weights.
## Honest scope note
These packs target full marks on every actionable item. They cannot change scores already recorded (several quizzes, exercises, and Exam 1 are graded zeros), and the syllabus states there are no pre-defined grade boundaries — grades reflect the instructor's judgment of the work. Quiz and exam items are prep-only: the attempts themselves must be yours.
## Course facts
- Grading (percentage-based; no points total stated): Exams (2) at 25% each; Quizzes 10%; In-class exercises 35%; Participation 5%.
- Grade boundaries are not pre-defined; historical ranges: A ~90–100, B ~80–89, C ~70–79.
- Policies (paraphrased): makeup exams generally not given — advance notice plus instructor agreement, or a documented bona fide emergency, can change that. A missed quiz can be made up at a 50% penalty (half credit), as soon as possible and ideally the same day or before the next class; more than 1 week later, no makeup and the quiz is a 0. Exercises are generally due at the beginning of the following class period, whether or not the student attended; absent students must get the materials and submit before the next class.
- Past-due exercises show "new attempts will be marked as late" (late submission still mechanically possible). Several quizzes show "no new late attempt" — those need instructor agreement.
- Second exam not found in Blackboard (Exams folder holds only the Exam 1 study guide; the Course Schedule link needs a Google sign-in). Syllabus intro mentions three exams while its breakdown lists two — confirm with the instructor.

## CLOSED — no prompt (scores stand / record only)
- Syllabus Quiz 9/10 (graded). Quiz on requirements 0/10, Application Quiz 0/15, Quiz on Security basics 0/10 (graded, no new attempt shown). Exam 1 0/50 (manual grade column). Attendance 0/100 (5 absent: Sep 10, Sep 17, Sep 29, Oct 1, Oct 27).

## ACTIONABLE BLOCKS
### PROMPT — Exercise 3: Design Exercise (10 pts, due was Sep 29, past due ungraded)
Instructions: download the packet at the beginning of class, follow the instructions during class, submit the completed packet by the due date. Packet: study the data-flow diagram and trust boundaries; use the STRIDE threat-modeling slides; consider how each STRIDE threat could impact each part of the model given the trust boundaries; note mitigations in the final column of the last slide; be prepared to discuss answers in class; save and submit the PPTX with all team members' names.
[FILL: the data-flow diagram + STRIDE slides + your threat notes, or paste the packet text.]
Deliverable: completed PPTX file upload, all team members named.
PASTE-READY PROMPT: "Complete the Exercise 3 design packet below: for each part of the data-flow diagram, assess every applicable STRIDE threat given the trust boundaries, explain how the threat could impact that part, and fill in a concrete mitigation for each, in the packet's final column. Include all team members' names. [Packet/diagram/notes:]"

### PROMPT — Exercise 4: Black list characters (10 pts, due was Oct 8, past due ungraded)
Instructions: individual submission — upload the Part 1 Google Doc link. Attached deck covers input validation, protecting entry points, and cleansing the request, plus a pseudocode reference.
[FILL: your Part 1 document content / the blacklist characters and validation approach from your deck and code.]
Deliverable: Part 1 Google Doc link submission.
PASTE-READY PROMPT: "Write Exercise 4 Part 1 below: explain input validation, protecting entry points, and cleansing the request as applied to blacklist characters, with the validation logic and pseudocode, ready to submit as the Part 1 document. [Your deck notes / code:]"
Coding note (for a repo model): the follow-on exercises build on an `isBlacklist` method in UiService — see the IS 472 code drafts file for the method sketch.

### PROMPT — Exercise 5: stripping HTML characters (10 pts, due was Oct 22, past due ungraded)
Instructions: read the HTML-injection explainer; in the UiService program, define an OWASP sanitizer policy (formatting + links) and apply it to username/password in `initialLogin` and `authenticateAdmin`, using the sanitized values thereafter; build with Maven, run with no errors and show the menu; test inputs containing HTML tags (they should sanitize down to plain text and still allow login with the correct password); print the sanitized username/password values in both methods; commit with tag `Ex5Submitted` following the Github instructions handout.
[FILL: your UiService code for initialLogin and authenticateAdmin.]
Deliverable: working code + test evidence + git tag Ex5Submitted.
PASTE-READY PROMPT (best run in a repo coding model with your code attached): "Implement Exercise 5 in this UiService code: define PolicyFactory policy = Sanitizers.FORMATTING.and(Sanitizers.LINKS); sanitize username and password in initialLogin and authenticateAdmin and use the sanitized values for the rest of each method; print the sanitized values; keep the program building with Maven and running cleanly. Then show the test: HTML-tag inputs sanitizing to plain text with correct-password login still working. [UiService code:]"

### PROMPT — Exercise 6: SQL injection characters (8 pts, due was Oct 27, past due ungraded)
Instructions: in the UiService class, add a `detectSQLInjection` method, similar to but a little different from `isBlacklist`, that detects the patterns `--` and a single quote `'` and returns true if a malicious character is found, false otherwise; call it from `cleanseInput` so SQL-injection checking applies to every input; `cleanseInput` returns true if detect returns true, false if false; no changes needed where `cleanseInput` is called. Complete Exercises 4/5 first if not done. Tag the work `Ex6Submitted` and push it.
[FILL: your UiService code (isBlacklist + cleanseInput + callers).]
Deliverable: working code + git tag Ex6Submitted, pushed.
PASTE-READY PROMPT (best run in a repo coding model): "Implement Exercise 6 in this UiService code: add detectSQLInjection(input) returning true when the input contains '--' or a single quote, and wire it into cleanseInput so every input is checked and cleanseInput returns true when detect returns true. Do not change the callers of cleanseInput. [UiService code:]"

### PROMPT — Peer code review of exercise 4 or 5 (10 pts, due was Oct 29, past due ungraded)
Instructions: producer describes code briefly (1 minute); reviewer reviews silently (4 minutes), then discusses the most interesting findings (3 minutes), then fills out the review sheet for the producer's code (reviewer + producer names). The sheet rates 1–3 (1 = needs more work, 2 = somewhat, 3 = yes, it's great!) plus a "where should it be better" write-in on: documentation/commenting; error handling and error-message quality; searchable, meaningful variable names; security (can an attacker manipulate this input? is authorization enforced correctly? are secrets exposed? can sensitive data leak?). Then give two suggestions for the author to improve the code. Readings: the secure-code-review article and the OWASP Java Security Cheat Sheet. Submit the document file.
[FILL: the producer's code + reviewer/producer names. NOTE: this needs a partner — it cannot be completed solo.]
Deliverable: completed review sheet document upload.
PASTE-READY PROMPT: "Complete the peer code review sheet below for this code: rate documentation, error handling, variable names, and security (input manipulation, authorization, secrets exposure, sensitive-data leakage) on the 1–3 scale with a 'where should it be better' note for each, and give two concrete improvement suggestions. [Producer code + names:]"

### PROMPT — Exercise 7: Exception Handling (10 pts, due shown as Nov 4, year "25" in Blackboard, past due ungraded)
Instructions: read the assigned handout pages on exception handling; create a new exception class in the exceptions directory; set up its constructor; import it in UiService and define a constant; in `cleanseInput2`, call the blacklist/SQL checks and throw the new exception on malicious input; test with malicious input and observe the error messages. (The attached deck's step text was partially truncated in Blackboard — the steps above are what was shown.)
[FILL: your UiService code (cleanseInput2, isBlacklist, detectSQLInjection) + the handout pages if available.]
Deliverable: working code + test evidence.
PASTE-READY PROMPT (best run in a repo coding model): "Implement Exercise 7 in this code: create a custom exception class extending Exception in the exceptions directory with a proper constructor; import it in UiService, define a constant for the error message, and in cleanseInput2 call the blacklist and SQL-injection checks and throw the exception on malicious input. Show the test with malicious input and the resulting error message. [UiService code:]"

### PROMPT — Exercise 2: Abuse Case Exercise (10 pts, graded 0/10, 1 attempt left, late-marked — resubmittable)
Instructions: using the banking-app requirements and use-case materials, work in two rounds. Round 1 (individual): draw a malicious user on the first-round use-case diagram; consider attack types and motivations; create two abuse cases (abuse-case bubbles connected to the threatened use cases and the attacker); think about countermeasures and represent them as new use cases; fill out the abuse-case template. Round 2 (with 1–2 partners): review and discuss each other's abuse cases, choose the two best-defined/most likely, draw them on the second-round diagram, document them with the template, revise from input, all names on the diagram; one copy, one submitter. Template fields per abuse case: description, attack type, attacker motive and what counts as success, how it would work, possible countermeasure and how it would work. Banking-app rules: two access levels (Admin, Customer); username/password authentication before other functions; Admin creates users and changes any Customer balance; Customer can deposit, withdraw, get balance, close own account; usernames/passwords/balances stored permanently; no access to another Customer's account; no overdraft; at most one account per Customer. Submit electronically via Blackboard.
[FILL: the use-case diagram/materials + your round-1 and round-2 notes.]
Deliverable: abuse-case document/diagrams upload.
PASTE-READY PROMPT: "Complete the Exercise 2 abuse-case document below: two fully documented abuse cases per the template (description, attack type, motive/success criteria, how it works, countermeasure and how it works), with the attacker and countermeasure use cases connected on the diagrams, respecting every banking-app rule listed. [Materials/notes:]"

### PROMPT — Exercise 1: Tool environment (10 pts, graded 0/10, 1 attempt left, late-marked — resubmittable)
Instructions: upload a Word document containing screenshots for Exercise 1.
[FILL: your Exercise 1 screenshots and what each shows.]
Deliverable: Word document upload. (Cannot be drafted without your screenshots.)

### PROMPT — Quiz on 'Coding Practices' reading (10 pts, due was Sep 30, past due ungraded) — PREP ONLY
LockDown Browser quiz, 10 minutes, no new late attempt shown; syllabus quiz-makeup rule (50% penalty, within 1 week) is now past on dates — instructor decision required.
Prep prompt: "Quiz me on secure coding practices (input validation, protecting entry points, cleansing the request, blacklist vs allowlist approaches) with exam-style questions and full explanations until I answer consistently correctly."
[FILL: the coding-practices reading notes.]

### PROMPT — Quiz on Exception Handling (10 pts, due was Oct 30, 12:00 PM, past due ungraded) — PREP ONLY
LockDown Browser quiz, no new late attempt shown; the syllabus 50%-penalty makeup window runs to about Nov 6 if the instructor agrees.
Prep prompt: "Quiz me on exception handling (try/catch, custom exception classes, error-message control and what information error messages reveal, secure error handling) with exam-style questions and full explanations until I answer consistently correctly."
[FILL: the exception-handling handout notes.]
