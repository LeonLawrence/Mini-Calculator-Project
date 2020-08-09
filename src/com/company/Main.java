package com.company;

import com.company.Controller.CalculatorController;
import com.company.Model.CalculatorModel;
import com.company.View.CalculatorView;

public class Main {

    public static void main(String[] args) {
        CalculatorController controller = new CalculatorController(new CalculatorModel(), new CalculatorView());
        UserMenu userMenu = new UserMenu(controller);
        userMenu.process();

    }
}