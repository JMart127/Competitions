/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codewars2015;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
 
/**
 *
 * @author Joseph
 */
public class AlternatingBinary13 {
    public static void main(String[] args) throws IOException {
        File file  = new File("C:\\Users\\Joseph\\Documents\\NetBeansProjects\\PastProblems\\datasets\\prob13-3-in.txt");
        Scanner sc = new Scanner(file);
        String s = sc.next();
        s = s.substring(0, s.length()-1);
        //System.out.println(s);
        int length = s.length() > 7 ? 7 : s.length();
        int amount = sc.nextInt();
        for (int i = 0; i < amount-1; i++) {
            for (int j = length; j > 0; j--) {
                String bin = Long.toBinaryString(Long.parseLong(s.substring(0, j)));
                if(isAlternating(bin)) {
                    System.out.println(Integer.parseInt(bin,2));
                    s = s.substring(j, s.length());
                    length = s.length() > 7 ? 7 : s.length();
                    //System.out.println("s is now " + s);
                    break;
                }
            }
        }
        System.out.println(s);
    }
    
    public static boolean isAlternating(String s) {
        boolean ret = true;
        boolean zero = true;
        for (int i = 1; i < s.length(); i++) {
            if(zero) {
                if(s.charAt(i)!='0') {
                    ret = false;
                    break;
                }
            } else {
                if(s.charAt(i)!='1') {
                    ret=false;
                    break;
                }
            }
            zero=!zero;
        }
        return ret;
    }
}
