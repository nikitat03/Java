package md2html;

import java.util.List;

public class Strikeout
        extends Container<ParagraphItemInterface>
        implements ParagraphItemInterface {
    public Strikeout(List<ParagraphItemInterface> items) {
        super(items);
    }

    @Override
    protected void putHTMLOpenTag(StringBuilder s) {
        s.append("<s>");
    }

    @Override
    protected void putHTMLCloseTag(StringBuilder s) {
        s.append("</s>");
    }
}
