package org.example.reflection.basiclevel.accessprivatefield;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Obtain the metadata of the Person class
            Class<?> className = Person.class;

            // Obtain the constructor
            Constructor<?> constructor = className.getDeclaredConstructor();
            // Create an object using the constructor
            Object object = constructor.newInstance();

            // Get the method 'display'
            Method method = className.getMethod("display");

            // Accessing the private field 'name'
            Field field = className.getDeclaredField("age");
            // Make the private field accessible
            field.setAccessible(true);
            // Modify the private field correctly (String instead of int)
            field.set(object, 25);

            // Invoke the display method to check if the value is updated
            method.invoke(object);

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
