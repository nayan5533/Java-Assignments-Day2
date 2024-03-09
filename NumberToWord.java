/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numbertoword;
import java.util.Scanner;


/**
 *
 * @author nayan
 */
public class NumberToWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a single digit number (0-9): ");
        
        int number = scanner.nextInt();
        
        if (number >= 0 && number <= 9 ){
            String word = "";
            switch (number){
                case 0:
                 word = "Zero";
                 break;
                case 1:
                    word = "One";
                    break;
                case 2:
                    word = "Two";
                    break;
                case 3:
                    word = "Three";
                    break;
                case 4:
                    word = "Four";
                    break;
                case 5:
                    word = "Five";
                    break;
                case 6:
                    word = "Six";
                    break;
                case 7:
                    word = "Seven";
                    break;    
                case 8:
                    word = "Eight";
                    break;
                case 9:
                    word = "Nine";
                    break; 
            }
            System.out.println("Word representation:  " + word);
        }else{
            System.out.println("please enter a single-digit number.");
        }
        
        scanner.close();
        
    }
}
