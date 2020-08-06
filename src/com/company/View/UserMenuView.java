package com.company.View;

import com.company.Controller.CalculatorController;

import java.util.Scanner;

public class UserMenuView {
    private Scanner scan = new Scanner(System.in);
    private UserViewAdd userViewAdd = new UserViewAdd();
    private UserViewMinus userViewMinus = new UserViewMinus();

    public void process() {

        while (true) {
        System.out.println("Enter 1: Add Two Numbers \n" +
                "Enter 2: Minus Two Numbers");
            String input = scan.next();
            if (input.equals("1")) {
                System.out.println("Selected 1");
                userViewAdd.executeAdd();
            } else if (input.equals("2")) {
                System.out.println("selected 2");
                userViewMinus.executeMinus();
            } else {
                System.out.println("Invalid Input, Try Again");
            }
        }
    }
}
