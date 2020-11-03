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

// PROBLEM DESCRIPTION
// The disance a vehicle travels can be calculated as follows: Distance = Speed * Time
// If a train travels 40 miles-per-hour for three hours, the distance traveled is 120 miles
// Write a progrm that asks for the speed of a vehicle (in mph) and the numbers of hours it has traveled
// It should use a loop to display the distance a vehicle has traveled for each hours of a time period specified by the user
// For example, if a vehicle is traveling at 40 mph for a three hour time period, it should display a report similar to the one that follows:
// Hour    Distance Traveled
// 1            40
// 2            80 
// 3            120

public class DistanceTraveled {
    
       public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        double vehicleSpeed = 0;
        double hoursDriven = 0;
        

        

        System.out.println("Enter the speed:");
        vehicleSpeed = keyboard.nextDouble();
     
       // Asks for speed while vehicleSpeed is less than 0 
       while (vehicleSpeed < 0) {
           System.out.println("Enter the speed:");
           vehicleSpeed = keyboard.nextDouble();
       }
       
       System.out.println("Enter the hours driven");
       hoursDriven = keyboard.nextDouble();
       
        
       // Asks for hoursDriven while less than 1
       while (hoursDriven < 1 ) {
           System.out.println("Enter the hours driven:");
           hoursDriven = keyboard.nextDouble();
       }
       
       
       // Displats the table header
       System.out.println("Hours" + "                    Distance Traveled");
       System.out.println("------------------------------------------------");
       
       int hr = 1;
       
       while (hoursDriven >= 1) {
           System.out.println(" " + hr + "                           " + hr * vehicleSpeed + " miles");
           hr++;
           hoursDriven--;
       }
       
    }
   
       
    
}
