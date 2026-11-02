# IS 369 — Source and Export QA, 2026-11-02

## Scope and interpretation
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

### Primary-source status — Guo et al. 2022
Published abstract https://doi.org/10.1007/s10209-021-00815-1 and accessible publisher-preview excerpts confirm 34 **invited** participants; higher quantity complexity increased revisits/fixations/saccades and reduced satisfaction; higher layout complexity increased revisits/saccades, with nonlinear fixation and inverted-U satisfaction patterns.
**Full methods, exact analyzed demographics, experimental tables and effect sizes were NOT independently accessible.** Previous-course note ages 21–26, mean 23.85, SD 1.42 remain expressly marked unverified in Word and PowerPoint. No invented p-values, means, qualitative interviews, or numerical chart are included. Full paper is required before a submission-ready statistical/demographic audit.

### Research validity / additional blockers
- IT-2: publisher page/abstract is accessible but the **full 21-page article including appendix and scoring details is not accessible here**. Earlier 21-response draft remains source-conditional; full article, genuine individual evaluation and any real partner interaction still needed.
- CT1/CT2: exact official Blackboard question sheets are not independently verified; [YOUR VIEW] remains for student opinion. CT2 Q5/Q6's required cited studies need primary-source checks.
- All 12 presenter comment forms × 4 presenters: intentionally evidence-only templates, not fabricated observations; guest comments similarly remain a worksheet.
- IT-3: article and questions not provided; no answers made.
- Final Project 1–3: proposed four citations and AI-verification theme remain **unconfirmed**, design unapproved, no data collected.
- Quiz practice sheets exist; quizzes unattempted by assistant.
- Instructor controls article approvals, late-work admission, presentation scheduling and grades.

## Rubric coverage intent
Review 2/3: APA; purpose and publication rationale; sample/methods; quantitative and qualitative treatment; three supported strengths and weaknesses; future work; summary; writing quality. Presentation 2/3: same, with concise visual organization and speaker notes. **Evidence readiness and approval are separate from structural rubric coverage**. No grade guarantees.
