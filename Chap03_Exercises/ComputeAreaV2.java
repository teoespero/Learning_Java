////////////////////////////////////////////////////////////////////////////////////////////////////
//  ComputeAreaV2.java
//  Author: Teo Espero
//          BS Cloud and System Administration
//          BS Software Development
//          Western Governors University
//  Description:
//          This program in Java was written to demo the computation of a Circle's area.
//          This version validates for the radius and does not proceed if the value is less
//          than zero.
//  Date: 07282022
////////////////////////////////////////////////////////////////////////////////////////////////////

// define the packages we need
import javax.swing.plaf.TableHeaderUI;
import java.util.Scanner;

// class declaration
public class ComputeAreaV2 {

    // main function
    public static void main(String[] args) {

        // define our vars
        double area = 0.00;

        // create the Scanner object
        Scanner input = new Scanner(System.in);

        // prompt the user for the value for radius
        System.out.print("> Enter the value for radius: ");
        double radius = input.nextDouble();

        if (radius < 0)
            System.out.println("The radius can't be less than 0.");
        else {
            // perform the computations
            area = (radius * radius) * 3.14159;

            // display the result
            System.out.println("> The area for the circle of radius " + radius + " is " + area);
        }
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
