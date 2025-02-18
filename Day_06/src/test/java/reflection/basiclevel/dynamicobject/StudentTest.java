package reflection.basiclevel.dynamicobject;
import org.example.reflection.basiclevel.dynamicobjects.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StudentTest {

    @Test
    public void testDynamicCreationAndDisplayDetails() {
        try {
            // Capture System.out output
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(baos));

            // Access the Student class metadata using reflection
            Class<?> clazz = Student.class;

            // Get the constructor that accepts a String and an int
            Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);

            // Dynamically create a Student instance without using the new keyword
            Object studentObject = constructor.newInstance("Aman", 21);

            // Access and invoke the displayDetails(String, int) method dynamically
            Method displayMethod = clazz.getMethod("displayDetails", String.class, int.class);
            displayMethod.invoke(studentObject, "Aman", 21);

            // Restore the original System.out
            System.setOut(originalOut);

            // Define the expected output (adjust newlines as needed)
            String expectedOutput = "Student's Name: Aman" + System.lineSeparator() +
                    "Student's Roll No.: 21";

            // Normalize line separators before assertion
            String actualOutput = baos.toString().trim().replace("\r\n", "\n").replace("\r", "\n");
            String normalizedExpected = expectedOutput.trim().replace("\r\n", "\n").replace("\r", "\n");

            assertEquals(normalizedExpected, actualOutput);
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }
}
