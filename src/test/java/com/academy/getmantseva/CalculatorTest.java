package com.academy.getmantseva;

import com.academy.getmantseva.calculator.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }


    @ParameterizedTest
    @CsvSource({
            "123, 456, 579",
            "123.123, 456.456, 579.57",
            "1.23, 4.56, 5.79",
            "1.23, -4.56, -3.33",
            "1.01, 0.09, 1.1",
    })
    void testAddNumbers(double a, double b, double result) {
        double actualResult = calculator.add(a, b);
        assertEquals(result, actualResult, 0.01, "Addition is not correct. Expected result: "
                + result + "  actual result: " + actualResult);
    }

    @ParameterizedTest
    @CsvSource({
            "456.456, 123.123, 333.33",
            "123.123, 456.456, -333.33",
            "-456.456, 123.123, -579.57",
            "-456.456, -123.123, -333.33",
            "0.082, 0.08, 0.00",
    })
    void testSubtractNumbers(double a, double b, double result) {
        double actualResult = calculator.subtract(a, b);
        assertEquals(result, actualResult, 0.01, "Subtraction is not correct. Expected result: "
                + result + " actual result: " + actualResult);
    }

    @ParameterizedTest
    @CsvSource({
            "4.56, 1.23, 5.61",
            "-4.56, 1.23, -5.61",
            "-4.56, -1.23, 5.61",
            "456.456, 123.123, 56200.23",
            "456, 0, 0",
    })
    void testMultiplyNumbers(double a, double b, double result) {
        double actualResult = calculator.multiply(a, b);
        assertEquals(result, actualResult, 0.01, "Multiplication method is not correct. Expected result: "
                + result + " actual result: " + actualResult);

    }

    @ParameterizedTest
    @CsvSource({
            "45.6, 12.3, 3.70",
            "12.3, 45.6, 0.27",
            "12.3, -45.6, -0.27",
            "-12.3, -45.6, 0.27",

    })
    void testDivideNumbers(double a, double b, double result) {
        double actualResult = calculator.divide(a, b);
        assertEquals(result, actualResult, 0.01, "Division is not correct. Expected result: "
                + result + " actual result: " + actualResult);
    }
}
