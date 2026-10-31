# DRAFT TEMPLATE — IS 472 Exercise 3: Design Exercise (STRIDE packet)
## Status: TEMPLATE ONLY, not a completed packet. The data-flow diagram and trust
## boundaries from the class packet were not available when this was written, so no
## diagram-specific analysis is claimed here. Fill every [FILL] from your packet's
## diagram, then transfer the completed tables into the packet PPTX and submit that
## file with all team members' names on it.
## Instructions (from Blackboard): study the data-flow diagram and trust boundaries;
## use the STRIDE threat-modeling slides; consider how each STRIDE threat could impact
## each part of the model given the trust boundaries; note mitigations in the final
## column of the last slide; be prepared to discuss answers in class; save and submit
## the PPTX with all team members' names.

## How to use this template
For EACH part of your data-flow diagram (each process, data store, data flow, and
external entity), work through the six STRIDE rows below. Ask, for each row: given
the trust boundaries this part crosses, could this threat happen here, and what
would it impact? Leave rows that genuinely do not apply marked "N/A — [reason]",
not blank. The final column of your packet's last slide is the mitigation column —
every applicable threat needs one.

## STRIDE reference (what each category means)
- Spoofing: an attacker pretends to be someone or something else (fake identity).
- Tampering: data is modified in transit or at rest without authorization.
- Repudiation: an action is performed and later denied, with no proof it happened.
- Information Disclosure: confidential data is exposed to someone unauthorized.
- Denial of Service: the part is made unavailable or unusable for legitimate users.
- Elevation of Privilege: a lower-privileged user gains higher-privileged abilities.

## Per-part analysis table (copy once per diagram part)
Part: [FILL: diagram part name + type (process / data store / data flow / external entity)]
Trust boundaries crossed: [FILL: which boundaries, and what sits on each side]
| STRIDE threat | Could it happen here? | Impact on this part | Mitigation (final column) |
| Spoofing | [FILL] | [FILL] | [FILL] |
| Tampering | [FILL] | [FILL] | [FILL] |
| Repudiation | [FILL] | [FILL] | [FILL] |
| Information Disclosure | [FILL] | [FILL] | [FILL] |
| Denial of Service | [FILL] | [FILL] | [FILL] |
| Elevation of Privilege | [FILL] | [FILL] | [FILL] |

## Banking-application example rows (EXAMPLES ONLY — adapt to your actual diagram,
## do not submit these as your analysis)
These use the banking rules from Exercise 2 (Admin/Customer levels, authentication
before other functions, no access to another customer's account, no overdraft, one
account per customer). They illustrate the level of specificity expected.
- Login process / Spoofing: an attacker presents stolen credentials as a customer.
  Impact: full access to the victim's account functions. Mitigation: multi-factor
  authentication + account lockout after failed attempts + rate limiting.
- Balance data flow / Tampering: an attacker alters a balance value in transit.
  Impact: incorrect balances, possible unauthorized withdrawal. Mitigation: integrity
  checks + authenticated, encrypted channels + server-side validation of every
  transaction against the stored balance.
- Withdrawal process / Repudiation: a customer withdraws funds and later denies it.
  Impact: disputes with no evidence. Mitigation: tamper-evident audit logging of
  every transaction with user, time, and amount.
- Account data store / Information Disclosure: stored usernames, passwords, balances
  exposed. Impact: credential theft and privacy breach. Mitigation: hashed passwords,
  encrypted sensitive fields, least-privilege database access.
- Authentication service / Denial of Service: repeated login attempts flood the
  service. Impact: legitimate users cannot log in. Mitigation: rate limiting +
  lockout + monitoring.
- Admin function / Elevation of Privilege: a customer invokes an admin-only balance
  change. Impact: arbitrary balance manipulation. Mitigation: server-side role check
  on every admin operation, never trusting client-supplied role data.

## Submission checklist
☐ Every diagram part analyzed with all six STRIDE rows (or a reasoned N/A)
☐ Mitigations filled in the packet's final column
☐ All team members' names on the packet: [FILL]
☐ Saved as PPTX and submitted via Blackboard
☐ Prepared to discuss answers in class
