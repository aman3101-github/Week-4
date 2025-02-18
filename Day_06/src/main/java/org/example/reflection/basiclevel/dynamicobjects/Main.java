package org.example.reflection.basiclevel.dynamicobjects;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        // REFLECTION CODE IN THE MAIN CLASS

        try {
            // Accessing the class reference - metadata of the class
            Class<?> className =  Student.class;

            // Accessing the constructor of the class
            Constructor<?> constructor = className.getDeclaredConstructor(String.class, int.class);

            // Creating the object of the class using the constructor
            Object object = constructor.newInstance("Aman", 21);

            // Invoke the objects dynamically
            Method method = className.getMethod("displayDetails", String.class, int.class);
            method.invoke(object, "Aman", 21);
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
