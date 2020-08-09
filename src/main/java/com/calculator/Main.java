package com.calculator;


import com.calculator.Controller.CalculatorController;
import com.calculator.Model.CalculatorModel;
import com.calculator.View.CalculatorView;

public class Main {

    public static void main(String[] args) {
        CalculatorController controller = new CalculatorController(new CalculatorModel(), new CalculatorView());
        UserMenu userMenu = new UserMenu(controller);
        userMenu.process();

    }
}