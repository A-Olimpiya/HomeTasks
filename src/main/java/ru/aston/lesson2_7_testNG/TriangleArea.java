package ru.aston.lesson2_7_testNG;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите основание треугольника: ");
            int side = sc.nextInt();
            System.out.println("Введите высоту треугольника: ");
            int length = sc.nextInt();
            System.out.println("Площадь треугольника: " + triangleArea(side, length));
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: необходимо ввести число");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static double triangleArea(double side, double length) {
        if (side <= 0 || length <= 0) {
            throw new IllegalArgumentException(
                    "Основание и высота должны быть положительными числами"
            );
        }
        return (side * length) / 2;
    }
}
