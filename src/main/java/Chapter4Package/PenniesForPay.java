/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4Package;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Drew
 */

// Write a program that calculates the amount a person would earn over a period of timeif his or her salary is 
// one penny the first day, two pennies the second day, and continues to double each day
// The program should display a table showing the slary for each day, and then show the total pay at then end of the period
// The output should be displayed in a dollar amount not the number pennies.


public class PenniesForPay {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("0.00");
        
        // Initialzing variables
        double finalSalary = 0;
        double currentPay = .01;
        double day = 1;
        
        
        // User inputs how many days the number accumulates
        System.out.println("Enter the number of days your money will accumulate: ");
        double userInput = keyboard.nextDouble();
        
        // User validation to make sure the value is greater than 0 
        if (userInput < 1) {
            System.out.println("That is not a valid number.");
        }
          
        // Generates heading for table 
        System.out.println("Day " + "                   " + "      Salary");
        System.out.println("----------------------------------------");
        
        
        
        // 
        for (day = 1; day<=userInput; day++) {
            currentPay = currentPay * 2;
            System.out.println(day + "\t\t\t\t" + "$" + currentPay);
            finalSalary += currentPay;
        }
        System.out.println("Your total salary is \n $ " + formatter.format(+ finalSalary));
    }
    
    
    
    
}
