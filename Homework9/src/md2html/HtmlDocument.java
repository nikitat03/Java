package md2html;

public class HtmlDocument
        extends Container<ParagraphInterface>
        implements Document {

    public void addParagraph(ParagraphInterface p) {
        super.Add(p);
    }

    @Override
    protected void putHTMLOpenTag(StringBuilder s) {

    }

    @Override
    protected void putHTMLCloseTag(StringBuilder s) {

    }
}
