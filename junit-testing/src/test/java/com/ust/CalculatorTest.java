package com.ust;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {

        Calculator calculator = new Calculator();
        int a = 10, b = 20;
        assertEquals(30, calculator.add(a, b));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-5, calculator.add(5, -10));

    }

}