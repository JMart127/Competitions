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
public class Diamond11 {
    public static void main(String[] args) throws IOException {
        File file  = new File("C:\\Users\\Joseph\\Documents\\NetBeansProjects\\PastProblems\\datasets\\prob11-1-in.txt");
        Scanner sc = new Scanner(file);
        while(true) {
            int size = sc.nextInt();
            int length = sc.nextInt();
            int width = sc.nextInt();
            if(size==0&&length==0&&width==0) {
                break;
            } else {
                char[][] array = new char[size][size*width];
                int middle = size/2;
                for (int i = 1; i <= middle; i++) {
                    int startAwayFromMiddle = middle-i;
                    for (int j = startAwayFromMiddle; j < middle; j++) {
                        array[i-1][j] = '/';
                    }
                    for (int j = middle; j < middle+i; j++) {
                        array[i-1][j] = '\\';
                    }
                }
                for (int i = middle; i < size; i++) {
                    int startAwayFromMiddle = size-i;
                    for (int j = middle-startAwayFromMiddle; j < middle; j++) {
                        array[i][j] = '\\';
                    }
                    for (int j = middle; j < middle+startAwayFromMiddle; j++) {
                        array[i][j] = '/';
                    }
                }
                fill(array,size);
                for (int i = 0; i < length; i++) {
                    for (char[] cs : array) {
                        for (char c : cs) {
                            if(c!=0) {
                                System.out.print(c);
                            } else {
                                System.out.print("#");
                            }

                        }
                        System.out.println("");
                    }
                }
                System.out.println("");
            }
        }
    }
    
    public static void fill(char[][] array, int size) {
        for (int i = 0; i < array.length; i++) {
            for (int j = size; j < array[i].length; j++) {
                array[i][j]=array[i][j-size];
            }
        }
    }
}
