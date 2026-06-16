package test.view;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import models.Brand;
import models.BrandList;
import models.CarList;
import tools.Validation;
import view.BrandView;
import java.util.Scanner;
import java.lang.reflect.Field;

public class BrandViewTest {

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
    public void testGetUpdatedBrand_HappyPathAllFields() {
        // Happy path: Update all fields with valid new values
        Brand brand = new Brand("B01", "Toyota", "Active", 2.5);
        BrandView view = new BrandView(new CarList(new BrandList()));
        // Simulating user inputs: Honda, VTEC, 3.2B
        setSimulatedInput("Honda\nVTEC\n3.2B\n");
        boolean updated = view.getUpdatedBrand(brand);
        assertTrue(updated);
        assertEquals("Honda", brand.getBrandName());
        assertEquals("VTEC", brand.getSoundBrand(), "Sound brand");
        assertEquals(3.2, brand.getPrice(), 0.0001);
    }

    @Test
    public void testGetUpdatedBrand_SkipAllFields() {
        // Skip all updates by leaving inputs blank
        Brand brand = new Brand("B01", "Toyota", "Active", 2.5);
        BrandView view = new BrandView(new CarList(new BrandList()));
        // Simulating: empty lines for name, sound, and price
        setSimulatedInput("\n\n\n");
        boolean updated = view.getUpdatedBrand(brand);
        assertFalse(updated);
        assertEquals("Toyota", brand.getBrandName());
        assertEquals("Active", brand.getSoundBrand());
        assertEquals(2.5, brand.getPrice(), 0.0001);
    }

    @Test
    public void testGetUpdatedBrand_FaultyPriceThenSkip() {
        // Enter invalid price, then leave blank to skip
        Brand brand = new Brand("B01", "Toyota", "Active", 2.5);
        BrandView view = new BrandView(new CarList(new BrandList()));
        // Simulating: skip name, skip sound, enter invalid price "abc", then skip price
        setSimulatedInput("\n\nabc\n\n");
        boolean updated = view.getUpdatedBrand(brand);
        assertFalse(updated);
        assertEquals("Toyota", brand.getBrandName());
        assertEquals("Active", brand.getSoundBrand());
        assertEquals(2.5, brand.getPrice(), 0.0001);
    }
}
