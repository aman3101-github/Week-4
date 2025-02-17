package org.example.regex.basicproblems.validateusername;

// Class for username validation logic
public class UsernameValidator {

    // Method to validate username using regex
    public boolean isValidUsername(String username) {
        // Regex explanation:
        // ^[a-zA-Z] - starts with a letter
        // [a-zA-Z0-9_]{4,14}$ - allows 4 to 14 additional chars (total 5-15)
        //with letters, numbers, or underscores
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return username != null && username.matches(regex);
    }
}

