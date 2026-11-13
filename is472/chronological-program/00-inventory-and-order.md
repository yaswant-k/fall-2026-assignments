# IS 472 Inventory, Chronological Order, and Ex 2 Gap Assessment

Course: IS 472 Software Security, Prof. Sreedevi Sampath, Fall 2026, UMBC.
Student: Yaswant Kakarla (ykakarl1).
Report type: inventory only. No assignment deliverable is written here.
Report date: Nov 12, 2026.
Sources read for this report: `fall2026-audit/extracted/IS472_Fall2026_syllabus.txt`;
`fall2026-audit/extracted/design-exercise-v2.txt`;
`fall2026-audit/is472/ex2-completion-checklist.md`;
`your_files/is472-exercise2-abuse-case-draft-2026-10-30.md`;
`fall2026-audit/is472/ex3-stride-design.md` (skimmed, to identify Ex 3);
`browser_downloads/sess-2650903382/browser-download-20261112T043831.662180968Z-8-7.coding_practices.pdf`
(read directly as a PDF). Workspace greps covered the fall2026-audit tree, your_files,
the fall-2026-assignment-drafts goal files, and the github-push assignment tree,
excluding browser_downloads binaries and self_improvement staging.
Additional dated facts used below come from on-disk files found by those greps
(`prompt-pack-is472-2026-10-30.md`, `is472-ex8-ex11-complete-guide-2026-11-12.md`,
`fall2026-audit/PHASE5-REPORT-2026-11-12.md`, `fall2026-audit/PHASE6-REPORT-2026-11-11.md`,
`fall2026-audit/is472/ex4-ex7-sketch-verification.md`,
`fall2026-audit/is472/ex4-requirement-checklist.md`).
Where a fact is marked UNKNOWN, no on-disk source stated it and no date or name was guessed.

## Standing course facts that affect the order

- The syllabus does not contain the schedule. It states the schedule lives in a Google
  spreadsheet and gives the link
  `https://docs.google.com/spreadsheets/d/1wTR1VScPbphaItxKmSbgmiEC-JeD1uESH0YdIHLqGxs/edit?usp=sharing`,
  reachable from Blackboard, login required. That sheet was not read for this report.
  Dates below therefore come from Blackboard-derived on-disk records, not from the sheet.
- Syllabus grading: Exams 25 percent each (the syllabus text says "Exams (2)" in the
  breakdown but "three exams" in the grading intro; that inconsistency is unresolved),
  quizzes 10 percent, in-class exercises 35 percent, participation 5 percent.
  The lowest exercise grade is dropped. The lowest quiz grade is dropped.
- Syllabus exercise rule: exercises are generally due at the beginning of the following
  class period, whether or not the student attended. Exercises are cumulative: each
  contributes to a single software artifact completed by the end of the semester.
- No Blackboard rubric exists for any IS 472 item (verified live Nov 12, about 01:50 EST,
  per the Ex 2 checklist and the Ex 8 to Ex 11 guide).
- Late acceptance is unresolved. Sampath replied Oct 30 that she will not offer makeups
  and suggested dropping or retaking. The Nov 2 reconsideration appeal is unanswered.
  Past-due items below are therefore listed as past due, not as accepted or rejected.

## 1. Chronological order: Ex 1 through Ex 11 plus the peer code review

Order is by due date as stated in the on-disk Blackboard-derived records.
Year is 2026 unless a source shows otherwise. Times are as stated in the source.

