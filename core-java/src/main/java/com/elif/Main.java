package com.elif;

import com.elif.inheritance.Carr;
import com.elif.staticmethod.staticmethod;
import com.elif.student.Student;

public class Main {
    public static void main(String[] args) {
/*
        Car car = new Car("TOGG", "T10X", 2023);
        car.display();
*/
/*      Car1 car = new Car1();

        car.setBrand("Audi");
        car.setModel("A3");
        car.setYear(2021);

        String brand = car.getBrand();
        String model = car.getModel();
        int year = car.getYear();

        car.display(brand, model,year);
*/

//      staticmethod.multiplication(21,25);

/*      Carr myCar = new Carr();
        myCar.setSpeed(125.0);
        System.out.println("Car Speed : " + myCar.getSpeed());
*/
        Student s = new Student("Elif", 21, "Uludağ Üniversitesi");
        s.print();

    }
}