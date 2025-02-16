package org.example.reflection.basiclevel.classInfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInfo {
    public static void displayClassDetails(String className) {
        try {
            // Load the class dynamically
            Class<?> clazz = Class.forName(className);

            // Display class name
            System.out.println("Class Name: " + clazz.getName());

            // Display constructors
            System.out.println("\n Constructors:");
            for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
                System.out.println(constructor);
            }

            // Display fields
            System.out.println("\n Fields:");
            for (Field field : clazz.getDeclaredFields()) {
                System.out.println(field);
            }

            // Display methods
            System.out.println("\nMethods:");
            for (Method method : clazz.getDeclaredMethods()) {
                System.out.println(method);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }
    }
}