| Order | Item | Due date found | Points | Gradebook status found |
|---|---|---|---|---|
| 1 | Exercise 1: Tool environment | Sep 1, 1:00 PM EDT | 10 | 0/10, graded, 1 attempt left, late-marked, resubmittable |
| 2 | Exercise 2: Abuse Case Exercise | Sep 22, 1:00 PM EDT | 10 | 0/10, graded, 1 attempt left, late-marked, resubmittable |
| 3 | Exercise 3: Design Exercise (STRIDE) | Sep 29 | 10 | --/10, not graded, never submitted, 1 attempt left |
| 4 | Exercise 4: Black list characters | Oct 8 | 10 | 0/10, zero-for-missing, never submitted, 1 attempt left |
| 5 | Exercise 5: stripping HTML characters | Oct 22 | 10 | Past due, ungraded (gradebook zero-or-blank not stated on disk for Ex 5) |
| 6 | Exercise 6: SQL injection characters | Oct 27 | 8 | Past due, ungraded (gradebook zero-or-blank not stated on disk for Ex 6) |
| 7 | Peer code review of Exercise 4 or 5 | Oct 29 | 10 | Past due, ungraded |
| 8 | Exercise 7: Exception Handling | Nov 4 (Blackboard shows the year as "25") | 10 | 0/10, zero-for-missing, never submitted, 1 attempt left |
| 9 | Exercise 8: Logging | Nov 10, 11:59 PM | 10 | Past due, not submitted |
| 10 | Exercise 9: EC and BVA, generategrade | Nov 10 | 10 | Past due, not submitted (plan complete, staged only, not uploaded) |
| 11 | Exercise 10: EC and BVA for UiService and CustomerController | Nov 12, 11:59 PM | 10 | Staged in Blackboard as an unsubmitted draft attempt; submit action is out of scope for this report |
| 12 | Exercise 11: JUnit coding | Nov 20 (gradebook shows the year as 2025, which looks like a typo for 2026; report it as shown) | 10 | --/10, not graded, 1 attempt left |

Notes on the ordering:

- Ex 8 and Ex 9 share the Nov 10 date. No time of day was found on disk for Ex 9,
  so no order between Ex 8 and Ex 9 within Nov 10 is stated. Ex 8 is listed first
  because it is the lower exercise number.
- Ex 1 and Ex 2 due dates (Sep 1 and Sep 22, 1:00 PM EDT) come from
  `fall2026-audit/PHASE6-REPORT-2026-11-11.md` and
  `goals/fall-2026-assignment-drafts/files/all-courses-syllabi-due-dates-rubrics-2026-10-30.md`.
  No separate Ex 1 or Ex 2 handout on disk states a date.
- Ex 3 (Sep 29), Ex 4 (Oct 8), Ex 5 (Oct 22), Ex 6 (Oct 27), peer review (Oct 29),
  and Ex 7 (Nov 4, year "25") dates come from
  `goals/fall-2026-assignment-drafts/files/prompt-pack-is472-2026-10-30.md`.
- Ex 8 (Nov 10, 11:59 PM) and Ex 11 (Nov 20, year shown as 2025) dates come from
  `goals/fall-2026-assignment-drafts/files/is472-ex8-ex11-complete-guide-2026-11-12.md`.
  Ex 9 (Nov 10) and Ex 10 (Nov 12) dates come from
  `fall2026-audit/PHASE5-REPORT-2026-11-12.md`.
- The peer code review sits between Ex 6 (Oct 27) and Ex 7 (Nov 4). It reviews
  Exercise 4 or Exercise 5 code, so it depends on Ex 4 and Ex 5 work being done first.
- No due date was found on disk for any item other than the dates in the table above.
  In particular, no separate date was found for the Ex 2 Round 2 review itself;
  the Ex 2 due date is the only date on record for that exercise.

## 2. Ex 1, Ex 5, Ex 6: what each covers, what exists on disk, and what must be fetched

### 2.1 Exercise 1: Tool environment

What it covers: the tool-environment exercise. The only instruction found on disk is:
upload a Word document containing screenshots for Exercise 1. No on-disk source states
which tools the screenshots must show, how many screenshots are required, or what each
screenshot must demonstrate. The code-drafts file states only that the deliverable
"needs his screenshots; cannot be drafted without them."

Material on disk: NONE that counts as Ex 1 material. No handout, no instruction sheet,
no screenshots, and no Word document for Ex 1 were found anywhere in the searched
workspace. The only mentions are one-line descriptions in the prompt pack, the code
drafts file, the assignment tracker, and the Phase 6 report.

What the parent must fetch from Blackboard:

- Blackboard gradebook item name: "Exercise 1: Tool environment" (10 pts, due Sep 1,
  1:00 PM EDT, 0/10, 1 attempt left, late-marked).
- Handout filename as it appears in Blackboard: UNKNOWN. No handout filename for Ex 1
  was found on disk. Fetch the Ex 1 instruction sheet or handout from the Blackboard
  In-class Exercises folder, plus the exact deliverable spec (which tools, which
  screenshots, Word document format).
