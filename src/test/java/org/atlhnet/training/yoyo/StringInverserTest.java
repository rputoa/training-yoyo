package org.atlhnet.training.yoyo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rowan on 6/20/15.
 */
public class StringInverserTest {

    private final String toInverse1 = "Bob";
    private final String expected1 = "boB";
    private final String expectedAddInverseString1="BobboB";

    private final String toInverse2 = "TestLol";
    private final String expected2 = "loLtseT";
    private final String expectedAddInverseString2="TestLolloLtseT";

    private final String toInverse3 = "Ceciestunemaison";
    private final String expected3 = "nosiamenutseiceC";
    private final String expectedAddInverseString3="CeciestunemaisonnosiamenutseiceC";

    private final String expectedEmpty = "Yoyo";
    private final String expectedAddInverseStringEmpty="Yoyo";

    private StringInverser stringInverser = new StringInverser();
    @Test
    public void inverseString() {
        // INIT

        // CALL
        String assert1 = stringInverser.inverseString(toInverse1);
        String assert2 = stringInverser.inverseString(toInverse2);
        String assert3 = stringInverser.inverseString(toInverse3);
        String assertIsNull = stringInverser.inverseString(null);
        String assertEmpty = stringInverser.inverseString("");

        // VERIFY
        assertNotNull(assert1);
        assertNotNull(assert2);
        assertNotNull(assert3);
        assertNotNull(assertEmpty);
        assertNull(assertIsNull);

        assertEquals(expected1, assert1);
        assertEquals(expected2, assert2);
        assertEquals(expected3, assert3);
        assertEquals(expectedEmpty, assertEmpty);
    }

    @Test
    public void addInverseString() {
        String result1 = stringInverser.addInverseString(toInverse1);
        String result2 = stringInverser.addInverseString(toInverse2);
        String result3 = stringInverser.addInverseString(toInverse3);
        String resultEmpty = stringInverser.addInverseString("");
        String resultnull = stringInverser.addInverseString(null);

        assertNotNull(result1);
        assertNotNull(result2);
        assertNotNull(result3);
        assertNotNull(resultEmpty);
        assertNull(resultnull);

        assertEquals(expectedAddInverseString1, result1);
        assertEquals(expectedAddInverseString2, result2);
        assertEquals(expectedAddInverseString3, result3);
        assertEquals(expectedAddInverseStringEmpty, resultEmpty);

    }
}
