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
                    "Enter 2: Minus Two Numbers  \n" +
                    "Enter 3: Multiply Two Numbers");
            String input = scan.next();
            if (input.equals("1")) {
                System.out.println("Selected 1");
                int[] result = askTwoNumber();
                controller.add(result[0], result[1]);
                controller.displayResult();
            } else if (input.equals("2")) {
                System.out.println("selected 2");
                int[] result = askTwoNumber();
                controller.minus(result[0], result[1]);
                controller.displayResult();
            } else if (input.equals("3")) {
                int[] result = askTwoNumber();
                controller.multiply(result[0], result[1]);
                controller.displayResult();
            } else {
                System.out.println("Invalid Input, Try Again");
            }
        }
    }

    private int[] askTwoNumber() {
        int[] numbers = new int[2];
        System.out.println("Enter First and Second Number");
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        numbers[0] = firstNumber;
        numbers[1] = secondNumber;
        return numbers;
    }
}