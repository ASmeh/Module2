package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private  SumCalculator sumCalculator;
    @BeforeEach
    void initCalculator() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void sum1Test() {
        Assertions.assertEquals(1,sumCalculator.sum(1));
    }
    @Test
    void sum3Test() {
        Assertions.assertEquals(6,sumCalculator.sum(3));
    }
    @Test
    void sumExeptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class,()->sumCalculator.sum(0));
    }
}