/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package magnolia;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
 
/**
 *
 * @author Joseph
 */
public class Danna {
    public static void main(String[] args) throws IOException {
        File file  = new File("Danna.dat");
        Scanner in = new Scanner(file);
        DecimalFormat out = new DecimalFormat("0.00");
        
        int total = 0;
        int totalUnder = 0;
        int totalNormal = 0;
        int totalOver = 0;
        int totalObese = 0;
        
        while(in.hasNextInt()){
            int inches = in.nextInt();
            int pounds = in.nextInt();
            double kilos = pounds*0.453592;
            double meters = inches*0.0254;
            double BMI = kilos/(meters*meters);
            String type;
            if(BMI < 18.5){
                type = "underweight";
                totalUnder ++;
            }else if(BMI >= 18.5 && BMI < 25){
                type = "normal";
                totalNormal++;
            }else if(BMI >= 25 && BMI < 30){
                type = "overweight";
                totalOver++;
            }else{
                type = "obese";
                totalObese++;
            }
             total ++;
            System.out.println(inches + " " + pounds + " " + out.format(BMI) + " " + type);
        }
        
        double weight = (100.0/total);

        double percentUnder = weight * totalUnder;
        double percentNormal = weight * totalNormal;
        double percentOver = weight * totalOver;
        double percentObese = weight * totalObese;
        
        System.out.println(total + " total students surveyed");
        System.out.println(out.format(percentUnder ) + "% underweight");
        System.out.println(out.format(percentNormal ) + "% normal");
        System.out.println(out.format(percentOver ) + "% overweight");
        System.out.println(out.format(percentObese ) + "% obese");
    }
}
