package ru.aston.lesson2_6.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneNumbers {
    private Map<String, List<String>> phoneBook;

    public TelephoneNumbers() {
        phoneBook = new HashMap<>();
    }

    public Map<String, List<String>> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(Map<String, List<String>> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void add(String name, List<String> phoneNumbers) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }
        phoneBook.get(name).addAll(phoneNumbers);
    }

    public void get(String name) {
        List<String> numbers = phoneBook.get(name);
        if (numbers == null) {
            System.out.println("Нет телефонных номеров для фамилии " + name);
        } else {
            System.out.println(name + ": " + numbers);
        }
    }
}