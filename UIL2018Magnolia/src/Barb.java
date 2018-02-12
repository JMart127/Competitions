
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
public class Barb {
    public static void main(String[] args) throws IOException {
        File file  = new File("barb.dat");
        Scanner sc = new Scanner(file);
        while(sc.hasNext()) {
            String orig = sc.next();
            
            String var1 = reverse(orig).toUpperCase();
            String var2 = reverse(orig).substring(orig.length()/2);
            String var3 = orig.substring(orig.length()/2).toUpperCase();
            
            System.out.println(orig + " " + var1 + " " + var2 + " " + var3);
        }
    }
    
    public static String reverse(String in){
        char[] chars = in.toCharArray();
        for (int i = 0; i < ((chars.length/2)); i++) {
            char aChar = chars[i];
            chars[i] = chars[chars.length-i-1];
            chars[chars.length-i-1] = aChar;
            
        }
        String end = "";
        for (int i = 0; i < chars.length; i++) {
            end += chars[i];
            
        }
        return end;
    }
}
