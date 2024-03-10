/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumnaturalnum;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class SumNaturalNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        int sum = calculateSum(n);
        
        System.out.print("Sum of first " + n + " natural numbers: " + sum);
        scanner.close();
    }
        public static int calculateSum(int n){
            int sum = 0;
            for(int i =1; i<=n; i++){
                sum +=i;
                
            }
            return sum;
        }
}

