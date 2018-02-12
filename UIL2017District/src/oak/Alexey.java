/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package oak;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
 
/**
 *
 * @author Joseph
 */
public class Alexey {
    public static void main(String[] args) throws IOException {
        File file  = new File("alexey.dat");
        Scanner sc = new Scanner(file);
        while(sc.hasNext()) {
            String s = sc.nextLine();
            String[] array = s.split(" ");
            if(array.length==2) {
                Long num = Long.parseLong(array[1]);
                //int index = num.toString().indexOf('1');
                char[] bits = Long.toBinaryString(num).toCharArray();
                String ret = "";
                for (int i = 0; i < bits.length; i++) {
                    if(bits[i]=='1') {
                        ret +='0';       
                    } else {
                        ret+='1';
                    }
                }
                System.out.println(Long.parseLong(ret, 2));
            } else {
                long num = Long.parseLong(array[2]);
                if(array[0].equals("RS")) {
                    long set = num>>Long.parseLong(array[1]);
                    System.out.println(set);
                } else if(array[0].equals("LS")) {
                    long set = num<<Long.parseLong(array[1]);
                    System.out.println(set);
                } else if(array[0].equals("RC")){
                    String bin = Long.toBinaryString(num);
                    int length = bin.length();
                    int place = Integer.parseInt(array[1]);
                    String end = bin.substring(length-place,length);
                    String begining = bin.substring(0,length-place);
                    String done = end+begining;
                    System.out.println(Long.parseLong(done, 2));
                } else if(array[0].equals("LC")) {
                    String bin = Long.toBinaryString(num);
                    int length = bin.length();
                    int place = Integer.parseInt(array[1]);
                    String end = bin.substring(place,length);
                    String begining = bin.substring(0,place);
                    String done = end+begining;
                    System.out.println(Long.parseLong(done ,2));
                } else if(array[0].equals("A")) {
                    Integer and = Integer.parseInt(array[1]);
                    num = num&and;
                    System.out.println(num);
                } else if(array[0].equals("O")) {
                    Integer and = Integer.parseInt(array[1]);
                    num = num|and;
                    System.out.println(num);
                } else if(array[0].equals("X")) {
                    Integer and = Integer.parseInt(array[1]);
                    num = num^and;
                    System.out.println(num);
                }
                
            }
            //System.out.println(s);
        }    
            
    }
    
}
