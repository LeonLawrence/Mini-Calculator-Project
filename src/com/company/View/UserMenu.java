package com.company.View;

import java.util.Scanner;

public class UserMenu {
    private Scanner scan = new Scanner(System.in);

    public void process() {
        while (true) {
            if (scan.equals("1")) {
                System.out.println("Selected 1");
            } else if (scan.equals("2")) {
                System.out.println("selected 2");
            } else {
                System.out.println("Invalid Input, Try Again");
            }
        }
    }
}
