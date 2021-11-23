package md2html;

import java.util.List;

public class HtmlDocument implements Document {
    private List<ParagraphInterface> paragraphs;

    public void addParagraph(ParagraphInterface p) {
        paragraphs.add(p);
    }

}
