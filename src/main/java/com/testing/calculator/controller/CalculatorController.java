package com.testing.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testing.calculator.service.CalculatorService;

@RestController
@RequestMapping("/api")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/add")
    public double add(@RequestParam double x, @RequestParam double y) {
        return calculatorService.add(x, y);
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double x, @RequestParam double y) {
        return calculatorService.subtract(x, y);
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam double x, @RequestParam double y) {
        return calculatorService.multiply(x, y);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double x, @RequestParam double y) {
        return calculatorService.divide(x, y);
    }

    @GetMapping("/modulus")
    public double modulus(@RequestParam double x, @RequestParam double y) {
        return calculatorService.modulus(x, y);
    }
}
