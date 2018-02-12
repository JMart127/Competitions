/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jerseyvillage;

import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class proj24 {
        public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
                System.out.println("ENTER TWO INTEGERS");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = Math.max(a, b);
    int d = Math.min(a, b);
            
    
    
    double root;
    int check;
    
    for(int i=d; i<c; i++) {
        
        check = (int)(Math.sqrt(i));
        root = (Math.sqrt(i));
        
        if(root == check) {
            System.out.print(i +"\n");
        }
        
    }
        
        
    }
    
    
    
    
}
