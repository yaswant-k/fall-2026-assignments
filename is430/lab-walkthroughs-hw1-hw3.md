# IS 430 — Lab Walkthroughs + Report Skeletons (DRAFTS for Yaswant's own runs)
## Rule that governs this whole file: the handouts prohibit generative AI on these labs, and every screenshot must come from YOUR own SEED VM run. Nothing below invents an output, a screenshot, or an observation.
## How to use each lab: follow the steps in your VM, fill every [PLACEHOLDER] with your real output, then assemble the report + evidence ZIP exactly as specified. Each lab ends with a criterion checklist so you can verify full rubric coverage before submitting.

## Shared setup (all three labs)
- SEED Ubuntu 20.04 VM, Docker, Labsetup files from Blackboard / the SEED Labs page. Do NOT run lab setups from a VirtualBox shared folder — use a normal folder inside the VM.
- Identity banner: open a graphical text editor in the VM and create `identity.txt` with your own information (example format from the handouts: Name; UMBC username; Course: IS 430 - HWn; Evidence tag: IS430-F26-<username>). Use your UMBC username/login, never a card number or password. Keep this editor visible in a narrow strip in EVERY required screenshot, with the terminal/Wireshark content still readable. Capture only the VM desktop, never your whole personal desktop.
- When switching labs: run `dcdown` in the previous lab's setup directory first — all three labs share the same network/addresses and cannot run at the same time.
- Late rule (syllabus): up to 2 days past due at 10% per day, then not accepted. HW1/HW2/HW3 are all past that window on syllabus terms — submission of these labs is subject to Prof. Islam's decision on the Oct 30 follow-up.

---

## HW1 — Packet Sniffing and Spoofing (5 pts, due was Sep 6) — Reading: Du, Chapter 19
### Setup checkpoints (do not continue until all pass)
1. Import the SEED Ubuntu 20.04 VM, log in as seed, copy the Blackboard Labsetup folder into the VM.
2. Start the containers: you should see seed-attacker, hostA-10.9.0.5, hostB-10.9.0.6 in `docker ps`.
3. Find the bridge interface for network net-10.9.0.0 and verify it contains 10.9.0.1.
4. Enter the attacker container, work in the persistent shared directory; on the outer VM, enter Host A and continuously ping Host B.
### Task 1A — Root vs ordinary user (sniffer.py, ICMP filter for Host A traffic)
- Create `sniffer.py` in /volumes on the attacker container, replacing REPLACE_ME with your exact bridge interface name. The program stops after two matching packets or 30 seconds.
- With the Host A ping running, run the same program first as root, then as seed.
- Expected (verify against YOUR run): as root it captures ICMP packets; as an ordinary user it fails with a permission-related error (exact error text varies; capture capture uses OS capabilities such as CAP_NET_RAW).
- [PLACEHOLDER — Screenshot 1: root capture + identity banner]
- [PLACEHOLDER — Screenshot 2: non-root error + identity banner]
- [PLACEHOLDER — Written answer, 2–3 sentences: quote the first line of YOUR actual error and explain why the outcomes differ.]
### Task 1B — Observe ARP discovery (filter "arp")
- Run the sniffer with the ARP filter; while it waits, from Host A ping one unused address on the local subnet (`ping -c 1 10.9.0.99`). If the sniffer stops before showing an ARP request, run it again.
- Expected (verify against YOUR run): Host A broadcasts ARP requests before it can send an IP packet, so the sniffer captures those requests even though the ping gets no echo reply.
- [PLACEHOLDER — Screenshot 3: ARP output + identity banner]
- [PLACEHOLDER — Written answer, 2–3 sentences: reproduce the "Who has …? Tell …" information from YOUR capture and explain why no machine sends an ARP reply.]
### Task 2A — Read the packet before sending (spoof.py)
- Create `spoof.py` in /volumes, replacing the example evidence tag with yours. Note: 192.0.2.123 is a documentation-only address.
- Run `./spoof.py` as root and use its `p.show()` output to complete this table (no extra screenshot required):
  - IP source address: [YOUR VALUE] | IP destination address: [YOUR VALUE] | IP TTL: [YOUR VALUE] | ICMP type: [YOUR VALUE] | Raw payload/evidence tag: [YOUR VALUE]
