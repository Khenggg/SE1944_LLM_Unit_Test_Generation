package test.tools;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import java.lang.reflect.Field;

import tools.Validation;
import models.CustomerList;
import models.CarList;
import models.BrandList;
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
    @Test
    public void testGetConfirmation_HappyPath() {
        // Happy path: User inputs Y or N correctly
        setSimulatedInput("Y\n");
        assertTrue(Validation.getConfirmation("Confirm?"));
        setSimulatedInput("N\n");
        assertFalse(Validation.getConfirmation("Confirm?"));
    }

    @Test
    public void testGetConfirmation_InvalidThenValid() {
        // Invalid input followed by a valid input to test loop termination
        setSimulatedInput("invalid\nY\n");
        assertTrue(Validation.getConfirmation("Confirm?"));
    }

    @Test
    public void testGetNewPrice_HappyPath() {
        // Happy path: valid input with B stripped
        setSimulatedInput("3.749B\n");
        assertEquals(3.749, Validation.getNewPrice("Enter price: "), 0.001);
    }

    @Test
    public void testGetNewPrice_InvalidThenValid() {
        // Boundary test: Zero or negative values, followed by a valid price
        setSimulatedInput("-1.5\n0\n4.2\n");
        assertEquals(4.2, Validation.getNewPrice("Enter price: "), 0.001);
    }

    @Test
    public void testGetNewPhone_HappyPath() {
        // Happy path: exact 10-digit number
        setSimulatedInput("0123456789\n");
        assertEquals(123456789, Validation.getNewPhone("Enter phone: ", new CustomerList()));
    }

    @Test
    public void testGetNewPhone_InvalidLengths() {
        // Length checks: shorter inputs, longer inputs, then correct length
        setSimulatedInput("123\n12345678901\n0987654321\n");
        assertEquals(987654321, Validation.getNewPhone("Enter phone: ", new CustomerList()));
    }

    @Test
    public void testGetUpdatedPrice_SkipUpdate() {
        // User skips update by leaving input blank
        setSimulatedInput("\n");
        assertEquals(-1.0, Validation.getUpdatedPrice("Enter price: ", 2.5), 0.001);
    }

    @Test
    public void testGetUpdatedPrice_UpdateWithValid() {
        // User updates value with valid price
        setSimulatedInput("4.5B\n");
        assertEquals(4.5, Validation.getUpdatedPrice("Enter price: ", 2.5), 0.001);
    }

    @Test
    public void testGetUpdatedFrameID_SkipUpdate() {
        // User skips update by leaving input blank
        CarList list = new CarList(new BrandList());
        setSimulatedInput("\n");
        assertEquals("", Validation.getUpdatedFrameID("Enter frame ID: ", "F11111", list));
    }

    @Test
    public void testGetUpdatedFrameID_RegexFailuresThenValid() {
        // Regex validation failures before providing a valid frame ID
        CarList list = new CarList(new BrandList());
        setSimulatedInput("F123\nF123456\nE12345\nF99999\n");
        assertEquals("F99999", Validation.getUpdatedFrameID("Enter frame ID: ", "F11111", list));
    }
}
