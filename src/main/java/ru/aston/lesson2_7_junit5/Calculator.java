package ru.aston.lesson2_7_junit5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            double a = sc.nextDouble();
            System.out.println("Введите второе число: ");
            double b = sc.nextDouble();
            System.out.println("Сумма двух чисел " + sum(a, b));
            System.out.println("Разность между первым и вторым числом " + sub(a, b));
            System.out.println("Умножение двух чисесл " + mul(a, b));
            try {
                System.out.println("Деление двух чисел: " + div(a, b));
            } catch (ArithmeticException e) {
                System.out.println("Деление двух чисел: ошибка - " + e.getMessage());
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: необходимо ввести число");
        }
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return a / b;
    }
}