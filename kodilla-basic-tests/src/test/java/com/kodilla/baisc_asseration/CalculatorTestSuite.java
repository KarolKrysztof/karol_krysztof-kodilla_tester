package com.kodilla.baisc_asseration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test

    public void testSum() {

        Calculator calculator = new Calculator();

        int a = 8;
        int b = 5;

        int sumResult = calculator.sum(a, b);

        assertEquals(13, sumResult);
    }
@Test
    public void testSubtract() {

        Calculator calculator = new Calculator();

        int a = 8;
        int b = 5;

        int subtractResult = calculator.subtract(a, b);

        assertEquals(3, subtractResult);
    }

@Test
    public void sqrtResult() {

        Calculator calculator = new Calculator();

        int a = 8;

        int sqrtResult = calculator.sqrt(a);

        assertEquals(64, sqrtResult);
        
    }

    @Test

    public void sqrtResultForNegative() {

        Calculator calculator = new Calculator();

        int a = -4;

        int sqrtResult = calculator.sqrt(a);

        assertEquals(16,sqrtResult);
    }

    @Test

    public void sqrtResultForZero() {

        Calculator calculator = new Calculator();

        int a = 0;

        int sqrtResult = calculator.sqrt(a);

        assertEquals(0, sqrtResult);
    }
}
