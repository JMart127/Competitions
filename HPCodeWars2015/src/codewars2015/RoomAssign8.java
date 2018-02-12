/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codewars2015;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
 
/**
 *
 * @author Joseph
 */
public class RoomAssign8 {
    public static void main(String[] args) throws IOException {
        File file  = new File("C:\\Users\\Joseph\\Documents\\NetBeansProjects\\PastProblems\\datasets\\prob08-1-in.txt");
        Scanner in = new Scanner(file);
        int times = in.nextInt();
        //in.nextLine();
        int empty=0;
        int dupe = 0;
        int wo = 0;
        Set<Integer> list = new HashSet<Integer>();
        HashSet list2 = new HashSet<Integer>();
        for (int i = 0; i < times; i++) {
            String name = in.next();
            int num = in.nextInt();
            if(name.equals("NA")) {
                empty++;
            }
            if (num==0) {
                wo++;
            }
            boolean add = list.add(num);
            if(!add) {
                boolean add2 = list2.add(num);
                if(add2) {
                    dupe++;
                }
            }
            
        }
        System.out.println("Empty Cubes: " + empty);
        System.out.println("Duplicate Cube Assignments " + dupe);
        System.out.println("Employees Without Cube: " + wo);
    }
}
