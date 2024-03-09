/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumofnaturalnumbers;
import java.util.Scanner;


/**
 *
 * @author nayan
 */
public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        if (n <= 0){
            System.out.print("Please enter a positive integer.");
        }else{
            int sum = 0;
            int i = 1;
            System.out.print("Sum of natural number from 1 to " + n + ": ");
            while (i <= n){
                sum += i;
                System.out.println(i);
                if (i < n){
                    System.out.print(" + ");
                }
                i++;
            }
            System.out.print(" = " + sum);
        }
        scanner.close();
    }
}
