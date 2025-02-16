package reflection.basiclevel.classinfo;

import org.example.reflection.basiclevel.classInfo.ClassInfo;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ClassInfoTest {

    @Test
    void testDisplayClassDetails() {
        // Redirect system output to capture printed text
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Test with a known class
        String testClassName = "org.example.basiclevel.classinformation.Main";
        ClassInfo.displayClassDetails(testClassName);

        // Restore original output stream
        System.setOut(System.out);

        // Convert output to string
        String output = outputStream.toString();

        // Check if expected output contains class name
        assertTrue(output.contains("Class Name: " + testClassName));
        assertTrue(output.contains("Constructors:"));
        assertTrue(output.contains("Methods:"));
    }

    @Test
    void testInvalidClassName() {
        // Redirect system output to capture printed text
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Test with an invalid class name
        String invalidClassName = "org.example.UnknownClass";
        ClassInfo.displayClassDetails(invalidClassName);

        // Restore original output stream
        System.setOut(System.out);

        // Convert output to string
        String output = outputStream.toString();

        // Verify output contains error message
        assertTrue(output.contains("Class not found: " + invalidClassName));
    }
}

