package md2html;

import java.util.ArrayList;

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

    Iterable<ParagraphInterface> GetAllParagraphs()
    {
        ArrayList<ParagraphInterface> pars = new ArrayList<ParagraphInterface>(super.GetAllElements());

        return pars;
    }
}
