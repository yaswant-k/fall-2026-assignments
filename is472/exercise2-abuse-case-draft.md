# DRAFT — IS 472 Exercise 2: Abuse Case Exercise
## Status: DRAFT for review. Built from the Blackboard instructions and the banking-application requirements (Oct 30 read). NOT submitted.
## Still needed before this is submittable: the use-case diagram itself (draw the bubbles/connections on the FIRST ROUND and SECOND ROUND diagrams from the packet), your partner's name(s), and your Round 2 review notes. Placeholders for those are marked [FILL].

## Banking application rules used (from the packet)
Two access levels (Admin, Customer). Username/password authentication before any other function. Admin creates users and changes any Customer balance. Customer can deposit, withdraw, get balance, and close their own account. Usernames, passwords, and balances are stored permanently. No access to another Customer's account. No overdraft. At most one account per Customer.

## ROUND 1 (individual)
### Malicious user
An external attacker with no legitimate account, motivated by financial gain, targeting the banking application's authentication and account-access functions.

### Abuse Case 1 — Credential stuffing against customer login
- Abuse Case Description: The attacker uses username/password pairs leaked from other breaches to attempt logins as legitimate customers, exploiting the absence of login-attempt limits.
- Attack type: Credential stuffing / brute-force authentication attack.
- Why would the attacker do this? What's the motive? What constitutes success for the attacker? Motive is direct financial gain: a successful login gives full access to a victim's account. Success = logging in as a customer and being able to view the balance, withdraw funds, or close the account.
- How would it work? The attacker scripts login attempts with large lists of leaked credentials against the login function. Because authentication is required before other functions, a single successful login unlocks deposit, withdrawal, balance inquiry, and account closure for that victim's account.
- What countermeasure is possible? How would the countermeasure work? (Represented as new use cases on the diagram.) (1) Account lockout after a small number of failed attempts, with unlock only through a verified recovery channel — this breaks automated credential testing. (2) Multi-factor authentication for login — a stolen password alone is no longer sufficient. (3) Rate limiting and anomaly detection on login attempts — slows automated attempts and flags credential-stuffing patterns.
- Diagram: draw the malicious user; connect Abuse Case 1 to the Login/Authenticate use case and to the threatened use cases (Get Balance, Withdraw, Close Account); connect the countermeasure use cases to the same area.

### Abuse Case 2 — Unauthorized access to another customer's account
- Abuse Case Description: The attacker, logged in as one customer (or without a valid session), manipulates requests to reach another customer's account data and funds, violating the rule that no customer may access another customer's account.
- Attack type: Broken access control / insecure direct object reference.
- Why would the attacker do this? What's the motive? What constitutes success for the attacker? Motive is financial gain and data theft. Success = viewing another customer's balance, withdrawing from it, or changing it, despite having no legitimate right to that account.
- How would it work? The attacker alters account identifiers in requests (for example, changing the account referenced in a balance or withdrawal request) and the application serves the referenced account without verifying that the requesting user owns it. Because balances are stored permanently and Admin can change any balance, any missing ownership check is directly exploitable.
- What countermeasure is possible? How would the countermeasure work? (Represented as new use cases on the diagram.) (1) Server-side authorization check on every account operation — the application verifies the requesting user's identity against the account owner before serving any balance, withdrawal, deposit, or closure request, and rejects mismatches. (2) Session-to-account binding — each session is bound to exactly one customer account (consistent with the at-most-one-account-per-customer rule), so a session can never address a different account. (3) Audit logging of cross-account access attempts — rejected attempts are logged and alerted, so probing is visible.
- Diagram: draw the malicious user; connect Abuse Case 2 to the Get Balance, Withdraw, and Deposit use cases and to the attacker; connect the countermeasure use cases to the same area.

## ROUND 2 (with partner — revise from joint review)
[FILL: partner name(s).]
[FILL: what your partner's review changed — which cases were combined, corrected, or strengthened, and how.]
### Chosen abuse cases (the two best-defined / most likely, after review)
The two Round 1 cases above are carried forward as the Round 2 pair, refined as follows:
1. Credential stuffing against customer login — refined with the lockout + multi-factor + rate-limiting countermeasures. [FILL: any refinement from your partner's review.]
2. Unauthorized access to another customer's account — refined with the server-side ownership check + session binding + audit-logging countermeasures. [FILL: any refinement from your partner's review.]
- Diagram: draw both cases on the SECOND ROUND diagram with all team members' names on it. Only one copy needs to be created and only one person needs to submit it.
- [FILL: names of all team members, as required on the diagram.]

## Submission checklist
☐ FIRST ROUND diagram with malicious user, two abuse-case bubbles, connections, countermeasure use cases, and filled templates
☐ SECOND ROUND diagram with the two chosen cases, all names on it
☐ This document's template fields completed for each case
☐ One copy submitted electronically via Blackboard (by one team member only)
