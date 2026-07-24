package humaneval.correct;

import java.util.HashMap;
import org.junit.Test;
import org.junit.Assert;

public class CHECK_DICT_CASE_GPTTest {

    @Test(timeout = 5000)
    public void testEmptyDictionary() {
        HashMap<Object, Object> dict = new HashMap<>();
        Assert.assertFalse(CHECK_DICT_CASE.check_dict_case(dict));
    }

    @Test(timeout = 5000)
    public void testAllLowerCaseKeys() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("b", "banana");
        Assert.assertTrue(CHECK_DICT_CASE.check_dict_case(dict));
    }

    @Test(timeout = 5000)
    public void testAllUpperCaseKeys() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("STATE", "NC");
        dict.put("ZIP", "12345");
        Assert.assertTrue(CHECK_DICT_CASE.check_dict_case(dict));
    }

    @Test(timeout = 5000)
    public void testMixedCaseKeys() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("Name", "John");
        dict.put("Age", "36");
        dict.put("City", "Houston");
        Assert.assertFalse(CHECK_DICT_CASE.check_dict_case(dict));
    }

    @Test(timeout = 5000)
    public void testMixedKeysWithNumbers() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put(8, "banana");
        Assert.assertFalse(CHECK_DICT_CASE.check_dict_case(dict));
    }

    @Test(timeout = 5000)
    public void testMixedCaseWithUpperAndLower() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("A", "banana");
        Assert.assertFalse(CHECK_DICT_CASE.check_dict_case(dict));
    }

    @Test(timeout = 5000)
    public void testAllUpperCaseWithMixedLower() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("STATE", "NC");
        dict.put("state", "nc");
        Assert.assertFalse(CHECK_DICT_CASE.check_dict_case(dict));
    }

    @Test(timeout = 5000)
    public void testAllLowerCaseWithMixedUpper() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("B", "banana");
        Assert.assertFalse(CHECK_DICT_CASE.check_dict_case(dict));
    }

    @Test(timeout = 5000)
    public void testSingleLowerCaseKey() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        Assert.assertTrue(CHECK_DICT_CASE.check_dict_case(dict));
    }

    @Test(timeout = 5000)
    public void testSingleUpperCaseKey() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("A", "apple");
        Assert.assertTrue(CHECK_DICT_CASE.check_dict_case(dict));
    }

    @Test(timeout = 5000)
    public void testNullKey() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put(null, "value");
        Assert.assertFalse(CHECK_DICT_CASE.check_dict_case(dict));
    }

    @Test(timeout = 5000)
    public void testEmptyStringKey() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("", "value");
        Assert.assertTrue(CHECK_DICT_CASE.check_dict_case(dict));
    }
}