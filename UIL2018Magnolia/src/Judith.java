
import java.io.File;
import java.io.IOException;
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
 * @author Joseph
 */
public class Judith {
    public static void main(String[] args) throws IOException {
        File file  = new File("judith.dat");
        Scanner sc = new Scanner(file);
        ArrayList<LongString> numbers = new ArrayList<LongString>();
        while(sc.hasNext()) {
            numbers.add(new LongString(sc.next()));
        }
        
        Collections.sort(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
            
        }
    }
    
    
}

class LongString implements Comparable<LongString>{
    String a;
    String b;
    public LongString(String s){
        this.b = s.substring(0, s.indexOf("."));
        this.a = s.substring(s.indexOf(".") + 1);
        
    }

    @Override
    public int compareTo(LongString t) {
        if(Long.valueOf(b) == Long.valueOf(t.b)){

            return  a.compareTo(t.a);
        }else{
            return (int) (Long.valueOf(b) - Long.valueOf(t.b));
        }
    }
    
    public String toString(){
        return b + "." + a;
    }
    
}
