# IT-2 — 21 Responses + Independent Evaluation Sheet
**30 pts | Was due Oct. 21, 2026 | MAKEUP DRAFT; instructor permission required**
**Source:** Hou et al. (2026), https://doi.org/10.1016/j.compedu.2026.105576
**WARNING:** Specific responses involving article Appendix A, scoring rubrics, and results beyond the previously supplied excerpt require comparison against the complete primary article before submission. Partner/session evidence is not supplied and should never be invented.

# ============ IT-2 (30 pts) ============
# Article: Hou, Zhu, Liu, Sudarshan, Chong, Zhang, Tan, & Ong (2026), Computers &
# Education, 247, 105576. Study: 226 first/second-year undergraduates, digital-literacy
# course, NTU, August semester 2024; 112 comparison, 114 intervention; intervention =
# one 2-hour in-class session; 38 group reports analyzed.
# Partner: [FILL: partner name]

## 1. APA citation
Hou, C., Zhu, G., Liu, Y., Sudarshan, V., Chong, J. L. L., Zhang, F. Y., Tan, M. Y. H., & Ong, Y. S. (2026). The effects of critical thinking intervention on reliance behaviors, problem-solving quality, and creativity during human-generative AI collaborative learning. *Computers & Education, 247*, Article 105576. https://doi.org/10.1016/j.compedu.2026.105576

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

## Required separate individualized evaluation — do not invent
1. Most valuable learning **[write from actual learning]**.
2. Hardest topic **[write from actual reading]**.
3. Easy or difficult? Explain **[write from actual reading]**.
4. Partner name and what was clarified in the session **[only if session occurred]**.

## Rubric crosswalk
APA (3%) · mechanics (6%) · links/citations (3%) · correctness (20%) · critical thinking (20%) · support/articulation (23%) · separate evaluation (25%). The last item cannot be truthfully completed without actual student experience.
