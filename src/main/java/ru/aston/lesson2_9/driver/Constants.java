package ru.aston.lesson2_9.driver;

public class Constants {
    // URL
    public static final String BASE_URL = "https://www.mts.by/";
    public static final String URL_PODROBNEE = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";

    // XPath локаторы
    public static final String BUTTON_PODROBNEE_XPATH = "//a[contains(text(), 'Подробнее о сервисе')]";
    public static final String BUTTON_PRINYT_XPATH = "//button[text()='Принять']";
    public static final String NAME_TITLE_XPATH = "//h2[contains(text(), \"Онлайн пополнение \")]";
    public static final String BUTTON_CONTINUE_XPATH = "//button[text()='Продолжить']";
    public static final String EMAIL_XPATH = "//input[@id='connection-email']";
    public static final String PHONE_NUMBER_XPATH = "//input[@id='connection-phone']";
    public static final String SUM_XPATH = "//input[@id='connection-sum']";
    public static final String IFRAME_XPATH = "//iframe[@class='payment-widget-iframe']";

    // Ожидаемые значения
    public static final String NAME_TITLE_EXPECTED = "ОНЛАЙН ПОПОЛНЕНИЕ БЕЗ КОМИССИИ";

    // Названия логотипов
    public static final String LOGO_BELKART = "Белкарт";
    public static final String LOGO_VISA = "Visa";
    public static final String LOGO_VERIFIED_BY_VISA = "Verified By Visa";
    public static final String LOGO_MASTERCARD = "MasterCard";
    public static final String LOGO_MASTERCARD_SECURE = "MasterCard Secure Code";

    // Тестовые данные
    public static final String PHONE_NUMBER = "297777777";
    public static final String EMAIL = "nstsy@yandex.ru";
    public static final String SUM = "1000";
}