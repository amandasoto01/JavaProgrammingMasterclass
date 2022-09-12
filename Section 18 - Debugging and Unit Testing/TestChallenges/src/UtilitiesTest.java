import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertArrayEquals;

public class UtilitiesTest {
    private Utilities utilities;

    @Before
    public void setUp() throws Exception {
        utilities = new Utilities();
    }

    @Test
    public void everyNthChar() {
        char[] letters = {'h','e','l','l','o'};
        char[] output = {'e','l'};
        assertArrayEquals( output, utilities.everyNthChar(letters,2));
        assertArrayEquals( new char[] {'h','e','l','l','o'}, utilities.everyNthChar(letters,8));
    }

    @Test
    public void removePairs() {
        String input = "AABCDDEFF";
        String output = utilities.removePairs(input);
        assertEquals("ABCDEF", output);
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        assertNull("Did not get null returned when argument passed was null", utilities.removePairs(null));
        assertEquals("A", utilities.removePairs("AA"));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));
    }

    @Test
    public void converter() {
        assertEquals(300, utilities.converter(10,5));
    }

    @Test(expected = ArithmeticException.class)
    public void converter2() {
        assertEquals(300, utilities.converter(10,0));
    }

    @Test
    public void nullIfOddLength() {
        Assert.assertNull(null, utilities.nullIfOddLength("hello"));
        assertEquals("helloo", utilities.nullIfOddLength("helloo"));
    }
}
