/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oak;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 
/**
 *
 * @author Joseph
 */
public class Gan {
    public static void main(String[] args) throws IOException {
        File file  = new File("gan.dat");
        Scanner sc = new Scanner(file);
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        while(sc.hasNextInt()){
            number.add(sc.nextInt());
        }
        
        Integer greatestNumber = 0;
        
        for (Integer integer : number) {
            if(integer >= greatestNumber){
                greatestNumber = integer;
            }
        }
        
        int lengthOfBiggest = greatestNumber.toString().length();
        
        for (int i = 0; i < lengthOfBiggest; i++) {
            System.out.print("-");
        }
        System.out.println("------------------------------------");
        
        for (Integer integer : number) {
            int r = integer;
            double pi = 3.141592653589793;
            
            double circumference = 2*pi*r;
            double area = pi*r*r;
            double surfaceArea = 4*pi*r*r*r;
            double sphereVolume = 4.0/3.0*pi*r*r*r;
            
            double rad = r;
            System.out.printf(radToString(lengthOfBiggest, r));
            System.out.printf("%9.1f", circumference);
            System.out.printf("%9.1f", area);
            System.out.printf("%9.1f", surfaceArea);
            System.out.printf("%9.1f", sphereVolume);
            System.out.println("");
        }
        
        for (int i = 0; i < lengthOfBiggest; i++) {
            System.out.print("-");
        }
        System.out.println("------------------------------------");
    }
    
    public static String radToString(int lengthOfBiggest, int rad){
        Integer radius = rad;
        int radLength = radius.toString().length();
        int numOfSpacesNeed = lengthOfBiggest - radLength;
        String toReturn = "";
        
        for (int i = 0; i < numOfSpacesNeed; i++) {
            toReturn += " ";
            
        }
        
        toReturn += rad;
        return toReturn;
    }
}
