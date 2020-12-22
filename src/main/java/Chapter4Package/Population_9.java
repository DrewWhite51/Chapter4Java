/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4Package;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Drew
 */
public class Population_9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        NumberFormat df = NumberFormat.getInstance();					// Decimal formatting
	df.setMaximumFractionDigits(2);
        double numberOfOrganisms = 0;
        double percentIncrease = 0;
        double numberOfDays = 0;
        int i = 0;
        double finalOrganisms = 0;
        
        
        while (numberOfOrganisms < 2) {
            System.out.println("Enter the number of organisms (must be 2 or greater).");
            numberOfOrganisms = keyboard.nextDouble();
        }
        while (percentIncrease <= 0) {
            System.out.println("Enter the average daily populaition increase (must be positive percent).");
            percentIncrease = keyboard.nextDouble()/100;
        }
        while (numberOfDays < 1) {
            System.out.println("Enter the number of days the organisms will multiply. (can't be less than one)");
            numberOfDays = keyboard.nextDouble();
        }
        
        System.out.println("Day" +"       Population" + "       Percent of Increase");	
        System.out.println("_______________________________________________");
	System.out.println("  1           " + df.format(numberOfOrganisms));
	for (i=2; i<numberOfDays + 1; i++){
            numberOfOrganisms += (numberOfOrganisms *= percentIncrease);
            System.out.println("  " +i + "           " + df.format(numberOfOrganisms) + "                " + (percentIncrease*100)+"%");
	}
        
    }
}
