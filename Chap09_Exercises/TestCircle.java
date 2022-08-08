////////////////////////////////////////////////////////////////////////////////////////////////////
//  TestCircle.java
//  Author: Teo Espero
//          BS Cloud and System Administration
//          BS Software Development
//          Western Governors University
//  Description:
//          Demonstrate the use of objects and methods in Java
//  Date: 08/08/2022
////////////////////////////////////////////////////////////////////////////////////////////////////

// define the packages we need
import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {

        // create a new object from the Circle class
        Circle circle01 = new Circle();

        System.out.println("The area of the circle with a radius of "
                + circle01.radius + " is "
                + circle01.getArea());

        Circle circle02 = new Circle(25);
        System.out.println("The area of the circle with a radius of "
                + circle02.radius + " is "
                + circle02.getArea());

        Circle circle03 = new Circle(125);
        System.out.println("The area of the circle with a radius of "
                + circle03.radius + " is "
                + circle03.getArea());

        circle01.radius = 100;
        System.out.println("The area of the circle with a radius of "
                + circle01.radius + " is "
                + circle01.getArea());
    }
}

class Circle{
    double radius;

    // no args constructor
    Circle(){
        radius =1 ;
    }

    // constructor with args
    Circle(double newRadius){
        radius = newRadius;
    }

    // return the area of a circle method
    double getArea(){
        return radius * radius * Math.PI;
    }

    // return the perimeter method
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    // set the new radius method
    void setRadius(double newRadius){
        radius = newRadius;
    }
}

