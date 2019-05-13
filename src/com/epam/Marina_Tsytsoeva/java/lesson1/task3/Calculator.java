package com.epam.Marina_Tsytsoeva.java.lesson1.task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator app = new Calculator();
        int num1 = getInt();
        int num2 = getInt();
        app.calc(num1, num2);
    }

    public static int getInt() {
        System.out.println("Insert the number:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Error. Insert the number.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static void calc(int num1, int num2) {
        JFrame myWindow = new JFrame("Operation choice");
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton buttAdd = new JButton("+");
        JButton buttSub = new JButton("-");
        JButton buttMult = new JButton("*");
        JButton buttDiv = new JButton("/");

        buttAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                add(num1, num2);
                System.exit(0);
            }
        });
        buttSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                sub(num1, num2);
                System.exit(0);
            }
        });
        buttMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                mult(num1, num2);
                System.exit(0);
            }
        });
        buttDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                div(num1, num2);
                System.exit(0);
            }
        });

        panel.add(buttAdd);
        panel.add(buttSub);
        panel.add(buttMult);
        panel.add(buttDiv);
        myWindow.setContentPane(panel);
        myWindow.setSize(400, 300);
        myWindow.setVisible(true);

    }

    public static void add(int num1, int num2) {
        System.out.println("The result of the addition operation: " + (num1 + num2));
    }

    public static void sub(int num1, int num2) {
        System.out.println("The result of the subtraction operation: " + (num1 - num2));
    }

    public static void mult(int num1, int num2) {
        System.out.println("The result of the multiplication operation: " + (num1 * num2));
    }

    public static void div(int num1, int num2) {
        if (num2==0) {
        System.out.println("Error!)");
        System.exit(0);
        }
        System.out.println("The result of the division operation: " + (num1 / num2));
    }

}



