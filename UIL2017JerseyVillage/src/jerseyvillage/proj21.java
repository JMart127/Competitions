/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jerseyvillage;

import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class proj21 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE DIAMETER OF THE PIZZA: ");
        double diam = input.nextInt();
        double area = Math.PI* (diam/2) * (diam/2);
        double calories = area*15;
        double calPerSlice = calories/8;
        System.out.println("ONE SLICE OF A " + (int)diam + " INCH PIZZA CONTAINS " + (int)Math.round(calPerSlice) + " CALORIES.");
    }
}
