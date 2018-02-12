
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joseph
 */
public class Constanza {
    public static void main(String[] args) throws IOException {
        File file  = new File("constanza.dat");
        Scanner sc = new Scanner(file);
        
        int red = 0;
        int orange =0;
        int yellow = 0;
        int green = 0;
        int blue = 0;
        int indigo =0;
        int violet = 0;
        while(sc.hasNext()) {
            String color = sc.next();
            switch(color){
                case "red":
                     red ++;
                     break;
                case "orange":
                        orange++;
                        break;
                 case "yellow":
                        yellow++;
                        break; 
                case "green":
                        green++;
                        break;
                case "blue":
                        blue++;
                        break;
                case "indigo":
                        indigo++;
                        break;          
                 case "violet":
                        violet++;
                        break;
            }
        }
        
        System.out.println(stringToLength("red",7)+ starString(red));
        System.out.println(stringToLength("orange",7)+ starString(orange));
        System.out.println(stringToLength("yellow",7)+ starString(yellow));
        System.out.println(stringToLength("green",7)+ starString(green));
        System.out.println(stringToLength("blue",7)+ starString(blue));
        System.out.println(stringToLength("indigo",7)+ starString(indigo));
        System.out.println(stringToLength("violet",7)+ starString(violet));
    }
    
    public static String stringToLength(String in, int length){
        String end = in;
        while(end.length()<length){
            end+=" ";
        }
        return end;
    }
    
    public static String starString(int times){
        String str ="";
        for(int i =0; i <times; i++){
            str +="*";
        }
        return str;
    }
}
