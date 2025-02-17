package org.example.regex.basicproblems.hexcolorcodevalidation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create the scanner object
        Scanner input = new Scanner(System.in);

        // Taking user input for the licence plate number
        System.out.println("Enter the hex color code: ");
        String hexCode = input.nextLine();

        // Create the object of the class
        ValidateHexColorCode validate = new ValidateHexColorCode();

        // Method call to validate licence plate
        boolean result = validate.validateHexCode(hexCode);

        // Displaying the results
        if(result){
            System.out.println("Valid Hex Color code.");
        }
        else {
            System.out.println("Invalid Hex Color code.");

        }

    }
}



