package com.academy.getmantseva.calculator;

public final class RunCalculator {
    public static void main(String[] args) {

        double num1 = CalculatorUtils.getNumber();
        double num2 = CalculatorUtils.getNumber();
        char operation = CalculatorUtils.getOperation();
        double result = CalculatorUtils.calculation(operation, num1, num2);
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);

    }
}
