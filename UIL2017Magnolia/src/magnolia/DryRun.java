/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package magnolia;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class DryRun {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File file  = new File("dryrun.dat");
        Scanner in = new Scanner(file);
        int length = in.nextInt();
        in.nextLine();
        for (int i = 0; i < length; i++) {
            System.out.println("I like " + in.nextLine() +  ".");
        }
        
    }
    
}
