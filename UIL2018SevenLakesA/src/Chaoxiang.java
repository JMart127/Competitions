
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Andrew
 */
public class Chaoxiang {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("chaoxiang.dat"));
        while(sc.hasNextDouble()){
            double K = (sc.nextDouble()-32)/1.8 + 273.16;
            System.out.printf("%.2f", K);
            System.out.println("");
            
        }
    }
    
}
