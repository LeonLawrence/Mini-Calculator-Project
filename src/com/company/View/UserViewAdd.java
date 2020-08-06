package com.company.View;

import com.company.Model.CalculatorModelAdd;

import java.util.Scanner;

public class UserViewAdd {
    private Scanner scan = new Scanner(System.in);
    private CalculatorModelAdd calculatorModelAdd = new CalculatorModelAdd();

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

}
