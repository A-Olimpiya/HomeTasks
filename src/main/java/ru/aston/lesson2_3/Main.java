package ru.aston.lesson2_3;

public class Main {
    public static void main(String[] args) {
        //Создание продукта и вывод информации о нем
        Product product = new Product("Book", "2000", "Bookstore", "China", 10.00, true);
        product.info();
        System.out.println();

        //Создание массива из 5 продуктов и вывод информации о них
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Dress", "2021", "Zara", "China", 35.15, true);
        productsArray[1] = new Product("Ball", "1998", "Belarus sports", "Belarus", 10.00, false);
        productsArray[2] = new Product("Pencil", "2026", "Korona", "China", 2.00, true);
        productsArray[3] = new Product("Phone", "2000", "Nokia", "Russia", 1300.50, false);
        productsArray[4] = new Product("Table", "1981", "IKEA", "USA", 350.25, true);
        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].info();
            System.out.println();
        }

        //Создание парка, добавление атрракционов, вывод информации о парке и аттракционах
        Park park = new Park("Парк аттракционов");
        park.addAttraction("Колесо обозрения", "Время работы с 10 до 22", 5.00);
        park.addAttraction("Лодочки", "Время работы с 10 до 22", 3.00);
        park.addAttraction("Машинки", "Время работы с 11 до 22", 6.00);
        park.printInfoParkAttractions();
    }
}