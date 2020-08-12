package com.calculator.View;

import javax.swing.*;

public class CalculatorViewGUI {

    public static void body() {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350,200);
        frame.add(panel);

        JLabel titleLabel = new JLabel("**Please Enter Two Numbers**");
        titleLabel.setBounds(10, 20, 80, 25);
//        panel.add(titleLabel);

        JLabel firstNumLabel = new JLabel("First Num");
        firstNumLabel.setBounds(10, 20, 80, 25);
        panel.add(firstNumLabel);

        JTextField firstNumText = new JTextField(20);
        firstNumText.setBounds(100,20,165,25);
        panel.add(firstNumText);

        JLabel secondNumLabel = new JLabel("Second Num");
        secondNumLabel.setBounds(10, 50, 80, 25);
        panel.add(secondNumLabel);

        JTextField secondNumText = new JTextField(20);
        secondNumText.setBounds(100,50,165,25);
        panel.add(secondNumText);

        JButton buttonAdd = new JButton("ADD");
        buttonAdd.setBounds(10, 80, 80, 25);
        panel.add(buttonAdd);

        JButton buttonMinus = new JButton("MINUS");
        buttonAdd.setBounds(20, 80, 80, 25);
        panel.add(buttonMinus);

        JButton buttonMultiply = new JButton("MULTIPLY");
        buttonAdd.setBounds(30, 80, 80, 25);
        panel.add(buttonMultiply);

        JLabel calculationAdd = new JLabel("*");
        calculationAdd.setBounds(10, 110, 300, 25);
        panel.add(calculationAdd);

        JLabel calculationMinus = new JLabel("*");
        calculationMinus.setBounds(20, 110, 300, 25);
        panel.add(calculationMinus);

        JLabel calculationMultiply = new JLabel("*");
        calculationMultiply.setBounds(30, 110, 300, 25);
        panel.add(calculationMultiply);

        frame.setVisible(true);

    }
}
