////////////////////////////////////////////////////////////////////////////////////////////////////
//  GetTheAverage.java
//  Author: Teo Espero
//          BS Cloud and System Administration
//          BS Software Development
//          Western Governors University
//  Description: This program in Java was written to get the average of three numbers
//  Date: 07282022
////////////////////////////////////////////////////////////////////////////////////////////////////

// define the packages we need
import java.util.Scanner;

// class declaration
public class GetTheAverage {
    public static void main(String[] args) {

        // declare our vars
        double
                number01 = 0.00,
                number02 = 0.00,
                number03 = 0.00,
                theSum = 0.00,
                theAverage = 0.00;

        // create our Scanner object
        Scanner input =  new Scanner(System.in);

        // get our inputs
        System.out.println("Enter 3 numbers below: ");

        // number 01
        System.out.print("> ");
        number01 = input.nextDouble();

        // number 02
        System.out.print("> ");
        number02 = input.nextDouble();

        // number 03
        System.out.print("> ");
        number03 = input.nextDouble();

        // get the sum
        theSum = number01 + number02 + number03;

        // get the average
        theAverage = theSum / 3;

        // display the resulting average
        System.out.println("> The average is : " + theAverage);
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
