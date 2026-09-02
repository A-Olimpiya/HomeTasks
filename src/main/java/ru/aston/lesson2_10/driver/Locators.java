package ru.aston.lesson2_10.driver;

import org.openqa.selenium.By;

public class Locators {
    public static final String BUTTON_PRINYT_XPATH = "//button[text()='Принять']";
    public static final String BUTTON_CONTINUE_XPATH = "//button[text()='Продолжить']";

    public static final String EMAIL_XPATH = "//input[@id='connection-email']";
    public static final String PHONE_NUMBER_XPATH = "//input[@id='connection-phone']";
    public static final String SUM_XPATH = "//input[@id='connection-sum']";

    public static final String IFRAME_XPATH = "//iframe[@class='payment-widget-iframe']";
    public static final String SERVICE_OPTION_XPATH = "//button[@class='select__header']";

    public static final String SUM_DISPLAY_XPATH = "//span[text()='100.00 BYN']";
    public static final String SUM_BUTTON_XPATH = "//button[@type='submit']/span[contains(text(), 'Оплатить')]";
    public static final String NUMBER_DISPLAY_CSS = ".pay-description__text span";

    public static final String GOOGLE_BUTTON_ID = "gpay-button-online-api-id";
    public static final String APPLE_PAY_BUTTON_ID = "apple-pay-button";
    public static final String VISA_LOGO_XPATH = "//img[contains(@src,'visa-system.svg')]";
    public static final String MASTERCARD_LOGO_XPATH = "//img[contains(@src,'mastercard-system.svg')]";
    public static final String BELCARD_LOGO_XPATH = "//img[contains(@src,'belkart-system.svg')]";
    public static final String MIR_LOGO_XPATH = "//img[contains(@src,'mir-system-ru.svg')]";

    public static final By[] CONNECTION_FIELDS = {
            By.id("connection-phone"),
            By.id("connection-sum"),
            By.id("connection-email")
    };
    public static final By[] INSTALLMENT_FIELDS = {
            By.id("score-instalment"),
            By.id("instalment-sum"),
            By.id("instalment-email")
    };
    public static final By[] INTERNET_FIELDS = {
            By.id("internet-phone"),
            By.id("internet-sum"),
            By.id("internet-email")
    };
    public static final By[] DEBT_FIELDS = {
            By.id("score-arrears"),
            By.id("arrears-sum"),
            By.id("arrears-email")
    };
}
