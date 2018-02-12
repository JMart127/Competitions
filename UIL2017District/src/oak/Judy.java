/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package oak;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 
/**
 *
 * @author Joseph
 */
public class Judy {
    
    static char[] output = new char[200];
    static String line = "";
    static String[] sets;
    public static void main(String[] args) throws IOException {
        File file  = new File("judy.dat");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
            output = new char[200];
            int root = 0;
            line = sc.nextLine();
            sets = line.split(" ");
            String cands = "";
            for(String s: sets){
                cands = cands + s.substring(0,1);
            }
            
            for(int i = 0; i < cands.length(); i++){
                char c = cands.charAt(i);
                if(c != '-' && c != ' '){
                    String sL = line.replaceFirst(String.valueOf(c), " ");   //= line.substring(0, i) + line.substring(i + 1);
                    if(!sL.contains(String.valueOf(c))){
                        //System.out.println("Root = " + line.indexOf(c));
                        root = line.indexOf(c);
                        break;
                    }
                }
            }
            output[0] = line.charAt(root);
            output[1] = line.charAt(root + 1);
            output[2] = line.charAt(root + 2);

            
            
            
            int curr = 0;
            int numDone = 0;
            ArrayList<Integer> banned = new ArrayList<Integer>();
            while(numDone < sets.length){
                if(curr == sets.length){
                    curr = 0;
                }
                if(!banned.contains(curr)){
                    if(addSet(curr) == true){
                        banned.add(curr);
                        numDone++;
                    }
                }
                if(String.valueOf(output).indexOf("A") != -1){
                    break;
                }
                curr++;
            }
            //System.out.println(String.valueOf(output));
            System.out.println(String.valueOf(output).indexOf("A"));
        }
    }
    
    public static boolean addSet(int i){
        String s = sets[i];
        String root = s.substring(0,1);
        int rootI = String.valueOf(output).indexOf(root);
        //System.out.println("Root I: " + rootI);
        if(rootI != -1){
            output[rootI * 2 + 1] = s.charAt(1);
            output[rootI * 2 + 2] = s.charAt(2);
            //System.out.println("Added Set: " + s);
            return true;
        }else{
            return false;
        }
    }
    
    
}
