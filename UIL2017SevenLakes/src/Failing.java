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
public class Failing {
    public static void main(String[] args) throws IOException {
        File file  = new File("failing.in");
        Scanner sc = new Scanner(file);
        int times = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < times; i++){
                String first = sc.next();
                String last = sc.next();
                int grade = sc.nextInt();
                if(grade<70) {
                    System.out.println(first + " " + last);
                }
        }
    }
}
