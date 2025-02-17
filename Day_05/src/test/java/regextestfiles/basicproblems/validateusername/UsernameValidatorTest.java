package regextestfiles.basicproblems.validateusername;

import org.example.regex.basicproblems.validateusername.UsernameValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsernameValidatorTest {

     UsernameValidator validator = new UsernameValidator();

    @Test
    void testValidUsername() {
        assertTrue(validator.isValidUsername("user_123")); // Valid case
        assertTrue(validator.isValidUsername("UserTest")); // Valid case
        assertTrue(validator.isValidUsername("abc_12"));   // Valid case
    }

    @Test
    void testInvalidUsername_StartingWithNumber() {
        assertFalse(validator.isValidUsername("123user")); // Starts with a number
        assertFalse(validator.isValidUsername("9test"));   // Starts with a number
    }

    @Test
    void testInvalidUsername_ShortLength() {
        assertFalse(validator.isValidUsername("us"));    // Too short
        assertFalse(validator.isValidUsername("a_1"));   // Too short
    }

    @Test
    void testInvalidUsername_LongLength() {
        assertFalse(validator.isValidUsername("thisIsAReallyLongUsername123")); // Too long
    }

    @Test
    void testInvalidUsername_SpecialCharacters() {
        assertFalse(validator.isValidUsername("user@123")); // Contains '@'
        assertFalse(validator.isValidUsername("hello!"));   // Contains '!'
        assertFalse(validator.isValidUsername("test name"));// Contains space
    }

    @Test
    void testInvalidUsername_NullAndEmpty() {
        assertFalse(validator.isValidUsername(null));  // Null input
        assertFalse(validator.isValidUsername(""));    // Empty input
        assertFalse(validator.isValidUsername(" "));   // Space only
    }
}

