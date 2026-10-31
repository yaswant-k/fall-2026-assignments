# DRAFT ANSWERS — IS 369: IT-2 + Critical Thinking 1 & 2
## Status: DRAFTS for review, written from the Oct 30 Blackboard article summaries
## (paraphrases of the articles, not copies of article text). NOT submitted.
## What is deliberately left for Yaswant: every question that asks for HIS opinion,
## agreement, concern, or experience is marked [YOUR VIEW] — do not submit a borrowed
## opinion as your own; fill those in your own words. Partner name and the IT-2
## separate evaluation are also [FILL]. Precision note from the pull: a few PDF
## sentences were truncated in Blackboard's text extraction, so the summaries
## paraphrased the visible argument and tables; numbers below come from the articles'
## tables and results sections.
## Rubrics: IT-2 → RUBRIC-IT; CT1/CT2 → RUBRIC-CT (see the IS 369 prompt pack).

# ============ IT-2 (30 pts) ============
# Article: Hou, Zhu, Liu, Sudarshan, Chong, Zhang, Tan, & Ong (2026), Computers &
# Education, 247, 105576. Study: 226 first/second-year undergraduates, digital-literacy
# course, NTU, August semester 2024; 112 comparison, 114 intervention; intervention =
# one 2-hour in-class session; 38 group reports analyzed.
# Partner: [FILL: partner name]

