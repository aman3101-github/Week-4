package org.example.regex.basicproblems.licenceplatevalidation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create the scanner object
        Scanner input = new Scanner(System.in);

        // Taking user input for the licence plate number
        System.out.println("Enter the licence number: ");
        String licenceNumber = input.nextLine();

        // Create the object of the class
        ValidateLicencePlate validate = new ValidateLicencePlate();

        // Method call to validate licence plate
        boolean result = validate.validateLicencePlate(licenceNumber);

        // Displaying the results
        if(result){
            System.out.println("Valid Licence Plate.");
        }
        else {
            System.out.println("Invalid Licence Plate.");

        }

    }
}
