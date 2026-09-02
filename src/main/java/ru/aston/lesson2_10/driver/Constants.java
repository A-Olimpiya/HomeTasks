package ru.aston.lesson2_10.driver;

import org.openqa.selenium.By;

public class Constants {
    // URL
    public static final String BASE_URL = "https://www.mts.by/";

    // Тестовые данные для заполнения формы
    public static final String PHONE_NUMBER = "297777777";
    public static final String EMAIL = "nstsy@yandex.ru";
    public static final String SUM = "100";

    // Ожидаемые значения
    public static final String CARD_NUMBER_EXPECTED = "Номер карты";
    public static final String EXPIRY_DATE_EXPECTED = "Срок действия";
    public static final String CVC_EXPECTED = "CVC";
    public static final String NAME_EXPECTED = "Имя и фамилия на карте";
    public static final  String SUM_EXPECTED = SUM + ".00 BYN";
    public static final String SUM_ON_BUTTON_EXPECTED = "Оплатить " + Constants.SUM + ".00 BYN";
    public static final   String NUMBER_PHONE_EXPECTED = "Оплата: Услуги связи Номер:375" + Constants.PHONE_NUMBER;

    // Для проверки плейсхолдеров
    public static final String[] CONNECTION_EXPECTED = {
            "Номер телефона",
            "Сумма",
            "E-mail для отправки чека"
    };
    public static final String[] INSTALLMENT_EXPECTED = {
            "Номер счета на 44",
            "Сумма",
            "E-mail для отправки чека"
    };
    public static final String[] INTERNET_EXPECTED = {
            "Номер абонента",
            "Сумма",
            "E-mail для отправки чека"
    };
    public static final String[] DEBT_EXPECTED = {
            "Номер счета на 2073",
            "Сумма",
            "E-mail для отправки чека"
    };
}