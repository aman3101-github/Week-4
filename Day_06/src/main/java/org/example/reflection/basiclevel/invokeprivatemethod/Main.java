package org.example.reflection.basiclevel.invokeprivatemethod;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        //REFLECTION CODE IN THE MAIN CLASS

        try {
            // Getting the object of the class to access the metadata
            Class<?> className = Calculator.class;

            // Access the constructor of the class
            Constructor<?> constructor = className.getDeclaredConstructor(int.class, int.class);
            // Creating the object of the class using constructor
            Object object = constructor.newInstance(5,20);

            // Getting the private method and it accessible
            Method method = className.getDeclaredMethod("multiplyNumbers", int.class, int.class);
            method.setAccessible(true);

            // Invoking the private method and get the results
            Object result = method.invoke(object, 5,10);

            // Displaying the results
            System.out.println("Multiplication result: " + result);
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
