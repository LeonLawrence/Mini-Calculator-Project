package com.company.Controller;

import com.company.Model.CalculatorModelAdd;
import com.company.View.CalculationView;

import java.util.Scanner;

public class CalculatorController {
    private CalculationView theView;
    private CalculatorModelAdd theModel;
    private Scanner scan = new Scanner(System.in);
    private CalculatorModelAdd calculatorModelAdd = new CalculatorModelAdd();

//    public CalculatorController(CalculationView theView, CalculatorModelAdd theModel) {
//        this.theView = theView;
//        this.theModel = theModel;
//    }

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
