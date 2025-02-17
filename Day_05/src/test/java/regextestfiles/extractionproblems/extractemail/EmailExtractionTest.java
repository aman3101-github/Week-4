package regextestfiles.extractionproblems.extractemail;

import org.example.regex.extractionproblems.extractemail.EmailExtraction;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class EmailExtractionTest {

    @Test
    void testExtractEmail() {
        // Sample text with email addresses
        String text = "For any information, kindly contact us at support@gmail.com or helpdesk@gmail.com.";

        // Create an instance of EmailExtraction
        EmailExtraction emailExtraction = new EmailExtraction();

        // Capture output using System.out
        // Redirect System.out to capture the print statement
        PrintStream originalOut = System.out;
        ByteArrayOutputStream capturedOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(capturedOut));

        // Call the method to extract email addresses
        emailExtraction.extractEmail(text);

        // Reset System.out back to original
        System.setOut(originalOut);

        // Check if the captured output contains both email addresses
        String output = capturedOut.toString();
        assertTrue(output.contains("Found email: support@gmail.com"));
        assertTrue(output.contains("Found email: helpdesk@gmail.com"));
    }

    @Test
    void testExtractEmailNoMatch() {
        // Sample text without email addresses
        String text = "There is no email address in this text.";

        // Create an instance of EmailExtraction
        EmailExtraction emailExtraction = new EmailExtraction();

        // Capture output using System.out
        PrintStream originalOut = System.out;
        ByteArrayOutputStream capturedOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(capturedOut));

        // Call the method to extract email addresses
        emailExtraction.extractEmail(text);

        // Reset System.out back to original
        System.setOut(originalOut);

        // Check if the captured output contains the "no email address" message
        String output = capturedOut.toString();
        assertTrue(output.contains("Text doesn't contain any email address."));
    }
}
