/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4Package;

import java.util.Scanner;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Drew
 */
//17
// Write  program that generates a random number and asks the user to guess the number.
// If the user's guess is higher than the random number, the program should display "Too high try again".
// If the guess is lower display "Too low try again"
// Program should loop until the user guesses correctly

//18 
// Make the program keep a count of the number of guesses a user makes.
// When a user correctly guesses the random nuber, the program should display the number of guesses.
public class RandomNumberGuessingGame_17_18 {

   public static void main (String [] args){
  //Variables
        Random randomNumber = new Random();
        Scanner keyboard = new Scanner(System.in);
        int computerValue = randomNumber.nextInt(100);
        int numberOfTries = 0;
        int success = 0;
        int guess = 0;


  //Logic and While Loop

    while(true) {
    computerValue = randomNumber.nextInt(100);
    numberOfTries = 0;
    while (true) {
        System.out.println("please enter an integer betwen 1 and 100 inclusive: ");
        guess = keyboard.nextInt();
        numberOfTries++;

        if (guess < 1 || guess > 100) System.out.println("Invalid input");
        else if (guess == computerValue) {
            System.out.println("Congratulations you won! Your numbers of tries was: " + numberOfTries + " and the number was: " + computerValue);
            // leave the first loop
            break;
        }
        else if (guess < computerValue) System.out.println("Your guess is too low!");
        else if (guess > computerValue) System.out.println("Your guess is too high!");
    }

    System.out.println("Do you want to play again? (1:Yes/2:No)");
    // if input is not yes leave second loop
    if(keyboard.nextInt() != 1) break;
}





   }
}

