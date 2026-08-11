package ru.aston.lesson2_6.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TelephoneNumbers telephoneNumbers = new TelephoneNumbers();

        telephoneNumbers.add("Ivanov", Arrays.asList("+375-29-234-54-65", "+375-33-555-77-45"));
        telephoneNumbers.add("Ivanov", Arrays.asList("+375-33-555-77-48"));
        telephoneNumbers.add("Petrov", Arrays.asList("+375-29-344-98-55"));
        telephoneNumbers.add("Sidorov", Arrays.asList("+375-29-234-55-33"));
        telephoneNumbers.add("Sidorov", Arrays.asList("+375-29-234-55-33"));
        telephoneNumbers.add("Black", Arrays.asList("+375-29-385-94-09"));

        telephoneNumbers.get("Ivanov");
        telephoneNumbers.get("Black");
        telephoneNumbers.get("Sidorov");
        telephoneNumbers.get("Cheh");
    }
}