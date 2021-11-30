package md2html;

import java.util.ArrayList;
import java.util.List;

public abstract class Container<T extends ContainerItemInterface>
        implements ContainerInterface {
    private List<T> items;

    public  Container() {
        this.items = new ArrayList<T>();
    }

    public Container(List<T> items) {
        this.items = items;
    }

    protected void Add(T newItem)
    {
        items.add(newItem);
    }


}
