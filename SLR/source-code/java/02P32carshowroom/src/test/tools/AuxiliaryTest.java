package test.tools;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import models.Brand;
import tools.Auxiliary;

public class AuxiliaryTest {

    @Test
    public void testCalculateCarPriceByColor_DiscountedColor() {
        // Happy path: Discounted color inputs should receive a 10% discount
        Brand brand = new Brand("B01", "Toyota", "Active", 10.0);
        // Checking for white, grey, gray, black
        assertEquals(9.0, Auxiliary.calculateCarPriceByColor(brand, "white"), 0.001);
        assertEquals(9.0, Auxiliary.calculateCarPriceByColor(brand, "grey"), 0.001);
        assertEquals(9.0, Auxiliary.calculateCarPriceByColor(brand, "gray"), 0.001);
        assertEquals(9.0, Auxiliary.calculateCarPriceByColor(brand, "black"), 0.001);
    }

    @Test
    public void testCalculateCarPriceByColor_MixedCasing() {
        // Mixed casing should still be detected properly
        Brand brand = new Brand("B01", "Toyota", "Active", 10.0);
        assertEquals(9.0, Auxiliary.calculateCarPriceByColor(brand, "White"), 0.001);
        assertEquals(9.0, Auxiliary.calculateCarPriceByColor(brand, "BLACK"), 0.001);
    }

    @Test
    public void testCalculateCarPriceByColor_NoDiscountColor() {
        // Other colors that should not receive a discount
        Brand brand = new Brand("B01", "Toyota", "Active", 10.0);
        assertEquals(10.0, Auxiliary.calculateCarPriceByColor(brand, "red"), 0.001);
        assertEquals(10.0, Auxiliary.calculateCarPriceByColor(brand, "blue"), 0.001);
    }
}
