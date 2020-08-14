package com.calculator.Model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorModelTest {

    private CalculatorModel model = new CalculatorModel();

    @Test
    public void canAdd() {
        model.addTwoNumbers(10, 15);
        assertEquals(25, model.getCalculationValue());
    }

    @Test
    public void canMinus() {
        model.minusTwoNumbers(30, 10);
        assertEquals(20, model.getCalculationValue());
    }

    @Test
    public void canMultiply() {
        model.multiplyTwoNumbers(5, 5);
        assertEquals(25, model.getCalculationValue());
    }
}

