/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class Figs {

    public static void main(String[] args) throws IOException {
        File file = new File("figs.in");
        Scanner sc = new Scanner(file);
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            int times2 = sc.nextInt();
            
            ArrayList<Day> days = new ArrayList<Day>();
            for (int j = 0; j < times2; j++) {
                days.add(new Day(sc.nextInt(), sc.nextInt()));
            }
            if(isTheSame(days)){
                System.out.println(days.get(0).val);
            }else{
                while(true){
                    Day max = Collections.max(days, (Day d1, Day d2) -> d1.val - d2.val);
                    int m = max.val;
                    //System.out.println(m);
                    //break;
                    //System.out.println("Max " + m);
                    for(Day d: days){
                        while(d.val < m){
                            d.add();
                        }
                    }
                    if(isTheSame(days)){
                        System.out.println(days.get(0).val);
                        break;
                    }
                }
            }
                
        }
    }
    
    public static boolean isTheSame(ArrayList<Day> dayz){
        int n = dayz.get(0).val;
        for(Day d : dayz){
            if(d.val != n) return false;
        }
        return true;
    }
}


class Day{
    public int m;
    public int val;
    public Day(int m, int b){
        val = b + m;
        this.m = m;
    }
    
    public void add(){
        val += m;
    }
}
