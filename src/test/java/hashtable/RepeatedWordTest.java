package hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void repeatedWord() {

        assertEquals("my", RepeatedWord.repeatedWord("I love my cat. My cat is Fred. Fred is orange."));
        assertEquals("the", RepeatedWord.repeatedWord("the quick brown fox jumps over the dog"));
        assertEquals("dick", RepeatedWord.repeatedWord("Dick has a large dick"));

        assertNull(RepeatedWord.repeatedWord("there are no repeats here!"));
    }
}