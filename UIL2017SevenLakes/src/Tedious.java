/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Joseph
 */
public class Tedious {
    public static void main(String[] args) throws IOException {
        File file  = new File("tedious.in");
        Scanner sc = new Scanner(file);
        int times = sc.nextInt();
        for(int i = 0; i < times; i++){
            double a = sc.nextInt();
            //System.out.println(a);
            double b = sc.nextInt();
            //System.out.println(b);
            double c = sc.nextInt();
            //System.out.println(c);
            double d = sc.nextInt();
            double x = sc.nextInt();
            //System.out.println;
            double answer = (2.0*x*(Math.pow((a+b), 3.0))*(b-(3.0*c*d)+(a*b)-23))/(Math.pow(c, 3.0)*Math.pow(d, 4.0)* Math.pow(x, 2));
            
            System.out.printf("%.3f\n", answer);
        }
    }
}
