package org.example.reflection.basiclevel.dynamicobjects;
import java.lang.reflect.*;

public class Student {
    // Encapsulated attributes of the class
    private String studentName = "Aman";
    private int rollNo = 21;

    // Constructor of the class
    Student(String studentName, int rollNo) {
        this.studentName = studentName;
        this.rollNo = rollNo;
    }

        // Method of the class
        public void displayDetails(String studentName, int rollNo){
            System.out.println("Student's Name: " + studentName);
            System.out.println("Student's Roll No.: " + rollNo);

    }
}
