package com.testing.calculator.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void add() {
        assertEquals(10, calculatorService.add(6, 4), "6 + 4 should equal 10");
    }

    @Test
    void subtract() {
        assertEquals(2, calculatorService.subtract(6, 4), "6 - 4 should equal 2");
    }

    @Test
    void multiply() {
        assertEquals(24, calculatorService.multiply(6, 4), "6 * 4 should equal 24");
    }

    @Test
    void divide() {
        assertEquals(1.5, calculatorService.divide(6, 4), "6 / 4 should equal 1.5");
    }

    @Test
    void divideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(6, 0),
                "Division by zero should throw IllegalArgumentException");
    }

    @Test
    void modulus() {
        assertEquals(2, calculatorService.modulus(6, 4), "6 % 4 should equal 2");
    }
}
