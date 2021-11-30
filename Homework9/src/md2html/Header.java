package md2html;

import java.util.List;

public class Header
        extends Container<ParagraphItemInterface>
        implements ParagraphInterface {

    private int level;

    public Header(int level, List<ParagraphItemInterface> items) {
        super(items);
        this.level = level;
    }
}
