package isNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringExpressionsTest {

    @Test
    public void isNumberTest()
    {
        // true
        assertTrue(StringExpressions.isNumber("4"));
        assertTrue(StringExpressions.isNumber("1342839795"));
        assertTrue(StringExpressions.isNumber("3.14"));
        assertTrue(StringExpressions.isNumber("43333.333"));
        assertTrue(StringExpressions.isNumber("-43333.333"));
        assertTrue(StringExpressions.isNumber("-4"));
        assertTrue(StringExpressions.isNumber("0"));
        assertTrue(StringExpressions.isNumber("0.2345"));
        assertTrue(StringExpressions.isNumber("-0.2345"));
        // false
        assertFalse(StringExpressions.isNumber("4..12"));
        assertFalse(StringExpressions.isNumber("4c12"));
        assertFalse(StringExpressions.isNumber("x12"));
        assertFalse(StringExpressions.isNumber("4 12"));
        assertFalse(StringExpressions.isNumber("4,12"));
        assertFalse(StringExpressions.isNumber("011"));
        assertFalse(StringExpressions.isNumber("-011"));
    }
}