/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jerseyvillage;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class proj23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE SHIP'S SPEED IN KNOTS: ");
        double knots = input.nextDouble();
        DecimalFormat out = new DecimalFormat("0.0");
        double mile = knots * 1.15;
        if (mile % 1 == 0) {
            System.out.println("THE SHIP IS CRUISING AT A SPEED OF " + out.format(mile) + " MPH.");

        }else{
            System.out.println("THE SHIP IS CRUISING AT A SPEED OF " + (int)Math.round(mile) + " MPH.");
        }
    }
}
