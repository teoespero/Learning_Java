////////////////////////////////////////////////////////////////////////////////////////////////////
//  ComputeArea.java
//  Author: Teo Espero
//          BS Cloud and System Administration
//          BS Software Development
//          Western Governors University
//  Description: This program in Java was written to demo the computation of a Circle's area.
//  Date: 07282022
////////////////////////////////////////////////////////////////////////////////////////////////////

// class declaration
public class ComputeArea {

    // main function
    public static void main(String[] args) {

        // define our vars0
        double radius = 0.00;
        double area = 0.00;

        // perform the computations
        radius = 20.00;
        area = (radius * radius) * 3.14159;

        // display the result
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
