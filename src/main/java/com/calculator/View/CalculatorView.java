package com.calculator.View;

import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame{

    private JTextField firstNumber  = new JTextField(10);
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButtonAdd = new JButton("Add");
    private JButton calculateButtonMinus = new JButton("Minus");
    private JButton calculateButtonMultiply = new JButton("Multiply");
    private JTextField results = new JTextField(10);

    public CalculatorView(){
        JPanel panel = new JPanel();
        this.setSize(500, 200);

        panel.add(firstNumber);
        panel.add(secondNumber);
        panel.add(calculateButtonAdd);
        panel.add(calculateButtonMinus);
        panel.add(calculateButtonMultiply);
        panel.add(results);

        this.add(panel);
    }

    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber(){
        return Integer.parseInt(secondNumber.getText());
    }

    public int getResults(){
        return Integer.parseInt(results.getText());
    }

    public void setResults(int solution){
        results.setText(Integer.toString(solution));
    }

    public void addCalculateListener(ActionListener listenForCalcButton){
        calculateButtonAdd.addActionListener(listenForCalcButton);
    }

    public void minusCalculateListener(ActionListener listenForCalcButton){
        calculateButtonMinus.addActionListener(listenForCalcButton);
    }

    public void multiplyCalculateListener(ActionListener listenForCalcButton){
        calculateButtonMultiply.addActionListener(listenForCalcButton);
    }
}