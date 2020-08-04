package com.company.Controller;

import com.company.Model.CalculatorModelAdd;
import com.company.Model.CalculatorModelMinus;

import java.util.Scanner;

public class CalculatorController {
    private Scanner scan = new Scanner(System.in);
    private CalculatorModelAdd calculatorModelAdd = new CalculatorModelAdd();
    private CalculatorModelMinus calculatorModelMinus = new CalculatorModelMinus();

    public void executeAdd() {
        System.out.println("Enter First Number");
        int firstNumber = scan.nextInt();

        System.out.println("Enter Second Number");
        int secondNumber = scan.nextInt();

        calculatorModelAdd.addTwoNumbers(firstNumber, secondNumber);
        System.out.println("==========================================================");
        System.out.println("Your Answer: " + calculatorModelAdd.getCalculation());
        System.out.println("==========================================================");
    }

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
