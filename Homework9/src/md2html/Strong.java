package md2html;

import java.util.List;

public class Strong
        extends Container<ParagraphItemInterface>
        implements ParagraphItemInterface {
    public Strong(List<ParagraphItemInterface> items) {
        super(items);
    }

    @Override
    protected void putHTMLOpenTag(StringBuilder s) {
        s.append("<strong>");
    }

    @Override
    protected void putHTMLCloseTag(StringBuilder s) {
        s.append("</strong>");
    }
}
