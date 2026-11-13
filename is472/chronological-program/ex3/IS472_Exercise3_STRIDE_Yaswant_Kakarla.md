# IS 472 Exercise 3: Design Exercise (STRIDE packet)

- Course: IS 472 Software Security, Prof. Sreedevi Sampath, Fall 2026
- Prepared by: Yaswant Kakarla (ykakarl1)
- Team members: Yaswant Kakarla (ykakarl1); [FILL: team member names, add all team members before submitting]
- Source: design exercise packet slides 1 to 4 (design-exercise.v2.pptx). This file is the text copy of the filled PPTX submission of the same name. The PPTX is the submission file; this .md copy carries the same content.
- Gradebook status (verified live Nov 12, ~01:50 EST): Ex 3 is --/10, NOT graded, never submitted, 1 attempt left, due Sep 29. No Blackboard rubric exists for any IS 472 item. Sampath's Nov 2 appeal about late acceptance is unanswered.

## Step 2: find threats using STRIDE

One row per threatened model part, not one row per STRIDE letter. The model part is shown as a label inside the threat cell. Row S-1 is the packet worked example, kept verbatim.

### Spoofing

| Threat example | What the attacker does |
|---|---|
| Spoofing (S-1): Flow F1: Credentials, Customer to Authenticate. Packet worked example, wording kept verbatim. | Tap communication to get login credentials. Could happen when customer is giving credentials to ‘Authenticate’ |
| Spoofing (S-2): Interactor Admin; Flow F4: Credentials, Admin to Authenticate. | Presents stolen or guessed admin credentials to Authenticate and gains admin rights, including the ability to authorize account creation and change balances. |
| Spoofing (S-3): Interactor Verification System; Flow F12: Confirmation to Make Transaction. | Impersonates the Verification System and sends a false Confirmation, so Make Transaction approves a transaction that was never verified. |
| Spoofing (S-4): Process Authenticate; Stores Customers and Admins. | Replays a captured auth token, or presents a forged token, to Create Account or Make Transaction and is treated as an authenticated user. |
| Spoofing (S-5): Flows F5 and F6: Auth token, Authenticate to Create Account and to Make Transaction. | Intercepts a token in transit and reuses it, or forges a token, to act as the authenticated user at a downstream process. |
| Spoofing (S-6): Flow F7: Identification, Customer to Create Account. | Supplies another customer's identification when an account is created, so the new account is tied to the wrong person. |
| Spoofing (S-7): Process Create Account; Flow F8: Authorization, Admin to Create Account. | Poses as an Admin and sends a false Authorization, so Create Account creates accounts without real admin approval. |
| Spoofing (S-8): Process Change Balance; Flow F14: Account and Balance, Admin to Change Balance. | Spoofs an Admin and submits balance changes for arbitrary accounts. Note: the diagram shows no authentication input to Change Balance, so this spoof only needs to reach F14. |

### Tampering

| Threat example | What the attacker does |
|---|---|
| Tampering (T-1): Flow F11: Transaction type/amount, Customer to Make Transaction. | Alters the transaction type or amount in transit, for example changing a withdrawal into a deposit or changing the amount. |
| Tampering (T-2): Flows F13 and F15: New balance into Accounts. | Modifies the new balance value before it is written, crediting an account with money it does not hold. |
| Tampering (T-3): Flows F1 to F4: Credentials into Authenticate. | Modifies credentials in transit to substitute the attacker's own credentials or to corrupt a login. |
| Tampering (T-4): Flows F5 and F6: Auth token. | Alters token contents, such as the user id or the privilege level, to escalate rights at the receiving process. |
| Tampering (T-5): Flow F12: Confirmation, Verification System to Make Transaction. | Alters the confirmation (amount, account, or approval flag) so a transaction is approved that should be refused, or refused that should be approved. |
| Tampering (T-6): Flows F7 and F8: Identification and Authorization into Create Account. | Alters identification or authorization data so an account is created for the wrong person or without approval. |
| Tampering (T-7): Stores Customers, Admins, Accounts. | With write access to a store, modifies stored data directly: changes a balance, swaps a credential hash, or alters admin records. |
| Tampering (T-8): Processes Authenticate, Create Account, Make Transaction, Change Balance. | Tampers with process code or configuration, for example disabling the balance check in Make Transaction. |

