package com.calculator.View;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {

    private JTextField firstNumberTextField = new JTextField(10);
    private JTextField secondNumberTextField = new JTextField(10);
    private JButton calculateButtonAdd = new JButton("Add");
    private JButton calculateButtonMinus = new JButton("Minus");
    private JButton calculateButtonMultiply = new JButton("Multiply");
    private JTextField resultsTextField = new JTextField(10);

    public CalculatorView() {
        JPanel panel = new JPanel();
        this.setSize(300, 200);

        panel.add(firstNumberTextField);
        panel.add(secondNumberTextField);
        panel.add(calculateButtonAdd);
        panel.add(calculateButtonMinus);
        panel.add(calculateButtonMultiply);
        panel.add(resultsTextField);

        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);
    }

    public int getFirstNumberTextField() {
        return Integer.parseInt(firstNumberTextField.getText());
    }

    public int getSecondNumberTextField() {
        return Integer.parseInt(secondNumberTextField.getText());
    }

    public int getResultsTextField() {
        return Integer.parseInt(resultsTextField.getText());
    }

    public void setResultsTextField(int solution) {
        resultsTextField.setText(Integer.toString(solution));
    }

    public void addCalculateListener(ActionListener listenForCalcButton) {
        calculateButtonAdd.addActionListener(listenForCalcButton);
    }

    public void minusCalculateListener(ActionListener listenForCalcButton) {
        calculateButtonMinus.addActionListener(listenForCalcButton);
    }

    public void multiplyCalculateListener(ActionListener listenForCalcButton) {
        calculateButtonMultiply.addActionListener(listenForCalcButton);
    }
}