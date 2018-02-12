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
public class Harold {
    public static void main(String[] args) throws IOException {
        File file  = new File("harold.in");
        Scanner sc = new Scanner(file);
        int times = sc.nextInt();
        for(int i = 0; i < times; i++){
            double speed1 = sc.nextInt();
            double speed2 = sc.nextInt();
            double distanceBetween = sc.nextInt();
            
            if(speed2 >= speed1){
                System.out.println("Oh No!");
            }else{
                double ftSpeed1 = 88.0/60.0*speed1;
                double ftSpeed2 = 88.0/60.0*speed2;
                double speedDifference = ftSpeed1- ftSpeed2;
                double time = distanceBetween/speedDifference;
                System.out.printf("%.2f\n", time);
            }
        }
    }
}