### Repudiation

| Threat example | What the attacker does |
|---|---|
| Repudiation (R-1): Process Make Transaction. | A customer repudiates a transaction, claiming it was never made, and the system holds no record that proves otherwise. |
| Repudiation (R-2): Process Change Balance. | An admin repudiates a balance change, claiming it was never made or was for a different amount. |
| Repudiation (R-3): Process Create Account. | A dispute arises over who authorized an account creation or whose identification was used. |
| Repudiation (R-4): Process Authenticate. | A user claims their credentials were not used in a login, or an admin claims an admin login was not theirs. |
| Repudiation (R-5): Flows F13 and F15: New balance into Accounts. | A dispute arises over which process wrote a given balance value. |
| Repudiation (R-6): Flow F12: Confirmation, Verification System to Make Transaction. | A party disputes whether a confirmation was issued for a transaction. |

### Information Disclosure

| Threat example | What the attacker does |
|---|---|
| Information Disclosure (I-1): Store Customers. | Reads customer records, including names, credentials, and identification data. |
| Information Disclosure (I-2): Store Admins. | Reads admin credentials and uses them to take admin rights. |
| Information Disclosure (I-3): Store Accounts. | Reads account numbers and balances for all customers. |
| Information Disclosure (I-4): Flows F1 to F4: Credentials into Authenticate. | Reads credentials in transit. |
| Information Disclosure (I-5): Flows F5 and F6: Auth token. | Reads a token in transit and reuses it (see also S-4 and S-5). |
| Information Disclosure (I-6): Flow F14: Account and Balance, Admin to Change Balance; Flows F13 and F15: New balance. | Reads balances in transit and learns customer account positions. |
| Information Disclosure (I-7): Flow F11: Transaction type/amount; Flow F12: Confirmation. | Reads transaction details in transit and learns customer activity. |
| Information Disclosure (I-8): Process Authenticate (error messages and timing). | Learns whether a username exists, or which credential failed, from error messages or response timing. |

### Denial of Service

| Threat example | What the attacker does |
|---|---|
| Denial of Service (D-1): Process Authenticate. | Floods login attempts so legitimate customers and admins cannot log in. |
| Denial of Service (D-2): Process Make Transaction. | Floods transaction requests, or sends expensive requests that exhaust the process or the Accounts store. |
| Denial of Service (D-3): Process Create Account. | Submits mass account creation requests, filling the Customers and Accounts stores. |
| Denial of Service (D-4): Process Change Balance. | Floods balance change requests or locks the Accounts store. |
| Denial of Service (D-5): Stores Customers, Admins, Accounts. | Exhausts storage or corrupts data so all processes fail. |
| Denial of Service (D-6): Interactor Verification System; Flow F12: Confirmation. | Blocks or floods the Confirmation flow so Make Transaction cannot complete transactions. |
| Denial of Service (D-7): Flows F1 to F6: Credentials and Auth token. | Floods or disrupts these flows so Authenticate and the downstream processes stall. |

### Elevation of Privilege

| Threat example | What the attacker does |
|---|---|
| Elevation of Privilege (E-1): Process Authenticate. | Logs in as a customer and obtains admin rights, or exploits a flaw in Authenticate to gain a higher privilege token. |
| Elevation of Privilege (E-2): Process Create Account; Flow F8: Authorization. | A customer, or an attacker with no admin rights, sends an Authorization and creates accounts without admin approval. |
| Elevation of Privilege (E-3): Process Change Balance. | A customer reaches Change Balance and alters a balance. Note: the diagram shows no authentication input to Change Balance, so this path depends only on reaching F14. |
| Elevation of Privilege (E-4): Store Admins. | Modifies the Admins store to add the attacker as an admin. |
| Elevation of Privilege (E-5): Flows F5 and F6: Auth token. | Modifies or forges a token to carry admin privileges into Create Account or Make Transaction. |
| Elevation of Privilege (E-6): Process Make Transaction. | Submits a transaction against another customer's account. |
| Elevation of Privilege (E-7): Flow F14: Account and Balance, Admin to Change Balance. | Without admin rights, injects a balance change request into Change Balance. |

