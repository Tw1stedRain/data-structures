package multibracketvalidation;

import org.junit.Test;

import static multibracketvalidation.MultiBracketValidation.multiBracketValidation;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void testMultiBrackets() {
        String test1 = "This ) has (";
        String test2 = "this has )";
        String test3 = "bob {}";
        String test4 = "} cat";
        String test5 = "[ murr]";
        String test6 = "boop]";
        String fail = "buttsbuttsbutts";

        assertTrue(multiBracketValidation(test1));
        assertFalse(multiBracketValidation(test2));
        assertTrue(multiBracketValidation(test3));
        assertFalse(multiBracketValidation(test4));
        assertTrue(multiBracketValidation(test5));
        assertFalse(multiBracketValidation(test6));
        assertFalse(multiBracketValidation(fail));
    }

}