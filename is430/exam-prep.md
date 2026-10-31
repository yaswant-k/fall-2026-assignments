# DRAFT — IS 430 Exam Prep: Network Security (Chapters 19–21)
## Status: PREP ONLY. Practice questions for Exam-1 topics — the exam itself must be taken by Yaswant. Topics follow the syllabus (Chapters 19–21) and the HW1/HW2 lab handouts (Oct 30 read). No exam questions were copied from anywhere — Blackboard showed no exam question text.
## Note: the gradebook shows Exam-1 as not graded (—/50). Separately, the instructor's Oct 21 email gave Exam 2 on Oct 26 and Exam 3 on Dec 14; neither appears as a gradebook column.

## Chapter 19 — Network security basics, sniffing & spoofing
1. Q: Why does packet capture require privilege (root / CAP_NET_RAW), while ordinary network use does not?
   A: Capture opens a raw socket that sees traffic beyond the user's own packets. The OS restricts that capability so an ordinary user cannot eavesdrop on other users' or hosts' traffic.
2. Q: A sniffer with an ICMP filter for Host A (10.9.0.5) does not match replies from Host B (10.9.0.6). Why?
   A: The filter selects by source address. Replies from Host B carry source 10.9.0.6, so they fail the Host A source match even though they are part of the same ping exchange.
3. Q: Host A pings an unused address (10.9.0.99) and no echo reply comes back, yet a sniffer captures traffic. What traffic, and why?
   A: ARP requests. Host A does not know which Ethernet address owns 10.9.0.99, so it broadcasts "Who has 10.9.0.99? Tell [Host A]" before it can send the IP packet. No machine owns that address, so no ARP reply is sent — but the requests themselves are visible on the wire.
4. Q: A forged ICMP echo request claims source 192.0.2.123. Host B replies — to whom, and why does Host B accept the request at all?
   A: Host B replies to 192.0.2.123, the address in the request's source field. IP has no built-in sender authentication: the receiver trusts the source field unless something else (like ingress filtering) checks it. The forged source field determines the reply destination.
5. Q: Before a spoofed packet is sent, why can fields like packet length and checksum appear as None in the packet description?
   A: Those fields are computed when the packet is actually built/sent, not when it is constructed in code. Until then they have no value yet.

## Chapter 21 — Firewalls (iptables)
6. Q: A packet addressed to the router itself is handled by which chains, and a packet merely passing through the router by which chain?
   A: Addressed to the router: INPUT (incoming) and OUTPUT (outgoing). Passing through: FORWARD. Choosing the wrong chain means the rule never matches the packet.
7. Q: A router's chains are empty with policy ACCEPT. What happens to a packet matching no rule, and why is that the dangerous default?
   A: It is accepted. With policy ACCEPT, anything not explicitly matched passes — so the firewall protects nothing until rules (or a DROP default) are in place.
8. Q: These rules are entered in order: ACCEPT icmp echo-request (INPUT); ACCEPT icmp echo-reply (OUTPUT); DROP everything (INPUT); DROP everything (OUTPUT). Why must the ACCEPT rules come first, and why does a blocked telnet attempt hang instead of failing immediately?
   A: Rules match in order, first match wins — if the DROP rules came first, the ACCEPT exceptions would never be reached. The telnet attempt hangs because DROP discards silently: Host A gets no refusal and waits for a reply that never comes. A REJECT rule would send an error back and fail at once; silence reveals less and wastes an attacker's time (though a scanner still reports the port as filtered).
9. Q: The firewall policy requires: outside cannot ping internal hosts; outside CAN ping the router; internal can ping outside; all other cross-network traffic blocked. Why does requirement 2 need no FORWARD rule?
   A: Packets to the router itself are handled by INPUT/OUTPUT, not FORWARD. FORWARD only governs packets passing through — so requirement 2 is a router-self rule, not a forwarding rule.
10. Q: For internal→outside ping to work through the firewall, which two rules are needed, and why two?
    A: One FORWARD rule allowing internal-to-external ICMP echo-request, and one allowing external-to-internal ICMP echo-reply. Ping is a request/reply pair in opposite directions; allowing only the request out would still block the reply coming back.

## Chapter 20 — Attacks on the TCP Protocol (concept check)
11. Q: Why are stateless firewall rules (like the ones in HW2) insufficient against some attacks, and what do stateful firewalls add?
    A: Stateless rules judge each packet alone (addresses, ports, protocol) with no memory of the connection. They cannot tell whether a packet belongs to an established, legitimate conversation or is an unsolicited/forged packet that merely looks similar. Stateful firewalls track connection state, so they can allow reply traffic for connections that were legitimately initiated and deny packets that match no known connection.
12. Q: What is the core weakness that makes TCP-level attacks (spoofing, session hijacking) possible in the first place?
    A: Like IP source spoofing, TCP's basic mechanisms trust header fields (addresses, sequence numbers) that an attacker who can observe or guess them can forge. Defenses work by adding verification the original design lacked: unpredictable sequence numbers, authentication, encryption, and stateful filtering.
