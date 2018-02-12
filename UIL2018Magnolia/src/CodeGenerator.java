import java.io.File;
import java.util.Scanner;

/**
 *
 * @author S531749
 */
public class CodeGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);

        if (true) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String updatedLine = "";
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    String s = "" + c;
                    if (s.equals("\"")) {
                        s = "\\\"";
                    }else if(s.equals("\\")){
                        s = "\\\\";
                    }
                    updatedLine += s;
                }
                System.out.println("System.out.println(\"" + updatedLine + "\");");
            }
        }
    }
}