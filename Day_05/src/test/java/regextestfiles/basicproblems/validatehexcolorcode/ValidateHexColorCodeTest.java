package regextestfiles.basicproblems.validatehexcolorcode;

import org.example.regex.basicproblems.hexcolorcodevalidation.ValidateHexColorCode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidateHexColorCodeTest {

    // Test with valid hex color codes
    @Test
    public void testValidHexColorCode() {
        ValidateHexColorCode validator = new ValidateHexColorCode();

        // Test with various valid hex codes
        assertTrue(validator.validateHexCode("#FFFFFF"));
        assertTrue(validator.validateHexCode("#abc123"));
        assertTrue(validator.validateHexCode("#A1B2C3"));
        assertTrue(validator.validateHexCode("#000000"));
        assertTrue(validator.validateHexCode("#FF5733"));
    }

    // Test with invalid hex color codes
    @Test
    public void testInvalidHexColorCode() {
        ValidateHexColorCode validator = new ValidateHexColorCode();

        // Test with various invalid hex codes
        assertFalse(validator.validateHexCode("#12345"));    // Too short
        assertFalse(validator.validateHexCode("#G12345"));   // Invalid character 'G'
        assertFalse(validator.validateHexCode("#1234567"));  // Too long
        assertFalse(validator.validateHexCode("123456"));    // Missing '#' symbol
    }
}

