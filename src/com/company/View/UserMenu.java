package com.company.View;

import com.company.Controller.CalculatorController;

import java.util.Scanner;

public class UserMenu {
    private Scanner scan = new Scanner(System.in);
    private CalculatorController calculatorController = new CalculatorController();

    public void process() {
        while (true) {
            System.out.println("Enter 1 to Add Two Numbers \n" +
                    "Enter 2 to Minus Two Numbers");
            String input = scan.next();
            if (input.equals("1")) {
                calculatorController.executeAdd();
                System.out.println("Selected 1");

            } else if (input.equals("2")) {
                System.out.println("selected 2");
            } else {
                System.out.println("Invalid Input, Try Again");
            }
        }
    }
}
