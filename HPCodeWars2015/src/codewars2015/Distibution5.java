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
public class Distibution5 {
    public static void main(String[] args) throws IOException {
        File file  = new File("C:\\Users\\Joseph\\Documents\\NetBeansProjects\\PastProblems\\datasets\\prob05-1-in.txt");
        Scanner in = new Scanner(file);
        int one = in.nextInt();
        int two = in.nextInt();
        int three = in.nextInt();
        int sum = one*(two+three);
        System.out.println(one + " x (" + two + " + " + three + ") = " + one + " x " + two + " + " + one + " x " + three);
        System.out.println(one + " x " + (two+three) + " = " + (one*two) + " + " + (one*three));
        System.out.println(sum + " = " + sum);
        
    }
}
