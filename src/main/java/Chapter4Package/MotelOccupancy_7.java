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
// A motel's occupancy rate is calculated as follows:
// Occupancy rate = Number of rooms occupied / Total number of rooms
// Write a program that calculates the occupancy rate for each floor of a motel.
// The program should start by asking for the number of floors in the motel.
// A loop should then iterate once for each floor.
// During each iteration, the loop should ask the user for the number of rooms on the floor and then the number of them that are occupied.
// After all iterations, the program should display the number of rooms the motel has, the number of them that are occupied, and the number that are vacant, and the occupancy rate for the motel.

public class MotelOccupancy_7 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many floors are there in the hotel?");
        int numberOfFloors = keyboard.nextInt();
        int i;
        double totalRooms = 0;
        double roomsOccupied = 0;
        double occupancyRate = 0;
        
        if (numberOfFloors < 1) {
            System.out.println("That is not a valid value");
        } else if (numberOfFloors >= 1) {
            for (i=1; i<=numberOfFloors; i++) {
                System.out.println("How many rooms are there on floor " + i);
                totalRooms += keyboard.nextDouble();
                System.out.println("How many rooms are occupied on floor " + i);
                roomsOccupied += keyboard.nextDouble();
                
                
            }
            
            System.out.println("The total rooms in the hotel is: " + totalRooms);
            System.out.println("The total rooms ocupied in the hotel is: " + roomsOccupied);
            occupancyRate = roomsOccupied / totalRooms;
            System.out.println("The occupancy rate is : " + occupancyRate + "%");
        }

    }
}
