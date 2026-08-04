package ru.aston.lesson2_2;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("\nTask 1:");
        printThreeWords();

        System.out.println("\nTask 2:");
        checkSumSign();

        System.out.println("\nTask 3:");
        printColor();

        System.out.println("\nTask 4:");
        compareNumbers();

        System.out.println("\nTask 5:");
        System.out.println(isSumBetween10And20(5, 6));
        System.out.println(isSumBetween10And20(1, 0));
        System.out.println(isSumBetween10And20(5, 5));
        System.out.println(isSumBetween10And20(15, 25));

        System.out.println("\nTask 6:");
        printNumberSign(7);
        printNumberSign(0);
        printNumberSign(-7);

        System.out.println("\nTask 7:");
        System.out.println(isNumberNegative(6));
        System.out.println(isNumberNegative(-6));
        System.out.println(isNumberNegative(0));

        System.out.println("\nTask 8:");
        printString("Печать строки заданное количество раз", 7);

        System.out.println("\nTask 9:");
        System.out.println(isYearLeap(2014));
        System.out.println(isYearLeap(2024));
        System.out.println(isYearLeap(200));
        System.out.println(isYearLeap(800));

        System.out.println("\nTask 10:");
        int[] array10 = {0, 1, 1, 0, 1, 1};
        for (int i = 0; i < array10.length; i++) {
            if (array10[i] == 0) {
                array10[i] = 1;
            } else {
                array10[i] = 0;
            }
        }
        for (int i : array10) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nTask 11:");
        int[] array11 = new int[100];
        for (int i = 0; i < array11.length; i++) {
            array11[i] = i + 1;
        }
        for (int i : array11) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nTask 12:");
        int[] array12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array12.length; i++) {
            if (array12[i] < 6) {
                array12[i] = array12[i] * 2;
            }
        }
        for (int i : array12) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nTask 13:");
        int[][] array13 = new int[4][4];
        for (int i = 0; i < array13.length; i++) {
            array13[i][i] = 1;
            array13[i][array13.length - 1 - i] = 1;
        }
        for (int[] ints : array13) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println("\nTask 14:");
        int[] arrayValue = arrayLength(9, 2);
        for (int i : arrayValue) {
            System.out.print(i + " ");
        }
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 25;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int value = 6;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 25;
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }

    public static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void printNumberSign(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean isNumberNegative(int a) {
        return a < 0;
    }

    public static void printString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean isYearLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int[] arrayLength(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}



