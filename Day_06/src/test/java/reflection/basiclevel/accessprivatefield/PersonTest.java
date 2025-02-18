package reflection.basiclevel.accessprivatefield;
import org.example.reflection.basiclevel.accessprivatefield.Person;
import org.junit.jupiter.api.Test;
import java.lang.reflect.*;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    void testModifyPrivateField() throws Exception {
        // Obtain the Class object of Person
        Class<?> className = Person.class;

        // Create an instance of Person using the default constructor
        Constructor<?> constructor = className.getDeclaredConstructor();
        Object object = constructor.newInstance();

        // Access the private field 'name'
        Field field = className.getDeclaredField("age");
        field.setAccessible(true); // Allow modification of private field

        // Modify the private field 'name'
        int newAge = 25;
        field.set(object, newAge);

        // Assert that the field was modified correctly
        assertEquals(newAge, field.get(object));
    }

    @Test
    void testInvokeDisplayMethod() throws Exception {
        // Obtain the Class object of Person
        Class<?> className = Person.class;

        // Create an instance of Person using the default constructor
        Constructor<?> constructor = className.getDeclaredConstructor();
        Object object = constructor.newInstance();

        // Access the 'display' method
        Method method = className.getMethod("display");

        // Capture output (optional: to verify method execution)
        assertDoesNotThrow(() -> method.invoke(object));
    }
}
