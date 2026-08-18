package ru.aston.lesson2_7_testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ComparatorTest {
    @DataProvider(name = "numbersData")
    public Object[][] data() {
        return new Object[][]{// a < b
                {3, 5, "3 < 5"},
                {-9, 0, "-9 < 0"},
                {-5, -4, "-5 < -4"},
                {-10, 10, "-10 < 10"},
                {0, 1, "0 < 1"},
                // a > b
                {6, 5, "6 > 5"},
                {0, -2, "0 > -2"},
                {-3, -8, "-3 > -8"},
                {10, -10, "10 > -10"},
                {1, 0, "1 > 0"},
                // a = b
                {3, 3, "3 = 3"},
                {-3, -3, "-3 = -3"},
                {0, 0, "0 = 0"},
                {100, 100, "100 = 100"},
                {-100, -100, "-100 = -100"}
        };
    }

    @Test(dataProvider = "numbersData")
    public void testCompareNumbers(int a, int b, String expected) {
        assertEquals(Comparator.compareNumbers(a, b), expected);
    }
}