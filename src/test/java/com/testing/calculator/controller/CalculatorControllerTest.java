package com.testing.calculator.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.testing.calculator.service.CalculatorService;

@ExtendWith(MockitoExtension.class)
public class CalculatorControllerTest {

    @Mock
    private CalculatorService calculatorService;

    @InjectMocks
    private CalculatorController calculatorController;

    @Test
    public void add() {
        when(calculatorService.add(6, 4)).thenReturn(10.0);
        assertEquals(10, calculatorController.add(6, 4), "6 + 4 should equal 10");
    }

    @Test
    public void subtract() {
        when(calculatorService.subtract(6, 4)).thenReturn(2.0);
        assertEquals(2, calculatorController.subtract(6, 4), "6 - 4 should equal 2");
    }

    @Test
    public void multiply() {
        when(calculatorService.multiply(6, 4)).thenReturn(24.0);
        assertEquals(24, calculatorController.multiply(6, 4), "6 * 4 should equal 24");
    }

    @Test
    public void divide() {
        when(calculatorService.divide(6, 4)).thenReturn(1.5);
        assertEquals(1.5, calculatorController.divide(6, 4), "6 / 4 should equal 1.5");
    }

    @Test
    public void divideByZero() {
        when(calculatorService.divide(6, 0))
                .thenThrow(new IllegalArgumentException("Division by zero is not allowed."));

        assertThrows(IllegalArgumentException.class, () -> calculatorController.divide(6, 0),
                "Division by zero should throw IllegalArgumentException");
    }

    @Test
    public void modulus() {
        when(calculatorService.modulus(6, 4)).thenReturn(2.0);
        assertEquals(2, calculatorController.modulus(6, 4), "6 % 4 should equal 2");
    }
}
