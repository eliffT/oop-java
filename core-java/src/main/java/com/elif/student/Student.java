package com.elif.student;

public class Student extends Person{
    String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("School: " + school);
    }
}
