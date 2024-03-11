/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quadratic;
import java.util.Scanner;


/**
 *
 * @author nayan
 */
public class Quadratic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter value of a: ");
        double a = scanner.nextDouble();
        
        System.out.println("Enter value of b: ");
        double b = scanner.nextDouble();
        
        System.out.println("Enter value of c: ");
        double c = scanner.nextDouble();
        
        double delta = b * b- 4 * a * c;
        
        if (delta > 0){
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            System.out.println("Root 1 of x = " + root1);
            System.out.println("Root 2 of x  = " + root2);
        } else if (delta == 0){
            double root = -b / (2 * a);
            System.out.println("Roots of x are real & equal.Root = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-delta) / (2 * a);
            
            System.out.println("Roots of x are complex.");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + " i ");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + " i ");
        }
                
    }
}
