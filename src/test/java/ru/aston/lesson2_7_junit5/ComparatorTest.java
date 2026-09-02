package ru.aston.lesson2_7_junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorTest {
    Comparator comparator = new Comparator();

    @ParameterizedTest
    @DisplayName("Сравнение двух чисел")
    @CsvSource({
            // a < b
            "3, 5, 3 < 5",
            "-9, 0, -9 < 0",
            "-5, -4, -5 < -4",
            "-10, 10, -10 < 10",
            "0, 1, 0 < 1",
            // a > b
            "6, 5, 6 > 5",
            "0, -2, 0 > -2",
            "-3, -8, -3 > -8",
            "10, -10, 10 > -10",
            "1, 0, 1 > 0",
            // a = b
            "3, 3, 3 = 3",
            "-3, -3, -3 = -3",
            "0, 0, 0 = 0",
            "100, 100, 100 = 100",
            "-100, -100, -100 = -100"
    })
    void testCompareNumbers(int a, int b, String expected) {
        assertEquals(expected, comparator.compareNumbers(a, b));
    }
}