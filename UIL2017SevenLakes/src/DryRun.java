
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joseph
 */
public class DryRun {
    
    /**
     * This is a really hard problem 
     * @param args      the arguments to pass in
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        File file  = new File("dryrun.in");
        Scanner sc = new Scanner(file);
        while(sc.hasNext()) {
            System.out.println(sc.next());
        }
        
    }
}
