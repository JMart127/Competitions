
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Andrew
 */
public class Isabel {
    
    public static void main(String[] args) throws FileNotFoundException {
        //Date date = new Date();
        //GregorianCalendar c = new GregorianCalendar();
        
        Scanner sc = new Scanner(new File("isabel.dat"));
        ArrayList<Person> p = new ArrayList<>();
        
        while(sc.hasNext()){
        
            p.add(new Person(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
            System.out.println("");
            
        }
        Object[] ps = p.toArray();
        Arrays.sort(ps);
        for (Object p1 : ps) {
            Person s = (Person) p1;
            System.out.println(s.toString() );
        }
    }
    

    
}

class Person implements Comparable<Person>{
    public GregorianCalendar bday;
    public String name;

    public Person(String name, int y, int m, int d){
        bday = new GregorianCalendar(y,m-1,d);
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        int n = bday.get(GregorianCalendar.DAY_OF_WEEK) - o.bday.get(GregorianCalendar.DAY_OF_WEEK);
        if(n != 0){
            return n;
        }
        return name.compareTo(o.name);
    }
    
    @Override
    public String toString(){
        return String.format("%-11s", name) + ": "
                + bday.getDisplayName(GregorianCalendar.DAY_OF_WEEK, 2, Locale.ENGLISH) + ", "
                + bday.getDisplayName(GregorianCalendar.MONTH, 2, Locale.ENGLISH) + " "
                + bday.get(GregorianCalendar.DAY_OF_MONTH) + ", "
                + bday.get(GregorianCalendar.YEAR);
    }


    
    

}
