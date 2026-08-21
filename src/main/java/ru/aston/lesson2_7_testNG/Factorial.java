package ru.aston.lesson2_7_testNG;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи число для вычисления факториала от 0 до 20: ");
        int number = scanner.nextInt();
        try {
            System.out.println("Факториал " + number + " = " + factorial.getFactorial(number));
        } catch (IllegalArgumentException e) {
            System.out.println("Число должно быть от 0 до 20");
        }
    }

    public long getFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число не должно быть отрицательным");
        }
        if (n > 20) {
            throw new IllegalArgumentException(
                    "Число должно быть от 0 до 20"
            );
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}