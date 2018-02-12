/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jerseyvillage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class proj52 {
    public static void main(String[] args) throws IOException{
        File file  = new File("E:PR52.dat");
        Scanner in = new Scanner(file);
        String name = in.nextLine();
        double baseWidth = in.nextDouble();
        double height = in.nextDouble();
        double baseHalf = baseWidth/2;
        double sideLength = Math.sqrt((baseHalf*baseHalf) + (height*height));
        double areaOfOne = 0.5*(baseWidth*sideLength);
        double latArea  = areaOfOne*4;
        int gallons = (int)Math.ceil(latArea/450);
        System.out.println("PAINTING " + name.toUpperCase() + " WILL REQUIRE " + gallons + " GALLONS OF PAINT");
    }
}