- Yaswant must also supply his own tool-environment screenshots. No one else can
  produce them, because they are evidence of his own machine setup.

### 2.2 Exercise 5: stripping HTML characters

What it covers (from the prompt pack and the code-drafts summary; the real handout was
not on disk, so every point below is limited to that summary and is NOT verified
against the handout):

- Read the HTML-injection explainer.
- In the UiService program, define an OWASP Java HTML Sanitizer policy:
  `PolicyFactory policy = Sanitizers.FORMATTING.and(Sanitizers.LINKS);`
- Apply the policy to the username and password in `initialLogin` and
  `authenticateAdmin`, and use the sanitized values for the rest of each method.
- Print the sanitized username and password values in both methods.
- Build with Maven (`mvn install` in the BankingApplication folder, per the summary),
  run with no errors, and show the menu.
- Test with inputs containing HTML tags. The summary states a tagged input should
  sanitize down to plain text and still allow login with the correct password.
- Commit following the GitHub instructions handout, with git tag `Ex5Submitted`.

Material on disk: SUMMARY ONLY, no handout and no real code.

- An AI-generated sketch of the Ex 5 code exists in
  `github-push/fall-2026-assignments/is472/exercise-code-drafts-ex4-ex7.md`
  (Exercise 5 section), mirrored at
  `goals/fall-2026-assignment-drafts/files/is472-exercise-code-drafts-2026-10-30.md`.
- That sketch was verified in `fall2026-audit/is472/ex4-ex7-sketch-verification.md`
  only against its own stated summary, not against a handout. Findings on the summary's
  own terms: the policy, the application points, the printing, and the use of sanitized
  values match the summary (V-Ex5-1). Unverifiable without the handout and without his
  code: the assumed `(String username, String password)` signatures for `initialLogin`
  and `authenticateAdmin` (V-Ex5-2; the Ex 4 handout flow chart says those methods read
  input themselves, which suggests they may take no parameters); policy placement as a
  field versus inside each method, left undecided in the sketch (V-Ex5-3); the build
  step (V-Ex5-6). Two cautions are recorded in the verification: printing sanitized
  passwords is poor practice in production code (V-Ex5-4, observation only), and
  sanitizing a password changes it, so a correct password containing HTML-significant
  characters would fail login after sanitizing (V-Ex5-5).
- The sketch is AI-generated review aid only. The syllabus and the Ex 4 handout state
  that submitting AI-generated code for the exercises is academic dishonesty. The sketch
  must not be submitted as his work. His own UiService code is the only valid source,
  and it lives on his Mac, not on disk here.
- No Ex 5 handout file, no HTML-injection explainer file, and no GitHub instructions
  handout file were found on disk. A file named `SQL_Injection_Attack.pptx` exists in
  browser downloads, but that is a SQL injection deck, not an HTML-injection explainer,
  and it is not identified on disk as Ex 5 material.

What the parent must fetch from Blackboard:

