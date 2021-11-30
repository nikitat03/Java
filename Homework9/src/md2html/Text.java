package md2html;

public class Text implements ParagraphItemInterface {
    private String val;

    public Text(String val) {
        this.val = val;
    }

    @Override
    public void toHTML(StringBuilder s) {

    }
}
