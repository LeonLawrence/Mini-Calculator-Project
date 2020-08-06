package com.company;

import com.company.Controller.CalculatorController;

import java.util.Scanner;

public class UserMenu {
    private Scanner scan = new Scanner(System.in);
    private CalculatorController controller;

    public UserMenu(CalculatorController controller) {
        this.controller = controller;
    }

    public void process() {

        while (true) {
            System.out.println("Enter 1: Add Two Numbers \n" +
                    "Enter 2: Minus Two Numbers");
            String input = scan.next();
            if (input.equals("1")) {
                System.out.println("Enter First Number");
                int firstNumber = scan.nextInt();

                System.out.println("Enter Second Number");
                int secondNumber = scan.nextInt();
                controller.add(firstNumber, secondNumber);
                controller.displayResult();
                System.out.println("Selected 1");
            } else if (input.equals("2")) {
                System.out.println("Enter First Number");
                int firstNumber = scan.nextInt();

                System.out.println("Enter Second Number");
                int secondNumber = scan.nextInt();
                controller.minus(firstNumber, secondNumber);
                controller.displayResult();
                System.out.println("selected 2");
            } else {
                System.out.println("Invalid Input, Try Again");
            }
        }
    }
}
