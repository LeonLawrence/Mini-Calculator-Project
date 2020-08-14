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
        this.theView.minusCalculateListener(new CalculateListener());
        this.theView.multiplyCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int firstNumber, secondNumber = 0;

            firstNumber = theView.getFirstNumberTextField();
            secondNumber = theView.getSecondNumberTextField();


            if (e.getActionCommand().equals("Add")) {
                theModel.addTwoNumbers(firstNumber, secondNumber);
                theView.setResultsTextField(theModel.getCalculationValue());

            } else if (e.getActionCommand().equals("Minus")) {
                theModel.minusTwoNumbers(firstNumber, secondNumber);
                theView.setResultsTextField(theModel.getCalculationValue());

            } else if (e.getActionCommand().equals("Multiply")) {
                theModel.multiplyTwoNumbers(firstNumber, secondNumber);
                theView.setResultsTextField(theModel.getCalculationValue());
            }
        }
    }
}