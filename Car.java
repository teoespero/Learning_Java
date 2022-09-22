package com.teoespero;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  create a car object
public class Car {

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    //  define car fields
    private String carMaker;
    private String modelName;
    private int modelYear;
    private double price;
    private int door;
    private String color;
    private boolean automatic;
    public static int carCounter = 0;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    //  constructor w/o any parameters
    public Car(){
        carCounter++;
    }

    //  constructor w/ parameters
    public Car(String carMaker, String modelName, int modelYear, double price, int door, String color, boolean automatic) {
        this.carMaker = carMaker;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.price = price;
        this.door = door;
        this.color = color;
        this.automatic = automatic;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    //  setter methods
    public void setCarMaker(String carMaker) {
        this.carMaker = carMaker;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    //  class constructor with parameters


    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    //  getters
    public String getCarMaker() {
        return carMaker;
    }

    public String getModelName() {
        return modelName;
    }

    public int getModelYear() {
        return modelYear;
    }

    public double getPrice() {
        return price;
    }

    public int getDoor() {
        return door;
    }

    public String getColor() {
        return color;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public static int getCarCounter() {
        return carCounter;
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
