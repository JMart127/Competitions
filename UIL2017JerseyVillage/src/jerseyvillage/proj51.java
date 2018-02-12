/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jerseyvillage;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class proj51 {
    public static void main(String[] args) throws IOException{
        File file  = new File("E:PR51.dat");
        Scanner input = new Scanner(file);
        int length = input.nextInt();
        ArrayList<String> names = new ArrayList();

        for (int i = 0; i < length; i++) {
            names.add(input.next());
        }
        
       File toWrite = new File("a.txt");
        PrintWriter writer = new PrintWriter(toWrite);
        for (String name : names) {
            writer.print(name);
            writer.print("new");
        }
        
        writer.close();
        for (int i = 0; i < length; i++) {
            if (whoCheck(names.get(i))==0) {
                System.out.println("6 WHO'S");
                System.out.println("AN OWL SAYS WHO?");
            } else {
            int numWho = 0;
            String[] split = names.get(i).split("WHO");
            numWho+=split.length;
            String left = "";
            for (int j = 0; j < split.length; j++) {
                left+=split[j];
            } if(left.equalsIgnoreCase("WHO")) {
               numWho++; 
               System.out.println(numWho + " WHO'S");
               System.out.println("AN OWL SAYS WHO?");
            } else if(whoCheck(left)>1) {
                if(left.equalsIgnoreCase("WWHOHWHOO")) {
                    numWho+=2;
                    System.out.println(numWho + " WHO'S");
                    System.out.println("AN OWL SAYS WHO?");
                }   
            } else {
                System.out.println(numWho + " WHO'S");
                System.out.println(left);
            }}
            System.out.println("");
        }
        
    }
    public static int whoCheck(String s) {
        String[] split = s.split("WHO");
        return split.length;
    }
}
