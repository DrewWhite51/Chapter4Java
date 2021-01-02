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

// Write a program that asks the user to enter the amount that he or she has budgeted for the month.
// A loop should then prompt the user to enter each of his or her expenses for the month, keep a running total.
// When the loop finishes, the program should display the amount that the user is over or under budget.
public class BudgetAnalysis_16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int totalExpenses = 0;
        System.out.println("How much money do you have budgeted for this month?");
        double moneyBudgeted = keyboard.nextDouble();
        System.out.println("How many expenses do you have this month?");
        int numberOfExpenses = keyboard.nextInt();
        int i = 1;
        
        for (i = 1; i<=numberOfExpenses; i++){
            System.out.println("How much is your " + i + " expense");
            totalExpenses += keyboard.nextInt();
        }
        
        System.out.println("Your expenses equal " + totalExpenses);
        if (totalExpenses > moneyBudgeted) {
            System.out.println("You are over budget");
        } else {
            System.out.println("You are within your budget constraints");
        }
        
    }
}
