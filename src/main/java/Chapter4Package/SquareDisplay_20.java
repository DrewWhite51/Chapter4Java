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
public class SquareDisplay_20 {
    public static void main(String[] args) {

    Scanner keyboard= new Scanner(System.in);

    System.out.print("Please enter positive number:  ");
    int number =keyboard.nextInt();


    while (number > 15 || number<=0){
        System.out.println("Don't input value greater than 15"
                + " and negative number");
        System.out.print("Enter number again: ");
        number=keyboard.nextInt();
    }
    
    for(int row=0; row<number;row++){
        for (int colum = 0; colum < number ; colum++)
        {
            System.out.print("X");
        }
        System.out.println();
    }
}
}
