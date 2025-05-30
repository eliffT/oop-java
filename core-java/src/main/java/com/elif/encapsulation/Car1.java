package com.elif.encapsulation;
public class Car1 {
    private String brand;
    private String model;
    private int year;

    public Car1() {

    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getBrand(){return brand;}
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public void display(String brand, String model, int year){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " +model);
        System.out.println("Year: " +year);
    }


}