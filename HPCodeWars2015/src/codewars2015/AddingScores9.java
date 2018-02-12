/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codewars2015;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 
/**
 *
 * @author Joseph
 */
public class AddingScores9 {
    public static void main(String[] args) throws IOException {
        File file  = new File("C:\\Users\\Joseph\\Documents\\NetBeansProjects\\PastProblems\\datasets\\prob09-1-in.txt");
        Scanner sc = new Scanner(file);
        ArrayList<Integer> teams = new ArrayList<Integer>();
        int[] scores = new int[100];
        for (int score : scores) {
            score=0;
        }
        while(sc.hasNext()) {
            int team = sc.nextInt();
            int score = sc.nextInt();
            if(team!=0&&score!=0) {
                int index = teams.indexOf(team);
                if(index<0) {
                    teams.add(team);
                    index = teams.indexOf(team);
                }
                scores[index] = scores[index] + score;
            } else {
                break;
            }
        }
        for (int i = 1; i <= 5; i++) {
            int index=0;
            int max = -1;
            for (int j = 0; j < scores.length; j++) {
                if(scores[j]>max) {
                    max = scores[j];
                    index=j;
                }
            }
            System.out.println(i + " " + teams.get(index) + " " + scores[index]);
            scores[index]=0;
        }
    }
}
