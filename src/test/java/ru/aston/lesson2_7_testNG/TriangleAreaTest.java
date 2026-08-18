package ru.aston.lesson2_7_testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TriangleAreaTest {

    @DataProvider(name = "validTriangleData")
    public Object[][] validTriangleData() {
        return new Object[][]{
                {3.0, 4.0, 6.0},
                {5.0, 5.0, 12.5},
                {2.5, 4.0, 5.0},
                {7.0, 3.0, 10.5},
                {10.0, 10.0, 50.0},
                {0.5, 0.5, 0.125}
        };
    }

    @Test(dataProvider = "validTriangleData")
    public void testTriangleArea(double side, double length, double expected) {
        assertEquals(TriangleArea.triangleArea(side, length), expected);
    }

    @DataProvider(name = "invalidTriangleData")
    public Object[][] invalidTriangleData() {
        return new Object[][]{
                {0.0, 1.0},
                {1.0, 0.0},
                {0.0, 0.0},
                {-3.0, 5.0},
                {5.0, -4.0},
                {-3.0, -4.0}
        };
    }

    @Test(dataProvider = "invalidTriangleData",
            expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Основание и высота должны быть положительными числами",
            description = "Невалидные значения сторон выбрасывают исключение")
    public void testTriangleAreaInvalid(double side, double length) {
        TriangleArea.triangleArea(side, length);
    }
}