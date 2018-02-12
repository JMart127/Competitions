/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Joseph
 */
public class Carmoji {
    public static void main(String[] args) throws IOException {
        File file  = new File("carmoji.in");
        Scanner sc = new Scanner(file);
        int times = sc.nextInt();
        sc.nextLine();
        //System.out.println(times);
        for(int i = 0; i < times; i++){
            //System.out.println(i);
            String line = sc.nextLine();
            //System.out.println(line);
            String[] array = line.split(" ");
            for (int j = 0; j < array.length-1; j++) {
                array[j] = fix(array[j]);
                System.out.print(array[j] + " ");
            }
            array[array.length-1] = fix(array[array.length-1]);
            System.out.print(array[array.length-1]);
            System.out.println("");
        }
        
    }
    
    public static String fix(String s) {
        boolean changed = false;
        String[] emoji = {":D", ":)", ":{)", ":]", "O.o"};
        String[] word = {"laugh", "smile", "disguise", "awkward", "shock"};
        for (int i = 0; i < emoji.length; i++) {
            if(s.contains(emoji[i])) {
                changed = true;
                
                    int index = s.indexOf(emoji[i]);
                    s = s.substring(0, index) + word[i] + s.substring(index+emoji[i].length());
                
                
            }
        }
        if(!changed) {
            for (int i = 0; i < word.length; i++) {
                if(s.contains(word[i])) {
                    changed = true;
                    s = s.replaceAll(word[i], emoji[i]);
                }
            }
        }
        return s;
    }
}
