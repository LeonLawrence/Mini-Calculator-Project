package com.company.Model;

public class CalculatorModel {
    private int calculationValue;

    public void addTwoNumber(int firstNumber, int secondNumber) {
        calculationValue = firstNumber + secondNumber;
    }

    public void minusTwoNumber(int firstNumber, int secondNumber) {
        calculationValue = firstNumber - secondNumber;
    }

    public int getCalculation() {
        return calculationValue;
    }
}
