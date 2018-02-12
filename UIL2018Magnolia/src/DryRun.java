import java.io.File;
import java.util.Scanner;


public class DryRun {

    public static void main(String[] args) throws Exception{
        Scanner file = new Scanner(new File("Dryrun.dat"));
        int times = file.nextInt();
        file.nextLine(); 
        for (int i = 0; i < times; i++) {
            System.out.println("I like " + file.next() +".");
        }
    }
    
}