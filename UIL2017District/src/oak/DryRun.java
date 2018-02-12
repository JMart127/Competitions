/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
//package oak;


 
/**
 *
 * @author Joseph
 */
public class DryRun {
    public static void main(String[] args) throws IOException {
        File file  = new File("dryrun.dat");
        Scanner sc = new Scanner(file);
        int times = sc.nextInt();
        for(int i = 0; i < times; i++){
            System.out.println("I like " + sc.next() + ".");
        }
    }
}
