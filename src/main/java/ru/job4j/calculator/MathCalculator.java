package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double calculate1(double first, double second) {
        return sum(subtraction(first, second), division(first, second));
    }

    public static double calculate2(double first, double second) {
        return sum(sum(sum(first, second), subtraction(first, second)), sum(multiply(first, second), division(first, second)));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}
