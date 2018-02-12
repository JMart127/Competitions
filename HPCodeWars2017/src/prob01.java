
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
public class prob01 {
    public static void main(String[] args) throws IOException {
        File file  = new File("prob01.txt");
        Scanner sc = new Scanner(file);
        String name = sc.next();
        System.out.println("Salutations, " + name + "! We are the Panthers from Klein Oak HS!");
    }
}
