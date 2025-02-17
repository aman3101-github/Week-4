package org.example.regex.extractionproblems.extractemail;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Creating the scanner object
        Scanner input = new Scanner(System.in);

        // Text containing the email address
        String text = "For any information, kindly contact us at support@gmail.com.org or helpdesk@gmail.com.";

        // Creating the object of the class
        EmailExtraction emailExtraction = new EmailExtraction();

        // Method call to extract the email address
        emailExtraction.extractEmail(text);

    }
}
