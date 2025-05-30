package com.elif;

import com.elif.inheritance.Carr;
import com.elif.interfacee.Cats;
import com.elif.interfacee.Dogs;
import com.elif.interfacee.Animall;
import com.elif.overloading.Calculator;
import com.elif.overriding.CarClass;
import com.elif.overriding.Vehiclee;
import com.elif.polymorphism.Animal;
import com.elif.polymorphism.Cat;
import com.elif.polymorphism.Dog;
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
/*      Student s = new Student("Elif", 21, "Uludağ Üniversitesi");
        s.print();
*/
/*
        Vehiclee v = new Vehiclee();
        v.start();

        System.out.println("----------------Overriding---------------------");

        CarClass car0 = new CarClass();
        car0.start();
*/
/*
        Calculator calculator = new Calculator();
        int result1 = calculator.add(51,7);
        int result2 = calculator.add(28,7,6);

        System.out.println("İki tamsayının toplamı: " + result1);
        System.out.println("Üç tamsayının toplamı: " + result2);
*/
/*
        Animal animal = new Animal();
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal.makeSound(); //Animal
        animal1.makeSound(); //Cat
        animal2.makeSound(); //Dog
*/
        Animall dog = new Dogs();
        Animall cat = new Cats();

        dog.Sound();
        cat.Sound();
    }
}