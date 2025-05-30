package com.elif.classandobject;
public class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " +model);
        System.out.println("Year: " +year);
    }


}