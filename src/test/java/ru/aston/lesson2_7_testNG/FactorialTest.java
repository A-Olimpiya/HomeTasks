package ru.aston.lesson2_7_testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FactorialTest {
    Factorial factorial = new Factorial();

    @DataProvider(name = "factorialData")
    public Object[][] factorialData() {
        return new Object[][] {
                {0, 1L},
                {1, 1L},
                {2, 2L},
                {3, 6L},
                {4, 24L},
                {5, 120L},
                {20, 2432902008176640000L}
        };
    }

    @Test(dataProvider = "factorialData")
    public void testGetFactorial(int n, long expected) {
        assertEquals(factorial.getFactorial(n), expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Число должно быть от 0 до 20",
            description = "Число больше 20 выбрасывает исключение")
    public void testFactorialTooLarge() {
        factorial.getFactorial(21);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Число не должно быть отрицательным",
            description = "Отрицательное число выбрасывает исключение")
    public void testFactorialNegative() {
        factorial.getFactorial(-1);
    }
}