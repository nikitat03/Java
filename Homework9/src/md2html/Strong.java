package md2html;

import java.util.List;

public class Strong
        extends Container<ParagraphItemInterface>
        implements ParagraphItemInterface {
    public Strong(List<ParagraphItemInterface> items) {
        super(items);
    }
}
