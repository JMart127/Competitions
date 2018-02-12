
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
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
public class Nikita {

    public static void main(String[] args) throws IOException {
        File file = new File("nikita.dat");
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {

            int len = sc.nextInt();
            int[][] grid = new int[len][len];
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    grid[i][sc.nextInt()]++;
                }
            }
            //System.out.println(grid);
//            for (int i = 0; i < grid.length; i++) {
//                System.out.println(Arrays.toString(grid[i]));
//                
//            }

            double[] close = new double[len];
            double[] deg = new double[len];

            for (int k = 0; k < grid.length; k++) {
                int[] cur = grid[k];
                int co = 0;
                for (int i = 0; i < grid[k].length; i++) {
                    co += cur[i] * i;
                }
                deg[k] = (double) cur[1] / (double) (len - 1);
                close[k] = (double)(len - 1) / (double)co;
                //System.out.println(cur[0]);
            }
            //System.out.println(Arrays.toString(deg));
            System.out.println("least degree       " + String.format("%1.2f", getLeast(deg)) + " " + getLeastArr(deg));
            System.out.println("greatest degree    " + String.format("%1.2f", getGreatest(deg)) + " " + getGreatestArr(deg));
            System.out.println("least closeness    " + String.format("%1.2f", getLeast(close)) + " " + getLeastArr(close));
            System.out.println("greatest closeness " + String.format("%1.2f", getGreatest(close)) + " " + getGreatestArr(close));
            System.out.println("---");
            
        }
    }

    public static double getLeast(double[] g) {
        double[] n = g.clone();
        Arrays.sort(n);
        return n[0];

    }

    public static double getGreatest(double[] g) {
        double[] n = g.clone();
        Arrays.sort(n);
        return n[g.length - 1];
    }

    public static String getLeastArr(double[] g) {
        String ans = "";
        double l = getLeast(g);
        for (int i = 0; i < g.length; i++) {
            if (g[i] == l) {
                ans += (char) (i + 65);
            }

        }
        return ans;
    }

    public static String getGreatestArr(double[] g) {
        String ans = "";
        double l = getGreatest(g);
        for (int i = 0; i < g.length; i++) {
            if (g[i] == l) {
                ans += (char) (i + 65);
            }

        }
        return ans;
    }

}
