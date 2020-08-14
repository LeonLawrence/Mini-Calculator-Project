package com.calculator.Controller;

import com.calculator.Model.CalculatorModel;
import com.calculator.View.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    private CalculatorView theView;
    private CalculatorModel theModel;

    private boolean addCalculatorListener = true;
    private boolean minusCalculatorListener = true;
    private boolean multiplyCalculatorListener = true;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculateListener(new CalculateListener());
        this.theView.minusCalculateListener(new CalculateListener());
        this.theView.multiplyCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int firstNumber, secondNumber = 0;

            firstNumber = theView.getFirstNumber();
            secondNumber = theView.getSecondNumber();

            for (int i = 0; i <= 1; i++) {
                {
                    if (addCalculatorListener) {
                        theModel.addTwoNumbers(firstNumber, secondNumber);
                        theView.setResults(theModel.getCalculationValue());
                        theView.resetInputNumber();

                    } else if (minusCalculatorListener) {
                        theModel.minusTwoNumbers(firstNumber, secondNumber);
                        theView.setResults(theModel.getCalculationValue());

                    } else if (multiplyCalculatorListener) {
                        theModel.multiplyTwoNumbers(firstNumber, secondNumber);
                        theView.setResults(theModel.getCalculationValue());

                    } else {
                        System.out.println("Invalid Input");
                    }
                }
            }
        }
    }
}