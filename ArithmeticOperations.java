/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arithmeticoperations;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class ArithmeticOperations {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("Enter the 1st number: ");
     double a = scanner.nextDouble();
     
     System.out.print("Enter the 2nd number: ");
     double b = scanner.nextDouble();
     
     System.out.print("Enter the 3rd number: ");
     double c = scanner.nextDouble();
     
     double result1 = a + b * c;
     double result2 = c + b / c;
     double result3 = a % b + c;
     double result4 = a * b + c;
     
     double max = Math.max(Math.max(result1,result2), Math.max(result3,result4));
     double min = Math.min(Math.min(result1,result2), Math.min(result3,result4));
     
     System.out.println("Result of a + b* c: " + result1);
     System.out.println("Result of c + b / c: " + result2);
     System.out.println("Result of a % b + c: " + result3);
     System.out.println("Result of a * b + c: " + result4);
     
     System.out.println("Maximun value among the resuts: " + max);
     System.out.println("Minimum value among the results: " + min);
     
    }
}
