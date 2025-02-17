package regextestfiles.basicproblems.licenceplatevalidation;

import org.example.regex.basicproblems.licenceplatevalidation.ValidateLicencePlate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidLicencePlateTest {

    // Create an instance of ValidateLicencePlate
     ValidateLicencePlate validator = new ValidateLicencePlate();

    @Test
    public void testValidLicencePlates() {
        assertTrue(validator.validateLicencePlate("AB1234")); // Valid
        assertTrue(validator.validateLicencePlate("XY9876")); // Valid
        assertTrue(validator.validateLicencePlate("CD5678")); // Valid
    }

    @Test
    public void testInvalidLicencePlates() {
        assertFalse(validator.validateLicencePlate("ab1234")); // Lowercase letters
        assertFalse(validator.validateLicencePlate("A12345")); // Only 1 letter
        assertFalse(validator.validateLicencePlate("ABC1234")); // 3 letters instead of 2
        assertFalse(validator.validateLicencePlate("1234AB")); // Numbers before letters
        assertFalse(validator.validateLicencePlate("AB12A4")); // Letter where number should be
        assertFalse(validator.validateLicencePlate("A 1234")); // Space not allowed
        assertFalse(validator.validateLicencePlate(null)); // Null input
        assertFalse(validator.validateLicencePlate("")); // Empty string
    }
}