## 1. APA citation
Hou, Zhu, Liu, Sudarshan, Chong, Zhang, Tan, and Ong (2026), Computers & Education,
247, Article 105576. (Use the journal's exact author order and article number from the
article's first page when formatting the final reference list.)

## 2. Critical thinking (Delphi Report, as presented in the article)
Critical thinking is purposeful, self-regulatory judgment: interpreting, analyzing,
evaluating, and inferring, and explaining the evidence, concepts, methods, criteria,
and context behind a judgment. In problem-based learning it is what lets students
articulate their reasoning, weigh alternatives, and justify a solution — a capacity
that matters more, not less, when AI can supply fluent but unchecked answers.

## 3. The three instructional strategies (Abrami et al. meta-analysis)
(1) Authentic instruction: learning set in real-world, ill-structured problems rather
than textbook exercises. (2) Dialogue: structured discussion and role-play in which
students clarify ideas, challenge assumptions, and weigh multiple perspectives.
(3) Mentoring: personalized, timely feedback and scaffolding — here delivered at scale
by a GPT-based peer tutor, since one instructor cannot mentor every group at once.

## 4. Reflective vs. thoughtless use (Reliance Behaviors Scale)
The scale measures how students behave while using AI, independently of whether the
final answer was right or wrong, so it captures process rather than outcome. Its four
patterns: reflective use (deliberately questioning, checking, and revising AI output
before using it); collaborative use (working back and forth with AI, combining its
output with one's own ideas); cautious use (active skepticism, spotting flaws,
engaging only selectively); and thoughtless use (accepting AI output with little
scrutiny and copying or adopting it directly). Reflective and cautious use are the
thoughtful end; thoughtless use is the uncritical end; collaborative use sits between,
since it can be thoughtful joint work or merely co-produced output.

## 5. Trust as a predictor of reliance
Trust is the belief that an agent will help the user reach personal goals. Across
studies, higher trust is consistently associated with greater reliance, and in this
study trust significantly predicted both reflective use (beta = 0.31, p < 0.01) and
thoughtless use (beta = 0.31, p < 0.01). So higher trust does NOT always lead to
better outcomes: it increases overall engagement with AI rather than guaranteeing
good engagement. Excessive trust can lead students to accept AI suggestions even when
other evidence contradicts them, while too little trust can lead them to dismiss
accurate suggestions. Trust is an important predictor of reliance, not a determinant
of it; students also adjust reliance by weighing costs and benefits.

## 6. The authentic-instruction critical-thinking exercise
After instructors reviewed AI concepts (machine learning, deep learning, AI
applications), student teams drafted a practice guide / policy proposal for teaching
and learning with Generative AI at NTU, responding to observed AI-misuse cases. The
task had three stages: (1) problem identification — choose a case, define the core
issue, analyze its impact on learning, and articulate stakeholder concerns;
(2) information exploration — propose strategies addressing the core issue, aligned
with stakeholder needs and handling conflicts among stakeholders; (3) solution
presentation — present and evaluate the proposal, reflect on strengths and weaknesses,
and discuss whether it addressed the original problem. In the intervention condition,
students were additionally guided to spot potential biases in AI-generated content;
the comparison group used Generative AI freely, without those scaffolds.

## 7. The GPT-based peer tutor (Socratic chatbot)
A customized GPT, built with OpenAI's GPT creation tools, acted as a mentoring peer
tutor rather than an answer giver. It was designed to (1) recognize which
problem-solving stage a group was in and give stage-appropriate scaffolding;
(2) promote critical thinking by asking Socratic questions, for example about which
stakeholders' interests were at stake; and (3) monitor progress and give constructive
feedback, for example noting clear steps for fairness and prompting students to
strengthen a weak part. The design mirrors teacher feedback and tutoring, at a scale
instructors cannot provide to every group simultaneously.

## 8. Two elements of a truly creative solution
Following the standard definition used in the article (Runco and Jaeger), a solution
counts as truly creative only if it has both novelty/originality AND
usefulness/effectiveness: it must be new or uncommon, and it must also be workable and
fit for the problem. The study assesses this through originality of ideas, idea
density, and human-rated novelty of ideas and writing, alongside feasibility as part
of problem-solving quality.

## 9. CPIDR and DEPID
Both are computational measures of idea density: how many distinct ideas or
propositions are packed into a text, taken as an indicator of sophisticated, rich
articulation — not simply of length. CPIDR (Computerized Propositional Idea Density
Rater) counts propositions with a rule-based, part-of-speech approach; DEPID
(Dependency-based Propositional Idea Density Rater) uses syntactic dependency parsing
to identify unique propositions. Higher scores mean denser idea content. Across the
38 reports the overall means were CPIDR 0.49 and DEPID 0.40.

## 10. Individual outcomes: self-reported critical thinking
No significant improvement. The regression predicting perceived critical thinking,
controlling for trust and disciplinary background, was not significant
(F(3, 222) = 0.53, p = 0.65). The authors offer three explanations: the intervention
lasted only 2 hours in a single session, too short to shift a general skill;
problem-based learning itself fosters critical thinking, so both conditions may have
perceived themselves as thinking critically; and a general self-report scale (adapted
from the Motivated Strategies for Learning Questionnaire, Cronbach's alpha = 0.80)
may not capture condition-specific differences in how students engaged with AI.

## 11. Group outcomes: direct adoption of AI content
Direct adoption was measured as the similarity between a group's report and its AI
chat history. The intervention group adopted significantly less AI content directly
than the comparison group: mean 0.50 versus 0.69 (t = 2.50, p < 0.05, df = 22). In other
words, intervention groups reworked AI output more instead of copying it. Adoption was
also negatively related to originality (r = -0.49, p < 0.05): groups that copied more
produced less original reports.

## 12. Originality via cosine similarity
Each group report was converted to a sentence embedding (Sentence-BERT). The centroid
— the average embedding of all reports — represents the collective, typical content.
Semantic originality is the distance from that centroid: a report whose embedding is
less similar (lower cosine similarity) to the centroid is more distinctive relative
to the whole set, and therefore scored as more original. Intervention reports were
significantly more original than comparison reports (means 0.04 versus 0.03,
t = -2.06, p < 0.05), and human-rated novelty agreed with the computational measure
(r = 0.36, p < 0.05).

## 13. The Evaluation paradox
Evaluation was the only problem-solving quality dimension with a significant group
difference, and it favored the comparison group (means 1.92 versus 1.31, t = 2.49,
p < 0.05); all other quality dimensions showed no significant difference. The authors'
discussion interpretation — presented as interpretation, not a second experiment —
is that comparison groups engaged in more knowledge-based dialogue and elaborated
discussion with Generative AI, and that Generative AI is resilient to cognitive
intensity, so it can keep performing consistently on evaluative discussion (weighing
advantages and limitations) even when students are cognitively loaded. Intervention
groups, by contrast, spent their effort on critical scaffolding, bias-checking, and
revising, which improved creativity and reduced thoughtless adoption but did not raise
this one evaluation score.

## 14. Role-play stakeholder perspectives
Students were required to adopt and integrate the perspectives of students,
instructors, peers, and ICC (Interdisciplinary Collaborative Core) administrators. The
coding scheme's perspective-taking dimension likewise credits reports that list and
integrate the concerns of students, instructors, and ICC administrators, rather than
presenting only the student's own view.

## 15. Disciplinary differences (STEM vs. non-STEM)
STEM background (mathematics, computing/data science, engineering, and medical
programs; non-STEM was social sciences, humanities, and business) significantly
predicted higher collaborative use (beta = 0.27, t = 2.31, p < 0.05), consistent with
the article's note that STEM students usually have higher AI literacy. STEM background
was also marginally associated with lower reflective use (beta = -0.14, t = -1.54,
p < 0.10). The pattern is therefore more joint working with AI, not necessarily more
critical checking — and disciplinary background was included as a control variable,
not as a headline intervention effect.

## 16. Appendix A, Case #1
NTU's ICC office was compiling a practice guide for teaching and learning with
Generative AI because instructors observed problematic student AI use. Case #1, from
an instructor of course CC0001, is that students were excessively using AI for essay
writing — letting AI do the writing instead of writing themselves — raising
academic-integrity and learning concerns (whether students actually learn, and how
such work should be assessed) that the policy proposal had to address.

## 17. Why binary reliance definitions are insufficient
Outcome-based labels — overreliance when AI is wrong and the user follows it,
underreliance when AI is right and the user rejects it — tie reliance to a single
correct or incorrect outcome. In ill-structured problems there is no single correct
answer, and the same outcome can hide very different processes: thoughtful adaptation
of an AI suggestion versus blind copying, or a well-reasoned rejection versus careless
dismissal. A process-based scale is therefore needed to see how students actually
engage with AI.

## 18. Impact Analysis score of 2
In the Appendix B coding scheme (0–2 per dimension), a score of 2 for Impact Analysis
means the report demonstrates causal reasoning about how the problem affects learning
— explaining the mechanism and consequences, for example that excessive AI use will
affect students' overall learning experience, especially preparation for the working
world — rather than merely mentioning an impact briefly (score 1) or not addressing
it at all (score 0).

## 19. "Altering authority" (Bearman et al.)
As used in the Implications section, AI's expanding role in intellectual tasks reshapes
who or what counts as authoritative, and what education is for. When AI can produce
essays, answers, and solutions, authority shifts away from the teacher or textbook
alone, and the purpose of assessment and learning must be rethought: from policing AI
use toward designing tasks that require students to contextualize, evaluate, and build
on AI output, with human judgment remaining central to novel, contextually grounded
ideas.

## 20. Study limitations (duration and sample)
(1) Duration: the intervention was a single 2-hour session, too brief to expect durable
gains in critical thinking. (2) Sample size and homogeneity: only 38 groups were
analyzed at group level, and participants were relatively homogeneous undergraduates
from a single institution (mostly Year 1, mostly Chinese, ages mostly 19–22), limiting
generalizability. Two further limitations the authors note: outcomes were assessed
only from group reports, and the three strategies were bundled, so their separate
contributions could not be isolated.

## 21. Practical implications: advice to instructors
Design activities that scaffold critical thinking and frame AI as a collaborator to be
questioned, not an authority to be copied: prompt students to contextualize AI output
for their specific stakeholders, check it for bias, and revise it, rather than adopting
it uncritically. The article's closing message is that interventions should cultivate
students' critical thinking to support creative human–AI problem-solving, because AI
alone does not guarantee originality.

## IT-2 closing evaluation (each student separately — YOUR views, do not borrow these)
1. Most valuable information learned: [YOUR VIEW — e.g., which finding changed how
   you will use AI in coursework, and why]
2. Topic that gave you trouble: [YOUR VIEW — e.g., the computational originality
   method, the reliance scale, or the statistics, and what was difficult about it]
3. Easy or difficult to read, with explanation: [YOUR VIEW — e.g., density of
   methods/statistics vs. clarity of the intervention description]

# ============ CRITICAL THINKING 1 (10 pts) — privacy-policy article ============
# Article: Ibdah, Lachtar, Raparthi, & Bacha (2021), IEEE Access, 9, 166465–166487,
# University of Michigan–Dearborn. Survey: pilot n = 36; main MTurk survey 655
# responses received, 561 analyzed; mostly ages 25–44; 52.6% bachelor's or higher.

## 1. APA citation
Ibdah, D., Lachtar, N., Raparthi, S. M., & Bacha, A. (2021). "Why Should I Read the
Privacy Policy, I Just Need the Service": A Study on Attitudes and Perceptions Toward
Privacy Policies. IEEE Access, 9, 166465–166487. https://doi.org/10.1109/ACCESS.2021.3130086

## 2. Why understanding privacy-policy behavior matters
A privacy policy is the legal contract between user and provider, governing data
whose collection and use have real consequences — including sensitive data such as
political affiliation, reproductive health, and religious beliefs, used for advertising
and other commercial purposes. If users do not read or understand it, their consent is
not informed in any meaningful sense, and providers face no pressure to write usable
policies. Understanding behavior — who reads, what stops them, what they understand —
is therefore the precondition for any design or policy fix.

## 3. Limitations of the study, plus additional ones
Stated limitations: Mechanical Turk workers are demographically diverse but reported
to be more technically savvy than the general population, so results may not
generalize to the broader public; self-reported reading behavior cannot be verified the
way tracked behavior could; and the survey's point systems for sharing and security
knowledge are simplifications. Additional limitations to consider (adopt or revise):
the sample is U.S.-only, so cross-country policy regimes are untested; the design is
cross-sectional, so it cannot show whether reading causes behavior change; and
comprehension was tested on excerpts, not on a full policy read under realistic
conditions.

## 4. Opt-out services, and why they matter
An opt-out service, as defined in the survey, lets users decline to share certain
private information with a provider. It matters because it is the main control users
have short of refusing the service entirely — the alternative is the all-or-nothing
bargain of accept or be barred. The gap is awareness: 64.7% knew opt-outs were included
in policies and 63.6% had used opt-out services, but 35.3% were still unfamiliar with
them, so a control that exists on paper is invisible to a third of users.

## 5. Data commonly collected (from the real excerpts tested)
Google: device, operating system, mobile network/carrier and phone number, IP address,
crash reports, system activity, and date/time. Amazon: name, address, phone, email,
passwords, credit-card information, and Social Security and driver's license numbers.
Facebook: device signals such as Bluetooth and nearby-device signals, and information
retained even after account deletion through other users' conversation histories.
Familiarity was highest for Google's types (over 80% familiar with system activity,
carrier name, and phone number) and lower for Facebook's signal data and Amazon's
sensitive identifiers (69.2% familiar with the Amazon excerpt).

## 6. Agreement with the survey questions: [YOUR VIEW]
[YOUR VIEW — e.g., whether the questions covered the right behaviors, whether any
wording was leading or unclear, and whether important topics were missing.]

## 7. Agreement with how results were calculated: [YOUR VIEW — draft stance to revise]
Draft stance: the point systems for sharing (limited 190 / medium 331 / excessive 40)
and security knowledge (limited 32 / medium 416 / good) are transparent and make group
comparisons possible, but they compress nuanced behavior into coarse bands — two users
with the same score may behave very differently. Treat the group patterns as indicative
rather than precise. [Revise this to your own judgment.]

## 8. Purpose of the article, and opinion of its goal
The study asks why users do or do not read privacy policies, and what happens when
they do not, at a time when providers are turning everyday systems (voice assistants,
location-sharing apps, social media) into data-collection platforms. Its goal is to
extract the pain points in policy reading and understanding so that researchers and
providers can improve policy usability.
Opinion of the goal: [YOUR VIEW — e.g., whether describing pain points is the right
first step, or whether the study should have tested a redesigned policy.]

## 9. Technological basis for commercial data collection; agree or disagree
The author's stated basis is that online providers have built their services into
data-collection platforms: voice assistants, location-sharing apps, and social media
continuously collect behavioral and device data, and sensitive data is then used for
advertising and other commercial purposes. [Agree or disagree, with your reasons:
YOUR VIEW.]

## 10. Concern about digital surveillance: [YOUR VIEW]
[YOUR VIEW — e.g., whether social media and phone-app data practices concern you,
with examples from your own experience and reference to the study's findings on
retention, signal data, and all-or-nothing consent.]

## 11. Research questions; right questions? Additional questions?
RQ1: Who reads privacy policies, and what is users' general behavior toward such
contracts? RQ2: What motivates users to read them, and what prevents them from doing
so? RQ3: Do users understand the consequences of agreeing to the terms, and does
understanding change whether they keep using the service? RQ4: How do users act on
their concerns — for example by changing permissions or using opt-outs — and how does
concern relate to those actions?
Whether they asked the right questions: [YOUR VIEW]. Additional questions worth
asking (adopt or revise): does reading actually change sharing behavior over time
(longitudinal tracking rather than self-report)? And do users in other countries, under
different privacy regimes, behave the same way?

## 12. The privacy paradox
The paradox (Section II.D, "The Paradox: Perception vs. Behavior") is the gap between
stated privacy concern and actual behavior: users report understanding the risks of
making data public and express concern, yet continue to share data, accept terms
without reading, and keep using services. The article links this to online apathy and
resignation (the sense that one cannot really control data practices), the convenience
and personalization trade-off, and the all-or-nothing design of consent — concern alone
does not translate into protective action when the cost of opting out is losing the
service. The study's own numbers illustrate it: 87% endorse provision and reading,
alongside selective or no reading, low comprehension, and continued use.

## 13. Principal areas of the methodology
(1) Pilot study: preliminary survey with 36 local university participants (18+) to
test question quality. (2) Main collection: IRB-approved Amazon Mechanical Turk survey,
restricted to U.S. residents 18+ with a high HIT approval rating; 655 responses
received, 561 analyzed. (3) Survey design, five areas: demographics and general online
practice; security knowledge and behavior; behavior toward privacy policies; reactions
to real policy excerpts from popular services; reflection on the survey and behavior
change. (4) Scoring systems grouping respondents by time online and amount shared, and
by security knowledge (Appendix C, Tables 7–8). (5) Policy-comprehension tests using
real Google, Amazon, and Facebook excerpts. (6) Interface experiments: five policy
interfaces (Appendix A, Figures 9–13) plus link-placement questions for websites and
mobile apps.

## 14. Qualitative analysis methods
Open-ended answers were coded to extract three user characteristics and test their
relationships: (1) background security knowledge, (2) pro-activeness toward security
and privacy (proactive users — two-factor authentication, password managers, private
browsing, opt-outs, sharing less — versus reactive or inactive users), and
(3) online presence (time online and sharing habits). The authors also used open-ended
comments to explain quantitative patterns, for example why users do not read policies
(wording too broad or vague; "either accept or be barred from the website") and why
interface preferences formed. No separate interview study was conducted; the
qualitative work is thematic coding of survey free-text responses alongside the
quantitative groupings.

## 15. Evaluation of Points of Influence
Section VI groups influences into motivators and blockers. Motivators were dominated
by service characteristics — above all the credibility/trustworthiness of the provider
and the sensitivity of the data involved — followed by policy characteristics
(readability, length, clarity) and the type of data collected. Popularity alone
motivated only 11.1%, frequent use of a service 4.9%, and a recommendation from
someone else 4.1%. A personal cyber-attack also mattered: among 182 victims, 40.3%
reported reading policies more frequently than five years earlier, citing increased
technology use, concern about data misuse, hearing about breaches/leaks, and greater
security awareness from work or study. Blockers were unfamiliar legal/technical terms,
deliberately vague wording, length and time cost, the take-it-or-leave-it nature of
consent, and low perceived control — over 75% felt negatively about policy design and
felt providers gave users little control over their data. For never-readers, reluctance
centered on the all-or-nothing bargain and the belief that reading would not change
anything.

## 16. Qualitative and quantitative results
Qualitative: users overwhelmingly said policies should exist and should be read (87%
said providers must supply them and consumers should read them before use), yet most
read only selectively — among those with reading experience (n = 435), about 51%
focused on highlighted or key sections and 43.4% on opt-out information, rather than
reading the whole document. Most users were concerned about the type of data collected
(28% named this as the top concern prompting them to limit access), followed by how
collected data was used (24.9%), ambiguity about how data was consumed, service
quality, and the feeling that collection was unnecessary for the service offered. Most
judged much of the collection unnecessary — least concern for Google's types, most for
Facebook's signal and retention practices (44.4% to 59.9% concerned across the Facebook
excerpts).
Quantitative: 77% reported some experience reading privacy policies, but comprehension
was the major handicap — more than 68% were unfamiliar with at least one term in a test
passage (IP address, cookies, Flash cookies, operating system, session information),
and only 31.6% were familiar with all terms mentioned. Even among five participants
working in the legal field, only one had completely read a policy. Security knowledge
predicted reading: users with more security knowledge were more likely to read a policy
at sign-up. Sharing did not show the expected gradient: 77.5% of limited sharers, 80.4%
of medium sharers, and a slightly lower share of excessive sharers reported reading
policies, contrary to the expectation that heavier sharers would read more. Reading over
time was increasing on average, but many users never check for updates after sign-up.
Interface results: 49% rated Interface 4 (Facebook's sidebar design, headings in a left
sidebar) the most user-friendly, followed by Interface 5 (sidebar plus video
explanations) at 24.8%; Interfaces 3 and 2 were rated most user-friendly by only 13.2%
and about 10%. For link placement, over 91% wanted the policy available in the app store
before download, 84.3% wanted it reachable through in-app settings/about pages, and over
78% wanted pop-ups or sign-in/sign-up links; desktop users wanted footer links on every
page and policy links on checkout pages where payment data is entered.

