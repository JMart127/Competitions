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
public class Fengge {
    public static void main(String[] args) throws IOException {
        File file  = new File("Fengge.dat");
        Scanner in = new Scanner(file);
        while(in.hasNextInt()){
            int row = in.nextInt();
            int column = in.nextInt();
            char c = in.next().charAt(0);
            
            char[][] arr= new char[row][column];
            for(int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = c;    
                }
            }
            
            for (int i = 0; i < arr.length; i++) {
                if(i>= 2 && i <= arr.length-3){
                    arr[i][column/2]= ' ';
                    
                    for (int j = 0; j < arr[i].length; j++) {
                        if(j>= 2 && j <= arr[i].length-3){
                            arr[i][j] = ' ';
                        }
                        
                    }
                }
                
            }
            
            
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] ); 
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
