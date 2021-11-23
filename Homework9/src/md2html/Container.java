package md2html;

import java.util.List;

public abstract class Container implements ContainerInterface {
    private List<ContainerItemInterface> items;

    public Container(List<ContainerItemInterface> items) {
        this.items = items;
    }


}
