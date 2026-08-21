package ru.aston.lesson2_7_testNG;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            double a = sc.nextDouble();
            System.out.println("Введите второе число: ");
            double b = sc.nextDouble();
            System.out.println("Сумма двух чисел " + calculator.sum(a, b));
            System.out.println("Разность между первым и вторым числом " + calculator.sub(a, b));
            System.out.println("Умножение двух чисесл " + calculator.mul(a, b));
            try {
                System.out.println("Деление двух чисел: " + calculator.div(a, b));
            } catch (ArithmeticException e) {
                System.out.println("Деление двух чисел: ошибка - " + e.getMessage());
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: необходимо ввести число");
        }
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return a / b;
    }
}