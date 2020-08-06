package com.company.View;

import com.company.Model.CalculatorModelMinus;

import java.util.Scanner;

public class UserViewMinus {
    private Scanner scan = new Scanner(System.in);
    private CalculatorModelMinus calculatorModelMinus = new CalculatorModelMinus();

    public void executeMinus() {
        System.out.println("Enter First Number");
        int firstNumber = scan.nextInt();

        System.out.println("Enter Second Number");
        int secondNumber = scan.nextInt();

        calculatorModelMinus.minusTwoNumbers(firstNumber, secondNumber);
        System.out.println("==========================================================");
        System.out.println("Your Answer: " + calculatorModelMinus.getCalculation());
        System.out.println("==========================================================");
    }
}
