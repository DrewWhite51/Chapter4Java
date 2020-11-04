/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4Package;

import java.util.Scanner;

/**
 *
 * @author Drew
 */
public class SumOfNumbers {
    
    public static void sumOfNumbers() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a positive integer.");
        int userInput = keyboard.nextInt();
        
        int x;
        int total = 0;
        
        for (x=1; x <= userInput; x++) {
            total += x;
        }
        
        System.out.println(total);
        
    }
    
    public static void main(String[] args) {
        sumOfNumbers();
        
    }
    
}
