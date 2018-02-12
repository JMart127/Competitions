/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Joseph
 */
public class prob07 {
    public static void main(String[] args) throws IOException {
        File file  = new File("prob07-1-in.txt");
        Scanner sc = new Scanner(file);
        DecimalFormat out = new DecimalFormat("0.000000");
        int times = sc.nextInt();
        for(int i = 0; i < times; i++){
            double firstNum = sc.nextDouble();
            double A = sc.nextDouble();
            double B = sc.nextDouble();
            double C = sc.nextDouble();
            double M = sc.nextDouble();
            double N = sc.nextDouble();
            double acceptError = sc.nextDouble();
            
            double currentNum = firstNum;
            boolean good = false;
            int timesRun = 0;
            while(!good){
                double returnNum = C + (A * currentNum + M)/(B * currentNum + N);
                double error = Math.abs(returnNum - currentNum);
                timesRun ++;
                if(error <= acceptError){
                    good = true;
                    System.out.println(out.format(returnNum));
                }else if(timesRun >= 100){
                    good = true;
                    System.out.println("DIVERGES");
                }else{
                    currentNum = returnNum;
                }
            }
        }
    }
}
