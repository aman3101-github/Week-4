package org.example.reflection.basiclevel.invokeprivatemethod;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
public class Calculator {
    // Encapsulated attributes of the clas
    private int a = 5;
    private int b = 20;

    // constructor of the class
    public Calculator (int a, int b){
        this.a = a;
        this.b = b;
    }

    // Private method of the class
    private int multiplyNumbers(int a, int b){
        return  a * b;
    }
}
