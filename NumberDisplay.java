/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberdisplay;
import java.util.Scanner;
/**
 *
 * @author nayan
 */
public class NumberDisplay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number (1,10,100 or 1000): ");
        int number = scanner.nextInt();
        
        if (number == 1){
            System.out.println("Unit");
        }else if (number == 10){
            System.out.println("Ten");          
        }else if (number == 100){
            System.out.println("Hundred");
        }else if (number == 1000){
            System.out.println("Thousand");    
        }else {
            System.out.println("Invalid number.Please enter 1, 10, 100, 1000");    
    }
        scanner.close();
}
}    
