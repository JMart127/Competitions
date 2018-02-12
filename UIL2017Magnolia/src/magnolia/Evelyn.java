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
public class Evelyn {
    public static void main(String[] args) throws IOException {
        File file  = new File("Evelyn.dat");
        Scanner in = new Scanner(file);
        //in.nextLine();
        
        int carry = 1;
        int sum = 1;
        int before = 1;
        while(in.hasNextInt()){
            System.out.print("\' ");
            int length = in.nextInt();
            //System.out.println(length);
        for (int i = 0; i < length; i++) {
            sum=carry;
            String str = sum+"";
            str = str.replace('0', '&');
            str = str.replace('1', '\'');
            str = str.replace('2', '(');
            str = str.replace('3', ')');
            str = str.replace('4', '*');
            str = str.replace('5', '+');
            str = str.replace('6', ',');
            str = str.replace('7', '-');
            str = str.replace('8', '.');
            str = str.replace('9', '/');
            
            System.out.print(str+" ");
            carry=before+carry;
            before = sum;
        }
        
        carry=1;
        sum=1;
        before = 1;
            System.out.println("");
        }
    }
}
