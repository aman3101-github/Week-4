package org.example.reflection.basiclevel.classInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creating the scanner object
        Scanner scanner = new Scanner(System.in);

        // User input for the class name
        System.out.print("Enter the fully qualified class name: ");
        String className = scanner.nextLine();

        // Closing the scanner object
        scanner.close();

        // Method call to display the class information
        ClassInfo.displayClassDetails(className);
    }
}