## 17. Major points of the conclusion; agree?
(1) Comprehension, not just willingness, is the central problem: most users endorse
policies in principle, but well over half did not understand the actual content of real
policies. (2) Design and language are experienced as hostile: vague, broad, legalistic
wording and take-it-or-leave-it consent leave users feeling they have little control,
which discourages reading. (3) Interfaces matter: sidebar navigation, short summaries,
videos for complex explanations, clickable section lists, and prominent, well-placed
links (app store, settings, checkout, pop-ups) are the design directions users preferred
and that the authors recommend researchers and providers pursue. (4) The authors present
the work as extracting pain points that can help improve policy usability, rather than
as proof that any one interface solves comprehension.
Agreement: [YOUR VIEW — e.g., whether comprehension-first is the right diagnosis, and
whether the recommended interface directions follow from the evidence.]

## 18. Appendix B
Appendix B (Questions 1–99, with branching) covers: demographics; time online and
services used; security behavior (antivirus, password choice, lock-symbol meaning,
two-factor authentication, password manager, encryption, social-media privacy settings
and sharing); attitudes toward policies (necessity of provision and reading, willingness
to read, reasons for never reading or not finishing, motivators, what is usually read,
helpfulness, difficulty, effect of all-or-nothing consent, permission changes after
reading); website vs. mobile reading (where read, why only one medium, which is easier
to find, which interface is better); opt-outs (use, necessity, awareness, types used,
comfort/control); change over five years and after cyber-attacks; readability
(difficulty rating of a test paragraph, unfamiliar terms, why providers collect
cookies/Flash cookies/session data); reactions to the Google, Amazon, and Facebook
excerpts; link placement; interface design (whether design affects willingness, which
interface is most user-friendly, how to improve it); service quality vs. privacy
(whether collection is justified, actions taken if not, willingness to give up
personalization or custom search results for privacy, private-browsing use); and a
closing reflection on willingness to read policies and under what conditions
(friendlier wording, mandatory reading, selective opt-out).
Usefulness: [YOUR VIEW — e.g., whether this breadth was needed, whether any sections
were inappropriate for this article, and what additional questions you would ask.]

