
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
public class Deshi {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("deshi.dat"));
        while(sc.hasNext()){
            String line = sc.nextLine();
            char a='a';
            char e='e';
            char i='i';
            char o='o';
            char u='u';
            boolean good=true;
            for (int j = 0; j < line.length()-5; j++) {
                if ((line.charAt(j)==a||line.charAt(j)==e||line.charAt(j)==i||line.charAt(j)==o||line.charAt(j)==u)
                        &&(line.charAt(j+1)==a||line.charAt(j+1)==e||line.charAt(j+1)==i||line.charAt(j+1)==o||line.charAt(j+1)==u)
                        &&(line.charAt(j+2)==a||line.charAt(j+2)==e||line.charAt(j+2)==i||line.charAt(j+2)==o||line.charAt(j+2)==u)
                        &&(line.charAt(j+3)==a||line.charAt(j+3)==i||line.charAt(j+3)==e||line.charAt(j+3)==o||line.charAt(j+3)==u)
                        &&(line.charAt(j+4)==a||line.charAt(j+4)==i||line.charAt(j+4)==e||line.charAt(j+4)==o||line.charAt(j+4)==u)) {
                    good=false;
                    break;
                }
            }
                for (int j = 0; j < line.length()-8; j++) {
                    if ((line.charAt(j)!=a&&line.charAt(j)!=e&&line.charAt(j)!=i&&line.charAt(j)!=o&&line.charAt(j)!=u)
                        &&(line.charAt(j+1)!=a&&line.charAt(j+1)!=e&&line.charAt(j+1)!=i&&line.charAt(j+1)!=o&&line.charAt(j+1)!=u)
                        &&(line.charAt(j+2)!=a&&line.charAt(j+2)!=e&&line.charAt(j+2)!=i&&line.charAt(j+2)!=o&&line.charAt(j+2)!=u)
                        &&(line.charAt(j+3)!=a&&line.charAt(j+3)!=i&&line.charAt(j+3)!=e&&line.charAt(j+3)!=o&&line.charAt(j+3)!=u)
                        &&(line.charAt(j+4)!=a&&line.charAt(j+4)!=e&&line.charAt(j+4)!=i&&line.charAt(j+4)!=o&&line.charAt(j+4)!=u)
                        &&(line.charAt(j+5)!=a&&line.charAt(j+5)!=e&&line.charAt(j+5)!=i&&line.charAt(j+5)!=o&&line.charAt(j+5)!=u)
                        &&(line.charAt(j+6)!=a&&line.charAt(j+6)!=i&&line.charAt(j+6)!=e&&line.charAt(j+6)!=o&&line.charAt(j+6)!=u)
                            &&(line.charAt(j+7)!=a&&line.charAt(j+7)!=i&&line.charAt(j+7)!=e&&line.charAt(j+7)!=o&&line.charAt(j+7)!=u)) {
                    
                    good=false;
                    break;
                }
               
                
                
            }
                if(good) {
                    System.out.println("ACCEPTABLE "+line);
                } else {
                    System.out.println("NOT ACCEPTABLE "+ line);
                }
        }
    }
           
}
