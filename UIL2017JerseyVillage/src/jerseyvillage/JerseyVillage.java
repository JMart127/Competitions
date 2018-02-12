/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jerseyvillage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class JerseyVillage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws  IOException{
        File file  = new File("PR25.dat");
        Scanner input = new Scanner(file);
        int length = input.nextInt();
        String[] names = new String[length];
        for (int i = 0; i < length; i++) {
            names[i]= input.next();
        }
        for (int i = 0; i < length; i++) {
            
        }
         
    }
    
}
