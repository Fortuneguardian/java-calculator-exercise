package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 1);

        assertEquals(3, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }

    @Test
    @DisplayName("multiply two numbers")
    public void testMultiplication() {
        final Integer multiply = Calculator.multiply(2, 0);

        assertEquals(0, multiply); 
    }

    @Test
    @DisplayName("divide two numbers")
    public void testDivision() {
        final Float divide = Calculator.divide(2, 4);

        assertEquals(0.5f, divide); 
    }

    // the following tests only check for whole numbers
    // to simplify and ensure this calculator calculates numbers with decimals 
    // we would check for Float variable instead of Integer and then ensure the
    // contructor within the Calculator.java method takes in float parameters? 
    
    @Test
    @DisplayName("divide by zero") 
    public void divideByZero() {

        
        assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(2, 0);
        });
        
    }
    }



