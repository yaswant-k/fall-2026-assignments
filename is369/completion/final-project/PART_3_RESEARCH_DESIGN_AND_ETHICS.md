# Final Project — Part 3: Research Design and Proposed Experiment
**IS 369 | Yaswant Kakarla | Fall 2026**  
**Status: METHODS PROPOSAL ONLY; no participants recruited and no data collected. Due Dec. 9, 2026.**
**Rubric:** Mechanics 4%; design/overview 32%; depth/detail 32%; participant demographic information 32%.

## Aim, design, and research logic
This study proposes a randomized, between-subjects experiment to examine whether a brief evidence-verification prompt improves decisions made with AI recommendations. The research question and hypotheses are defined in Part 1. The independent variable is presentation condition; the primary outcome is the probability of accepting inaccurate AI recommendations. A secondary outcome is final-answer accuracy. Participants will evaluate short source-backed informational questions for which expert-checked answer keys exist. The study will not involve actual medical, financial, or legal advice.

### Conditions
- **A — Recommendation only:** participant sees a question, relevant evidence, and an AI recommendation, without a separate explanation.
- **B — Explanation:** participant sees the same question, evidence, recommendation, plus a short explanation citing the relevant evidence.
- **C — Explanation + verification:** participant sees all of B and must answer a brief prompt such as, “Which evidence supports or contradicts this recommendation?” before finalizing.

All participants receive equal time access to the same underlying factual source excerpts. The explanation lengths, reading levels, and evidence format will be piloted and standardized. Participants will not be told that all AI recommendations are correct; study instructions will emphasize that the system can be wrong.

## Recruitment and intended demographic profile
**Target enrollment:** 90 adult undergraduate students, about 30 randomly assigned to each condition. This is a feasibility target, not a sample size derived from an asserted statistical power result; a formal power/simulation check should be completed before actual collection. Eligible participants must be 18 or older, consent, and be able to read the task language. Recruitment would use voluntary campus announcements. No course grade, employment, or benefit is contingent on participation.

**Demographic variables collected optionally:** age band (18–20, 21–24, 25–34, 35+), field of study (computing/STEM vs. non-STEM, with other/undisclosed), year of study, prior AI tool-use frequency, self-rated AI familiarity, and any accessibility accommodations needed for the task. Gender is optional and can be declined; no demographic subgroup is presumed in advance. These are **planned measurements, not observations**; no actual ages, proportions, or means are claimed. Report a final recruitment/attrition flow and demographic table only after data are collected. Exclude names, student IDs, and sensitive personal data from analytic exports.

## Tasks and trial construction
A pilot of about 12 volunteers not included in the main analysis will check task clarity, reading time, and the balance of AI answer difficulty. Each participant will perform **six informational decision tasks**, three paired with objectively correct AI recommendations and three with deliberately incorrect AI recommendations. Trial order will be randomized/counterbalanced. A question could concern comparing data summaries, identifying a contradiction in short research excerpts, or interpreting a simple table. Every correct outcome will be independently checked against source material by two reviewers before deployment.

**Per-trial procedure:**
1. Present consent-confirmed instructions and an unscored practice example.
2. Display the question, a standardized evidence excerpt, and the recommendation in the assigned condition.
3. If in B or C, display the explanation; if in C, record the required evidence-check answer.
4. Record the participant's final choice, confidence rating (0–100), and response time.
5. Repeat for six balanced trials without displaying correctness feedback.
6. Collect optional background and usability feedback; debrief participants about intentionally inaccurate recommendations.

## Variables and operational definitions
**Primary measure:** acceptance of inaccurate AI advice = 1 when the participant selects the recommendation on an intentionally wrong-advice trial; 0 otherwise. **Secondary measures:** overall accuracy across six tasks, acceptance of accurate advice, time to decision, confidence calibration (absolute difference between confidence and correctness aggregated at participant level), and scored evidence-check quality in C using a prespecified 0–2 rubric. Separately report both false acceptance and false rejection so that a condition is not rewarded merely for blanket distrust of AI.

