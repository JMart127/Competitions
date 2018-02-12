
import java.io.File;
import java.io.IOException;
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
public class Cruz {
    public static void main(String[] args) throws IOException {
        File file  = new File("cruz.in");
        Scanner sc = new Scanner(file);
        
        int times = sc.nextInt();
        
        for (int i = 0; i < times; i++) {
            int rows = sc.nextInt();
            int columns = sc.nextInt();
            int timePerTile = sc.nextInt();
            int timeToSave = sc.nextInt();
            
            int dirtyTiles = 0;
            for (int j = 0; j < rows; j++) {
                String line = sc.next();
                char[] chars = line.toCharArray();
                for (int k = 0; k < chars.length; k++) {
                    char aChar = chars[k];
                    if(aChar == '#'){
                        dirtyTiles++;
                    }
                    
                }
                }
            int timeToClean = dirtyTiles*timePerTile;
                if(timeToClean < timeToSave){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }

