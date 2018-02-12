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
public class Suresh {

    public static void main(String[] args) throws IOException {
        File file = new File("suresh.dat");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String paragraph = sc.nextLine();
            paragraph = paragraph.replaceAll("\\.", "@");
            paragraph = paragraph.replaceAll("\\?", "@");
            String[] sentences = paragraph.split("@");
            System.out.print(sentences.length + " " );
            for (int i = 0; i < sentences.length; i++) {
                
                String mySentence = sentences[i];
                mySentence = mySentence.replaceAll(",", "");
                mySentence = mySentence.replaceAll(";", "");
                mySentence = mySentence.replaceAll(":", "");

                String[] words = mySentence.split(" ");
                if(i > 0 && words.length>0){
                System.out.print(words.length-1 + " ");
                }else if (words.length>0){
                System.out.print(words.length + " ");
                }
                String longestWord = "";

                for (int j = 0; j < words.length; j++) {
                    if (words[j].length() >= longestWord.length()) {
                        longestWord = words[j];
                    }
                }

                System.out.print(longestWord + " ");
                
            }
                System.out.println("");
        }
    }
}
