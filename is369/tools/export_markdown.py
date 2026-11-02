"""Build reviewer-ready draft DOCX/PPTX exports from is369/completion Markdown files.

Nothing is submitted to Blackboard or published. Personal reflections, missing
presentation observations, article-approval checks and other evidence gates remain.
Run from the repository root: python is369/tools/export_markdown.py
"""
from pathlib import Path
import re

from docx import Document
from docx.shared import Inches, Pt
from pptx import Presentation
from pptx.util import Inches as PI, Pt as PP

ROOT = Path(__file__).resolve().parents[1]
SOURCE = ROOT / "completion"
DEST = ROOT / "dist"

def strip_md(text):
    text = re.sub(r"\[([^]]+)\]\(([^)]+)\)", r"\1 (\2)", text)
    return text.replace("**", "").replace("`", "").replace("*", "").strip()

def word_export(source):
    doc = Document()
    section = doc.sections[0]
    section.top_margin = section.bottom_margin = Inches(.7)
    section.left_margin = section.right_margin = Inches(.85)
    normal = doc.styles["Normal"]
    normal.font.name = "Times New Roman"
    normal.font.size = Pt(12)
    normal.paragraph_format.space_after = Pt(4)
    normal.paragraph_format.line_spacing = 1
    for heading in ("Heading 1", "Heading 2", "Heading 3"):
        style = doc.styles[heading]
        style.font.name = "Times New Roman"
        style.font.size = Pt(12)
        style.font.bold = True
    previous_heading = ""
    acc = []
    def flush():
        nonlocal acc
        if acc:
            p = doc.add_paragraph(strip_md(" ".join(acc)))
            if previous_heading.lower() in ("references", "apa reference", "apa citation"):
                p.paragraph_format.left_indent = Inches(.25)
                p.paragraph_format.first_line_indent = Inches(-.25)
            else:
                p.paragraph_format.first_line_indent = Inches(.2)
        acc = []
    for raw in source.read_text(encoding="utf-8").splitlines():
        s = raw.strip()
        if not s:
            flush()
        elif s.startswith("#"):
            flush()
            m = re.match(r"^(#{1,6})\s*(.*)", s)
            if m:
                previous_heading = strip_md(m.group(2))
                doc.add_paragraph(previous_heading, style="Heading " + str(min(len(m.group(1)), 3)))
        elif s.startswith("|") or re.match(r"^(?:[-*] |\d+\. )", s):
            flush()
            doc.add_paragraph(strip_md(s))
        else:
            acc.append(s)
    flush()
    out = DEST / source.relative_to(SOURCE).with_suffix(".docx")
    out.parent.mkdir(parents=True, exist_ok=True)
    doc.save(out)
    return out

def slide_export(source):
    raw = source.read_text(encoding="utf-8")
    # Marp frontmatter precedes the first --- separator.
    blocks = re.split(r"^---\s*$", raw, flags=re.M)
    blocks = [b.strip() for b in blocks if b.strip() and "marp: true" not in b]
    deck = Presentation()
    deck.slide_width, deck.slide_height = PI(13.333), PI(7.5)
    for number, block in enumerate(blocks, 1):
        slide = deck.slides.add_slide(deck.slide_layouts[6])
        body = re.sub(r"<!--.*?-->", "", block, flags=re.S)
        lines = [strip_md(x.strip()) for x in body.splitlines() if x.strip()]
        titles = [x.lstrip("#").strip() for x in lines if x.startswith("#")]
        title = titles[0] if titles else "IS 369 Research Seminar"
        content = [x.lstrip("#-* ").strip() for x in lines if not x.startswith("#") and not x.startswith("|---") and not re.match(r"^[-| ]+$", x)]
        x = slide.shapes.add_textbox(PI(.75), PI(.5), PI(11.85), PI(.95))
        x.text_frame.text = title
        for para in x.text_frame.paragraphs:
            para.font.size = PP(27)
            para.font.bold = True
        box = slide.shapes.add_textbox(PI(.95), PI(1.65), PI(11.5), PI(5.2))
        tf = box.text_frame
        tf.word_wrap = True
        for i, line in enumerate(content[:9]):
            para = tf.paragraphs[0] if i == 0 else tf.add_paragraph()
            para.text = line[:300]
            para.font.size = PP(17)
            para.space_after = PP(16)
        foot = slide.shapes.add_textbox(PI(.75), PI(7), PI(11.8), PI(.3))
        foot.text_frame.text = f"IS 369 | Draft | Slide {number}"
        foot.text_frame.paragraphs[0].font.size = PP(9)
    out = DEST / source.relative_to(SOURCE).with_suffix(".pptx")
    out.parent.mkdir(parents=True, exist_ok=True)
    deck.save(out)
    return out

def main():
    for source in sorted(SOURCE.rglob("*.md")):
        output = slide_export(source) if "SLIDE_SCRIPT" in source.name else word_export(source)
        print(output)
    print("Generated files are drafts and require source, approval, and evidence checks.")

if __name__ == "__main__":
    main()
