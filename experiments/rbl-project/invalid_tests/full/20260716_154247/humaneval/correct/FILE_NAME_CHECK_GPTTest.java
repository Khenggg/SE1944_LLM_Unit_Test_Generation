package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class FILE_NAME_CHECK_GPTTest {

    @Test(timeout = 5000)
    public void testValidFileName_txt() {
        Assert.assertEquals("Yes", FILE_NAME_CHECK.file_name_check("example.txt"));
    }

    @Test(timeout = 5000)
    public void testValidFileName_exe() {
        Assert.assertEquals("Yes", FILE_NAME_CHECK.file_name_check("program.exe"));
    }

    @Test(timeout = 5000)
    public void testValidFileName_dll() {
        Assert.assertEquals("Yes", FILE_NAME_CHECK.file_name_check("library.dll"));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_noDot() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("exampletxt"));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_multipleDots() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("example.txt.txt"));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_emptyName() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check(".txt"));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_invalidStart() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("1example.dll"));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_invalidExtension() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("example.doc"));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_tooManyDigits() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("example1234.txt"));
    }

    @Test(timeout = 5000)
    public void testValidFileName_withDigits() {
        Assert.assertEquals("Yes", FILE_NAME_CHECK.file_name_check("example123.txt"));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_onlyDigits() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("123.txt"));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_noExtension() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("example."));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_invalidCharacters() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("example@.txt"));
    }

    @Test(timeout = 5000)
    public void testValidFileName_uppercaseStart() {
        Assert.assertEquals("Yes", FILE_NAME_CHECK.file_name_check("Example.txt"));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_emptyAfterDot() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("example."));
    }

    @Test(timeout = 5000)
    public void testInvalidFileName_specialCharacters() {
        Assert.assertEquals("No", FILE_NAME_CHECK.file_name_check("example!@#.txt"));
    }
}