/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package singing;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class Singing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        File file = new File("singing.dat");
        Scanner in = new Scanner(file);
        int length = in.nextInt();
        String[] songs = new String[length];
        ArrayList<String> array = new ArrayList<>();
        in.nextLine();
        while(in.hasNextLine()) {
            array.add(in.nextLine());
        }
        for (int i = 0; i < length; i++) {
            songs[i] = array.get(i);
            //System.out.println(array.get(i));
        }
        for (int i = 0; i < length; i++) {
            String temp = songs[i];
            for (int j = i; j >= 0; j--) {
                //System.out.println("Comparing " + i + " and  " + j);
                if(i!=j) {
                    if(temp.equals(songs[j])) {
                        //System.out.println("bad");
                        //System.out.println(songs[i] + " is equal to " + songs[j]);
                        printOut(songs[i]);
                        //System.out.println(i + " is equal to " + j);
                        break;
                    } 
                }
            }
        }
        
    }
    public static void printOut(String good){
        
            for (int j = 0; j < good.length(); j++) {
                if(good.charAt(j) == '-'){
                    good = good.substring(j+2);
                    good += " AGAIN?!";
                    System.out.println(good.toUpperCase());
                }
                
            }
            
            
        }
    }
    

