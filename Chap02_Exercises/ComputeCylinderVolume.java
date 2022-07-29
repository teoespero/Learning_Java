////////////////////////////////////////////////////////////////////////////////////////////////////
//  ComputeCylinderVolume.java
//  Author: Teo Espero
//          BS Cloud and System Administration
//          BS Software Development
//          Western Governors University
//  Description: Write a program that reads in the radius and length of a cylinder and
//          computes the area and volume
//  Date: 07292022
////////////////////////////////////////////////////////////////////////////////////////////////////

// declare the packages that we will use
import java.text.DecimalFormat ;
import java.util.Scanner;

// class declaration
public class ComputeCylinderVolume {
    public static void main(String[] args) {

        // declare our constant for PI
        final double PI = 3.14159;

        DecimalFormat ft = new DecimalFormat( " #### " ) ;

        // create a Scanner object
        Scanner input =  new Scanner(System.in);

        // get the celsius temp from the user
        System.out.print("Enter radius and length of the cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        // compute for the fahrenheit value
        double area = radius *  radius * PI;

        double volume = area * length;

        // format the results in 2 decimal places
        ft = new DecimalFormat( "###,###.##"  ) ;

        // display the results
        System.out.println("The area is " + ft.format(area) + " sq. unit(s) and the volume is "
                + ft.format(volume) + " cubic unit(s).");

    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////

