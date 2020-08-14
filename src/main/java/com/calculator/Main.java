package com.calculator;

import com.calculator.Controller.CalculatorController;
import com.calculator.Model.CalculatorModel;
import com.calculator.View.CalculatorView;

public class Main {
    public static void main(String[] args) {

        CalculatorView theView = new CalculatorView();

        CalculatorModel theModel = new CalculatorModel();

        CalculatorController theController = new CalculatorController(theView,theModel);

        theView.setVisible(true);

    }
}