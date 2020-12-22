/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4Package;

/**
 *
 * @author Drew
 */
public class CelsiusToFahrenheitTable_11 {
    public static void main(String[] args) {
        double i;
        for (i=0; i<=20; i++){
            double fahrenheit = ((i*9)/5)+32;
            System.out.println(i + " degrees celsius is equal to " + fahrenheit + " degrees fahrenheit.");
        }
    }
}
