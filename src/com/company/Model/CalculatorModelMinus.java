package com.company.Model;

public class CalculatorModelMinus {
    private int calculationValue;

    public void minusTwoNumbers(int firstNumber, int secondNumber) {
        calculationValue = firstNumber - secondNumber;
    }

    public int getCalculation() {
        return calculationValue;
    }
}
