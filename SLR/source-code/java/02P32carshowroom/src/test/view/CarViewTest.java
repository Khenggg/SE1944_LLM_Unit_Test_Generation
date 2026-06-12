package test.view;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import models.Brand;
import models.BrandList;
import models.Car;
import models.CarList;
import tools.Validation;
import view.CarView;
import java.util.Scanner;
import java.lang.reflect.Field;

public class CarViewTest {

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
    public void testGetUpdatedCar_HappyPathAllFields() {
        // Happy path: Update all fields with valid new values
        Brand brand = new Brand("B01", "Toyota", "Active", 2.5);
        Car car = new Car("C01", brand, "red", "F11111", "E11111");
        CarList carList = new CarList(new BrandList());
        CarView view = new CarView();
        
        // Simulating user inputs: blue, F22222, E22222
        setSimulatedInput("blue\nF22222\nE22222\n");
        boolean updated = view.getUpdatedCar(car, carList);
        assertTrue(updated);
        assertEquals("blue", car.getColor());
        assertEquals("F22222", car.getFrameID());
        assertEquals("E22222", car.getEngineID());
    }

    @Test
    public void testGetUpdatedCar_SkipAllFields() {
        // Skip updating all fields by leaving inputs blank
        Brand brand = new Brand("B01", "Toyota", "Active", 2.5);
        Car car = new Car("C01", brand, "red", "F11111", "E11111");
        CarList carList = new CarList(new BrandList());
        CarView view = new CarView();
        
        // Simulating user inputs: empty lines for color, frame ID, and engine ID
        setSimulatedInput("\n\n\n");
        boolean updated = view.getUpdatedCar(car, carList);
        assertFalse(updated);
        assertEquals("red", car.getColor());
        assertEquals("F11111", car.getFrameID());
        assertEquals("E11111", car.getEngineID());
    }

    @Test
    public void testGetUpdatedCar_PartialUpdate() {
        // Update only the Color and keep others empty
        Brand brand = new Brand("B01", "Toyota", "Active", 2.5);
        Car car = new Car("C01", brand, "red", "F11111", "E11111");
        CarList carList = new CarList(new BrandList());
        CarView view = new CarView();
        
        // Simulating user inputs: black, skip frame ID, skip engine ID
        setSimulatedInput("black\n\n\n");
        boolean updated = view.getUpdatedCar(car, carList);
        assertTrue(updated);
        assertEquals("black", car.getColor());
        assertEquals("F11111", car.getFrameID());
        assertEquals("E11111", car.getEngineID());
    }
}
