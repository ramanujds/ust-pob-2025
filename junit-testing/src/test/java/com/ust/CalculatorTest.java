package com.ust;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown(){
        System.out.println("Test Completed");
    }

    @Test
    void testAdd() {
        int a = 10, b = 20;
        assertEquals(30, calculator.add(a, b));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-5, calculator.add(5, -10));

    }


    @Test
    void testDivide(){
        int a = 10, b = 2;
        assertEquals(5, calculator.divide(a, b));
    }

    @Test
    void testDivideForException(){
        int a = 10, b = 0;
        assertThrows(ArithmeticException.class, ()->calculator.divide(a,b));
    }



}