////////////////////////////////////////////////////////////////////////////////////////////////////
//  Fahrenheit.java
//  Author: Teo Espero
//          BS Cloud and System Administration
//          BS Software Development
//          Western Governors University
//  Description: Convert from Fahrenheit to Celsius.
//  Date: 07282022
////////////////////////////////////////////////////////////////////////////////////////////////////

// define the packages we need
import java.util.Scanner;

// class declaration
public class Fahrenheit {
    public static void main(String[] args) {

        // declare our vars
        double fahrenheit, celsius;

        // create our Scanner object
        Scanner input =  new Scanner(System.in);

        // get our inputs
        System.out.println("Enter degrees in Fahrenheit: ");

        // number 01
        System.out.print("> ");
        fahrenheit = input.nextDouble();

        // convert to celsius
        celsius = (5.0 / 9.0) * (fahrenheit - 32);

        // display the resulting average
        System.out.println("> Celsius equivalent is : " + celsius);
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
