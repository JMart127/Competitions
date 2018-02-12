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
public class prob03 {
    public static void main(String[] args) throws IOException {
        File file  = new File("prob03.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextDouble()){
            double time = sc.nextDouble();
            double distance = time * 0.299792;
            System.out.println(distance);
            
        }
    }
}
