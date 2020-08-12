package com.calculator;


import com.calculator.Controller.CalculatorController;
import com.calculator.Model.CalculatorModel;
import com.calculator.View.CalculatorView;
import com.calculator.View.CalculatorViewGUI;

public class Main {
        private static CalculatorViewGUI gui = new CalculatorViewGUI();

    public static void main(String[] args) {
        gui.body();
        CalculatorController controller = new CalculatorController(new CalculatorModel(), new CalculatorView());
        UserMenu userMenu = new UserMenu(controller);
        userMenu.process();

    }
}