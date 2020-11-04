/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4Package;

import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Drew
 */
public class DistanceTraveledToFile {
    
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
       
       
       // Initializes counter variable
       int hr = 1;
       
       
       // Adds values to the table 
       while (hoursDriven >= 1) {
           System.out.println(" " + hr + "                           " + hr * vehicleSpeed + " miles");
           hr++;
           hoursDriven--;
       }
       


       CreateFile g = new CreateFile();
       g.openFile();
       g.addRecords(hoursDriven, hr, vehicleSpeed);
       g.closeFile();
    }
     
     

}
