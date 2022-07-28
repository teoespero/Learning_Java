////////////////////////////////////////////////////////////////////////////////////////////////////
//  ComputeArea.java
//  Author: Teo Espero
//          BS Cloud and System Administration
//          BS Software Development
//          Western Governors University
//  Description: This program in Java was written to demo the computation of a Circle's area.
//  Date: 07282022
////////////////////////////////////////////////////////////////////////////////////////////////////

// define the packages we need
import java.util.Scanner;

// class declaration
public class ComputeArea {

    // main function
    public static void main(String[] args) {

        // define our vars
        double area = 0.00;

        // create the Scanner object
        Scanner input = new Scanner(System.in);
        
        // prompt the user for the value for radius
        System.out.print("> Enter the value for radius: ");
        double radius = input.nextDouble();
        // perform the computations
        area = (radius * radius) * 3.14159;

        // display the result
        System.out.println("> The area for the circle of radius " + radius + " is " + area);
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
