package md2html;

import java.util.List;

public class Emphasis
        extends Container<ParagraphItemInterface>
        implements ParagraphItemInterface {
    public Emphasis(List<ParagraphItemInterface> items) {
        super(items);
    }

    @Override
    protected void putHTMLOpenTag(StringBuilder s) {
        s.append("<em>");
    }

    @Override
    protected void putHTMLCloseTag(StringBuilder s) {
        s.append("</em>");
    }
}
