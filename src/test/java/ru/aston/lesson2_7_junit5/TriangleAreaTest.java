package ru.aston.lesson2_7_junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaTest {

    @ParameterizedTest
    @DisplayName("Площадь треугольника")
    @CsvSource({
            "3, 4, 6.0",
            "5, 5, 12.5",
            "2.5, 4, 5.0",
            "7, 3, 10.5",
            "10, 10, 50.0",
            "0.5, 0.5, 0.125"
    })
    void triangleArea(double side, double length, double expected) {
        assertEquals(expected, TriangleArea.triangleArea(side, length));
    }

    @ParameterizedTest
    @DisplayName("Невалидные значения сторон выбрасывают исключение")
    @CsvSource({
            "0, 1",
            "1, 0",
            "0, 0",
            "-3, 5",
            "5, -4",
            "-3, -4"
    })
    void testTriangleAreaInvalid(double side, double length) {
        try {
            TriangleArea.triangleArea(side, length);
            fail("Должно выбросить исключение для сторон: " + side + ", " + length);
        } catch (IllegalArgumentException e) {
            assertEquals("Основание и высота должны быть положительными числами",
                    e.getMessage());
        }
    }
}