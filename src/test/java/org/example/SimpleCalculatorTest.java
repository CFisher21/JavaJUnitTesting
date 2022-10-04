package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void twoPlusThreeShouldEqualFive() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertTrue(calculator.add(2, 3) == 5);
    }

    @Test
    void twoPlusThreeShouldNotEqualSix() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertFalse(calculator.add(2, 3) == 6);
    }

    @Test
    void twoTimesThreeShouldEqualSix() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void twoTimesFourShouldEqualEight() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertTrue(calculator.multiply(2,4) == 8);
    }

    @Test
    void twoTimesTwoShouldNotEqualFive() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertFalse(calculator.multiply(2, 2) == 5);
    }

}