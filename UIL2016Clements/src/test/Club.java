/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fightclub;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class Club {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        File file = new File("Club.dat");
        Scanner in = new Scanner(file);
        int length = in.nextInt();
        for (int i = 0; i < length; i++) {
            int J = in.nextInt();
            int size = J+2;
            int howMany =0;
            char[][] array = new char[size][size];
            fillArray(array);
            fillMiddle(array);
            printOut(array);
        }
    }
    public static void printOut(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                char temp = array[i][j];
                System.out.print(array[i][j] + " ");
  
            }
            System.out.println("");
        }
        
    }
    public static void fillArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = '*';
            }
        }
    }
    public static void fillMiddle(char[][] array) {
        int howMany=0;
        int size = array.length;
        int middle = (size)/2;
        System.out.println("Middle is " + middle);
            for (int j = 0; j < size; j++) {
                array[middle][middle] = ' ';
                for (int k = 0; k < howMany; k++) {
                    //left is messed up
                    for (int i = middle-howMany; i < middle+howMany; i++) {
                        array[j][i] = ' ';
                        System.out.println("Making [" + j + "][" + i  + "] a space");
                    }
//                    array[j][middle+howMany] = ' ';
//                    System.out.println("Making [" + j + "][" + (middle+howMany)  + "] a space");
//                    array[j][middle-howMany] = ' ';
//                    System.out.println("Making [" + j + "][" + (middle-howMany)  + "] a space");  
                }
                if(howMany<middle) {
                       howMany++; 
                    } else {
                        howMany--;
                    }
            }
    }
    
}
