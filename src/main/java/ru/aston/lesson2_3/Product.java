package ru.aston.lesson2_3;

public class Product {
    private String name;
    private String dateProduction;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean isReserved;

    public Product(String name, String dateProduction, String manufacturer,
                   String countryOfOrigin, double price, boolean isReserved) {
        this.name = name;
        this.dateProduction = dateProduction;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isReserved = isReserved;
    }

    public void info() {
        System.out.println("Name: " + name +
                "\nDate Production: " + dateProduction +
                "\nManufacturer: " + manufacturer +
                "\nCountry Of Origin: " + countryOfOrigin +
                "\nPrice: " + price +
                "\nReserved: " + isReserved);
    }
}
