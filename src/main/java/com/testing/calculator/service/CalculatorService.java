package com.testing.calculator.service;

public class CalculatorService {
    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return x / y;
    }

    public double modulus(double x, double y) {
        return x % y;
    }
}
