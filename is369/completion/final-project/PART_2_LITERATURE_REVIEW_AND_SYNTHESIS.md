# Final Project — Part 2: Review of Four Peer-Reviewed Journal Articles
**IS 369 | Yaswant Kakarla | Fall 2026**  
**Status: research-based draft; article/theme approval remains unverified. Due Dec. 4, 2026.**
**Research question:** Does adding an evidence-verification prompt to concise AI explanations reduce acceptance of inaccurate advice during undergraduate information-evaluation tasks?

## Article 1 — Predictive performance information
**Citation:** Zhang, L., & An, Y. (2025). Enhancing sports team management through machine learning. *IEEE Access, 13*, 55431–55441. https://doi.org/10.1109/ACCESS.2025.3551889

**Purpose and contribution.** Zhang and An examine whether football performance data can support richer assessments than stand-alone outcome prediction. Their computational approach aggregates and selects player-performance variables to reproduce aspects of expert player evaluation and inform match-result prediction. The authors report a **0.17 average rating-prediction error** for one functional-metric configuration and **63.4% match-outcome prediction accuracy** using **34 identified performance characteristics**. This is quantitative modeling on observational sports records, not a participant experiment in trust.

**Critical appraisal.** The work is valuable because it illustrates the construction of machine-produced information from task-specific data. Yet performance metrics do not automatically establish how a human recipient interprets model confidence, checks assumptions, or decides when to reject advice. Its relation to the research question is the *source of algorithmic recommendations*: the proposed experiment must specify an objective answer key and give participants the information needed to assess a recommendation.

## Article 2 — Comprehension and information disclosure
**Citation:** Ibdah, D., Lachtar, N., Raparthi, S. M., & Bacha, A. (2021). “Why should I read the privacy policy, I just need the service”: A study on attitudes and perceptions toward privacy policies. *IEEE Access, 9*, 166465–166487. https://doi.org/10.1109/ACCESS.2021.3130086

**Purpose and methods.** Ibdah and colleagues investigate privacy-policy reading and understanding using an online survey with **655 responses**, **561 valid after 94 attention-check exclusions**, scored security/behavior profiles, real policy text, and preference comparisons across interface designs. Their findings include **55% incorrect interpretations** of a tested policy passage even though only **18.4%** rated it difficult. The work combines numerical survey patterns and open-text explanations of hesitation, distrust, and desired design improvements.

**Critical appraisal.** The discrepancy between subjective confidence and comprehension is especially relevant: an explanation that feels clear might still leave the user unable to judge the implications of AI advice. However, a cross-sectional survey cannot show that changing the interface causes better decisions. The proposed study therefore measures objective accuracy and decision behavior under randomized conditions rather than relying only on perceived clarity.

## Article 3 — Visual information architecture
**Citation:** Guo, F., Chen, J., Li, M., Lyu, W., & Zhang, J. (2022). Effects of visual complexity on user search behavior and satisfaction: An eye-tracking study of mobile news apps. *Universal Access in the Information Society, 21*, 795–808. https://doi.org/10.1007/s10209-021-00815-1

**Purpose and methods.** Guo and colleagues distinguish the quantity of content from its layout in mobile news interfaces. Their **34-participant eye-tracking experiment** records fixation, saccade, revisit, and satisfaction measures. Higher quantity complexity increased eye-movement counts and reduced satisfaction, while layout complexity had a more complex, nonlinear relation to fixation and satisfaction.

**Critical appraisal.** This research suggests that concise, navigable evidence could make verification more feasible; yet neither eye movements nor reported satisfaction directly establish correct judgments. A limitation is the relatively narrow sample and laboratory-style tasks. The proposed experiment accordingly holds evidence layout and content constant between explanation conditions as much as possible, so that the added verification prompt—not an accidental change in complexity—drives the primary comparison.

## Article 4 — Instructional critical-thinking scaffolds
**Citation:** Hou, C., Zhu, G., Liu, Y., Sudarshan, V., Chong, J. L. L., Zhang, F. Y., Tan, M. Y. H., & Ong, Y. S. (2026). The effects of critical thinking intervention on reliance behaviors, problem-solving quality, and creativity during human-generative AI collaborative learning. *Computers & Education, 247*, Article 105576. https://doi.org/10.1016/j.compedu.2026.105576

**Purpose and methods.** Hou and colleagues investigate human–generative-AI collaboration through a problem-based learning intervention combining authentic instruction, structured dialogue, and AI-supported peer mentoring. Their article reports **226 university students** and compares students with critical-thinking scaffolds to a comparison condition. The authors report less direct adoption of AI-generated content and more creative/original outputs in the intervention context, while self-reported critical thinking did not show a statistically significant improvement. The article draws on direct group outputs and behavioral traces in addition to self-report.

**Critical appraisal.** The study is the most direct conceptual support for requiring students to appraise AI contributions rather than reproduce them. Nevertheless, lower text similarity or more originality is not synonymous with correctly rejecting inaccurate advice. The planned experiment therefore assesses error-sensitive reliance with a known answer key, not merely how much wording comes from AI. Further limitations include its short instructional window and university-specific sample.

## Cross-study synthesis
The four studies address different points in a decision-support chain: **(1) how algorithmic advice is produced, (2) how people comprehend complex statements, (3) how information is visually organized, and (4) how users critically engage with AI suggestions.** They are not interchangeable sources and do not all test the same causal claim. Zhang and An provide the data-to-advice context; Ibdah et al. warn against substituting perceived clarity for understanding; Guo et al. show that information density and layout affect search effort; Hou et al. provide intervention evidence that structured critique changes AI collaboration.

The unresolved question is whether a **small, mandatory verification step** improves the *quality* of reliance on AI advice, particularly when advice is wrong, without causing indiscriminate rejection when advice is right. It cannot be answered by the cited work alone because the populations, outputs, and methods differ substantially. This creates a concrete rationale for a randomized, task-based study combining objective accuracy with appropriately differentiated measures of reliance. A verification prompt should be evaluated for both benefit and cost: it may improve discrimination but add time and friction. Those outcomes must be analyzed together.

## References
Zhang, L., & An, Y. (2025). Enhancing sports team management through machine learning. *IEEE Access, 13*, 55431–55441. https://doi.org/10.1109/ACCESS.2025.3551889

Ibdah, D., Lachtar, N., Raparthi, S. M., & Bacha, A. (2021). “Why should I read the privacy policy, I just need the service”: A study on attitudes and perceptions toward privacy policies. *IEEE Access, 9*, 166465–166487. https://doi.org/10.1109/ACCESS.2021.3130086

Guo, F., Chen, J., Li, M., Lyu, W., & Zhang, J. (2022). Effects of visual complexity on user search behavior and satisfaction: An eye-tracking study of mobile news apps. *Universal Access in the Information Society, 21*, 795–808. https://doi.org/10.1007/s10209-021-00815-1

Hou, C., Zhu, G., Liu, Y., Sudarshan, V., Chong, J. L. L., Zhang, F. Y., Tan, M. Y. H., & Ong, Y. S. (2026). The effects of critical thinking intervention on reliance behaviors, problem-solving quality, and creativity during human-generative AI collaborative learning. *Computers & Education, 247*, Article 105576. https://doi.org/10.1016/j.compedu.2026.105576
