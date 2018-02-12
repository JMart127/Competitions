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
public class Isidora {
    public static void main(String[] args) throws IOException {
        File file  = new File("Isidora.dat");
        Scanner in = new Scanner(file);
        while(in.hasNext()) {
            String s = in.nextLine();
            String[] a = s.split(" ");
            String sep = a[0];
            long num = Long.parseLong(a[1]);
            //System.out.println(sep);
            String[] split = sep.split("-");
            if(split[0].equals("RS")) {
                long set = num>>Long.parseLong(split[1]);
                System.out.println(Long.toBinaryString(set));
            } else if(split[0].equals("LS")) {
                long set = num<<Long.parseLong(split[1]);
                System.out.println(Long.toBinaryString(set));
            } else if(split[0].equals("RC")){
                /*int howMany = Integer.parseInt(split[1]);
                howMany--;
                String sq = Long.toBinaryString(num);
                String toMove = sq.substring(sq.length()-(howMany));
                String good = toMove + sq.substring(0, (sq.length()-(howMany)));
                System.out.println("good " + good);
*/
                
                
                String bin = Long.toBinaryString(num);
                int length = bin.length();
                int place = Integer.parseInt(split[1]);
                String end = bin.substring(length-place,length);
                String begining = bin.substring(0,length-place);
                String done = end+begining;
                System.out.println(done);
            } else if(split[0].equals("LC")) {
                String bin = Long.toBinaryString(num);
                int length = bin.length();
                int place = Integer.parseInt(split[1]);
                String end = bin.substring(place,length);
                String begining = bin.substring(0,place);
                String done = end+begining;
                System.out.println(done);
            }
            //System.out.println(num);
        }
    }
}
