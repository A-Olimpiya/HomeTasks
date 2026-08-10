package ru.aston.lesson2_4.task2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 6, 7, "Black", "Green");
        Circle circle = new Circle(2, "Black", "White");
        Rectangle rectangle = new Rectangle(4, 5, "Red", "Yellow");

        triangle.printInfo();
        circle.printInfo();
        rectangle.printInfo();
    }
}