## Step 3: Mitigation

### Spoofing

| Threat example | What the attacker does | What are you going to do about it? |
|---|---|---|
| Spoofing (S-1): Flow F1: Credentials, Customer to Authenticate. Packet worked example, wording kept verbatim. | Tap communication to get login credentials. Could happen when customer is giving credentials to ‘Authenticate’ | Use two-factor authentication, strong password policies |
| Spoofing (S-2): Interactor Admin; Flow F4: Credentials, Admin to Authenticate. | Presents stolen or guessed admin credentials to Authenticate and gains admin rights, including the ability to authorize account creation and change balances. | Mandatory two-factor authentication for admin logins; separate admin credential store and admin login path; admin login only from a restricted network or terminal; lockout and alerting on failed admin logins. |
| Spoofing (S-3): Interactor Verification System; Flow F12: Confirmation to Make Transaction. | Impersonates the Verification System and sends a false Confirmation, so Make Transaction approves a transaction that was never verified. | Mutual authentication between Make Transaction and the Verification System; accept only signed confirmations tied to a specific transaction; reject unsigned, stale, or replayed confirmations; log the confirmation source. |
| Spoofing (S-4): Process Authenticate; Stores Customers and Admins. | Replays a captured auth token, or presents a forged token, to Create Account or Make Transaction and is treated as an authenticated user. | Short-lived tokens bound to the session and the user; signed tokens verified on every use; token revocation on logout; replay detection at each receiving process. |
| Spoofing (S-5): Flows F5 and F6: Auth token, Authenticate to Create Account and to Make Transaction. | Intercepts a token in transit and reuses it, or forges a token, to act as the authenticated user at a downstream process. | Transmit tokens only over an encrypted channel; never put tokens in URLs or logs; validate signature and expiry at each receiving process. |
| Spoofing (S-6): Flow F7: Identification, Customer to Create Account. | Supplies another customer's identification when an account is created, so the new account is tied to the wrong person. | Verify identification against an authoritative source before account creation; require a verified document or in-person check for new customers; log the identification evidence presented. |
| Spoofing (S-7): Process Create Account; Flow F8: Authorization, Admin to Create Account. | Poses as an Admin and sends a false Authorization, so Create Account creates accounts without real admin approval. | Accept Authorization only with an authenticated admin session token; check the admin role server side on every authorization; log every authorization with the admin identity. |
| Spoofing (S-8): Process Change Balance; Flow F14: Account and Balance, Admin to Change Balance. | Spoofs an Admin and submits balance changes for arbitrary accounts. Note: the diagram shows no authentication input to Change Balance, so this spoof only needs to reach F14. | Authenticate the admin session behind the Change Balance path and authorize each balance change against the admin role; require a second approval or confirmation for large changes; audit log every change with admin identity. |

### Tampering

