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
public class Radicals7 {
    public static void main(String[] args) throws IOException {
        File file  = new File("C:\\Users\\Joseph\\Documents\\NetBeansProjects\\PastProblems\\datasets\\prob07-1-in.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNext()) {
            double p = sc.nextDouble();
            if(p==0) {
                break;
            } else {
                double r = Math.pow(p, 2.0/3.0);
                System.out.println(r);
            }
        }
    }
}
