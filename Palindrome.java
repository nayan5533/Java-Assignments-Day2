/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindrome;
import java.util.Scanner;


/**
 *
 * @author nayan
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        boolean isPalindrome = checkPalindrome(num);
        
        if(isPalindrome){
            System.out.println(num + " is a palindrome.");
        } else{
            System.out.println(num + " is not a palindrome.");
            
        }
        scanner.close();
        
    }
    public static boolean checkPalindrome(int n){
        int originalNum = n;
        int reversedNum = 0;
        
        while (n != 0){
            int digit = n% 10;
            reversedNum = reversedNum * 10 + digit;
            n /= 10;
        }
        
        return originalNum == reversedNum;
    }
}
