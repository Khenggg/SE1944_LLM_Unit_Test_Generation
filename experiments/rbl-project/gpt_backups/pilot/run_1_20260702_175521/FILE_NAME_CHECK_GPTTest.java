package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class FILE_NAME_CHECK_GPTTest {

    @Test
    public void testValidFileName() {
        Assert.assertEquals("Yes", FILE_NAME_CHECK.file_name_check("example.txt"));
        Assert.assertEquals("Yes", FILE_NAME_CHECK.file_name_check("TestFile.exe"));
        Assert.assertEquals("Yes", FILE_NAME_CHECK.file_name_check("myfile.dll"));
    }

    @Test
    public void testInvalidFileName_NoDot() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("exampletxt"));
    }

    @Test
    public void testInvalidFileName_MultipleDots() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("example.txt.txt"));
    }

    @Test
    public void testInvalidFileName_EmptyNameBeforeDot() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check(".txt"));
    }

    @Test
    public void testInvalidFileName_InvalidExtension() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("example.doc"));
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("file.pdf"));
    }

    @Test
    public void testInvalidFileName_StartsWithDigit() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("1example.txt"));
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("123file.exe"));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test
    public void testInvalidFileName_TooManyDigits() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("file1234.txt"));
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("file1a2b3c.txt"));
    }

    @Test
    public void testInvalidFileName_OnlyDigitsBeforeDot() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("123.txt"));
    }

    @Test
    public void testInvalidFileName_EmptyString() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check(""));
    }

    @Test
    public void testInvalidFileName_OnlyDot() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("."));
    }

    @Test
    public void testInvalidFileName_OnlyExtension() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("..txt"));
    }

    @Test
    public void testValidFileName_WithDigits() {
        Assert.assertEquals("Yes", FILE_NAME_CHECK.file_name_check("file123.txt"));
        Assert.assertEquals("Yes", FILE_NAME_CHECK.file_name_check("file1.txt"));
        Assert.assertEquals("Yes", FILE_NAME_CHECK.file_name_check("file12.txt"));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test
    public void testInvalidFileName_ExceedingThreeDigits() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("file1234.txt"));
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("file1a2b3c.txt"));
    }
}