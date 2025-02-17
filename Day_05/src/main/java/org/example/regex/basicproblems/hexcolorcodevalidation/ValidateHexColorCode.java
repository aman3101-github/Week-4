package org.example.regex.basicproblems.hexcolorcodevalidation;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateHexColorCode {
    // Method to validate the hex color code
    public boolean validateHexCode(String hexCode) {

        // Regex string to match the pattern
        String regex = "^#[a-fA-F0-9]{6}";
        return hexCode != null && hexCode.matches(regex);
    }
}
