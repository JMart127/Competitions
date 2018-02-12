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
public class Luann {
    public static void main(String[] args) throws IOException {
        File file  = new File("luann.dat");
        Scanner sc = new Scanner(file);
        int times = sc.nextInt();
        for(int i = 0; i < times; i++){
            int num = sc.nextInt();
            boolean[][] arr = new boolean[num+1][num+1];
            int highestr=0;
            for(int k =0; k < num; k++){
                int c = sc.nextInt();
                int r = sc.nextInt();
                //System.out.println(x + " " + y);
                if(r>highestr){
                    highestr = r;
                }
                arr[r][c]= true;
            }
            
            for(int r = highestr; r >0; r--){
                System.out.print(r + "|");
                for (int j = 1; j < arr[r].length; j++) {
                    if(arr[r][j]){
                        System.out.print("X");
                    }else{
                        System.out.print(" ");
                    }
                    
                }
                System.out.println("");
            }
            
            System.out.print("  ");
            for (int j = 0; j < num; j++) {
                System.out.print("_");        
            }
            System.out.println("");
            System.out.print("  ");
            for (int j = 0; j < num; j++) {
                System.out.print(j+1);        
            }
            System.out.println("");
            System.out.println("=====");
        }
    }
}
