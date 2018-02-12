
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Andrew
 */
public class Rocio {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("rocio.dat"));
        while(sc.hasNext()){
            int size = sc.nextInt();
            int diag = sc.nextInt();
            char[][] array = new char[size][size];
            for (char[] cs : array) {
                for (char c : cs) {
                    c =' ';
                }
            }
            for (int i = 0; i < size; i++) {
                array[i][i]='*';
            }
            for (int i = 0; i < size; i++) {
                array[i][size-i-1]='*';
            }
            for (int i = diag; i < size-diag; i++) {
                for (int j = diag; j < size-diag; j++) {
                    array[i][j]='*';
                }
            }
            
            for (char[] cs : array) {
                for (char c : cs) {
                    if(c=='*') {
                        System.out.print(c);
                    } else {
                         System.out.print(" ");
                    }
                }
                System.out.println("");
            }
            for (int i = 0; i < size; i++) {
                System.out.print("=");
            }
            System.out.println("");
        }
    }
    
}
