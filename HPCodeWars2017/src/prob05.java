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
public class prob05 {
    public static void main(String[] args) throws IOException {
        File file  = new File("prob05.txt");
        Scanner sc = new Scanner(file);
        int times = sc.nextInt();
        double winner = Double.MAX_VALUE;
        String winnerName = "";
        for(int i = 0; i < times; i++){
            String name = sc.next();
            double dist = sc.nextDouble();
            double speed=  sc.nextDouble();
            double time = dist/speed;
            if(time < winner){
                winnerName = name;
                winner = time;
            }
        }
        System.out.println(winnerName + " " + winner);
    }
}
