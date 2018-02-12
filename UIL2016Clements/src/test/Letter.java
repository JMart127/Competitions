/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package letter;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class Letter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        File file = new File("letter.dat");
        Scanner in = new Scanner(file);
        ArrayList<Character> clist= new ArrayList<Character>();
        ArrayList<String> list= new ArrayList<String>();
        while(in.hasNextLine()) {
            list.add(in.nextLine());
        }
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            if(temp.length()==0) {
              clist.add(' ');
            } else {
            clist.add(temp.charAt(2));
            }
        }
        for (char c : clist) {
            System.out.print(c);
        }
    }
    
}
