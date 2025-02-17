package org.example.regex.extractionproblems.extractemail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtraction {

    // Method to extract the email address from the text
    public void extractEmail(String text) {

        // Regex string to match the email pattern
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        // Compile the regex string into an object for manipulation
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object to search for the pattern in the text
        Matcher matcher = pattern.matcher(text);

        // Find and print the email address from the text
        boolean found = false;
        while (matcher.find()) {
            System.out.println("Found email: " + matcher.group());
            found = true;
        }

        // If no email is found, print the message
        if (!found) {
            System.out.println("Text doesn't contain any email address.");
        }
    }
}
