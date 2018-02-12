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
public class Boa {
    public static void main(String[] args) throws IOException {
        File file  = new File("boa.in");
        Scanner sc = new Scanner(file);
        int times = sc.nextInt();
        for(int i = 0; i < times; i++){
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            
            char[][] grid = new char[rows][cols];
            for(int x = 0; x < grid.length; x++){
                grid[x] = sc.next().toCharArray();
            }
            int x = 0,y = 0;
            for (int j = 0; j < grid.length; j++) {
                for (int k = 0; k < grid[0].length; k++) {
                    if(grid[j][k] == 'C'){
                        x = j;
                        y = k;
                        break;
                    }
                    
                }
            }
            int res = gsp(grid,x,y);
            if(res == Integer.MAX_VALUE){
                System.out.println("Squish.");
            }else{
                System.out.println(res);
            }
            
        }
    }
    
    public static int gsp(char[][] grid, int x, int y){
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(grid[x][y] == '#'){
            return Integer.MAX_VALUE;
        }
        if(grid[x][y] == 'E'){
            return 0;
        }
        grid[x][y] = '#';
        int west = gsp(grid, x-1, y);
        int north = gsp(grid, x, y+1);
        int east = gsp(grid, x+1, y);
        int south = gsp(grid, x, y-1);
        
        if(west == Integer.MAX_VALUE && east == Integer.MAX_VALUE &&north == Integer.MAX_VALUE &&south == Integer.MAX_VALUE ){
            return Integer.MAX_VALUE;
        }
        int nw = Math.min(west, north);
        int se = Math.min(south, east);
        return Math.min(nw, se) + 1;

    }
}
