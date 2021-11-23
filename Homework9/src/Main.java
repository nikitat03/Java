import java.io.*;

public class Main {
    public static void main(String[] args) {
        File inFile = new File(args[0]);
        try {
            Reader rd = new FileReader(inFile);

        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e.getMessage());
        }


        File outFile = new File(args[1]);
        try {
            FileWriter fWriter = new FileWriter(outFile);
            fWriter.write("<pre>кода __без__ форматирования</pre>");
            fWriter.close();
        } catch (IOException e) {
            System.out.println("Can't create out file" + e.getMessage());
        }
    }
}
