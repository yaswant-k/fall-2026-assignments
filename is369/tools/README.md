# IS 369 — Export source drafts to Word and PowerPoint

All content is maintained as version-controlled Markdown under `is369/completion/`.

## Reproducible conversion
```bash
python -m pip install -r is369/tools/requirements.txt
python is369/tools/export_markdown.py
```

This generates DOCX files and PPTX slide decks under `is369/dist/` without
changing the original coursework. The generic exporter is a **convenience**
tool; verify slide pagination, source tables, citations, APA hanging indents,
and final content before use. For polished, checked November 3 exports,
use the Word and PowerPoint downloads shared in the ChatGPT conversation.

**Status:** These files are not Blackboard submissions. Proposed article
approvals and missing class/partner observations must be resolved separately.
The repository is PUBLIC; do not add confidential student or course information.

**Future:** After approval, the exact references and selected three-paper theme
must be reconciled with Final Project Parts 1–3.
