package com.company.Model;
    // Hold all data and preform all the calculations needed.
    // This class doesn't even know that the view exist

//DATA
public class CalculatorModelAdd {
    private int calculationValue;

    //PERFORMS THE METHOD
    public void addTwoNumbers(int firstNumber, int secondNumber) {
         calculationValue = firstNumber + secondNumber;
    }

    //PROVIDE ACCESS TO THE DATA
    public int getCalculation() {
        return calculationValue;
    }
}
