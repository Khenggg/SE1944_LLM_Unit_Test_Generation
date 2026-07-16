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
        dict.put("B", "banana");
        Assert.assertFalse(CHECK_DICT_CASE.check_dict_case(dict));
    }

    @Test(timeout = 5000)
    public void testAllUpperCaseWithMixedTypes() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("STATE", "NC");
        dict.put(123, "value");
        Assert.assertFalse(CHECK_DICT_CASE.check_dict_case(dict));
    }

    @Test(timeout = 5000)
    public void testAllLowerCaseWithMixedTypes() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("key1", "value1");
        dict.put(456, "value2");
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
    public void testAllKeysAreEmptyStrings() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("", "value");
        dict.put("", "anotherValue");
        Assert.assertTrue(CHECK_DICT_CASE.check_dict_case(dict));
    }

    @Test(timeout = 5000)
    public void testAllKeysAreNull() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put(null, "value");
        dict.put(null, "anotherValue");
        Assert.assertFalse(CHECK_DICT_CASE.check_dict_case(dict));
    }
}