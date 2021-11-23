package md2html;

import java.util.List;

public class Header extends Container implements ParagraphInterface {
    private int level;

    public Header(int level, List<ContainerItemInterface> items) {
        super(items);
        this.level = level;
    }
}
