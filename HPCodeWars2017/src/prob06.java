/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Joseph
 */
public class prob06 {
    public static void main(String[] args) throws IOException {
        File file  = new File("prob06.txt");
        Scanner sc = new Scanner(file);
        int times = sc.nextInt();
        for(int i = 0; i < times; i++){
            int length = sc.nextInt();
            int[] array = new int[length];
            for (int j = 0; j < length; j++) {
                array[j] = sc.nextInt();
            }
            int firstNum  = array[0];
            int[] deltas = new int[length-1];
            for (int j = 0; j < deltas.length; j++) {
                deltas[j] = array[j+1]-array[j];
            }
            for (int j = 0; j < deltas.length; j++) {
                deltas[j] = deltas[j] * -1;    
            }
            int[] done = new int[length];
            for (int j = 0; j < length; j++) {
                if(j==0) {
                    done[j] = firstNum;
                } else {
                    done[j] = done[j-1] + deltas[j-1];
                }
            }
            for (int j = 0; j < done.length; j++) {
                System.out.print(done[j] + " ");
            }
            System.out.println("");
        }
    }
}
