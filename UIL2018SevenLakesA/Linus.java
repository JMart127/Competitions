
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
public class Linus {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("Linus.dat"));
        int numTimes = sc.nextInt();
        for (int iteration = 0; iteration < numTimes; iteration++) {
            int num = sc.nextInt();
            int dem = sc.nextInt();
            int gcf = findGCF(num,dem);
            num/=gcf;
            dem/=gcf;
            if(num/1.0/dem>1) {
                int rem = num%dem;
                if(rem==0) {
                    System.out.println(num%dem);
                } else {
                    System.out.println(num/dem + " " + rem +"/" + dem);
                }
            } else {
                System.out.println(num+"/"+dem);
            }
        }
    }
    
    public static int findGCF(int first, int second) {
        int min = Math.min(first, second);
        for (int i = min; i > 0; i--) {
            if((first%i==0)&&(second%i==0)) {
                return i;
            }
        }
        return 1;
    }
           
}
