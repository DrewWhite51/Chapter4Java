/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4Package;

import java.util.Formatter;

/**
 *
 * @author Drew
 */

// This creates a file and add records to the file for the DistanceTraveledToFile.java
public class CreateFile {
    
    private Formatter x;
     
    
    // Opens the file to write to it
    public void openFile() {
         try {
             x = new Formatter("DistanceTraveled.txt");
         }
         catch (Exception e) {
             System.out.println("You have an error.");
         }
     }
     
    
    // Adds tabel to file
    public void addRecords(double hoursDriven, double hr, double vehicleSpeed) {
        x.format("Hours", "                                      ", "Distance Traveled");
        x.format("----------------------------------------------------------------------");
       
       while (hoursDriven >= 1) {
           x.format(" " + hr + "                           " + hr * vehicleSpeed + " miles");
           hr++;
           hoursDriven--;
       }
    }
    
     
    // Closes the file
    public void closeFile() {
         x.close();
    }
    
    
}
