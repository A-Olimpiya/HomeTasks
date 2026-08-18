package ru.aston.lesson2_5;

public class ArraySize {
    public static void main(String[] args) {
        //Проверка валидного двумерного массива
        String[][] validArray = {
                {"0", "1", "2", "3"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };
        demoArray(validArray);

        //Проверка невалидного двумерного массива (количество строк 2 вместо 4)
        String[][] unValidArray1 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };
        demoArray(unValidArray1);

        //Проверка невалидного двумерного массива (количество столбцов не равно 4 в 1 строке)
        String[][] unValidArray2 = {
                {"1"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        demoArray(unValidArray2);

        //Проверка невалидного двумерного массива (вместо числа присутвует слово)
        String[][] unValidArray3 = {
                {"1", "1", "2", "3"},
                {"1", "1", "1", "1"},
                {"1", "1", "HelloWorld", "1"},
                {"1", "1", "1", "1"}
        };
        demoArray(unValidArray3);

        //Ловим ArrayIndexOutOfBoundsException
        try {
            String element = validArray[3][10];
            System.out.println(element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void demoArray(String[][] array) {
        try {
            arraySizeFour(array);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void arraySizeFour(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("В массиве должно быть 4 строки, а получено " + array.length);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Строка " + i + " имеет длину " + array[i].length + ", а нужно 4");
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum = Integer.parseInt(array[i][j]) + sum;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Элемент [" + i + "][" + j + "] не число!");
                }
            }
        }
        System.out.println("Общая сумма всех элементов двумерного массива: " + sum);
    }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}