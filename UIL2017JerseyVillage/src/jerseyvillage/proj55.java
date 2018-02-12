/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jerseyvillage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class proj55 {
    public static void main(String[] args) throws IOException{
        File file  = new File("pr55.dat");
        Scanner in = new Scanner(file);
        int length = in.nextInt();
        String[] s = new String[length];
        int[] is = new int[length];
        for (int i = 0; i < length; i++) {
            is[i] = in.nextInt();
        }
        for (int i = 0; i < length; i++) {
            s[i]=Integer.toBinaryString(is[i]);
            //System.out.println(s[i]);
        }
        for (int i = 0; i < length; i++) {
            int l = s[i].length();
            if(l<24) {
                char[] array = s[i].toCharArray();
                char[] arr = new char[24];
                for (int j = 0; j < array.length; j++) {
                    if(array[j]=='1') {
                        arr[j]='1';
                    } else {
                        arr[j]='0';
                    }
                }
                String temp = "";
                for (int j = 0; j < 23; j++) {
                  temp+=arr[j];  
                }
                //System.out.println(temp);
              String red = temp.substring(0,8);
            String green = temp.substring(8,16);
            String blue = temp.substring(16,24);
            int r = Integer.parseInt(red, 2);
            System.out.print("RED: " + r + "\t");
            int g = Integer.parseInt(green, 2);
            System.out.print("GREEN: " + g + "\t");
            int b = Integer.parseInt(blue, 2);
            System.out.print("BLUE: " + b + "\t");
            System.out.println(""); 
            } else {
              String red = s[i].substring(0,8);
            String green = s[i].substring(8,16);
            String blue = s[i].substring(16,24);
            int r = Integer.parseInt(red, 2);
            System.out.print("RED: " + r + "\t");
            int g = Integer.parseInt(green, 2 );
            System.out.print("GREEN: " + g + "\t");
            int b = Integer.parseInt(blue, 2);
            System.out.print("BLUE: " + b + "\t");
            System.out.println("");  
            }
            
        }
        
    }
}
