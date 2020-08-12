package com.calculator.Controller;

import com.calculator.Model.CalculatorModel;
import com.calculator.View.CalculatorView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculateListener(new CalculateListener());
        this.theView.minusCalculateListener(new CalculateListener2());
        this.theView.multiplyCalculateListener(new CalculateListener3());
    }

    class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int firstNumber, secondNumber = 0;

            firstNumber = theView.getFirstNumber();
            secondNumber = theView.getSecondNumber();

            theModel.addTwoNumbers(firstNumber, secondNumber);
            theView.setResults(theModel.getCalculationValue());
        }
    }

    class CalculateListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int firstNumber, secondNumber = 0;

            firstNumber = theView.getFirstNumber();
            secondNumber = theView.getSecondNumber();

            theModel.minusTwoNumbers(firstNumber, secondNumber);
            theView.setResults(theModel.getCalculationValue());
        }
    }

    class CalculateListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;

            firstNumber = theView.getFirstNumber();
            secondNumber = theView.getSecondNumber();

            theModel.multiplyTwoNumbers(firstNumber, secondNumber);
            theView.setResults(theModel.getCalculationValue());
        }
    }
}