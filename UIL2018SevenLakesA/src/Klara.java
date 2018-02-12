
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andrew
 */
public class Klara {

    public static char[][] grid;
    public static char midChar;

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("klara.dat"));
        while (sc.hasNext()) {
            int sl = sc.nextInt();
            grid = new char[sl][sl];

            for (int x = 0; x < sl; x++) {
                grid[x] = sc.next().toCharArray();
            }

            midChar = grid[sl / 2][sl / 2];
            int numChanges = 1;
            grid[sl / 2][sl / 2] = '-';
            while (numChanges > 0) {
                numChanges = 0;
                for (int i = 0; i < sl; i++) {
                    for (int j = 0; j < sl; j++) {
                        //System.out.println(i + " " + j);
                        if (grid[i][j] == '-') {
                            if (replace(i, j + 1)) {
                                numChanges++;
                            }
                            if (replace(i, j - 1)) {
                                numChanges++;
                            }
                            if (replace(i + 1, j)) {
                                numChanges++;
                            }
                            if (replace(i - 1, j)) {
                                numChanges++;
                            }

                        }

                    }

                }
            }

            for (char[] c : grid) {
                System.out.println(c);
            }
            System.out.println("=====");

        }

    }

    public static boolean replace(int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid.length) {
            return false;

        } else {
            if (grid[x][y] == midChar) {
                grid[x][y] = '-';
                return true;
            }
        }
        return false;
    }
}