**Manipulation check:** after tasks, ask whether participants noticed an explanation and whether they were required to evaluate evidence. **Quality safeguards:** comparable source difficulty, accessible language, stable interface styling, prevalidated answer keys, automatic duplicate-response checks, and a recorded exclusion policy established before analysis.

## Planned analysis
Use intention-to-treat comparisons by randomized group where feasible. Estimate the odds of accepting an incorrect recommendation using mixed-effects logistic regression with experimental condition as the primary predictor, plus participant and item effects to account for six repeated observations. The primary prespecified comparison is **C versus B** on wrong-advice trials; compare C versus A as a secondary contrast. Analyze final-answer accuracy with a similar trial-level model; examine time with a suitable skew-aware model or log transformation after diagnostics. Report group-level counts, estimates, confidence intervals, effect sizes, and exact p values where appropriate; do not claim statistical significance without data. Check baseline AI familiarity, item difficulty, attrition, and assumption sensitivity. Predefine multiplicity handling for secondary endpoints. Exploratory moderators should be labeled exploratory.

## Ethics, privacy, and risk
Obtain any required instructor or institutional review determination **before** recruiting or running an experiment. Use informed consent explaining voluntary participation, approximate duration, ability to withdraw without penalty, and the possibility of intentionally inaccurate system advice. Avoid deceptive high-stakes recommendations; debrief the intervention and incorrect advice immediately afterward. Store responses under random participant IDs; keep any consent/contact information separate from data, encrypted and access-restricted. Establish retention and destruction dates before collection. Do not upload participant-level data to a public repository. Ensure accessible screen-reader navigation and alternative interfaces. Instructor and student conflicts of interest should be addressed by recruiting outside graded activities where practical.

## Timeline and feasibility
**Week 1:** secure approval, design six tasks, prevalidate answer keys and readability.  
**Week 2:** pilot, correct unclear wording, finalize preregistration and demographic form.  
**Weeks 3–4 (only if authorized):** recruit and randomize; record outcomes.  
**Week 5:** clean blinded data, analyze, prepare limitations and report.

For this course's Dec. 9 deliverable, the **design itself** can be submitted without claiming that the study was executed. Any real implementation after the course requires the appropriate approval and participant recruitment.

## Anticipated limitations
The expected student sample will be convenient rather than nationally representative; six short tasks will not capture chronic overreliance; controlled excerpts may be easier to evaluate than authentic workplace decisions; mandatory prompts may create demand effects or increased response time; and precise effect estimates may be unstable with 90 participants. These are prospective limitations to be reported, not observed findings.

## References
Zhang, L., & An, Y. (2025). Enhancing sports team management through machine learning. *IEEE Access, 13*, 55431–55441. https://doi.org/10.1109/ACCESS.2025.3551889

Ibdah, D., Lachtar, N., Raparthi, S. M., & Bacha, A. (2021). “Why should I read the privacy policy, I just need the service”: A study on attitudes and perceptions toward privacy policies. *IEEE Access, 9*, 166465–166487. https://doi.org/10.1109/ACCESS.2021.3130086

Guo, F., Chen, J., Li, M., Lyu, W., & Zhang, J. (2022). Effects of visual complexity on user search behavior and satisfaction: An eye-tracking study of mobile news apps. *Universal Access in the Information Society, 21*, 795–808. https://doi.org/10.1007/s10209-021-00815-1

Hou, C., Zhu, G., Liu, Y., Sudarshan, V., Chong, J. L. L., Zhang, F. Y., Tan, M. Y. H., & Ong, Y. S. (2026). The effects of critical thinking intervention on reliance behaviors, problem-solving quality, and creativity during human-generative AI collaborative learning. *Computers & Education, 247*, Article 105576. https://doi.org/10.1016/j.compedu.2026.105576
