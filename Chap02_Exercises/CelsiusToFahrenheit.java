////////////////////////////////////////////////////////////////////////////////////////////////////
//  CelsiusToFahrenheit.java
//  Author: Teo Espero
//          BS Cloud and System Administration
//          BS Software Development
//          Western Governors University
//  Description: Write a program that reads a Celsius degree in a double value from the console,
//          then converts it to Fahrenheit, and displays the result.
//  Date: 07292022
////////////////////////////////////////////////////////////////////////////////////////////////////

// declare the packages that we will use
import java.util.Scanner;

// class declaration
public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        // create a Scanner object
        Scanner input =  new Scanner(System.in);

        // get the celsius temp from the user
        System.out.print("Enter Celsius temp: ");
        double celsiusTemp = input.nextDouble();

        // compute for the fahrenheit value
        double fahrenheit = ((double) 9 / (double)5) * celsiusTemp + 32;

        // display the results
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
