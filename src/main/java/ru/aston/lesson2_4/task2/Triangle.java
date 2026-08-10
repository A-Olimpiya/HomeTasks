package ru.aston.lesson2_4.task2;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fillColor;
    private String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public String infoFillColor() {
        return fillColor;
    }

    @Override
    public String infoBorderColor() {
        return borderColor;
    }

    @Override
    public double infoArea() {
        double s = infoPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public String infoName() {
        return "Triangle";
    }

    @Override
    public double infoPerimeter() {
        return sideA + sideB + sideC;
    }
}