## 19. Did the results meet the article's goal?
Draft stance (revise to your own judgment): largely yes for the stated goal of
extracting pain points — the study documents, with numbers, the comprehension gap, the
motivators and blockers, and the interface preferences. No, for any stronger claim: the
authors themselves present the work as a step toward understanding general behavior,
not as proof that a redesigned policy would be read or understood, and the MTurk
sample and self-report limits mean the findings describe this population's reported
behavior rather than verified behavior in general.

## 20. Important article? Good article? Changed your opinion?
[YOUR VIEW — e.g., whether the comprehension-gap finding is important, whether the
survey design was strong, and whether anything in the results changed how you think
about privacy policies.]

# ============ CRITICAL THINKING 2 (10 pts) — mobile-news eye-tracking article ============
# Article: Guo, Chen, Li, Lyu, & Zhang (2022), Universal Access in the Information
# Society, 21, 795–808, Northeastern University, China. Within-subjects eye-tracking
# experiment, prototypes on a monitor; pre-study n = 26; formal experiment 34 invited,
# ages 21–26 (mean 23.85, SD 1.42), varied majors, normal/corrected vision, 0.5–1 year
# of mobile news-app experience, $5 gift card.

## 1. APA citation
Guo, Chen, Li, Lyu, and Zhang (2022), Universal Access in the Information Society, 21,
795–808. (Use the article's exact author order and full title from its first page when
formatting the final reference list.)

