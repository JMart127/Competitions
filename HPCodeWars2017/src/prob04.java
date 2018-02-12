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
public class prob04 {
    public static void main(String[] args) throws IOException {
        File file  = new File("prob04.txt");
        Scanner sc = new Scanner(file);
        int times = sc.nextInt();
        for(int i = 0; i < times; i++){
            double distance = sc.nextDouble();
            double time = sc.nextDouble();
            
            System.out.println((distance * 60)/time);
        }
    }
}
