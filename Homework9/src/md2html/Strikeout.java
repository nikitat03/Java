package md2html;

import java.util.List;

public class Strikeout
        extends Container<ParagraphItemInterface>
        implements ParagraphItemInterface {
    public Strikeout(List<ParagraphItemInterface> items) {
        super(items);
    }
}
