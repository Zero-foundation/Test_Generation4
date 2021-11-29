package net.mooctest;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testisNumber() {
        MathParser mp = new MathParser();
        assertEquals(true, mp.isNumber("2.5"));
        assertEquals(false, mp.isNumber("abcde"));
    }

    @Test
    public void testfactorial() {
        MathParser mp = new MathParser();
        assertEquals(1.0, mp.factorial(1.0), 0.0);
        assertEquals(6.0, mp.factorial(3.0), 0.0);
    }

    @Test
    public void testsolveBinaryOperation() {
        MathParser mp = new MathParser();
        assertEquals(4.0, mp.solveBinaryOperation(2.0, "^", 2.0), 0.0);
        assertEquals(0.0, mp.solveBinaryOperation(4.0, "%", 2.0), 0.0);
        assertEquals(7.0, mp.solveBinaryOperation(5.0, "+", 2.0), 0.0);
        assertEquals(3.0, mp.solveBinaryOperation(5.0, "-", 2.0), 0.0);
        assertEquals(10.0, mp.solveBinaryOperation(5.0, "*", 2.0), 0.0);
        assertEquals(2.5, mp.solveBinaryOperation(5.0, "/", 2.0), 0.0);
    }
}

