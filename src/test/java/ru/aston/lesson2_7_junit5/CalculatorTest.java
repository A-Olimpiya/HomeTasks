package ru.aston.lesson2_7_junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest
    @DisplayName("Сложение чисел")
    @CsvSource({
            "2, 2, 4",
            "5, -5, 0",
            "0, 10, 10",
            "-5, -5, -10",
            "10, -5, 5"
    })
    void testSum(double a, double b, double expected) {
        assertEquals(expected, Calculator.sum(a, b));
    }

    @ParameterizedTest
    @DisplayName("Вычитание чисел")
    @CsvSource({
            "6, 3, 3",
            "3, 6, -3",
            "0, 5, -5",
            "-3, -3, 0",
            "10, -5, 15"
    })
    void testSub(double a, double b, double expected) {
        assertEquals(expected, Calculator.sub(a, b));
    }

    @ParameterizedTest
    @DisplayName("Умножение чисел")
    @CsvSource({
            "3, 3, 9",
            "-3, 3, -9",
            "0, 5, 0",
            "-5, -5, 25",
            "10, -5, -50"
    })
    void testMul(double a, double b, double expected) {
        assertEquals(expected, Calculator.mul(a, b));
    }

    @ParameterizedTest
    @DisplayName("Деление чисел")
    @CsvSource({
            "6, 3, 2",
            "9, 3, 3",
            "-6, 3, -2",
            "-6, -3, 2",
            "0, 5, 0"
    })
    void testDiv(double a, double b, double expected) {
        assertEquals(expected, Calculator.div(a, b));
    }

    @Test
    @DisplayName("Деление на ноль выбрасывает исключение")
    void testDivByZero() {
        try {
            Calculator.div(5, 0);
            fail("Деление должно выбросить исключение");
        } catch (ArithmeticException e) {
            assertEquals("Деление на ноль невозможно", e.getMessage());
        }
    }
}