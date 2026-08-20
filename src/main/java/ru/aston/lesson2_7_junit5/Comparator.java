package ru.aston.lesson2_7_junit5;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Comparator comparator = new Comparator();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            int a = sc.nextInt();
            System.out.print("Введите второе число: ");
            int b = sc.nextInt();
            System.out.println(comparator.compareNumbers(a, b));
        } catch (Exception e) {
            System.out.println("Ошибка: необходимо ввести целое число");
        }
    }

    public String compareNumbers(int a, int b) {
        if (a < b) {
            return a + " < " + b;
        } else if (a > b) {
            return a + " > " + b;
        } else {
            return a + " = " + b;
        }
    }
}