| Threat example | What the attacker does | What are you going to do about it? |
|---|---|---|
| Tampering (T-1): Flow F11: Transaction type/amount, Customer to Make Transaction. | Alters the transaction type or amount in transit, for example changing a withdrawal into a deposit or changing the amount. | Integrity protection on the flow (signed or MAC-protected messages); server-side validation of type and amount against the account and the session; re-derive the amount from the authenticated session rather than trusting the client-supplied value. |
| Tampering (T-2): Flows F13 and F15: New balance into Accounts. | Modifies the new balance value before it is written, crediting an account with money it does not hold. | Compute the new balance server side from the stored balance and the validated transaction; never accept a client-supplied balance; integrity checks on store writes. |
| Tampering (T-3): Flows F1 to F4: Credentials into Authenticate. | Modifies credentials in transit to substitute the attacker's own credentials or to corrupt a login. | Encrypted channel with integrity protection; compare credential hashes server side; never transmit or store plaintext passwords. |
| Tampering (T-4): Flows F5 and F6: Auth token. | Alters token contents, such as the user id or the privilege level, to escalate rights at the receiving process. | Signed tokens; server-side validation of signature and contents on every use; reject any modified token. |
| Tampering (T-5): Flow F12: Confirmation, Verification System to Make Transaction. | Alters the confirmation (amount, account, or approval flag) so a transaction is approved that should be refused, or refused that should be approved. | Signed confirmation messages that include transaction id, amount, and account; verify the signature and match the confirmation to the pending transaction before acting. |
| Tampering (T-6): Flows F7 and F8: Identification and Authorization into Create Account. | Alters identification or authorization data so an account is created for the wrong person or without approval. | Integrity-protected messages; server-side revalidation of the identification and of the authorizing admin session before the account is created. |
| Tampering (T-7): Stores Customers, Admins, Accounts. | With write access to a store, modifies stored data directly: changes a balance, swaps a credential hash, or alters admin records. | Least-privilege database access; writes only through the authorized processes; integrity constraints on the stores; audit logging of all writes; tested backups with restore verification. |
| Tampering (T-8): Processes Authenticate, Create Account, Make Transaction, Change Balance. | Tampers with process code or configuration, for example disabling the balance check in Make Transaction. | Code signing and integrity monitoring; least-privilege service accounts for each process; change control on code and configuration; configuration review. |

### Repudiation

| Threat example | What the attacker does | What are you going to do about it? |
|---|---|---|
| Repudiation (R-1): Process Make Transaction. | A customer repudiates a transaction, claiming it was never made, and the system holds no record that proves otherwise. | Tamper-evident transaction log recording the authenticated user, account, type, amount, timestamp, and confirmation reference; keep the log separate from the Accounts store. |
| Repudiation (R-2): Process Change Balance. | An admin repudiates a balance change, claiming it was never made or was for a different amount. | Append-only audit log of every balance change with admin identity, old balance, new balance, timestamp, and reason; require admin re-authentication for each change. |
| Repudiation (R-3): Process Create Account. | A dispute arises over who authorized an account creation or whose identification was used. | Log the authorizing admin, the identification evidence, the auth token identity, and the timestamp for every account created. |
| Repudiation (R-4): Process Authenticate. | A user claims their credentials were not used in a login, or an admin claims an admin login was not theirs. | Login audit log covering success and failure, with user, time, and source; alert on unusual logins; retain logs. |
| Repudiation (R-5): Flows F13 and F15: New balance into Accounts. | A dispute arises over which process wrote a given balance value. | Each write records the writing process and the transaction reference; reconcile the Accounts store against the transaction log. |
| Repudiation (R-6): Flow F12: Confirmation, Verification System to Make Transaction. | A party disputes whether a confirmation was issued for a transaction. | Retain signed confirmations with the transaction record; the Verification System keeps its own log of confirmations issued. |

### Information Disclosure

| Threat example | What the attacker does | What are you going to do about it? |
|---|---|---|
| Information Disclosure (I-1): Store Customers. | Reads customer records, including names, credentials, and identification data. | Salted hashing for stored credentials; encryption at rest for sensitive fields; least-privilege access; never return credential data to the client. |
| Information Disclosure (I-2): Store Admins. | Reads admin credentials and uses them to take admin rights. | Same protections as I-1, plus separate storage with stricter access control and monitoring of all reads. |
| Information Disclosure (I-3): Store Accounts. | Reads account numbers and balances for all customers. | Encryption at rest; access only through authenticated and authorized processes; no bulk read path. |
| Information Disclosure (I-4): Flows F1 to F4: Credentials into Authenticate. | Reads credentials in transit. | Encrypted channel; never log credentials; minimize credential exposure on every flow. |
| Information Disclosure (I-5): Flows F5 and F6: Auth token. | Reads a token in transit and reuses it (see also S-4 and S-5). | Encrypted channel; short token expiry; binding to the session; never log tokens. |
| Information Disclosure (I-6): Flow F14: Account and Balance, Admin to Change Balance; Flows F13 and F15: New balance. | Reads balances in transit and learns customer account positions. | Encrypted channel; send the least data needed on the flow, such as an account reference and a delta rather than a full balance, where the design allows it. |
| Information Disclosure (I-7): Flow F11: Transaction type/amount; Flow F12: Confirmation. | Reads transaction details in transit and learns customer activity. | Encrypted channel; minimal data on the flow; no transaction details in logs. |
| Information Disclosure (I-8): Process Authenticate (error messages and timing). | Learns whether a username exists, or which credential failed, from error messages or response timing. | Generic login error messages that do not distinguish an unknown user from a wrong password; constant-time comparison where practical; rate limiting. |

