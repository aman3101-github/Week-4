package reflection.basiclevel.privatefield;

import org.example.reflection.basiclevel.invokeprivatemethod.Calculator;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testMultiplyNumbers() {
        try {
            // Create an instance of Calculator
            Calculator calculator = new Calculator(5, 20);

            // Access the private method using reflection
            Method method = Calculator.class.getDeclaredMethod("multiplyNumbers", int.class, int.class);
            method.setAccessible(true);

            // Invoke the method with test values
            Object result = method.invoke(calculator, 5, 10);

            // Assert the expected result (5 * 10 = 50)
            assertEquals(50, result);
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }
}