## 2. Opinion of the abstract: [YOUR VIEW — with the abstract's claim]
The abstract's claim, in brief: website visual complexity is well studied but mobile
visual complexity is not; splitting mobile news-app complexity into quantity complexity
(how much is shown) and layout complexity (how it is arranged), the study finds higher
quantity complexity raised revisit, fixation, and saccade counts while satisfaction
fell; higher layout complexity raised revisit and saccade counts while fixation counts
first fell then rose, and satisfaction followed an inverted U; the best combination was
low quantity complexity with medium layout complexity.
[YOUR VIEW — e.g., whether the abstract states the contribution and findings clearly,
and whether anything important is missing from it.]

## 3. Why mobile search differs from website search
Mobile screens are small, so less information fits at once and the interface is more
crowded; users are often in different contexts (on the move, fragmented attention) and
use different interaction modes (touch, scrolling) than desktop users. Prior log and
behavioral work cited in the article found mobile search differs from website search in
number of steps and pages viewed, location and timing of use, and distribution of query
types and time. Because of the small screen, layout becomes more important on mobile,
and visual search — scanning for a target among distractors — is more easily disrupted
by clutter, so mobile search behavior cannot simply be assumed to match desktop
behavior. [Agree or disagree, with your reasons: YOUR VIEW.]

