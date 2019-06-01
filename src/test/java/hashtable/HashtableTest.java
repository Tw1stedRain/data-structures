package hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {
    Hashtable<Integer> testHash;

    @Test
    public void getTest() {
        testHash = new Hashtable<>();
        testHash.add("test1", 12);
        testHash.add("test2", 57);
        testHash.add("test3", 7);

        assertEquals(12, (int) testHash.get("test1"));
        assertEquals(57, (int) testHash.get("test2"));
        assertEquals(7, (int) testHash.get("test3"));
    }

    @Test
    public void testCollision() {
        testHash = new Hashtable<>();
        testHash.add("test one", 12);
        testHash.add("test two", 57);
        testHash.add("test three", 7);

        assertFalse(testHash.add("test one", 15));
        assertFalse(testHash.add("test one", 37));
        assertTrue(testHash.add("test One", 37));

    }

    @Test
    public void containsTest() {
        testHash = new Hashtable<>();
        testHash.add("test one", 12);
        testHash.add("test two", 57);
        testHash.add("test three", 7);

        assertTrue(testHash.contains("test one"));
        assertFalse(testHash.contains("test One"));
        assertTrue(testHash.contains("test two"));

    }
}