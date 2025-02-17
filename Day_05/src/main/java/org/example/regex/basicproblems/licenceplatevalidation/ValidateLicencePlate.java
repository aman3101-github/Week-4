package org.example.regex.basicproblems.licenceplatevalidation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicencePlate {
    public boolean validateLicencePlate(String licenceNumber){

        // Using regex to check for pattern AB1234
        String regex = "^[A-Z]{2}[0-9]{4}$";

        // Matching and validating the input licence number and return the result
        return licenceNumber != null && licenceNumber.matches(regex);
    }
}
