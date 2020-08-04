package com.company.Model;

public class CalculatorModelAdd {
    private int calculationValue;

    public void addTwoNumbers(int firstNumber, int secondNumber) {
        calculationValue = firstNumber + secondNumber;
    }

    public int getCalculation() {
        return calculationValue;
    }
}
