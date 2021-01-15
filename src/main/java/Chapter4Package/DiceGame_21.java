/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4Package;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Drew
 */

// Write a program that plays a simple dice game between the computer and the user. 
// When the program runs, a loop should repeat 10 times. Each iteration of the loop should do the followig:
// (1) Generate a random integer in the range of 1 through 6. This is the value of the computer's die.
// (2) Generate anothe random integer in the range of 1 through 6. This is the value of the user's die.
// (3) The die with the highest value wins. If there is a tie there is no winner.
// As the loop iterates, the program should keep count of the number of wins for each.
// After the loop performs all of its iterations, the program should display who is the grand winner.
public class DiceGame_21 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random randomNumber = new Random();
        int userWin = 0;
        int computerWin = 0;
        int numberOfTies = 0;
        int computerRoll = 0;
        int userRoll = 0;
        int i = 0;
        
        for (i=1; i<=10; i++) {
            computerRoll = randomNumber.nextInt(6);
            userRoll = randomNumber.nextInt(6);
            System.out.println("----------------------------------------");
            System.out.println("The user rolled a: " + userRoll);
            System.out.println("The computer rolled a: " + computerRoll);
            if (userRoll > computerRoll) {
                System.out.println("User wins!");
                userWin +=1;
            } else if (userRoll < computerRoll) {
                System.out.println("Computer wins!");
                computerWin +=1;
            } else if (userRoll == computerRoll) {
                System.out.println("It is a tie!");
                numberOfTies += 1;
            }
            System.out.println("----------------------------------------");
           
        }
        
        System.out.println("----------------------------------------");
        System.out.println("The number of user wins is " + userWin);
        System.out.println("The number of computer wins is " + computerWin);
        System.out.println("The number of ties is " + numberOfTies);
        System.out.println("----------------------------------------");

    }
}
