/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4Package;

import static java.lang.Character.toLowerCase;
import java.util.Scanner;

/**
 *
 * @author Drew
 */

// Write a program that asks the user to enter a string, and then asks the user to enter a character
// The program should count and display the number of times that the specified character appears in the string


public class LetterCounter {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        char letter;
        String sentence = " ";
        
        // Gets letter to search for 
        System.out.println("enter a character for which to search: ");
        letter = toLowerCase(keyboard.next().charAt(0));
        
        // Gets string to search in
        System.out.println("Enter the string to search: ");
        sentence = keyboard.next().trim().toLowerCase();
        
        int counter = 0;
        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == letter) {
                counter++;
            }
        }
        
        System.out.println("There are " + counter + " occurences of the letter " + letter + " in the word " + sentence);
        
    }
    
}
