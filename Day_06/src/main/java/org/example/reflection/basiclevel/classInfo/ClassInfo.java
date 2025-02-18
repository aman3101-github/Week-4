package org.example.reflection.basiclevel.classInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class ClassInfo {

    // Encapsulated (private) attributes of the class
    private String name;
    private int age;

    // Constructor
    public ClassInfo (String name, int age){
        this.name = name;
        this.age = age;
    }

    // methods of the class
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

}