package md2html;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static Document Parse(BufferedReader rd) throws IOException {

        HtmlDocument doc = new HtmlDocument();

        String line = rd.readLine();
        while (line != null) {
            StringBuilder paragraph = new StringBuilder();
            while (line.isEmpty()) {
                line = rd.readLine();
            }
            while (line != null && !line.isEmpty()) {
                if (paragraph.length() != 0) {
                    paragraph.append('\n');
                }
                paragraph.append(line);
                line = rd.readLine();
            }
            if (paragraph.length() > 0) {
                ParagraphInterface par =  ParseRubric(paragraph.toString());
                doc.addParagraph(par);
            }
        }

        return doc;
    }

    private static ParagraphInterface ParseRubric(String paragStr) {
        final int amountHash = getAmountHash(paragStr);

        ParagraphInterface par = null;

        if (amountHash > 0) {
            par = ParseHeader(amountHash, paragStr);
        } else {
            par = ParseParagraph(paragStr);
        }

        return par;
    }

    private static int getAmountHash(String line) {
        int amountHash = 0;
        while (amountHash < line.length() && line.charAt(amountHash) == '#') {
            amountHash++;
        }
        if (amountHash < line.length() && line.charAt(amountHash) == ' ') {
            return amountHash;
        }

        return 0;
    }

    private static ParagraphInterface ParseHeader(int headerLevel, String paragStr) {
        return new Header(headerLevel, ParseText(paragStr));
    }

    private static ParagraphInterface ParseParagraph(String paragStr) {
        return new Paragraph(ParseText(paragStr));
    }

    private static List<ParagraphItemInterface> ParseText(String paragStr) {
        List<ParagraphItemInterface> elements = new ArrayList<ParagraphItemInterface>();



        return elements;
    }
}
