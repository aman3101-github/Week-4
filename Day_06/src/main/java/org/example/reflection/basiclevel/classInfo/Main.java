package org.example.reflection.basiclevel.classInfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        // WRITING THE REFLECTION CODE IN THE MAIN CLASS

        try{
            // Taking the reference of the class (Metadata of class ast runtime)
            Class<?> metadata = ClassInfo.class;

            // Taking reference of the constructor
            Constructor<?> constructor = metadata.getDeclaredConstructor(String.class, int.class);

            // Create object using constructor
            Object obj = constructor.newInstance("Aman", 23);

            // Taking reference of the methods of class
            Method method = metadata.getMethod("display");

            // Execute the method
            method.invoke(obj);
        }

        catch (Exception e){
            e.printStackTrace();
        }

    }
}