### Denial of Service

| Threat example | What the attacker does | What are you going to do about it? |
|---|---|---|
| Denial of Service (D-1): Process Authenticate. | Floods login attempts so legitimate customers and admins cannot log in. | Rate limiting; lockout after failed attempts; added verification after failures; separate capacity for the admin login path. |
| Denial of Service (D-2): Process Make Transaction. | Floods transaction requests, or sends expensive requests that exhaust the process or the Accounts store. | Per-user rate limits; validate requests before expensive work; resource quotas; monitoring and alerting. |
| Denial of Service (D-3): Process Create Account. | Submits mass account creation requests, filling the Customers and Accounts stores. | Admin authorization required before creation; rate limits; a verification step before the account is created. |
| Denial of Service (D-4): Process Change Balance. | Floods balance change requests or locks the Accounts store. | Admin authentication and authorization; rate limits; short transactions; minimal store locking. |
| Denial of Service (D-5): Stores Customers, Admins, Accounts. | Exhausts storage or corrupts data so all processes fail. | Storage quotas; backups; integrity monitoring; store access only through the processes. |
| Denial of Service (D-6): Interactor Verification System; Flow F12: Confirmation. | Blocks or floods the Confirmation flow so Make Transaction cannot complete transactions. | Timeouts with explicit failure handling; bounded retries; fail safe on missing confirmation (do not approve without one); monitoring of confirmation latency. |
| Denial of Service (D-7): Flows F1 to F6: Credentials and Auth token. | Floods or disrupts these flows so Authenticate and the downstream processes stall. | Encrypted and authenticated channels; timeouts; rate limiting at the trust boundary. |

### Elevation of Privilege

| Threat example | What the attacker does | What are you going to do about it? |
|---|---|---|
| Elevation of Privilege (E-1): Process Authenticate. | Logs in as a customer and obtains admin rights, or exploits a flaw in Authenticate to gain a higher privilege token. | Separate customer and admin authentication paths and credential stores; role encoded in a signed token and checked server side on every request; least privilege by default. |
| Elevation of Privilege (E-2): Process Create Account; Flow F8: Authorization. | A customer, or an attacker with no admin rights, sends an Authorization and creates accounts without admin approval. | Accept Authorization only from an authenticated admin session; check the admin role server side; never make the authorization decision on the client. |
| Elevation of Privilege (E-3): Process Change Balance. | A customer reaches Change Balance and alters a balance. Note: the diagram shows no authentication input to Change Balance, so this path depends only on reaching F14. | Change Balance reachable only through an authenticated admin session; role check on every call; audit logging of every change. |
| Elevation of Privilege (E-4): Store Admins. | Modifies the Admins store to add the attacker as an admin. | Admins store writable only through a controlled admin-management path; integrity monitoring; alerts on any admin record change. |
| Elevation of Privilege (E-5): Flows F5 and F6: Auth token. | Modifies or forges a token to carry admin privileges into Create Account or Make Transaction. | Signed tokens; server-side signature and role validation on every use; short expiry; revocation. |
| Elevation of Privilege (E-6): Process Make Transaction. | Submits a transaction against another customer's account. | Bind every transaction to the authenticated session identity; verify account ownership server side on every transaction; reject mismatches. |
| Elevation of Privilege (E-7): Flow F14: Account and Balance, Admin to Change Balance. | Without admin rights, injects a balance change request into Change Balance. | Authenticate and authorize the caller before Change Balance acts; verify the account reference against the caller's authority; log every change. |

## How this was done

### Method

