package test.models;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import models.Brand;
import models.BrandList;

public class BrandListTest {
    private File tempFile;

    @BeforeEach
    public void setUp() throws IOException {
        tempFile = File.createTempFile("test_brands", ".txt");
    }

    @AfterEach
    public void clean() {
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    private void writeToFile(String content) throws IOException {
        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write(content);
        }
    }

    @Test
    public void testLoad_HappyPath() throws IOException {
        // Happy path: valid brand entry
        writeToFile("B001, Toyota, Active: 3.5B\n");
        BrandList brandList = new BrandList();
        try {
            java.lang.reflect.Method loadMethod = BrandList.class.getDeclaredMethod("load", String.class);
            loadMethod.setAccessible(true);
            loadMethod.invoke(brandList, tempFile.getAbsolutePath());
        } catch (Exception e) {
            fail("Failed to invoke load method: " + e.getMessage());
        }
        assertEquals(1, brandList.size());
        Brand brand = brandList.getList().get(0);
        assertEquals("B001", brand.getBrandID());
        assertEquals("Toyota", brand.getBrandName());
        assertEquals("Active", brand.getSoundBrand());
        assertEquals(3.5, brand.getPrice(), 0.0001);
    }

    @Test
    public void testLoad_EmptyLines() throws IOException {
        // Empty lines and spaces should be skipped
        writeToFile("\n   \n\n");
        BrandList brandList = new BrandList();
        try {
            java.lang.reflect.Method loadMethod = BrandList.class.getDeclaredMethod("load", String.class);
            loadMethod.setAccessible(true);
            loadMethod.invoke(brandList, tempFile.getAbsolutePath());
        } catch (Exception e) {
            fail("Failed to invoke load method: " + e.getMessage());
        }
        assertTrue(brandList.isEmpty());
    }

    @Test
    public void testLoad_FaultyFormat() throws IOException {
        // Faulty format: missing delimiters and fields
        writeToFile("B001, Toyota, Active\n");
        BrandList brandList = new BrandList();
        try {
            java.lang.reflect.Method loadMethod = BrandList.class.getDeclaredMethod("load", String.class);
            loadMethod.setAccessible(true);
            loadMethod.invoke(brandList, tempFile.getAbsolutePath());
        } catch (Exception e) {
            fail("Failed to invoke load method: " + e.getMessage());
        }
        assertTrue(brandList.isEmpty());
    }

    @Test
    public void testLoad_DuplicateID() throws IOException {
        // Duplicate ID
        writeToFile("B001, Toyota, Active: 3.5B\nB001, Honda, VTEC: 4.2B\n");
        BrandList brandList = new BrandList();
        try {
            java.lang.reflect.Method loadMethod = BrandList.class.getDeclaredMethod("load", String.class);
            loadMethod.setAccessible(true);
            loadMethod.invoke(brandList, tempFile.getAbsolutePath());
        } catch (Exception e) {
            fail("Failed to invoke load method: " + e.getMessage());
        }
        assertEquals(1, brandList.size());
        assertEquals("Toyota", brandList.getList().get(0).getBrandName());
    }
}
