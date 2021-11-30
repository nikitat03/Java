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
                ParagraphInterface par = ParseRubric(paragraph.toString());
                doc.addParagraph(par);
            }
        }

        return doc;
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


    private static int ind;

    private static ParagraphInterface ParseRubric(String paragStr) {
        final int amountHash = getAmountHash(paragStr);
        if (amountHash > 0)
            ind = amountHash + 1;


        List<ParagraphItemInterface> elements = new ArrayList<ParagraphItemInterface>();
        ParseText(paragStr, elements);

        ParagraphInterface par;
        if (amountHash > 0) {
            par = new Header(amountHash, elements);
        } else {
            par = new Paragraph(elements);
        }

        return par;
    }


    private static void ParseText(String line, List<ParagraphItemInterface> elements) {


        while (ind < line.length()) {
            char curChar = line.charAt(ind);


            ind++;
        }

    }
}
