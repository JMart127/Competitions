
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Andrew
 */
public class Wally {
    
    public static void main(String[] args) throws FileNotFoundException {
        String s= "";
        Scanner sc = new Scanner(new File("wally.dat"));
        ArrayList<String> words = new ArrayList<String>();
        while(!(s.equals("999"))){
            
            s =sc.next();
            words.add(s);
            
        }
        words.remove("999");
        words.add("true");
        words.add("false");
        words.add("null");
        ArrayList<String> good = new ArrayList<String>();
        while(sc.hasNext()) {
             s = sc.next();
            if(isGood(s)) {
                if(words.contains(s)) {
                    
                } else {
                    good.add(s);
                }
            }
        }
        Collections.sort(good);
        for (String string : good) {
            System.out.println(string);
        }
    }
    
    public static boolean isGood(String s) {
        boolean ret=true;
        char[] array =s.toCharArray();
        for (char c : array) {
            ret= (Character.isAlphabetic(c)||Character.isDigit(c)||c=='$'||c=='_');
            if(ret==false) {
                return false;
            }
        }
        char c = s.charAt(0);
        return (Character.isAlphabetic(c)||c=='$'||c=='_');
    }
}
