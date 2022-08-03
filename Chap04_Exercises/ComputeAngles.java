////////////////////////////////////////////////////////////////////////////////////////////////////
//  ComputeAngles.java
//  Author: Teo Espero
//          BS Cloud and System Administration
//          BS Software Development
//          Western Governors University
//  Description:
//          The Java program will accept three sides of a triangle to compute the
//          angles by using the following formulas
//  Date: 08/02/2022
////////////////////////////////////////////////////////////////////////////////////////////////////

// define the packages we need
import java.util.Scanner;

// class declaration
public class ComputeAngles {
    public static void main(String[] args){

        // declare the input object
        Scanner input = new Scanner(System.in);

        //////////////////////////////////////////////////////////////////////////
        // GET TRIANGLE POINTS
        System.out.println("Enter 3 points for the triangle: ");

        /////////////////////////////////////
        // x1, y1
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();

        /////////////////////////////////////
        // x2, y2
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();

        /////////////////////////////////////
        // x3, y3
        System.out.print("x3: ");
        double x3 = input.nextDouble();
        System.out.print("y3: ");
        double y3 = input.nextDouble();

        //////////////////////////////////////////////////////////////////////////
        // COMPUTE THREE SIDES
        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        //////////////////////////////////////////////////////////////////////////
        // COMPUTE THREE ANGLES
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        //////////////////////////////////////////////////////////////////////////
        // DISPLAY RESULTS
        System.out.println("The three angles are "
                + Math.round(A * 100) / 100.0 + " "
                + Math.round(B * 100) / 100.0 + " "
                + Math.round(C * 100) / 100.0);
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////