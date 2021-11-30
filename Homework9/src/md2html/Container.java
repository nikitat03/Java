package md2html;

import java.util.ArrayList;
import java.util.List;

public abstract class Container<T extends ContainerItemInterface>
        implements ContainerInterface {
    private List<T> elements;

    public  Container() {
        this.elements = new ArrayList<T>();
    }

    public Container(List<T> items) {
        this.elements = items;
    }

    protected void Add(T newItem)
    {
        elements.add(newItem);
    }

    protected abstract void putHTMLOpenTag(StringBuilder s);
    protected abstract void putHTMLCloseTag(StringBuilder s);

    @Override
    public void toHTML(StringBuilder s) {
        putHTMLOpenTag(s);
        for (T item : elements) {
            item.toHTML(s);
        }
        putHTMLCloseTag(s);
    }

}
