/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package magnolia;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
 
/**
 *
 * @author Joseph
 */
public class Olga {
    public static void main(String[] args) throws IOException {
        File file  = new File("Olga.dat");
        Scanner in = new Scanner(file);
        while(in.hasNext()) {
            String name = in.nextLine();
            String temp = "";
            if(name.length()%2==0) {
                temp = '"' + name + '"';
            } else {
                temp = "'" + name + "'";
            }
            if(name.charAt(0)>=78) {
                temp = "\\" + "\\" + temp + "//";
            } else {
                temp = "\\" + temp +"/";
            }
            if (name.length()>=6) {
                temp = "=" + temp + "=";
            } else {
                temp = "-" + temp + "-";
            }
            System.out.println(temp);
        }
    }
}
