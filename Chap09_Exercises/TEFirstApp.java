package TEFirstApp;////////////////////////////////////////////////////////////////////////////////////////////////////
//  TestLoan.java
//  Author: Teo Espero
//          BS Cloud and System Administration
//          BS Software Development
//          Western Governors University
//  Description:
//          Demonstrate the use of objects and methods in Java
//  Date: 08/11/2022
////////////////////////////////////////////////////////////////////////////////////////////////////


import Animal.Dog;

public class TEFirstApp {
    public static void main(String[] args) {

        // create one Dog object
        Dog Dog01 = new Dog();
        Dog01.setBreed("Beagle");
        Dog01.setBehavior("Snoopy");
        Dog01.setLifeSpan(20);
        Dog01.setPrice(1760.00);

        // create the second Dog object
        Dog Dog02 = new Dog("Corgi", 15, "Controlled", 2000.00);

        // show the information for the first Dog

        System.out.println("Dog01");
        System.out.println("Breed: " + Dog01.getBreed());
        System.out.println("Breed: " + Dog01.getBehavior());
        System.out.println("Breed: " + Dog01.getLifeSpan());
        System.out.println("Breed: " + Dog01.getPrice());

        // break a line
        System.out.println();

        // show the information for the second Dog

        System.out.println("Dog02");
        System.out.println("Breed: " + Dog02.getBreed());
        System.out.println("Breed: " + Dog02.getBehavior());
        System.out.println("Breed: " + Dog02.getLifeSpan());
        System.out.println("Breed: " + Dog02.getPrice());
    }
}


