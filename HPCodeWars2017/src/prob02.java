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
public class prob02 {
    public static void main(String[] args) throws IOException {
        File file  = new File("prob02.txt");
        Scanner sc = new Scanner(file);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int product = one*two;
        System.out.println(product);
        
    }
}
