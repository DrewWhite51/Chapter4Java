package Chapter4Package;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drew
 */
public class BarChart_12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i;
        int store1Sales, store2Sales, store3Sales, store4Sales, store5Sales;
        System.out.println("Enter the sales for store 1");
        store1Sales = keyboard.nextInt();
        System.out.println("Enter the sales for store 2");
        store2Sales = keyboard.nextInt();
        System.out.println("Enter the sales for store 3");
        store3Sales = keyboard.nextInt();
        System.out.println("Enter the sales for store 4");
        store4Sales = keyboard.nextInt();
        System.out.println("Enter the sales for store 5");
        store5Sales = keyboard.nextInt();
        
        System.out.println("Sales bar chart");
        System.out.print("Store 1: ");
        for (i=1;i<=(store1Sales/100);i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Store 2: ");
        for (i=1;i<=(store2Sales/100);i++) {
            System.out.print("*");
        }  
        System.out.println();
        System.out.print("Store 3: ");
        for (i=1;i<=(store3Sales/100);i++) {
            System.out.print("*");
        }  
        System.out.println();
        System.out.print("Store 4: ");
        for (i=1;i<=(store4Sales/100);i++) {
            System.out.print("*");
        }  
        System.out.println();
        System.out.print("Store 5: ");
        for (i=1;i<=(store5Sales/100);i++) {
            System.out.print("*");
        }          
        
    }
}
