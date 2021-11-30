package md2html;

import java.util.List;

public class Paragraph
        extends Container<ParagraphItemInterface>
        implements ParagraphInterface {

    public Paragraph(List<ParagraphItemInterface> items) {
        super(items);
    }
}
