package ru.aston.lesson2_7_testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {

    @DataProvider(name = "sumData")
    public Object[][] sumData() {
        return new Object[][]{
                {2.0, 2.0, 4.0},
                {5.0, -5.0, 0.0},
                {0.0, 10.0, 10.0},
                {-5.0, -5.0, -10.0},
                {10.0, -5.0, 5.0}
        };
    }

    @Test(dataProvider = "sumData")
    public void testSum(double a, double b, double expected) {
        assertEquals(Calculator.sum(a, b), expected);
    }

    @DataProvider(name = "subData")
    public Object[][] subData() {
        return new Object[][]{
                {6.0, 3.0, 3.0},
                {3.0, 6.0, -3.0},
                {0.0, 5.0, -5.0},
                {-3.0, -3.0, 0.0},
                {10.0, -5.0, 15.0}
        };
    }

    @Test(dataProvider = "subData")
    public void testSub(double a, double b, double expected) {
        assertEquals(Calculator.sub(a, b), expected);
    }

    @DataProvider(name = "mulData")
    public Object[][] mulData() {
        return new Object[][]{
                {3.0, 3.0, 9.0},
                {-3.0, 3.0, -9.0},
                {0.0, 5.0, 0.0},
                {-5.0, -5.0, 25.0},
                {10.0, -5.0, -50.0}
        };
    }

    @Test(dataProvider = "mulData")
    public void testMul(double a, double b, double expected) {
        assertEquals(Calculator.mul(a, b), expected);
    }

    @DataProvider(name = "divData")
    public Object[][] divData() {
        return new Object[][]{
                {6.0, 3.0, 2.0},
                {9.0, 3.0, 3.0},
                {-6.0, 3.0, -2.0},
                {-6.0, -3.0, 2.0},
                {0.0, 5.0, 0.0}
        };
    }

    @Test(dataProvider = "divData")
    public void testDiv(double a, double b, double expected) {
        assertEquals(Calculator.div(a, b), expected);
    }

    @Test(expectedExceptions = ArithmeticException.class,
            expectedExceptionsMessageRegExp = "Деление на ноль невозможно",
            description = "Деление на ноль выбрасывает исключение")
    public void testDivByZero() {
        Calculator.div(5, 0);
    }
}