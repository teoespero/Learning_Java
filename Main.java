package com.teoespero;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setCarMaker("Toyota");
        myCar.setModelYear(1976);
        myCar.setModelName("Torano");
        myCar.setDoor(2);
        myCar.setAutomatic(false);
        myCar.setColor("Red");
        myCar.setPrice(6700.00);

        Car myOtherCar = new Car("Nissan", "Rogue", 2014, 16000.00,
                4, "Platinum", true);

        showMyCar(myCar);
        showMyCar(myOtherCar);
    }

    private static void showMyCar(Car carObject) {
        String transmission;

        System.out.println("Year: " + carObject.getModelYear());
        System.out.println("Maker: " + carObject.getCarMaker());
        System.out.println("Model: " + carObject.getModelName());
        System.out.println("Year: " + carObject.getModelYear());
        System.out.println("Color: " + carObject.getColor());
        System.out.println("Doors: " + carObject.getDoor());
        if (carObject.isAutomatic()){
            transmission = "Automatic";
        }
        else {
            transmission = "Manual";
        }
        System.out.println("Transmission: " + transmission);
        System.out.println("Price: " + carObject.getPrice());
        System.out.println();
    }
}