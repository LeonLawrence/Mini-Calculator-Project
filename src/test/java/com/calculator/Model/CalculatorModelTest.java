package com.calculator.Model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorModelTest {

    private CalculatorModel model = new CalculatorModel();

    @Test
    public void canAdd() {
        model.addTwoNumber(10, 15);
        assertEquals(25, model.getCalculation());
    }

    @Test
    public void canMinus() {
        model.minusTwoNumber(30, 10);
        assertEquals(20, model.getCalculation());
    }

    @Test
    public void canMultiply() {
        model.multiplyTwoNumber(5, 5);
        assertEquals(25, model.getCalculation());
    }
}

