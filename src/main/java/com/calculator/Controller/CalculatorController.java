package com.calculator.Controller;

import com.calculator.Model.CalculatorModel;
import com.calculator.View.CalculatorView;
import com.calculator.View.CalculatorViewGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorModel theModel;
    private CalculatorViewGUI theView;


    public CalculatorController(CalculatorModel theModel, CalculatorViewGUI theView) {
        this.theModel = theModel;
        this.theView = theView;
    }
}

//    public void displayResult() {
//        theView.displayResult(theModel.getCalculation());
//    }

//    public void add(int firstNumber, int secondNumber) {
//        theModel.addTwoNumber(firstNumber, secondNumber);
//    }
//
//    public void minus(int firstNumber, int secondNumber) {
//        theModel.minusTwoNumber(firstNumber, secondNumber);
//    }
//
//    public void multiply(int firstNumber, int secondNumber) {
//        theModel.multiplyTwoNumber(firstNumber, secondNumber);
//    }
