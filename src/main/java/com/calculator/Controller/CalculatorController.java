package com.calculator.Controller;

import com.calculator.Model.CalculatorModel;
import com.calculator.View.CalculatorView;

public class CalculatorController {
    private CalculatorModel theModel;
    private CalculatorView theView;

    public CalculatorController(CalculatorModel theModel, CalculatorView theView) {
        this.theModel = theModel;
        this.theView = theView;
    }

    public void displayResult() {
        theView.displayResult(theModel.getCalculation());
    }

    public void add(int firstNumber, int secondNumber) {
        theModel.addTwoNumber(firstNumber, secondNumber);
    }

    public void minus(int firstNumber, int secondNumber) {
        theModel.minusTwoNumber(firstNumber, secondNumber);
    }

    public void multiply(int firstNumber, int secondNumber) {
        theModel.multiplyTwoNumber(firstNumber, secondNumber);
    }
}