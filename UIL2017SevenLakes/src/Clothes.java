/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author Joseph
 */
public class Clothes {
    public static void main(String[] args) throws IOException {
        File file  = new File("clothes.in");
        Scanner sc = new Scanner(file);
        int times = sc.nextInt();
        for(int i = 0; i < times; i++){
            int times2 = sc.nextInt();
            ArrayList<Shirt> shirts = new ArrayList<Shirt>();
            
            for(int j = 0; j < times2; j++){
                String name=  sc.next();
                String type = sc.next();
                String color = sc.next();
                String store = sc.next();
                shirts.add(new Shirt(name, type, color, store));
                //System.out.println(name + type + color + store);
            }
            Collections.sort(shirts, (Shirt t, Shirt t1) ->  t.getAll().compareTo(t1.getAll()));
            
            for(Shirt s : shirts){
                System.out.println(s.name);
            }
        }
    }
    
}

 class Shirt implements Comparator<Shirt>{
        public String name;
        public String type;
        public String color;
        public String store;
        
        public Shirt(String name, String type, String color, String store){
            this.name = name;
            this.type = type;
            this.color = color;
            this.store = store;
        }
        
        public String getAll(){
            return type + color + store;
        }

        @Override
        public int compare(Shirt t, Shirt t1) {
            return t.getAll().compareTo(t1.getAll());
        }
    }
