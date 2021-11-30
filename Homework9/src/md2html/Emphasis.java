package md2html;

import java.util.List;

public class Emphasis
        extends Container<ParagraphItemInterface>
        implements ParagraphItemInterface {
    public Emphasis(List<ParagraphItemInterface> items) {
        super(items);
    }
}
