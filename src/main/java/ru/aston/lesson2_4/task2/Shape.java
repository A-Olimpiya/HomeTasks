package ru.aston.lesson2_4.task2;

public interface Shape {
    String infoFillColor();
    String infoBorderColor();
    double infoArea();
    String infoName();
    default double infoPerimeter() {
        return 0;
    }
    default void printInfo() {
        System.out.println("\n" + infoName());
        System.out.println("Периметр: " + infoPerimeter());
        System.out.println("Площадь: " + infoArea());
        System.out.println("Цвет заливки: " + infoFillColor());
        System.out.println("Цвет границы: " + infoBorderColor());
    }
}