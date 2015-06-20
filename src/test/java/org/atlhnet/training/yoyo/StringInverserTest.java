package org.atlhnet.training.yoyo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rowan on 6/20/15.
 */
public class StringInverserTest {

    private final String toInverse1 = "Bob";
    private final String expected1 = "Bob";

    private final String toInverse2 = "TestLol";
    private final String expected2 = "loLtseT";

    private final String toInverse3 = "Ceciestunemaison";
    private final String expected3 = "nosiamenutseiceC";

    private final String expectedEmpty = "Yoyo";



    @Test
    public void inverseString() {
        // INIT

        // CALL
        String assert1 = StringInverser.inverseString(toInverse1);
        String assert2 = StringInverser.inverseString(toInverse2);
        String assert3 = StringInverser.inverseString(toInverse3);
        String assertIsNull = StringInverser.inverseString(null);
        String assertEmpty = StringInverser.inverseString("");

        // VERIFY
        assertNotNull(assert1);
        assertNotNull(assert2);
        assertNotNull(assert3);
        assertNotNull(assertEmpty);
        assertNull(assertIsNull);

        assertEquals(expected1, assert1);
        assertEquals(expected2, assert1);
        assertEquals(expected3, assert1);
        assertEquals(expectedEmpty, assertEmpty);


    }
}