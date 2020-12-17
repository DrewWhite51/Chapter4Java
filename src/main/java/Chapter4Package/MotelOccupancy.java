/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4Package;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Drew
 */
// A motel's occupancy rate is calculated as follows:
// Occupancy rate = Number of rooms occupied / Total number of rooms
// Write a program that calculates the occupancy rate for each floor of a motel.
// The program should start by asking for the number of floors in the motel.
// A loop should then iterate once for each floor.
// During each iteration, the loop should ask the user for the number of rooms on the floor and then the number of them that are occupied.
// After all iterations, the program should display the number of rooms the motel has, the number of them that are occupied, and the number that are vacant, and the occupancy rate for the motel.

public class MotelOccupancy {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int floors;
	double rooms = 0; 
	int roomsOccupied = 0;
	double totalRooms = 0;
	double totalRoomsOccupied = 0;
	double totalVacancy = 0;
	double occupancyRate = 0.0;
        
        
        // Asks for number of floors
        System.out.println("How many floors are there in the motel?");
        floors = x.nextInt();
        
        // Floor input validation
        while(floors < 1){
            System.out.print("Invalid Input. Enter a number of floors greater than 0: ");
            floors = x.nextInt();
	}
        
        
        
        
        for(int i=0; i<floors; i++){
                // Prompt user for the number of rooms
		System.out.print("Enter the number of rooms (Floor " + (int)(i + 1) + "): ");
		rooms = x.nextInt();
			
		// Room input validation
		while(rooms < 10){
                    System.out.print("Invalid input. Enter a number of rooms greater than 9 \n(Floor " + (int)(i + 1) + "): ");
                    rooms = x.nextInt();
		}
			
		// Prompt user for the number of rooms occupied.
                System.out.print("Enter the number of rooms occupied(Floor " + (int)(i + 1) + "): ");
		roomsOccupied = x.nextInt();
			
		// Calculate total rooms
		totalRooms += rooms;
			
		// Calculate total rooms occupied
		totalRoomsOccupied += roomsOccupied;
		}
		
		// Calculate total vacancy
		totalVacancy = totalRooms - totalRoomsOccupied; 
		
		// Calculate occupancy rate
		occupancyRate = (totalRoomsOccupied/totalRooms);
		
		// Decimal formating 
		  NumberFormat df = DecimalFormat.getInstance();
		  df.setMaximumFractionDigits(2);
		
		// Display Hotel Occupancy data
		System.out.println("Total Rooms: " + totalRooms + "\nOccupied(QTY): " + totalRoomsOccupied + 
							"\nVacant Rooms(QTY): " + totalVacancy + "\nOccupancy Rate: " + df.format(occupancyRate) + "%");
	}
        
    }
    