- [PLACEHOLDER — Written answer, 1 sentence: explain why fields such as packet length and checksum can appear as None before the packet is sent.]
### Task 2B — Send and verify the spoofed request
- Uncomment the final line so it reads `send(p)`. On the outer VM, start Wireshark on your bridge interface with display filter `icmp`. Run the program as root in the attacker container.
- Expected (verify against YOUR run): Wireshark shows an echo request from 192.0.2.123 to 10.9.0.6 and an echo reply from 10.9.0.6 to 192.0.2.123. Select a packet and expand its data so your evidence tag is visible. Save the capture as `<username>_task2.pcapng`. Maximize the VM and place the identity editor in a narrow strip beside Wireshark so both ICMP rows and the evidence tag are readable.
- [PLACEHOLDER — Screenshot 4: Wireshark showing both packet rows, expanded evidence tag, identity banner]
- [PLACEHOLDER — Written answer: explain why the reply goes to 192.0.2.123 (Host B replies to the address in the request's source field, not to an independently verified sender).]
### HW1 submission (exactly two files, replace <username> with your UMBC username)
- File 1: `<username>_HW1_Report.pdf` (max 6 pages, exported PDF, NOT scanned/image-only), in this exact section order: (1) student information and checklist; (2) Task 1A; (3) Task 1B; (4) Task 2A; (5) Task 2B; (6) reflection (75–100 words: one observation from YOUR capture that surprised you + one defense that could detect or reduce source-address spoofing, tied to something visible in your evidence); (7) both programs as selectable text. Embed the 4 screenshots above.
- File 2: `<username>_HW1_Evidence.zip` (files directly inside, no nested folders, no extra files): `<username>_sniffer.py`; `<username>_spoof.py`; `<username>_01_root_icmp.png`; `<username>_02_nonroot_error.png`; `<username>_03_arp_discovery.png`; `<username>_04_spoof_request_reply.png`. Screenshots must be original readable PNGs from inside the SEED VM — no phone photos, HEIC, RAR/7z, or edited images.
- Before submitting: open both files, confirm every item is readable, and verify the Blackboard submission receipt.
- Troubleshooting (from the handout): no packets as root → verify bridge interface name, 10.9.0.1 address, Host A ping running; alias not found → use docker-compose up/down and docker exec; Wireshark shows no reply → same bridge interface, filter icmp, Host B running, destination 10.9.0.6; when finished → stop the ping, exit container shells, run dcdown in the Labsetup directory.
- HW1 criterion checklist: ☐ root capture screenshot ☐ non-root error screenshot ☐ ARP screenshot ☐ Wireshark spoof screenshot ☐ packet-field table ☐ all written answers ☐ 75–100-word reflection ☐ both programs as selectable text ☐ exact filenames, no extras.

## HW2 — Firewall (5 pts, due was Oct 2) — Reading: Du, Chapter 21
### Setup checkpoints
1. Same SEED VM; this lab has its OWN setup files (not HW1's) — get Labsetup.zip from the official SEED Labs Firewall page, download and unzip inside the VM in a normal folder.
2. Containers you should see (5): host-10.9.0.5 (Host A, outside), seed-router (10.9.0.11 / 192.168.60.11), host1-192.168.60.5, host2-192.168.60.6, host3-192.168.60.7 (internal network 192.168.60.0/24; external 10.9.0.0/24). Every packet between networks crosses the router.
3. Keep three root shells open the whole lab: Terminal 2 = router (all firewall rules typed here); Terminal 3 = Host A; Terminal 4 = Host 1. Do not continue until `docker ps` lists all five containers and you have a root shell on the router, Host A, and Host 1.
### Task 1A — What access looks like before any rules (router, Terminal 2)
- Record the starting state: `iptables -L -n` — every chain should be empty, policy ACCEPT.
- From Host A (Terminal 3): ping to 10.9.0.11 should receive replies; telnet to 10.9.0.11 (login seed/dees, then exit) should succeed.
- [PLACEHOLDER — Screenshot 1: successful ping + successful telnet login + identity banner]
- [PLACEHOLDER — Written answer, 2–3 sentences: state the default policy of each chain and what that policy means for a packet matching no rule.]
### Task 1B — Allow ping, block everything else (router, Terminal 2, in this order)
```
iptables -A INPUT -p icmp --icmp-type echo-request -j ACCEPT
iptables -A OUTPUT -p icmp --icmp-type echo-reply -j ACCEPT
iptables -A INPUT -j DROP
iptables -A OUTPUT -j DROP
iptables -L -n
```
- Repeat both tests from Host A: ping to 10.9.0.11 should still receive replies; telnet to 10.9.0.11 will hang — wait ~10 seconds, then Ctrl+C. (DROP discards silently, so Host A waits for a reply that never comes; REJECT would fail at once. Your docker-exec router shell is unaffected because docker exec does not come over the network.)
- [PLACEHOLDER — Screenshot 2: successful ping + blocked telnet attempt + identity banner]
- [PLACEHOLDER — Written answer, 3–4 sentences: purpose of each of the four rules, and why adding the ACCEPT exceptions before switching to DROP is safer even though the finished rule set is the same.]
- Cleanup before Task 2 (router): `iptables -F`; `iptables -P OUTPUT ACCEPT`; `iptables -P INPUT ACCEPT`.
### Task 2A — Read the interfaces and plan the rules (router)
- On the router (ignore loopback lo), run `ip addr` and complete this table (no screenshot required):
  - Interface name: [YOUR VALUE] | IP address on router: [YOUR VALUE] | External or internal?: [YOUR VALUE]
  - (One row per non-loopback interface.)
- Policy your firewall must enforce: (1) outside hosts cannot ping internal hosts; (2) outside hosts CAN ping the router; (3) internal hosts can ping outside hosts; (4) all other traffic between the two networks is blocked.
- [PLACEHOLDER — Written answer, 1–2 sentences: explain why requirement 2 needs no FORWARD rule at all.]
### Task 2B — Apply the rules and verify them (router)
- Replace INT-IF / EXT-IF with your two interface names from Task 2A, and the example evidence tag with yours:
```
iptables -A FORWARD -i INT-IF -o EXT-IF -p icmp --icmp-type echo-request -j ACCEPT
iptables -A FORWARD -i EXT-IF -o INT-IF -p icmp --icmp-type echo-reply -j ACCEPT
iptables -A FORWARD -j DROP
iptables -L FORWARD -n -v
```
(The --comment option attaches your evidence tag to the rule so it appears in the listing.)
- Run all three tests: from Host A (Terminal 3): `ping -c 3 192.168.60.5` — should FAIL, 100% packet loss; ping to 10.9.0.11 — should succeed; from Host 1 (Terminal 4): ping to 10.9.0.5 — should succeed.
- [PLACEHOLDER — Screenshot 3: all three test results + the iptables -L FORWARD -n -v listing with your evidence tag readable + identity banner]
- [PLACEHOLDER — Written answer, 3–4 sentences: trace the third test — which rule lets Host 1's echo request out, and which lets Host A's echo reply back in.]
### HW2 submission (exactly two files)
- File 1: `<username>_HW2_Report.pdf` (max 6 pages, exported PDF, NOT scanned/image-only), exact section order: (1) student information and checklist; (2) Task 1A; (3) Task 1B; (4) Task 2A including the interface table; (5) Task 2B; (6) reflection (75–100 words: one result from YOUR experiments that surprised you + one limitation of your stateless rules — something an attacker could still do or something legitimate your rules break, tied to visible evidence); (7) both rule sets as selectable text. Embed the 3 screenshots above.
- File 2: `<username>_HW2_Evidence.zip` (files directly inside, no nested folders): `<username>_task1_rules.txt`; `<username>_task2_rules.txt`; `<username>_01_baseline_access.png`; `<username>_02_router_protected.png`; `<username>_03_forward_policy.png`. Same screenshot rules as HW1.
- Discrepancy preserved: the handout says "by Friday, September 25, 2026" while Blackboard shows Oct 2, 2026.
- Troubleshooting (from the handout): dcdown fails / router container missing → run dcbuild first (this lab builds the router image locally); ping fails before any rules → confirm you're pinging from the right container, Host A is 10.9.0.5; a rule does nothing → `iptables -L -n -v`, check packet counters (zero = nothing matched; usually wrong interface/direction; first match wins); messed-up rules → `iptables -F`, reset policies to ACCEPT, or restart the container — but NEVER `iptables -t nat -F` (Docker keeps its own rules there); when finished → `iptables -F` plus reset INPUT/OUTPUT/FORWARD policies to ACCEPT, exit shells, run dcdown.
- HW2 criterion checklist: ☐ baseline screenshot ☐ router-protected screenshot ☐ forward-policy screenshot ☐ interface table ☐ all written answers ☐ 75–100-word reflection ☐ both rule sets as selectable text ☐ exact filenames, no extras.

## HW3 — Cross-Site Scripting, XSS (5 pts, due was Oct 19) — Reading: Du, Chapter 13
### Setup checkpoints
1. Same VM; run dcdown in the previous lab's directory first. Download the XSS lab setup files and build/run them inside the VM.
2. Open Firefox INSIDE the SEED VM and visit `http://www.seed-server.com` — exact hostname, http (not the raw IP, not https). The extra CSP hostnames in the original manual are not needed.
3. Two separate sessions, same Elgg site/database: NORMAL Firefox window = Samy (username samy, password seedsamy) — stores the script; NEW PRIVATE window (Ctrl+Shift+P) = Alice (username alice, password seedalice) — views the profile. Two ordinary tabs do NOT give separate logins. Keep Alice's private window open for both tasks — a second private window shares Alice's login. Do not continue until both containers run, the site loads, and Samy is logged in normally and Alice privately. (Local practice accounts only.)
### Task 1A — Save a script in Samy's profile (Samy's normal window)
- Open Samy's profile → Edit profile → in the About me field, select Edit HTML (source/text mode). Do NOT paste into the visual editor. Set visibility to Public if a selector is shown, so Alice can view it.
- Replace the field's contents with the following, replacing jdoe1 with YOUR UMBC username, using straight quotes (not typographic quotes):
  `<script>alert('IS430-F26-<your-username>: stored XSS');</script>`
- Before saving: [PLACEHOLDER — Screenshot 1: source field with the complete personalized script + Samy's editing page + identity banner]. Save the profile; an alert may appear when Samy's own profile loads — dismiss with OK. Save a plain-text copy of the exact script for submission.
- [PLACEHOLDER — Written answer, 2–3 sentences: identify where you saved the script and explain why the browser must receive it as HTML markup, not ordinary displayed text, for it to execute.]
### Task 1B — Visit the profile as Alice (Alice's private window)
- Confirm Alice is logged in, then visit `http://www.seed-server.com/profile/samy`. The personalized alert should appear even though Alice never typed the script.
- [PLACEHOLDER — Screenshot 2: alert + profile URL + private-window indicator + identity banner]. Dismiss the alert, reload the page, and check it appears again (no extra screenshot required for the reload).
- [PLACEHOLDER — Written answer, 3–4 sentences: name who saved the script, whose browser session ran it, and what happened after reloading; explain why this is stored XSS and how reflected XSS differs.]
### Task 2A — Display the visitor's accessible cookies (Samy's normal window, then Alice's)
- Back in Samy's normal window, edit About me in source/text mode again and REPLACE the entire Task 1 snippet with the following (do not leave two scripts in the field), using your own tag:
  `<script>alert('IS430-F26-<your-username>: cookies = ' + document.cookie);</script>`
- Save the profile, dismiss any alert in Samy's window, and save this exact new script as a second plain-text file.
- In Alice's EXISTING private window, reload Samy's profile.
- [PLACEHOLDER — Screenshot 3: cookie alert + profile URL + private-window indicator + identity banner]
- [PLACEHOLDER — Written answer, 2–3 sentences: record the cookie NAMES you observed and identify which browser session supplied them. Do not transcribe cookie values. If nothing follows "cookies =", record that honestly and continue to Part B.]
### Task 2B — Compare the alert with browser storage (same Alice private window)
- Dismiss the alert. Press Shift+F9 for Firefox's Storage Inspector (or Developer Tools → Storage; it may be under the overflow menu). Expand Cookies, select `http://www.seed-server.com`, widen the panel so cookie names and the HttpOnly column are visible. Do NOT log out, clear cookies, or switch accounts between the alert and this comparison.
- [PLACEHOLDER — Screenshot 4: cookie table + profile URL + private-window indicator + identity banner]
- Complete this table for the cookies listed there (add rows as needed; compare values on screen but record only names/observations):
  - Cookie name: [YOUR VALUE] | HttpOnly? (Yes/No): [YOUR VALUE] | Shown in alert? (Yes/No): [YOUR VALUE] | Value matches? (Yes/No/Not visible): [YOUR VALUE]
- [PLACEHOLDER — Written answer, 3–4 sentences: explain what your comparison shows about document.cookie; do not assume all cookies are readable or that an empty alert means the script failed; explain why HttpOnly would not prevent the Task 1 alert from executing.]
- Background (from the handout): document.cookie returns only the JavaScript-accessible cookies for the current document — not every cookie in the browser, not other websites' cookies. The injected code runs as part of the Elgg page in Alice's session; HttpOnly restricts cookie reading, it does not stop the injected script; preventing XSS requires keeping untrusted content from executing.
### HW3 submission (exactly two files, by Monday, October 19, 2026 per the handout)
- File 1: `<username>_HW3_Report.pdf` (max 6 pages, exported PDF, NOT scanned/image-only), exact section order: (1) student information and checklist (must confirm all four screenshots, both scripts, the cookie table, and all written answers are included); (2) Task 1A; (3) Task 1B; (4) Task 2A; (5) Task 2B including the cookie table; (6) reflection (75–100 words: one observation from YOUR experiment + one defense that would prevent the stored script from executing, tied to the profile field used, explaining how the defense prevents execution and why HttpOnly alone would not); (7) both scripts as selectable text. Embed the 4 screenshots above.
- File 2: `<username>_HW3_Evidence.zip` (files directly inside, no nested folders; the two text files must contain the EXACT personalized snippets saved in the profile, including script tags): `<username>_task1_alert.txt`; `<username>_task2_cookies.txt`; `<username>_01_saved_script.png`; `<username>_02_visitor_alert.png`; `<username>_03_cookie_alert.png`; `<username>_04_cookie_storage.png`. Same screenshot rules as HW1. Include only the supplied lab accounts' cookies.
- Before submitting: open both files, confirm every item is readable, and verify the Blackboard submission receipt.
- Troubleshooting (from the handout): network/address in use → dcdown in the previous homework's setup directory, then retry the HW3 directory; site does not load → check both containers and /etc/hosts inside the VM, Firefox inside that VM, exact HTTP hostname; script appears as text / no alert → Edit HTML mode, straight quotes, Public visibility, save, then reload in Alice's window; wrong account / repeated dialogs → check which window you're in, dismiss with OK, remove the previous snippet before saving the new one, reopen the affected window and log in again if Firefox suppresses dialogs; cookies differ/missing → compare within Alice's same session, check HttpOnly/Domain/Path columns, report your actual observation, do not invent a value; when finished → remove the script from Samy's About me field and save, confirm Alice can reload the profile with no alert, close the private window, run dcdown in the HW3 directory (the database persists in mysql_data — stopping containers alone does not remove the saved script).
- HW3 criterion checklist: ☐ saved-script screenshot ☐ visitor-alert screenshot ☐ cookie-alert screenshot ☐ cookie-storage screenshot ☐ cookie table ☐ all written answers ☐ 75–100-word reflection ☐ both scripts as selectable text ☐ exact filenames, no extras.