## 4. Visual complexity and perceptual psychology
Visual complexity is the level of detail or complexity in an image or interface. The
article reviews several decompositions, including Olivia et al.'s perceptual dimensions
(number of objects, clutter, symmetry, organization); King et al.'s feature vs. design
complexity; Deng and Poole's visual diversity and visual richness (text content, number
of graphics, page layout); and Nadkarni and Gupta's component, coordinative, and dynamic
complexity. This study operationalizes it as two dimensions for mobile news: quantity
complexity (amount of text/pictures) and layout complexity (arrangement of pictures
relative to text). The psychology link is that visual search depends on limited attention
and working-memory capacity: more characters, objects, and clutter distract attention,
degrade search performance, and raise cognitive load, so users need more fixations and
revisits to find a target. Aesthetic theory is also invoked: an optimal, moderate level
of complexity raises arousal and favorable evaluation, while too little feels empty and
too much feels overwhelming — hence the inverted-U pattern found for layout.
In-text citation reviewed: Olivia et al. — its perceptual dimensions (objects, clutter,
symmetry, organization) give the study a way to treat complexity as perceivable
structure rather than mere amount, which supports splitting mobile complexity into
quantity and layout as separate, measurable dimensions.

## 5. Why visual search behavior matters to psychology research
Visual search is a window on limited attention and working-memory capacity: how people
scan, dwell, and re-check reveals how attention is allocated, how cognitive load builds,
and how interface structure helps or hinders finding a target. Because search is a
perceptual task performed under capacity limits, measuring it objectively (rather than
relying only on what users say) lets researchers test claims about clutter, layout, and
load directly.
In-text citation reviewed: [FILL — name one in-text citation you viewed in the article
and describe how it adds to this statement.]

