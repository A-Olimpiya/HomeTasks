package ru.aston.lesson2_7_junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @ParameterizedTest
    @DisplayName("Получение факториала")
    @CsvSource({
            "0, 1",
            "1, 1",
            "2, 2",
            "3, 6",
            "4, 24",
            "5, 120",
            "20, 2432902008176640000"
    })
    void getFactorial(int n, long expected) {
        assertEquals(expected, Factorial.getFactorial(n));
    }

    @Test
    @DisplayName("Число больше 20 выбрасывает исключение")
    void testFactorialTooLarge() {
        try {
            Factorial.getFactorial(21);
            fail("Должно выбросить исключение для числа больше 20");
        } catch (IllegalArgumentException e) {
            assertEquals("Число должно быть от 0 до 20",
                    e.getMessage());  // ✅ Проверка точного сообщения
        }
    }

    @Test
    @DisplayName("Отрицательное число выбрасывает исключение")
    void testFactorialNegative() {
        try {
            Factorial.getFactorial(-1);
            fail("Должно выбросить исключение для отрицательного числа");
        } catch (IllegalArgumentException e) {
            assertEquals("Число не должно быть отрицательным", e.getMessage());
        }
    }
}