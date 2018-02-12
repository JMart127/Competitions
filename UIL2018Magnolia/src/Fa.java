
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joseph
 */
public class Fa {
    public static void main(String[] args) throws IOException {
        File file  = new File("fa.dat");
        Scanner sc = new Scanner(file);
        while(sc.hasNext()) {
            int len=  sc.nextInt();
            int[] nums = new int[len];
            for (int i = 0; i < len; i++) {
                nums[i] = sc.nextInt();
            }
            int min = Integer.MAX_VALUE - 10;
            double opt = 1;
            for (double i = 0.5; i < nums.length; i+= 0.5) {
                int ub = getUB(nums, i);
                if(ub < min){
                    min = ub;
                    opt  = i;
                }
                
            }
            System.out.print(getLS(nums, opt) + " ");
            if(Math.round(opt) == opt){
                System.out.print("^"+ (int)opt);
            }else{
                System.out.print((int)(opt-.5) + "^" + (int)(opt + .5));
            }
            
            System.out.println(" " + getRS(nums, opt));

        }
    }
    
    public static int getLS(int[] nums, double i){
        int sum = 0;
        for (int j = 0; j < i; j++) {
            sum += nums[j];
        }
        return sum;
    }
    
    public static int getRS(int[] nums, double i){
        int sum = 0;
        for (int j = nums.length-1; j > i; j--) {
            sum += nums[j];
        }
        return sum;
    }
    
    public static int getUB(int[] nums, double i ){
        return Math.abs(getLS(nums, i) - getRS(nums, i));
    }
}
