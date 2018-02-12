/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codewars2015;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
 
/**
 *
 * @author Joseph
 */
public class AngleDifference12 {
    public static double greatest=0.0;
    public static void main(String[] args) throws IOException {
        //
        File file  = new File("C:\\Users\\Joseph\\Documents\\NetBeansProjects\\PastProblems\\datasets\\prob12-1-in.txt");
        Scanner sc = new Scanner(file);
        int size = sc.nextInt();
        double[][] heigths = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                heigths[i][j] = sc.nextDouble();
            }
        }
        
        for (int i = 1; i < size-1; i++) {
            for (int j = 1; j < size-1; j++) {
                diffAdj(heigths[i][j], heigths[i-1][j]);
                diffAdj(heigths[i][j], heigths[i+1][j]);
                diffAdj(heigths[i][j], heigths[i][j-1]);
                diffAdj(heigths[i][j], heigths[i][j+1]);
                diffDiag(heigths[i][j], heigths[i-1][j-1]);
                diffDiag(heigths[i][j], heigths[i-1][j+1]);
                diffDiag(heigths[i][j], heigths[i+1][j-1]);
                diffDiag(heigths[i][j], heigths[i+1][j+1]);
            }
        }
        
        System.out.println("Max angle is " + greatest);
        
    }
    
    public static void diffAdj(double first, double second) {
        double a = Math.abs(first-second);
        double b=1;
        double c = Math.sqrt((a*a)+(b*b));
        double angle =  Math.toDegrees(Math.asin(a/c));
        if(angle>greatest) {
            greatest = angle;
        }
    }
    
    public static void diffDiag(double first, double second) {
        double a = Math.abs(first-second);
        double b=Math.sqrt(2);
        double c = Math.sqrt((a*a)+(b*b));
        double angle =  Math.toDegrees(Math.asin(a/c));
        if(angle>greatest) {
            greatest = angle;
        }
    }
}
