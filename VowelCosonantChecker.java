/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcosonantchecker;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class VowelCosonantChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a char: ");
        char ch = scanner.next().charAt(0);
        scanner.close();
        
        switch (Character.toLowerCase(ch)){
            case'a':
            case'e':
            case'i':
            case'o':
            case'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'z'))
                    System.out.println(ch + " is a consonant.");
                else
                    System.out.println("Invalid input: "+ ch);
            
           
        }
    }
}
