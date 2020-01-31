package com.conestogac.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public  void setUp() throws Exception {
        calculator = new Calculator();
    }

    //Test cases for addition
    @Test
    // Test identifier: 1.1
    // Test description: Adding 5 and 5 (2 positive member)
    // Method of execution: automatic
    // Input data (5,5)
    // Expected data 10
    // Observer data 10
    public  void testAddition_input5and5_output10() {
        double a = 5;
        double b = 5;

        double result = calculator.addition(a,b);
        assertEquals(10.0, result,1);
    }


    @Test
    public void testSubstraction_input5and5_output0() {
        double a = 5;
        double b = 5;

        double result = calculator.substraction(a,b);
        assertEquals(0, result,1);
    }

    @Test
    public void testMultiplication_input5and5_output25() {
        double a = 5;
        double b = 5;

        double result = calculator.multiplication(a,b);
        assertEquals(25.0, result,1);
    }

    @Test
    public void testDivision_input5and5_output1() {
        double a = 5;
        double b = 5;

        double result = calculator.division(a,b);
        assertEquals(1.0, result,1);
    }
    @Test(expected = ArithmeticException.class)
    public void testDivision_input5and0_ReturnException() {
        double a = 5;
        double b = 0;
        calculator.division(a,b);

    }
}
