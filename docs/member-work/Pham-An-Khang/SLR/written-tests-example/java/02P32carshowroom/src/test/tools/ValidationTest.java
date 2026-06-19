package test.tools;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import java.lang.reflect.Field;

import tools.Validation;

public class ValidationTest {

    // Helper to inject simulated user input into Validation's static scanner
    private void setSimulatedInput(String input) {
        try {
            Field scField = Validation.class.getDeclaredField("sc");
            scField.setAccessible(true);
            scField.set(null, new Scanner(input));
        } catch (Exception e) {
            throw new RuntimeException("Failed to inject simulated input", e);
        }
    }

    @Test
    public void testGetChoiceInt_HappyPath() {
        // Happy path: valid input within range on the first try
        setSimulatedInput("5\n");
        int result = Validation.getChoiceInt("Enter choice: ", 1, 10);
        assertEquals(5, result);
    }

    @Test
    public void testGetChoiceInt_FaultyFormat() {
        // Faulty format followed by valid input
        setSimulatedInput("abc\n3\n");
        int result = Validation.getChoiceInt("Enter choice: ", 1, 10);
        assertEquals(3, result);
    }

    @Test
    public void testGetChoiceInt_OutOfBounds() {
        // Out of bounds followed by valid input
        setSimulatedInput("15\n-2\n7\n");
        int result = Validation.getChoiceInt("Enter choice: ", 1, 10);
        assertEquals(7, result);
    }
}
