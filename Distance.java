/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.distance;

/**
 *
 * @author nayan
 */
public class Distance {

    public static void main(String[] args) {
        if (args.length != 2){
            System.out.print("Usage java Distance <x> <y> ");
            return;
            
        }
        
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        
        System.out.println("distance from point (" + x + ", " + y + ") to the origin (0, 0): " + distance);
    }
}
