/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codewars2015;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
/**
 *
 * @author Joseph
 */
public class EBCDIC10 {
    public static void main(String[] args) throws IOException {
        File file  = new File("C:\\Users\\Joseph\\Documents\\NetBeansProjects\\PastProblems\\datasets\\prob10-1-in.txt");
        Scanner in = new Scanner(file);
        int times = in.nextInt();
        //System.out.println(times);
        for (int i = 0; i < times; i++) {
            int length = in.nextInt();
            //System.out.println(length);
            for (int j = 0; j < length; j++) {
                String c  = in.next();
                System.out.print(c + " ");
            }
            System.out.println("");
        }
    }
    
    public char convert(int i) {
        Map map = new HashMap();
        return 0;
    }
}
