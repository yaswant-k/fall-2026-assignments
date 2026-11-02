# IS 369 — Source and Export QA, 2026-11-02

## Scope and interpretation
**Makeup authorization (user-reported written reply, October 31, 2026):** Professor Bill Ryan agreed to accept the missed IT-2, Critical Thinking assignments, Guest Comments, and past-due presentation comments discussed in the October 30 email, with full credit possible depending on quality. Submit ASAP. **Instructor-set makeup deadline remains TBD.** This is permission to submit, **not approval/acceptance of any draft and not points earned**. No alternate assignments, extra credit, or Incomplete. Work beginning November 3 remains subject to its ordinary deadline.

**Article selection decision:** pending; no verified Ibdah or Guo professor approval. **Personal inputs:** NONE YET. This audit did not repeat the already completed Ibdah numeric source verification.

This is **a verified layout/source audit, not an acceptance or Blackboard submission**. The working GitHub repository is PUBLIC. Research drafts and export scripts live on branch `is369/source-grounded-completion-20261102`. Actual DOCX/PPTX artifacts were generated and rendered in the ChatGPT conversation and made available as conversation file downloads; **binary DOCX/PPTX files have not been committed to GitHub**.

## Verified output files
| Filename | SHA-256 | Format QA |
|---|---|---|
| `IS369_Article_Review_2_PROPOSED.docx` | `e06d17356d7fc9281bd689758ca7129b68123f34b1d7dec3fa7cca28f66900fc` | 2 rendered pages; 12pt Times New Roman; single spaced, left aligned, first-line body indents, hanging reference; visually inspected |
| `IS369_Presentation_2_PROPOSED.pptx` | `2f371fe3725e37f62d06b6e0727afdf2e8caa9a83d08a496fbcec3a68dc6e9a2` | 12 slides; 12 notes pages with presenter guidance; rendered montage reviewed; automated slide overflow test PASS |
| `IS369_Article_Review_3_PROPOSED.docx` | `d93c043b8be2ddc9e1f4f011c77d759d5255498c06d4c89f5117680a0aa777f6` | 3 rendered pages; 12pt Times New Roman; single spaced, body first-line indents, hanging reference; visually inspected |
| `IS369_Presentation_3_PROPOSED.pptx` | `aa2b3d242dbe29398d4e9887c4cacf156e61d3c43095ec3e859dc8dbe102c18f` | 12 slides; 11 presenter note sets (all content slides); rendered montage reviewed; automated slide overflow test PASS |

**Technical QA status:** Document layout PASS; deck overflow PASS; Review 2 chart values verified. **Submission status:** BLOCKED pending professor article approvals and, for Review 3, unverified full-text methods and table results. Neither numerical source checking nor valid exports changes that.

### Primary-source verification — Ibdah et al. 2021
Full 23-page article: https://anysbacha.github.io/publications/ibdah_access21.pdf (DOI https://doi.org/10.1109/ACCESS.2021.3130086).
- Section IV and Table 1, journal p. 166471: 655 responses received; 94 excluded by attention checks; 561 analyzed. Demographic figures confirmed: 56.0% male, 42.8% female, 0.7% nonbinary/third gender, 73.8% ages 25–44, 52.6% bachelor's or higher.
- Section V-C, journal p. 166475: 18.4% rated tested policy passage difficult; 55% incorrectly interpreted it. These are **different questions**, not complementary percentages, and the slide's two-bar chart correctly labels them.
- Section V-B: 63.6% used opt-outs; 86.3% considered opt-outs necessary; 89.7% felt more control with opt-outs.
- Section VII / Table 6, journal p. 166480: Interface 4 user-friendliness 49%, willingness to read 47.4%; Interface 1 user-friendliness 2.7%, willingness to read 3.6%. Distinguish preference from observed actual policy reading.
- Section V-A: security-knowledge reading groups 59.4%, 75%, and 92%; observational comparison, not an educational causal effect.

### Primary-source status — Guo et al. 2022 (rechecked Nov. 2)
- Publisher preview: https://link.springer.com/article/10.1007/s10209-021-00815-1 — source article is subscription-restricted beyond the abstract. Access page confirms 2022 volume 21, pages 795–808, originally online May 11, 2021.
- ResearchGate publisher preview: https://www.researchgate.net/publication/351495657_Effects_of_visual_complexity_on_user_search_behavior_and_satisfaction_an_eye-tracking_study_of_mobile_news_apps — first-page metadata/abstract and images, not the complete 14-page methods/tables.
- Prior **unverified** source transcription in `is369/completion/makeup/CT_2_EYETRACKING_17_RESPONSES.md` records sample age 21–26, mean 23.847, SD 1.422 and detailed ANOVA/means; these values have **not** been independently corroborated against the full original paper and therefore are *not* promoted to VERIFIED or copied into the review's numerical claims.
- No independently authenticated changes to sample demographics, tested F/p values, or effect sizes were made. Full institutional PDF or approved author copy is the precise needed input.


Published abstract https://doi.org/10.1007/s10209-021-00815-1 and accessible publisher-preview excerpts confirm 34 **invited** participants; higher quantity complexity increased revisits/fixations/saccades and reduced satisfaction; higher layout complexity increased revisits/saccades, with nonlinear fixation and inverted-U satisfaction patterns.
**Full methods, exact analyzed demographics, experimental tables and effect sizes were NOT independently accessible.** Previous-course note ages 21–26, mean 23.85, SD 1.42 remain expressly marked unverified in Word and PowerPoint. No invented p-values, means, qualitative interviews, or numerical chart are included. Full paper is required before a submission-ready statistical/demographic audit.

### Research validity / additional blockers
- IT-2: publisher page/abstract is accessible but the **full 21-page article including appendix and scoring details is not accessible here**. Earlier 21-response draft remains source-conditional; full article, genuine individual evaluation and any real partner interaction still needed.
- CT1/CT2: exact official Blackboard question sheets are not independently verified; [YOUR VIEW] remains for student opinion. CT2 Q5/Q6's required cited studies need primary-source checks.
- All 12 presenter comment forms × 4 presenters: intentionally evidence-only templates, not fabricated observations; guest comments similarly remain a worksheet.
- IT-3: article and questions not provided; no answers made.
- Final Project 1–3: proposed four citations and AI-verification theme remain **unconfirmed**, design unapproved, no data collected.
- Quiz practice sheets exist; quizzes unattempted by assistant.
- October 31 (user-reported written message) confirms **permission** for missed IT-2, Critical Thinking 1 and 2, Guest Comments, and past-due peer comments. Instructor will set **deadline TBD**; full marks possible subject to quality. Ordinary deadlines from November 3 onward still apply. No alternate tasks, extra credit, or Incomplete. Instructor retains grading and article-approval authority.

## Rubric coverage intent
Review 2/3: APA; purpose and publication rationale; sample/methods; quantitative and qualitative treatment; three supported strengths and weaknesses; future work; summary; writing quality. Presentation 2/3: same, with concise visual organization and speaker notes. **Evidence readiness and approval are separate from structural rubric coverage**. No grade guarantees.
