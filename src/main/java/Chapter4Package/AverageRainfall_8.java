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
public class AverageRainfall_8 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double yearsOfRain = 0;
        yearsOfRain = keyboard.nextDouble();
        int numberOfYears = 0;
        double inchesPerMonth = 0;
        double monthCounter = 0;
        double totalInches = 0;
        double averageRainfall = 0;
        double totalMonths = 0;
        // Input validation making sure at least one year is recorded
        while (yearsOfRain < 1){
            System.out.println("Enter the number of years the rain will be recorded: ");
            yearsOfRain = keyboard.nextDouble();
        }
        
        // Main loops
        for (numberOfYears = 1; numberOfYears <= yearsOfRain; numberOfYears++) {
            for (monthCounter = 1; monthCounter <= 12; monthCounter++) {
                System.out.println("How many inches did it rain in month " + monthCounter);
                inchesPerMonth += keyboard.nextDouble();
            }
        }
        totalMonths = yearsOfRain*12;
        System.out.println("The total months recorded is: " + totalMonths);
        System.out.println("The total inches of rain is : " + inchesPerMonth);
        averageRainfall = inchesPerMonth/totalMonths;
        System.out.println("The average rainfall per mont is: " + averageRainfall);
    }
    
}