- Studied the data flow diagram on slide 2 and the trust boundaries drawn on it.
- Applied each STRIDE letter to each part of the model (processes, data stores, data flows, external interactors), one row per threatened model part, 44 rows in total.
- Wrote the attacker action and the mitigation for each row from the diagram as drawn, not from a corrected diagram.
- Kept the packet worked example S-1 word for word.

### Sources used

- Design exercise packet slides 1 to 4 (design-exercise.v2.pptx), including the extracted slide text and the rendered slide images.
- No other source was used for the diagram description or the analysis. No banking application rules beyond the diagram were cited.

### Key decisions

- One row per threatened model part, not one row per STRIDE letter, because the packet instruction is to reason how each threat could impact each part of the model, given the trust boundaries drawn.
- The thick black rectangle on slide 2 is not treated as a trust boundary because the legend does not define it. Rows S-8, E-3, and E-7 are the rows most affected if the team reads it as one.
- The model part is shown as a label inside the threat cell, as specified in the Phase 5 analysis.
- Missing flows are recorded as gaps, and rows that depend on them say so: no balance read by Make Transaction, no result returned to the Customer, no request to the Verification System, no authentication input to Change Balance.

### What still needs verification

- Team member names: only Yaswant Kakarla is listed. Add all team member names before submitting.
- The thick black rectangle reading, if the team decides it is a trust boundary. If so, say so in the submission and adjust rows S-8, E-3, and E-7.
- Class discussion: be prepared to talk about the answers with the rest of the class.
- Submission: save and submit the PPTX on Blackboard. Nothing in this package is submitted; the file is ready for Yaswant to submit.
- Late acceptance: Ex 3 was due Sep 29 and is ungraded in the gradebook (--/10, 1 attempt left). The Nov 2 appeal to Prof. Sampath about late acceptance is unanswered, so acceptance of a late submission is not confirmed.

## The data flow diagram as drawn (slide 2)

Processes: Authenticate (checks credentials and issues auth tokens); Create Account (creates a new customer and a new account, from identification and authorization); Make Transaction (carries out a transaction from transaction type and amount, a confirmation, and an auth token); Change Balance (changes an account balance from admin-supplied account and balance data).

Data stores: Customers (customer records; receives new customer records from Create Account; supplies credentials to Authenticate); Admins (admin records; supplies credentials to Authenticate); Accounts (account records and balances; receives new accounts from Create Account and new balances from Make Transaction and Change Balance).

External interactors: Customer (supplies credentials, identification, and transaction type/amount); Admin (supplies credentials, authorization, and account and balance data); Verification System (supplies a confirmation to Make Transaction).

### Flows

| # | From | To | Label as drawn |
|---|---|---|---|
| F1 | Customer | Authenticate | Credentials |
| F2 | Customers (store) | Authenticate | Credentials |
| F3 | Admins (store) | Authenticate | Credentials |
| F4 | Admin | Authenticate | Credentials |
| F5 | Authenticate | Create Account | Auth token |
| F6 | Authenticate | Make Transaction | Auth token |
| F7 | Customer | Create Account | Identification |
| F8 | Admin | Create Account | Authorization |
| F9 | Create Account | Customers (store) | New customer |
| F10 | Create Account | Accounts (store) | New Account |
| F11 | Customer | Make Transaction | Transaction type/amount |
| F12 | Verification System | Make Transaction | Confirmation |
| F13 | Make Transaction | Accounts (store) | New balance |
| F14 | Admin | Change Balance | Account and Balance |
| F15 | Change Balance | Accounts (store) | New balance |

Notes on the flow inventory: four separate flows into Authenticate share the single label Credentials (F1 to F4). Two flows share the label Auth token (F5, F6) and two share the label New balance (F13, F15). No flow returns a result to the Customer. No flow shows Make Transaction reading the current balance from Accounts. No flow shows a request going from Make Transaction to the Verification System; only the Confirmation comes back. No flow connects Authenticate to Change Balance, so the diagram shows no authentication input to Change Balance. The only input to Change Balance is Account and Balance from the Admin.

### Trust boundaries as drawn

