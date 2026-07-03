package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class FILE_NAME_CHECK_GPTTest {

    @Test(timeout = 5000)
    public void testValidFileName() {
        Assert.assertEquals("Yes", FILE_NAME_CHECK.file_name_check("example.txt"));
        Assert.assertEquals("Yes", FILE_NAME_CHECK.file_name_check("TestFile.exe"));
        Assert.assertEquals("Yes", FILE_NAME_CHECK.file_name_check("myfile.dll"));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_NoDot() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("exampletxt"));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_MultipleDots() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("example.txt.txt"));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_EmptyNameBeforeDot() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check(".txt"));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_InvalidExtension() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("example.doc"));
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("file.pdf"));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_StartsWithDigit() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("1example.dll"));
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("123file.txt"));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_TooManyDigits() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("example1234.txt"));
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("file1_2_3_4.exe"));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_OnlyDigits() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("123.txt"));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_EmptyString() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check(""));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_OnlyDot() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("."));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_OnlyExtension() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("..txt"));
    }

    @Test(timeout = 5000)
    public void testValidFileName_WithDigits() {
        Assert.assertEquals("Yes", FILE_NAME_CHECK.file_name_check("file123.txt"));
        Assert.assertEquals("Yes", FILE_NAME_CHECK.file_name_check("test1.exe"));
        Assert.assertEquals("Yes", FILE_NAME_CHECK.file_name_check("myfile2.dll"));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testInvalidFileName_ExceedingDigits() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("file1234.txt"));
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("test12.exe"));
    }
}