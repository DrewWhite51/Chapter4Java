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

// This is a slot machine simulation that double the money if two match
// and triples the money if three match
public class SlotMachineSimulation_22 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        double slotMachineMoney = 0;
        int gameCounter = 0;
        String[] possibleOptions = {"Cherries","Oranges","Plums","Melons","Bars", "Bells"};
        
        while (gameCounter<1) {
            System.out.println("How much money do you want to put into the slot machine?");
            slotMachineMoney = keyboard.nextInt();
            double twoMatching = slotMachineMoney*2;
            double threeMatching = slotMachineMoney*3;   
            // Stores string from array in variable
            String first = possibleOptions[random.nextInt(possibleOptions.length)];
            String second = possibleOptions[random.nextInt(possibleOptions.length)];
            String third = possibleOptions[random.nextInt(possibleOptions.length)];            
            // Prints out the randomly chosen variable
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);

            if (first.equals(second) && first.equals(third)) {
                System.out.println("You have won $" + threeMatching);
            } else if (first.equals(second) || first.equals(third)) {
                System.out.println("You have won $" + twoMatching);
            } else if (second.equals(first) || second.equals(third)) {
                System.out.println("You have won $" + twoMatching);
            } else {
                System.out.println("You have won $0");
            }
            System.out.println("If you want to play again type 1, if not type 0");
            int playAgain = keyboard.nextInt();
            if (playAgain == 1) {
                gameCounter +=0;
            } else {
                System.out.println("Thanks for playing!");
                gameCounter ++;
            }
        }

               
        

    }
    

    
    
}