## 6. Why visual complexity on websites affects search behavior
More visual elements mean more distractors competing for limited attention: users must
scan more, dwell longer, and re-check more often before locating a target, so search
becomes slower and more effortful and satisfaction falls. The same mechanism the study
tests on mobile — load exceeding capacity, attention spread across items — was already
documented for websites, which is why the study asks whether it transfers to the smaller,
more crowded mobile screen.
In-text citation reviewed: [FILL — name one in-text citation you viewed in the article
and describe how it adds to this statement.]

## 7. Methodology: adequate and comprehensive? Improvements
Design: task-oriented, within-subjects eye-tracking experiment using prototypes of
mobile news apps displayed on a monitor (simulating a phone interface). Two factors,
each with three levels (low, medium, high), varied one at a time, holding other design
elements (search box, top navigation) constant. Quantity complexity varied the number of
news items (low 4, medium 5, high 6 items, each with 1 picture on the right). Layout
complexity held the count at 5 items and varied pictures (low 0 pictures, plain text;
medium 1 picture on the right; high 3 pictures at the bottom). A pre-study with 26
participants (ages 22–29) confirmed the levels were perceived as significantly different.
Apparatus: SMI iView X RED remote eye-tracking system (20-inch LCD, 1680 × 1050),
recorded with BeGaze 3.6, calibrated to within 0.5 degrees of error. Procedure, three
steps per trial: a target keyword was presented, the participant searched the news
interface for it, then completed an 11-item satisfaction evaluation scale (following
Cook's scale for web search satisfaction, adapted to mobile news). Screens were sequenced
(instruction, blank, keyword, interface, scale; 5000 ms instruction, 2000 ms keyword in
the sequence figure), with breaks to avoid fatigue, and a final demographic survey.
Analyses used repeated-measures ANOVA with Greenhouse–Geisser correction where
appropriate.
Assessment: the design is strong on internal control — one factor varied at a time,
levels validated in a pre-study, objective eye measures paired with a satisfaction
scale — but narrow in scope: only quantity and layout were varied, and the phone
interface was simulated on a desktop monitor rather than used on a real phone in a real
mobile context. Improvements to propose: test on real phones in realistic contexts;
vary additional complexity sources (colors, fonts, ads, personalization); add
physiological measures beyond the three eye-movement counts (e.g., pupil size).

## 8. Participant demographic: adequate?
Participants: 34 subjects invited for the formal experiment; the methods section
describes ages 21–26 (mean 23.847, SD 1.422), from varied majors including business,
engineering, and accounting, with normal or corrected-to-normal vision without
astigmatism, and 0.5–1 year of mobile news-app experience; each received a $5 gift card.
Demographic and background variables were dropped from the main analysis because they
showed little variation. Assessment: adequate for a controlled within-subjects
comparison, where each participant serves as their own control — but not adequate for
generalizing to older users, heavy or novice news-app users, or users with different
vision, since the sample is narrow (young adults, mostly students, limited experience
range).

## 9. Findings for the three research questions
RQ1 (quantity complexity): all three eye metrics rose significantly with quantity
complexity (revisit count F = 7.345, p = 0.002; fixation count F = 19.549, p < 0.001;
saccade count F = 8.127, p = 0.001). Means from low to high: revisits 1.63 → 2.26 → 4.84;
fixations 16.95 → 23.37 → 36.42; saccades 37.68 → 48.95 → 58.21. Satisfaction fell
significantly as quantity rose (F(2, 22.228) = 14.069, p < 0.001, eta-squared = 0.439),
with low quantity most satisfying.
RQ2 (layout complexity): all three metrics also differed significantly (revisits
F = 9.402, p = 0.001; fixations F = 19.791, p < 0.001; saccades F = 35.897, p < 0.001).
Means from low to high: revisits 1.63 → 2.84 → 5.26; saccades 33.95 → 48.05 → 81.11;
fixations, uniquely, fell then rose (21.47 → 13.95 → 33.26), because the medium layout
(one picture beside text) helped users process text and pictures together, while the
high layout (three pictures below) forced more checking. Satisfaction across layout
levels differed significantly (eta-squared = 0.398) and formed an inverted U: medium
layout was most satisfying, low and high less so.
RQ3 (behavior–satisfaction links): correlations differed by complexity type. Under
quantity complexity, only fixation count significantly predicted satisfaction
(r = -0.301, p = 0.023; more fixations, lower satisfaction); revisits (r = -0.154,
p = 0.253) and saccades (r = -0.216, p = 0.107) did not. Under layout complexity, all
three metrics significantly and negatively correlated with satisfaction (revisits
r = -0.353, p = 0.007; fixations r = -0.330, p = 0.012; saccades r = -0.310, p = 0.019):
more effortful searching went with lower satisfaction in both cases, but the link was
broader under layout complexity.

## 10. Tables and figures assessment
Table 1 defines the quantity and layout levels; Figure 1 shows quantity prototypes
(low/medium/high item counts); Figure 2 shows layout prototypes (0, 1, and 3 pictures);
Figure 3 shows the formal experimental scene; Figure 4 shows the trial sequence
(instruction, blank, keyword, news interface, scale); Figure 5 shows estimated marginal
means of satisfaction; Table 2 and Figure 6 give the quantity-complexity ANOVA and
multiple comparisons; Table 3 and Figure 7 give the layout-complexity ANOVA and multiple
comparisons; Figures 8 and 9 show scan paths (eye-movement traces) for quantity and
layout levels; Table 4 gives the correlations between eye metrics and satisfaction.
Assessment: the tables carry the statistical claims compactly and the prototypes make
the manipulations concrete; the scan-path figures are the most intuitive evidence —
quantity scan paths run top-down and become denser and more overlapping as quantity
rises, while layout scan paths run mainly horizontally and become more complex as layout
changes, without a simple top-down pattern.
Did they add value, were they easy to understand, did they surprise you: [YOUR VIEW].

## 11. Eye-tracking metrics
Three metrics, chosen from prior eye-tracking literature, are the objective measures of
search behavior: (1) fixation count — how many times the eyes stop and dwell on an area,
reflecting attention allocation and processing effort; more fixations mean the target
was harder to locate or required more checking; (2) saccade count — how many rapid jumps
occur between fixations, reflecting movement and re-scanning across the page; more
saccades mean a more complicated, less direct search path; (3) revisit count — how many
times the eyes return to a previously viewed area, reflecting uncertainty or the need
to re-check whether a target was present. Together they index search difficulty: higher
counts mean more effortful, less efficient search. Fixation duration is discussed in the
literature review, but the reported analyses use counts, not durations.

## 12. Discussion: credible and valid points?
Draft stance (revise to your own judgment): yes, by and large — the discussion's
mechanisms line up with the results rather than going beyond them. Quantity effects are
explained by information load exceeding limited capacity, which fits the uniform rise in
all three metrics; layout's non-monotonic pattern is explained by familiarity and
text–picture integration (plain text gives no visual anchors; one picture beside text
aids understanding by keeping related text and image close; three pictures below split
attention), which fits fixations falling then rising; and the satisfaction patterns
(declining with quantity, inverted-U with layout) are consistent with prior website
findings of an inverted-U between complexity and appeal. The one caution: the Evaluation
-style discussion explanations are interpretations of a single experiment, not
independently tested claims.

## 13. Implications of the research
For designers: do not simply pack more news items onto a mobile screen — keep quantity
low and use a medium-complexity layout (a moderate number of pictures placed near their
text) to help users focus and complete searches efficiently. For researchers: the study
extends website-complexity findings to mobile apps and shows that quantity and layout
must be studied separately, since they affect search and satisfaction differently;
eye-tracking counts (especially fixation count) are useful, objective proxies for search
effort, but should be paired with subjective satisfaction measures.

## 14. Future research suggestions
Adopt or revise: (1) run the experiment on real phones in realistic mobile contexts
rather than a monitor simulation; (2) vary real-world complexity sources beyond quantity
and layout (colors, fonts, ads, personalization); (3) recruit a broader sample (older
users, varied experience levels) to test generalizability; (4) add physiological
measures beyond the three eye-movement counts (e.g., pupil size, heart rate); (5) test
whether prior news-app experience changes search strategy, an effect the literature
leaves unresolved.

## 15. Conclusion accurate?
Draft stance (revise to your own judgment): yes, within its scope — mobile news-app
visual complexity, split into quantity and layout, measurably changes how users search
(as shown in eye movements) and how satisfied they are, and low quantity with medium
layout achieved the highest satisfaction in this experiment. The qualification that
matters: this is a controlled-experiment finding, not a tested rule for every commercial
news app, given the narrow sample, the monitor simulation, and the two complexity types
tested.

## 16. Strengths and weaknesses
Strengths: objective eye-tracking data combined with a validated satisfaction scale;
tightly controlled prototypes that vary only quantity or only layout, with a pre-study
validating the perceived levels; and scan-path visualizations that make search
strategies visible. Weaknesses, as stated by the authors: only two kinds of complexity
were tested, so real-world complexity (colors, fonts, ads, personalization) is missing;
the sample was narrow (young adults 21–26, mostly students, with limited experience
range), so results may not generalize to older or more varied users; the phone interface
was simulated on a desktop monitor rather than used on a real phone in a real mobile
context; only three common eye metrics were used, with no other physiological signals
(such as pupil size or heart rate); and the effect of prior experience on search remains
unresolved in the literature, with some studies finding no advantage for experienced
users.

## 17. Good article?
[YOUR VIEW — e.g., whether the controlled design and the quantity/layout split make it
a strong article despite the narrow sample and simulation limits.]
