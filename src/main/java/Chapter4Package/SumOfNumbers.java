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

// PROBLEM DISCRIPTION 
// Write a program that asks the user for a positive nonzero integer value
// This program should use  aloop to get the sum of all integers from 1 up to the number entered 
// For example if the user enters 50, the loop will find the sum of 1,2,3,4...5

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
