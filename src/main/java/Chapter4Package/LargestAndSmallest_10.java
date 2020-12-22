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

// Write a program that lets the user enter a series of integers.
// The user should enter -99 to signal then end of the series.
// After all the numbers have been entered, the program should display smallest to largest.
public class LargestAndSmallest_10 {
    
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       int currentNum, largest, smallest;
       System.out.println("Enter an integer, -99 will end it.");
       currentNum = keyboard.nextInt();
       largest = smallest = currentNum;
       
       while (currentNum != -99){
           if (currentNum > largest) {
               largest = currentNum;
           } else if (currentNum < smallest) {
               smallest = currentNum;
           }
           System.out.println("Please enter an integer, -99 to exit. ");
           currentNum = keyboard.nextInt();
       }
       
       if (smallest == -99) {
           System.out.println("No valid numbers were entered");
       } else {
            System.out.println("The smallest number entered was: " + smallest + ". The largest number entered was " + largest + ".");
        }
    }
}
