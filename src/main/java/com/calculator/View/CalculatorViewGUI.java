package com.calculator.View;

import javax.swing.*;

public class CalculatorViewGUI extends JFrame {
    private JLabel firstNumLabel;
    private JTextField firstNumber;
    private JLabel secondNumLabel;
    private JTextField secondNumber;
    private JButton buttonAdd;
    private JButton buttonMinus;
    private JButton buttonMultiply;
    private JLabel calculationAdd;
    private JLabel calculationMinus;
    private JLabel calculationMultiply;

    public void body() {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.add(panel);

        firstNumLabel = new JLabel("First Num");
        firstNumLabel.setBounds(10, 20, 80, 25);
        panel.add(firstNumLabel);

        firstNumber = new JTextField(20);
        firstNumber.setBounds(100, 20, 165, 25);
        panel.add(firstNumber);

        secondNumLabel = new JLabel("Second Num");
        secondNumLabel.setBounds(10, 50, 80, 25);
        panel.add(secondNumLabel);

        secondNumber = new JTextField(20);
        secondNumber.setBounds(100, 50, 165, 25);
        panel.add(secondNumber);

        buttonAdd = new JButton("ADD");
        buttonAdd.setBounds(10, 80, 80, 25);
        panel.add(buttonAdd);

        buttonMinus = new JButton("MINUS");
        buttonAdd.setBounds(20, 80, 80, 25);
        panel.add(buttonMinus);

        buttonMultiply = new JButton("MULTIPLY");
        buttonAdd.setBounds(30, 80, 80, 25);
        panel.add(buttonMultiply);

        calculationAdd = new JLabel("*");
        calculationAdd.setBounds(10, 110, 300, 25);
        panel.add(calculationAdd);

        calculationMinus = new JLabel("*");
        calculationMinus.setBounds(20, 110, 300, 25);
        panel.add(calculationMinus);

        calculationMultiply = new JLabel("*");
        calculationMultiply.setBounds(30, 110, 300, 25);
        panel.add(calculationMultiply);

        frame.setVisible(true);

    }

    public int getFirstNumber() {

        return Integer.parseInt(firstNumber.getText());

    }

    public int getSecondNumber() {

        return Integer.parseInt(secondNumber.getText());

    }
}