- Blackboard gradebook item name: "Exercise 5" (prompt pack heading: "Exercise 5:
  stripping HTML characters", 10 pts, due Oct 22).
- Handout filename as it appears in Blackboard: UNKNOWN. No Ex 5 handout filename was
  found on disk. Fetch the Ex 5 instruction sheet or handout from the Blackboard
  In-class Exercises folder.
- Also fetch: the HTML-injection explainer reading named in the instructions, and the
  "Guide to using github for IS 472 assignments" document (named in the Coding
  Practices deck; the Ex 5 summary says to commit "following the Github instructions
  handout"). Both filenames are UNKNOWN on disk.
- Yaswant must supply his own UiService code from his Mac. No Ex 5 code exists on disk.

### 2.3 Exercise 6: SQL injection characters

What it covers (from the prompt pack and the code-drafts summary; the real handout was
not on disk, so every point below is limited to that summary and is NOT verified
against the handout):

- In the UiService class, add a `detectSQLInjection` method, similar to but a little
  different from `isBlackList`. It detects the patterns `--` (double hyphen) and a
  single quote `'`, and returns true if a malicious character is found, false otherwise.
- Call `detectSQLInjection` from `cleanseInput`, so SQL-injection checking applies to
  every input. `cleanseInput` returns true if detect returns true, false if false.
- No changes are needed where `cleanseInput` is called.
- Complete Exercises 4 and 5 first if they are not done.
- Tag the work `Ex6Submitted` and push it.

Material on disk: SUMMARY ONLY, no handout and no real code.

- An AI-generated sketch of the Ex 6 code exists in the same code-drafts file as Ex 5
  (Exercise 6 section). It implements `detectSQLInjection` checking exactly `--` and
  `'`, and a `cleanseInput` that returns true if either `isBlackList` or
  `detectSQLInjection` returns true.
- Verification in `fall2026-audit/is472/ex4-ex7-sketch-verification.md`, limited to the
  summary: trigger and return contract match the summary (V-Ex6-1). Two mismatches are
  recorded: the sketched `cleanseInput` prints nothing, while the Ex 4 handout requires
  `cleanseInput` to print a message when blacklist characters are found, and whether
  the Ex 6 handout restates, drops, or preserves that print requirement cannot be
  checked without the Ex 6 handout (V-Ex6-2); and the sketch's adaptation note ("flip
  the returns if his cleanseInput returns the opposite sense") contradicts the handout
  contract, because Ex 4 fixes true as meaning malicious, and flipping would invert
  the call-site exit logic in Ex 4 and the throw condition in Ex 7 (V-Ex6-3).
  Everything beyond the summary is unverifiable without the handout (V-Ex6-4),
  including whether specific test inputs are required, the exact tag and push steps,
  and whether "no changes needed where cleanseInput is called" holds in his code.
  The tag `Ex6Submitted` is taken from the sketch's summary, not verified against a
  handout.
- Same AI-policy bar as Ex 5: the sketch is review aid only and must not be submitted
  as his work. His own UiService code is on his Mac, not on disk here.
- No Ex 6 handout file was found on disk.

What the parent must fetch from Blackboard:

- Blackboard gradebook item name: "Exercise 6" (prompt pack heading: "Exercise 6:
  SQL injection characters", 8 pts, due Oct 27). Note the point value: Ex 6 is 8
  points, while Ex 1 through Ex 5 and Ex 7 through Ex 11 are 10 points each.
- Handout filename as it appears in Blackboard: UNKNOWN. No Ex 6 handout filename was
  found on disk. Fetch the Ex 6 instruction sheet or handout from the Blackboard
  In-class Exercises folder.
- Yaswant must supply his own UiService code (isBlackList, cleanseInput, and callers)
  from his Mac. No Ex 6 code exists on disk.

### 2.4 Summary of missing materials for Ex 1, Ex 5, Ex 6

| Item | Real handout on disk? | Real code on disk? | Must fetch from Blackboard | Must come from Yaswant |
|---|---|---|---|---|
| Ex 1 | No | Not applicable (screenshots, not code) | Ex 1 instruction sheet; filename UNKNOWN | Tool-environment screenshots and the Word document built from them |
| Ex 5 | No | No (AI sketch only, summary-verified) | Ex 5 instruction sheet; HTML-injection explainer; GitHub instructions handout; all filenames UNKNOWN | His UiService code from his Mac |
| Ex 6 | No | No (AI sketch only, summary-verified) | Ex 6 instruction sheet; filename UNKNOWN | His UiService code (isBlackList, cleanseInput, callers) from his Mac |

For contrast, Ex 4 and Ex 7 handouts DO exist on disk as extracted text
(`fall2026-audit/extracted/coding_exercise_4_blacklist_chars.txt` and
`fall2026-audit/extracted/coding_exercise_7_Exceptions.txt`), and their PDFs exist in
browser downloads. Ex 3, Ex 8, Ex 9, Ex 10, and Ex 11 materials also exist on disk
(see section 3 for Ex 3; Ex 8 to Ex 11 files are listed in the Ex 8 to Ex 11 guide).
Ex 1, Ex 5, and Ex 6 are the three exercises with no handout on disk at all.

## 3. What design-exercise.v2.pptx and 7.coding_practices.pdf are

### 3.1 design-exercise.v2.pptx: Exercise 3, the STRIDE design packet

- File on disk: `browser_downloads/sess-2650903382/browser-download-20261112T043610.793885927Z-7-design-exercise.v2.pptx`.
  A second copy exists in `browser_downloads/sess-2992668786/`
  (`browser-download-20261112T064338.307075263Z-4-design-exercise.v2.pptx`).
- It belongs to Exercise 3 (Design Exercise, 10 pts, due Sep 29). It IS the Ex 3 packet.
- Contents, from the extracted text in `fall2026-audit/extracted/design-exercise-v2.txt`
  (slides 1 to 4, rendered as `fall2026-audit/extracted/ex3-slide-1.png` through
  `ex3-slide-4.png`):
  - Slide 1: instructions. Study the data flow diagram on slide 2, note the trust
    boundaries, consider STRIDE threats and how each could impact each part of the
    model, fill out the table on slide 3, then note mitigations in the last column on
    slide 4. Be prepared to discuss answers with the class. Save and submit the PPTX
    on Blackboard. Include all team members' names.
  - Slide 2: the data flow diagram. External interactors Customer, Admin, and
    Verification System; processes Authenticate, Create Account, Make Transaction, and
    Change Balance; data stores Customers, Admins, and Accounts; trust boundaries drawn
    as grey dashed wavy lines. Fifteen flows, listed as F1 to F15 in
    `fall2026-audit/is472/ex3-stride-design.md`.
  - Slide 3: the STRIDE threat table (threat example, what the attacker does). The
    packet's worked example is Spoofing: tap communication to get login credentials
    when the customer gives credentials to Authenticate.
  - Slide 4: the mitigation table, adding the column "What are you going to do about
    it?" The worked example mitigation is two-factor authentication and strong
    password policies.
- Status: the packet itself is on disk, but it is NOT a completed submission. A full
  STRIDE analysis in text form exists in `fall2026-audit/is472/ex3-stride-design.md`
  (44 rows: Spoofing 8, Tampering 8, Repudiation 6, Information Disclosure 8, Denial of
  Service 7, Elevation of Privilege 7; row S-1 is the packet's worked example kept
  verbatim). That document states explicitly that it is NOT the PPTX: the analysis
  still needs to be transferred into the PPTX tables, team member names still need to
  be filled in (marked [FILL] in the document), and the PPTX still needs to be saved
  and submitted on Blackboard by Yaswant. Ex 3 has 1 attempt left, no rubric, and its
  gradebook status is --/10, not graded, never submitted.
- The Ex 3 document also records ambiguities that must not be resolved by guessing:
  a thick black rectangle enclosing the Admins store, the Admin interactor, Change
  Balance, and the Accounts store is not defined in the legend, so it is NOT treated
  as a trust boundary in the analysis; the dashed trust boundaries do not form visibly
  closed loops; and the diagram shows no balance read by Make Transaction, no result
  returned to the Customer, no request to the Verification System, and no
  authentication input to Change Balance.

### 3.2 7.coding_practices.pdf: a lecture and reading deck, not an exercise handout

- File on disk: `browser_downloads/sess-2650903382/browser-download-20261112T043831.662180968Z-8-7.coding_practices.pdf`.
  The "7." prefix is its position in that download batch, not an exercise number.
  It is NOT Exercise 7 material. Exercise 7 material is `coding_exercise_7_Exceptions.pdf`.
- It belongs to no single exercise. It is the "Coding Practices" lecture and reading
  deck for IS 472 (source cited inside it: "Secure Software Development: A Security
  Programmer's Guide, First Edition"). It is the reading that Ex 4 depends on: the
  Ex 4 handout tells students to read Figure 9-3 in the "Coding practices" reading
  and to model `isBlackList` on that figure's whitelist method.
- Contents as read from the PDF: countermeasures and the point of abuse cases, threat
  modeling, and risk analysis; coding practices (techniques against specific attacks,
  higher quality code, debugging, good work habits); secure coding activities
  (validate the input, check for SQL injection, handle exceptions, pass objects as
  parameters, create self-monitoring code); a worked SQL injection example (a login
  query with a username of `admin%27%29+--+` decoding to a query that logs in as admin
  without the password); handling exceptions in Java, including designing custom
  exceptions with separate developer and user messages; logging (levels, storage,
  correlation, and its security use); coding for quality code (organized code, style,
  refactoring, diverse code); coding for debugging (debug statements, println);
  good work habits versus reality-based good work habits (defensive mindset,
  prioritize, communicate, review and refactor); and a final GitHub setup slide
  ("Download and open the Guide to using github for IS 472 assignments document on
  Blackboard, under In class exercises. We will step through this together. You will
  not be able to submit your exercises unless you go through these steps.").
- Which exercises it supports: Ex 4 directly (Figure 9-3, input validation, blacklist
  versus whitelist); Ex 6 indirectly (the SQL injection section); Ex 7 indirectly
  (the exceptions section); Ex 8 indirectly (the logging section). It is also the
  reading for the Quiz on Coding Practices (10 pts, due Sep 30, prep only).
  It is a reading deck, not a deliverable, and it does not belong to any one exercise.
- A text extraction of the same reading also exists on disk as
  `fall2026-audit/extracted/Ch9.txt`.

## 4. Exercise 2: exact remaining gaps

Exercise 2: Abuse Case Exercise, 10 pts, due Sep 22, 1:00 PM EDT. Gradebook status
(verified live Nov 12, about 01:50 EST): 0/10, graded zero, 1 attempt left,
late-marked, resubmittable. No rubric exists.

What is done (from `fall2026-audit/is472/ex2-completion-checklist.md` and the draft
`your_files/is472-exercise2-abuse-case-draft-2026-10-30.md`):

- D1. Banking application rules recorded from the packet: two access levels (Admin,
  Customer); username and password authentication before any other function; Admin
  creates users and changes any Customer balance; Customer can deposit, withdraw, get
  balance, and close their own account; usernames, passwords, and balances are stored
  permanently; no access to another Customer's account; no overdraft; at most one
  account per Customer. The checklist notes it did not re-verify these rules against
  the packet itself, so the packet remains the authority if any rule is disputed.
- D2. Round 1, Abuse Case 1, credential stuffing against customer login: all five
  template prompts answered (description; attack type, credential stuffing and
  brute-force authentication attack; motive and success, financial gain, logging in as
  a customer and being able to view the balance, withdraw funds, or close the account;
  how it would work, scripted login attempts with leaked credential lists; and
  countermeasures, account lockout after a small number of failed attempts with unlock
  only through a verified recovery channel, multi-factor authentication, rate limiting
  and anomaly detection). Malicious user defined as an external attacker with no
  legitimate account, motivated by financial gain, targeting authentication and
  account-access functions.
- D3. Round 1, Abuse Case 2, unauthorized access to another customer's account: all
  five template prompts answered (description; attack type, broken access control and
  insecure direct object reference; motive and success, financial gain and data theft,
  viewing another customer's balance, withdrawing from it, or changing it; how it
  would work, altering account identifiers in requests and the application serving the
  referenced account without verifying ownership; and countermeasures, server-side
  authorization check on every account operation, session-to-account binding consistent
  with the at-most-one-account-per-customer rule, audit logging of cross-account access
  attempts).
- D4. Round 2 pair carried forward: the two Round 1 cases carried forward as the Round 2
  pair, with the case 1 countermeasures (lockout plus multi-factor plus rate limiting)
  and the case 2 countermeasures (server-side ownership check plus session binding plus
  audit logging).
- D5. Submission rule recorded in the draft: only one copy needs to be created and only
  one person needs to submit it, electronically via Blackboard. The checklist notes
  this rule was stated in the draft and was not independently verified against the
  packet in this review.

### Gap 1. Diagrams are not drawn

Two diagrams are missing, and no diagram exists in the draft. The draft gives text
instructions for what to draw but contains no drawing.

- FIRST ROUND diagram: draw the malicious user; draw two abuse-case bubbles
  (Abuse Case 1, credential stuffing against customer login; Abuse Case 2,
  unauthorized access to another customer's account); connect Abuse Case 1 to the
  Login/Authenticate use case and to the threatened use cases (Get Balance, Withdraw,
  Close Account); connect Abuse Case 2 to the Get Balance, Withdraw, and Deposit use
  cases and to the attacker; connect the countermeasure use cases to the same areas;
  and show the countermeasure use cases as new use cases on the diagram. The filled
  templates for both cases must accompany it.
- SECOND ROUND diagram: draw both chosen cases on the SECOND ROUND diagram sheet,
  with all team members' names on it.
- What it requires: the diagrams must be drawn on the FIRST ROUND and SECOND ROUND
  diagram sheets from the packet. This is drawing work only Yaswant (and his partner,
  if the diagram is joint) can do. It cannot be completed from the text alone without
  the packet diagram sheets. Note: no Ex 2 packet file was found on disk in this
  inventory. If the packet sheets are not on disk, the parent must fetch them from
  Blackboard along with the Ex 2 instructions, or Yaswant must supply them.

### Gap 2. Partner name or names are missing

- The partner name is missing in two places in the draft, both marked
  `[FILL: partner name(s).]`, and the names of all team members on the SECOND ROUND
  diagram are missing, marked `[FILL: names of all team members, as required on the
  diagram.]`.
- No partner name is known to the author of the checklist, and no partner name was
  found in this inventory. No partner is invented here.
- What it requires: Yaswant's actual partner name (or names, if the team is larger
  than two), supplied by him. The draft states only one copy needs to be created and
  only one person needs to submit it, so the names matter for the diagram and for the
  submission record even though only one person submits. Per the prompt pack, Round 2
  is done "with 1-2 partners", so the team size is Yaswant plus one or two partners.

### Gap 3. Round 2 review notes are missing

Three [FILL] slots in the draft are empty, and the Round 2 section currently carries
the Round 1 cases forward with no recorded change from review:

1. What the partner's review changed: which cases were combined, corrected, or
   strengthened, and how.
2. Any refinement from the partner's review on Abuse Case 1 (credential stuffing).
3. Any refinement from the partner's review on Abuse Case 2 (unauthorized access to
   another customer's account).
- The two refinement lines in the draft currently repeat the Round 1 countermeasures
  without adding anything from a partner.
- What it requires: an actual joint review with the partner, after which Yaswant
  records which cases were combined, corrected, or strengthened, and how. This cannot
  be written without the review happening. If the review happens and changes nothing,
  the note should say so explicitly ("no change from review") rather than leaving the
  slots empty, because an empty slot reads as unfinished work.

### Review points to check before submitting (not gaps, from the checklist)

- R1. Abuse Case 1 says the attack exploits "the absence of login-attempt limits."
  The packet rules listed in the draft do not mention login-attempt limits. That is an
  inference about the application, not a stated rule. Confirm it against the
  application behavior or label it as an assumed vulnerability.
- R2. Abuse Case 2 says the application serves a referenced account "without verifying
  that the requesting user owns it." That is also an assumed implementation behavior,
  not a stated packet rule. Confirm it or label it as assumed.
- R3. Abuse Case 1's countermeasure of account lockout is proposed without a stated
  unlock mechanism beyond "a verified recovery channel." If the packet defines no
  recovery channel, the countermeasure needs a concrete mechanism or a note that the
  mechanism is proposed, not existing.
- R4. The draft's header in the code-drafts file says the Ex 2 deliverable is "queued
  after the IS 369 source-doc pull." That sequencing note is stale relative to the
  current audit work and should not be relied on for scheduling.
- R5. The draft states the two Round 1 cases are "the two best-defined / most likely,
  after review." No review has taken place (Gap 3), so that description is premature.
  It is accurate only as a Round 1 carry-forward, not as a reviewed selection.

### Ex 2 submission checklist status (from the draft)

- FIRST ROUND diagram with malicious user, two abuse-case bubbles, connections,
  countermeasure use cases, and filled templates: templates filled; diagram not drawn
  (Gap 1).
- SECOND ROUND diagram with the two chosen cases, all names on it: cases carried
  forward; diagram not drawn (Gap 1); names missing (Gap 2).
- Template fields completed for each case: Round 1 fields completed; Round 2 review
  fields empty (Gap 3).
- One copy submitted electronically via Blackboard (by one team member only):
  not submitted; 1 attempt left.

### What only Yaswant can do for Ex 2

1. Draw the FIRST ROUND and SECOND ROUND diagrams on the packet sheets (Gap 1).
2. Supply the partner name or names and confirm the full team member list for the
   diagram (Gap 2).
3. Hold the joint Round 2 review with the partner and write the review notes (Gap 3).
4. Confirm or correct the assumptions in R1 to R3 against the packet and the
   application.
5. Submit the one copy on Blackboard. Ex 2 has 1 attempt left and no rubric.

## 5. Peer code review: date and requirements

- Date: due Oct 29 (year 2026, from the prompt pack; no time of day stated on disk).
  Points: 10. Status: past due, ungraded.
- What it reviews: the producer's code for Exercise 4 or Exercise 5. The producer
  describes the code briefly, and the reviewer reviews the producer's code.
- Timed in-class process (from the prompt pack, which is the only on-disk source for
  the process): producer describes code briefly (1 minute); reviewer reviews silently
  (4 minutes), then discusses the most interesting findings (3 minutes), then fills
  out the review sheet for the producer's code (reviewer plus producer names).
- Review sheet contents: rate each of four areas on a 1 to 3 scale (1 means needs more
  work, 2 means somewhat, 3 means yes, it is great), plus a "where should it be
  better" write-in for each area:
  1. Documentation and commenting.
  2. Error handling and error-message quality.
  3. Searchable, meaningful variable names.
  4. Security: can an attacker manipulate this input? Is authorization enforced
     correctly? Are secrets exposed? Can sensitive data leak?
  Then give two suggestions for the author to improve the code.
- Readings named for the review: the secure-code-review article and the OWASP Java
  Security Cheat Sheet. Neither reading was found on disk. Their filenames are UNKNOWN.
- Deliverable: completed review sheet document upload to Blackboard.
- Partner requirement: this needs a partner and cannot be completed solo. The review
  sheet carries both the reviewer name and the producer name. No partner name, no
  producer code, and no review sheet were found on disk. No partner is invented here.
  The Phase 6 report states the same blocker in one line: "No partner for Ex 2 Round 2;
  no partner code for the peer review."
- What the parent must fetch from Blackboard:
  - Blackboard gradebook item name: "Peer code review" (prompt pack heading: "Peer
    code review of exercise 4 or 5", 10 pts, due Oct 29).
  - Handout filename as it appears in Blackboard: UNKNOWN. No peer review handout or
    review sheet file was found on disk. Fetch the review sheet itself (the document
    to be filled out and uploaded), plus the secure-code-review article and the OWASP
    Java Security Cheat Sheet readings.
  - Yaswant must supply the producer's code (his Ex 4 or Ex 5 code from his Mac) and a
    partner to act as reviewer (or to be the producer, with Yaswant as reviewer).
    Neither exists on disk.

## 6. Consolidated fetch list for the parent (Blackboard)

These are the items no on-disk source supplies. Fetch each from the Blackboard
In-class Exercises folder or the gradebook item named, and record the exact Blackboard
filename when it is found. Do not guess filenames.

1. Ex 1 instruction sheet. Gradebook item: "Exercise 1: Tool environment".
   Filename: UNKNOWN.
2. Ex 2 packet sheets (FIRST ROUND and SECOND ROUND use-case diagram sheets) and the
   Ex 2 instructions, if the packet is not already in Yaswant's possession.
   Gradebook item: "Exercise 2: Abuse Case Exercise". Filenames: UNKNOWN (no Ex 2
   packet file was found on disk in this inventory).
3. Ex 5 instruction sheet. Gradebook item: "Exercise 5". Filename: UNKNOWN.
4. Ex 5 HTML-injection explainer reading. Filename: UNKNOWN.
5. Ex 6 instruction sheet. Gradebook item: "Exercise 6". Filename: UNKNOWN.
6. Peer code review sheet (the document to fill out and upload). Gradebook item:
   "Peer code review". Filename: UNKNOWN.
7. Peer review readings: the secure-code-review article and the OWASP Java Security
   Cheat Sheet. Filenames: UNKNOWN.
8. "Guide to using github for IS 472 assignments" document (required before any
   exercise submission can be made, per the Coding Practices deck; needed for the
   Ex 4, Ex 5, Ex 6, Ex 7, and Ex 8 git tags). Filename: UNKNOWN.
9. The Google Sheet schedule (link in the syllabus, login required) for confirming
   every due date above against the authoritative schedule. The sheet was not read
   for this report, so every date above rests on Blackboard-derived on-disk records.

## 7. What was NOT done in this report

- Ex 10 was not touched, per the task. No browser task was run, per the task.
- No assignment deliverable was written. The Ex 5 and Ex 6 sketches on disk are
  AI-generated review aids, not submissions, and this report does not correct them
  into submittable code.
- No partner was invented for Ex 2 or for the peer review, and no Round 2 notes were
  invented. Both need real people and a real review.
- No date was guessed. Every UNKNOWN above means no on-disk source stated it.
