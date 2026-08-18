package ru.aston.lesson2_7_testNG;

import java.util.Scanner;

public class Comparator {public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        System.out.println(compareNumbers(a, b));
    } catch (Exception e) {
        System.out.println("Ошибка: необходимо ввести целое число");
    }
}

    public static String compareNumbers(int a, int b) {
        if (a < b) {
            return a + " < " + b;
        } else if (a > b) {
            return a + " > " + b;
        } else {
            return a + " = " + b;
        }
    }
}
