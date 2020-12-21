/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4Package;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Drew
 */
public class DistanceTraveledToFile_3 {
    
     public static void main(String[] args) throws FileNotFoundException {
        
       Scanner keyboard = new Scanner(System.in);
       double vehicleSpeed = 0;
       double hoursDriven = 0;
       System.out.println("Enter the speed:");
       vehicleSpeed = keyboard.nextDouble();
       while (vehicleSpeed < 0) {
           System.out.println("Enter the speed:");
           vehicleSpeed = keyboard.nextDouble();
       }
       System.out.println("Enter the hours driven");
       hoursDriven = keyboard.nextDouble();
       while (hoursDriven < 1 ) {
           System.out.println("Enter the hours driven:");
           hoursDriven = keyboard.nextDouble();
       }
       System.out.println("Hours" + "                    Distance Traveled");
       System.out.println("------------------------------------------------");
       int hr = 1;
       while (hoursDriven >= 1) {
           System.out.println(" " + hr + "                           " + hr * vehicleSpeed + " miles");
           hr++;
           hoursDriven--;
       }
       
       
        String fileName = "distanceTraveled";
        PrintWriter openedFile = new PrintWriter(fileName + ".txt");

         // Display the table header for rendering report.
        
             // Display the table header for rendering report.
             openedFile.println("Hours" + "             Distance Traveled");
             openedFile.println("------------------------------------");
             
            
            while (hoursDriven >= 1) {
            openedFile.println(" " + hr + "                           " + hr * vehicleSpeed + " miles");
            hr++;
            hoursDriven--;
            }  
            openedFile.close();
            System.out.println("Data stored in " + fileName + ".txt");
            
         
    }
     
     

}
