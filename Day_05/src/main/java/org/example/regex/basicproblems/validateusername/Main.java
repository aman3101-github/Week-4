package org.example.regex.basicproblems.validateusername;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create instance of UsernameValidator
        UsernameValidator validator = new UsernameValidator();

        // Prompt user for username
        System.out.print("Enter a username to validate: ");
        String username = scanner.nextLine();

        // Validate and display result
        if (validator.isValidUsername(username)) {
            System.out.println("Valid username.");
        } else {
            System.out.println("Invalid username.");
        }

        // Close the scanner
        scanner.close();
    }
}

