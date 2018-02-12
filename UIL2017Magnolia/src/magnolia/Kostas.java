/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package magnolia;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
 
/**
 *
 * @author Joseph
 */
public class Kostas {
    public static void main(String[] args) throws IOException {
        File file  = new File("kostas.dat");
        Scanner in = new Scanner(file);
    }
    
    public static String Switch(String s) {
        String ret="";
        char[] array = s.toCharArray();
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            
        }
        for (char c : array) {
            if(c=='A') {
                ret+='4';
            } else if (c=='B') {
                ret+="8";
            } else if (c=='C') {
                ret+="[";
            } else if (c=='D') {
                ret+=")";
            } else if (c=='E') {
                ret+="3";
            } else if (c=='F') {
                ret+="|=";
            } else if (c=='G') {
                ret+="6";
            } else if (c=='H') {
                ret+="#";
            } else if (c=='I') {
                ret+="|";
            } else if (c=='J') {
                ret+="]";
            } else if (c=='K') {
                ret+="|<";
            } else if (c=='L') {
                ret+="1";
            } else if (c=='M') {
                ret+="^^";
            } else if (c=='N') {
                ret+="^";
            } else if (c=='O') {
                ret+="0";
            } else if (c=='P') {
               ret+="|o"; 
            } else if (c=='Q') {
                ret+="9";
            } else if (c=='R') {
                ret+="2";
            } else if (c=='S') {
                ret+="5";
            } else if (c=='T') {
                ret+="7";
            } else if (c=='U') {
                ret+="(_)";
            } else if (c=='V') {
                ret+="\\/";
            } else if (c=='W') {
                ret+="vv";
            } else if (c=='X') {
                ret+="><";
            } else if (c=='Y') {
                ret+="/";
            } else if (c=='Z') {
                ret+="%";
            } else {
                ret+=c;
            }
        }
        return ret;
    }
}
