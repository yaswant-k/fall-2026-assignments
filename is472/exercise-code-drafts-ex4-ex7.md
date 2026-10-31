# IS 472 — Exercise Code Drafts (DRAFTS for review and adaptation)
## Status: written from the Blackboard instructions (Oct 30 read). NOT tested against Yaswant's BankingApplication code — method/class names below come from the instructions and must be matched to his actual code before use. Nothing here has been submitted anywhere.

## Exercise 5 — Stripping HTML characters (due was Oct 22)
What the instructions require: use the OWASP Java HTML Sanitizer with a prepackaged policy (formatting + links); apply it to the username/password in `initialLogin` and `authenticateAdmin`; use the sanitized values for the rest of each method; print the sanitized values; build, run, test with HTML-tag inputs; commit with tag `Ex5Submitted`.

```java
import org.owasp.html.PolicyFactory;
import org.owasp.html.Sanitizers;

// Inside the UiService class (as a field, or defined inside each method):
PolicyFactory policy = Sanitizers.FORMATTING.and(Sanitizers.LINKS);

// In initialLogin — replace the plain username/password use with sanitized values:
public void initialLogin(String username, String password) {
    String safeUsername = policy.sanitize(username);
    String safePassword = policy.sanitize(password);
    // Print the sanitized values for the exercise evidence:
    System.out.println("Sanitized username: " + safeUsername);
    System.out.println("Sanitized password: " + safePassword);
    // ... rest of initialLogin must use safeUsername / safePassword, not the raw inputs.
}

// Same pattern in authenticateAdmin:
public void authenticateAdmin(String username, String password) {
    String safeUsername = policy.sanitize(username);
    String safePassword = policy.sanitize(password);
    System.out.println("Sanitized username: " + safeUsername);
    System.out.println("Sanitized password: " + safePassword);
    // ... rest of authenticateAdmin uses safeUsername / safePassword.
}
```

Test notes (from the instructions): build with `mvn install` in the BankingApplication folder, run with no errors and show the menu, then try inputs containing HTML tags — implemented correctly, a tagged input should sanitize down to plain text and still allow login with the correct password. Commit following the Github instructions handout with tag `Ex5Submitted`.

## Exercise 6 — SQL injection characters (due was Oct 27)
What the instructions require: add `detectSQLInjection` to UiService, similar to but a little different from `isBlacklist`; it detects `--` and a single quote `'` and returns true if a malicious character is found, false otherwise; call it from `cleanseInput` so SQL-injection checking applies to every input; `cleanseInput` returns true if detect returns true, false if false; no changes needed where `cleanseInput` is called. Tag the work `Ex6Submitted` and push it. Complete Exercises 4/5 first if they are not done.

```java
// In the UiService class:
public boolean detectSQLInjection(String input) {
    if (input == null) {
        return false;
    }
    // Flag the two SQL-injection patterns named in the instructions:
    if (input.contains("--") || input.contains("'")) {
        return true;
    }
    return false;
}

// Wire it into cleanseInput alongside the existing blacklist check:
public boolean cleanseInput(String input) {
    // Existing blacklist check (from Exercise 4) stays:
    if (isBlackList(input)) {
        return true;
    }
    // New SQL-injection check (Exercise 6):
    if (detectSQLInjection(input)) {
        return true;
    }
    return false;
}
```

Adaptation note: match the exact spelling/casing of `isBlackList` and `cleanseInput` in his code (the instructions spell it `isBlackList` in one place and `isBlacklist` in another). If his `cleanseInput` returns the opposite sense (e.g., true = clean), flip the returns accordingly — the behavior to preserve is: malicious input is flagged, clean input passes through.

## Exercise 7 — Exception Handling (due shown as Nov 4, year "25")
What the instructions require (steps as shown, partially truncated in Blackboard): read the assigned handout pages on exception handling; create a new exception class in the exceptions directory; set up its constructor; import it in UiService and define a constant; in `cleanseInput2`, call the blacklist/SQL checks and throw the new exception on malicious input; test with malicious input and observe the error messages.

```java
// New file: exceptions/MaliciousInputException.java (adapt package/directory to his project)
public class MaliciousInputException extends Exception {
    public MaliciousInputException(String message) {
        super(message);
    }
}
```

```java
// In UiService:
import exceptions.MaliciousInputException; // adapt to his actual package

// A constant for the error message (wording is his to set):
private static final String MALICIOUS_INPUT_MESSAGE = "Malicious input detected.";

// cleanseInput2: check inputs and throw on malicious content instead of only returning a flag.
public boolean cleanseInput2(String input) throws MaliciousInputException {
    if (isBlackList(input) || detectSQLInjection(input)) {
        throw new MaliciousInputException(MALICIOUS_INPUT_MESSAGE);
    }
    return false;
}
```

Test notes: run the program with malicious input and record the error message produced — the security point of the exercise is that a controlled error message reveals less information than a raw stack trace. The caller of `cleanseInput2` must handle or declare the exception; adjust to how his code calls it.

## Exercise 4 — Black list characters (due was Oct 8)
What the instructions require: individual submission — upload the Part 1 Google Doc link; the attached deck covers input validation, protecting entry points, and cleansing the request, plus a pseudocode reference. The code side is the `isBlacklist` method that Exercises 6–7 build on. Sketch (adapt the actual blacklist characters to his deck/code):

```java
// In the UiService class — sketch only; match his actual blacklist set:
public boolean isBlackList(String input) {
    if (input == null) {
        return false;
    }
    // Example blacklist characters — replace with the set from his Exercise 4 deck/code.
    String blacklist = "<>\""; // placeholder set; use his actual set
    for (int i = 0; i < input.length(); i++) {
        if (blacklist.indexOf(input.charAt(i)) >= 0) {
            return true;
        }
    }
    return false;
}
```

Note: the Exercise 4 deliverable itself is the Part 1 Google Doc link submission — the code above only supports Exercises 6–7. His actual blacklist characters must come from his deck/code, not from this sketch.

## Exercise 3 — Design Exercise (due was Sep 29) — no code
Deliverable is the completed STRIDE packet (PPTX): study the data-flow diagram and trust boundaries, assess each STRIDE threat per model part, fill in the mitigation column, include all team members' names, and submit the PPTX. No code draft applies; the packet must be completed from his course slides.

## Exercise 2 — Abuse Case Exercise (resubmittable, graded 0/10)
Deliverable is the abuse-case document (two rounds, templates, diagrams) — a writing/diagram deliverable, not code. It is queued after the IS 369 source-doc pull; it needs no code from this file.

## Exercise 1 — Tool environment (resubmittable, graded 0/10)
Deliverable is a Word document with screenshots for the tool-environment exercise — needs his screenshots; cannot be drafted without them.
