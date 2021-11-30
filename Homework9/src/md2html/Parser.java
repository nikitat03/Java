package md2html;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static Document Parse(BufferedReader rd) throws IOException {

        HtmlDocument doc = new HtmlDocument();

        List<String> lines = new ArrayList<String>();

        String line;// = rd.readLine();
        do {
            line = rd.readLine();
            if (!line.isEmpty()) {
                lines.add(line);
            } else {
                ParagraphInterface par = ParseLines(lines);
                doc.addParagraph(par);
                lines.clear();
            }
        } while (rd.ready());

        if(!lines.isEmpty()) {
            ParagraphInterface par = ParseLines(lines);
            doc.addParagraph(par);
            lines.clear();
        }

        return doc;
    }

    private static boolean isHeader(String line) {
        int i = 0;
        while (line.charAt(i) == '#') {
            i++;
        }

        if (i != 0 && line.charAt(i) == ' ') {
            return true;
        }
        return false;
    }

    private static ParagraphInterface ParseLines(List<String> lines) {
        ParagraphInterface par = null;

        if (isHeader(lines.get(0))) {
            par = ParseHeader(lines);
        } else {
            par = ParseParagraph(lines);
        }

        return par;
    }

    private static int countHash(String line) {
        int i = 0;
        while (line.charAt(i) == '#') {
            i++;
        }
        return i;
    }

    private static ParagraphInterface ParseHeader(List<String> lines) {
        int cnt = countHash(lines.get(0));

        return new Header(cnt, ParseText(lines));
    }

    private static ParagraphInterface ParseParagraph(List<String> lines) {
        return new Paragraph(ParseText(lines));
    }

    private static List<ContainerItemInterface> ParseText(List<String> lines) {
        List<ContainerItemInterface> a = new ArrayList<ContainerItemInterface>();
        return a;
    }
}
