package com.company.Controller;

import com.company.View.UserMenuView;

public class CalculatorController {
    private UserMenuView theView;

    public CalculatorController(UserMenuView theView) {
        this.theView = theView;

    }

    public UserMenuView getView() {
        return theView;
    }

}

