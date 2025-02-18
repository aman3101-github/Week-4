package org.example.reflection.basiclevel.accessprivatefield;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
public class Person{

    // Encapsulated attributes of the class
    private String name = "Aman";
    private int age = 23;

    // Default Constructor
    public Person(){}

    // Display method
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

