
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
public class Emily {
    public static void main(String[] args) throws IOException {
        File file  = new File("emily.dat");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            String[] nums = line.split(" ");
            int[] vals = new int[nums.length];
            for (int i = 0; i < 3; i++) {
                vals[i] = Integer.parseInt(nums[i], 10);
            }
            double area = ((vals[0]+vals[1])/2.0)*vals[2];
            int ten = (int)(Math.round(area*10));
            if(ten%10==0) {
                System.out.println(ten/10);
            } else {
                System.out.println(ten/10.0);
            }
            
            
        }
    }
}
