/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reverseinteger;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class ReverseInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int reversedNum = reverseInteger(num);
        System.out.println("Reversed integer: " + reversedNum);
        scanner.close();
        
    }
    
    public static int reverseInteger(int n){
        int reversedNum = 0;
        while (n != 0){
            int digit = n % 10;
            reversedNum = reversedNum * 10 + digit;
            n /= 10;
        }
        return reversedNum;
    }
}