The legend defines the trust boundary as a grey dashed wavy line. Dashed segments are drawn between each external interactor and the processes and stores: between Customer and Authenticate (F1 crosses it), between Customer and Create Account (F7 crosses it), and between Customer and Make Transaction (F11 crosses it); between Admin and Authenticate (F4 crosses it), between Admin and Create Account (F8 crosses it), and between Admin and Change Balance (F14 crosses it); between Verification System and Make Transaction (F12 crosses it). Additional dashed segments pass near the Customers store and near the Accounts store, inside the system area. Reading: every flow from an external interactor crosses a trust boundary before it reaches a process. All four processes and all three stores sit on the trusted side of the interactor boundaries. That is the one boundary reading the drawing supports with confidence. There is also a thick black rectangle enclosing the right hand region. It contains the Admins store, the Admin interactor, Change Balance, and the Accounts store, and its left edge cuts through the right side of the Authenticate oval. The legend does not define this rectangle. Its meaning is listed under ambiguities below, and this document does NOT treat it as a trust boundary.

### Ambiguities and gaps in the drawing

1. Thick black rectangle. It is not in the legend. It could be a system boundary, an inner trust boundary around the admin subsystem, or a grouping box with no security meaning. If it is an inner trust boundary, then the Admin to Change Balance flow (F14) and the Change Balance to Accounts flow (F15) sit inside it, while the Admin to Authenticate (F4) and Admin to Create Account (F8) flows cross it. This document does not assume any of these readings.
2. Dashed trust boundaries do not form visibly closed loops in the render. The segments are disconnected, so the exact path of each boundary cannot be traced with confidence. What is certain is that a dashed segment sits between each external interactor and the processes.
3. Inner boundary near Accounts. A dashed segment passes above the Accounts store between Change Balance and Accounts. It is not clear whether this is a separate inner boundary around the Accounts store or part of a larger boundary loop. This document does not claim an inner boundary around Accounts.
4. Auth token flow to Make Transaction (F6). It is routed along the bottom edge of the thick black rectangle and rises into Make Transaction from below. The label and the arrowhead are clear, but the line does not leave the Authenticate oval as a short direct arrow, so the path is inferred from the label and arrowhead, not from a clean direct line.
5. Credentials flow from Customer to Authenticate (F1). It is routed over the top of the diagram, around the Customers store. Its origin is the top edge of the Customer box. The label is clear; the routing is unusual and is recorded here rather than redrawn.
6. Shared labels. All four Credentials flows and both Auth token and both New balance flows share labels, so the diagram carries no distinction between customer and admin credentials, between a token issued for account creation and one issued for transactions, or between a balance produced by a transaction and one set by an admin.
7. Missing flows. The diagram shows no balance read by Make Transaction, no result returned to the Customer, no request to the Verification System, and no authentication input to Change Balance. The STRIDE rows that depend on these missing flows say so explicitly; the mitigations are written for the diagram as drawn, not for a corrected diagram.

## Coverage check

- Processes: Authenticate (S-4, T-8, R-4, I-8, D-1, E-1); Create Account (S-6, S-7, T-8, R-3, D-3, E-2); Make Transaction (S-3, S-5, T-8, R-1, D-2, E-6); Change Balance (S-8, T-8, R-2, D-4, E-3, E-7).
- Stores: Customers (T-7, R-3, I-1, D-5); Admins (S-4, T-7, I-2, D-5, E-4); Accounts (T-7, R-5, I-3, D-5).
- Flows: All fifteen flows F1 to F15 are named in at least one row.
- Interactors: Customer (S-1, S-6, T-1, D-1); Admin (S-2, S-7, S-8, E-2, E-3, E-7); Verification System (S-3, T-5, R-6, D-6).

Total: 44 rows (Spoofing 8, Tampering 8, Repudiation 6, Information Disclosure 8, Denial of Service 7, Elevation of Privilege 7). Row S-1 is the packet's worked example, kept verbatim. All other rows are new analysis written for this exercise.

## Sources

- Design exercise packet slides 1 to 4, extracted text and rendered images, `~/workspace/fall2026-audit/extracted/design-exercise-v2.txt`, `ex3-slide-1.png` through `ex3-slide-4.png`.
- No other source was used for the diagram description or the analysis. No banking application rules beyond the diagram were cited in this document.
