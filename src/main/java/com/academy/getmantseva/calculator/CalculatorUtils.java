package com.academy.getmantseva.calculator;

import java.util.Scanner;

public class CalculatorUtils {
    private static final String OPERATOR_SIGN = "[-+*/]";

    public static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Enter the number:");
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Number is incorrect.");
            return getNumber();
        }
    }
    public static char getOperation() {
        System.out.println("Enter the operation (+, -, *, /):");
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        char operation;
        if (scanner.hasNext(OPERATOR_SIGN)) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Operation is incorrect.");
            operation = getOperation();
        }
        return operation;
    }
    public static double calculation(char operation, double num1, double num2) {
        Calculator calculate = new Calculator();
        return switch (operation) {
            case '+' -> calculate.add(num1, num2);
            case '-' -> calculate.subtract(num1, num2);
            case '*' -> calculate.multiply(num1, num2);
            case '/' -> calculate.divide(num1, num2);
            default -> 0;
        };
    }
    public static double getResult(double result) {
        final int DECIMAL_FORMAT = 2;
        return Math.round((result) * (int) Math.pow(10.0, DECIMAL_FORMAT)) / Math.pow(10.0,
                DECIMAL_FORMAT);
    }
}
