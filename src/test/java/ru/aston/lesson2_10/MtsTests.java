package ru.aston.lesson2_10;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.aston.lesson2_10.driver.Constants;
import ru.aston.lesson2_10.driver.Locators;

public class MtsTests extends BaseTest {

    @Test
    @DisplayName("Проверка в полях Услуги связи")
    public void testCommunicationServicesFields() {
        String[] actual = onlinePaymentPage.getPlaceholders("Услуги связи", Locators.CONNECTION_FIELDS);
        String[] expected = Constants.CONNECTION_EXPECTED;
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertTrue(actual[i].contains(expected[i]),
                    "Поле " + (i + 1) + ": ожидалось '" + expected[i] + "', получено '" + actual[i] + "'");
        }
    }

    @Test
    @DisplayName("Проверка надписей в полях Рассрочка")
    public void testInstallmentFields() {
        String[] actual = onlinePaymentPage.getPlaceholders("Рассрочка", Locators.INSTALLMENT_FIELDS);
        String[] expected = Constants.INSTALLMENT_EXPECTED;

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertTrue(actual[i].contains(expected[i]),
                    "Поле " + (i + 1) + ": ожидалось '" + expected[i] + "', получено '" + actual[i] + "'");
        }
    }

    @Test
    @DisplayName("Проверка надписей в полях Домашний интернет")
    public void testHomeInternetFields() {
        String[] actual = onlinePaymentPage.getPlaceholders("Домашний интернет", Locators.INTERNET_FIELDS);
        String[] expected = Constants.INTERNET_EXPECTED;

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertTrue(actual[i].contains(expected[i]),
                    "Поле " + (i + 1) + ": ожидалось '" + expected[i] + "', получено '" + actual[i] + "'");
        }
    }

    @Test
    @DisplayName("Проверка надписей в полях Задолженность")
    public void testDebtFields() {
        String[] actual = onlinePaymentPage.getPlaceholders("Задолженность", Locators.DEBT_FIELDS);
        String[] expected = Constants.DEBT_EXPECTED;

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertTrue(actual[i].contains(expected[i]),
                    "Поле " + (i + 1) + ": ожидалось '" + expected[i] + "', получено '" + actual[i] + "'");
        }
    }

    @Test
    @DisplayName("Проверка корректности отображения суммы (в том числе на кнопке), номера телефона")
    @Description("Тест проверяет, что на форме оплаты корректно отображается сумма (в том числе на кнопке), номер телефона")
    public void testPaymentFormDetailsDisplaying () {
        fillPaymentDetails();

        String actualSum = onlinePaymentPage.checksum();
        String actualSumButton = onlinePaymentPage.checkSumButton();
        String actualNumber = onlinePaymentPage.checkNumber();

        Assertions.assertEquals(Constants.SUM_EXPECTED, actualSum, "Сумма на форме оплаты не совпадает!");
        Assertions.assertEquals(Constants.SUM_ON_BUTTON_EXPECTED, actualSumButton, "Сумма на кнопке оплаты не совпадает!");
        Assertions.assertEquals(Constants.NUMBER_PHONE_EXPECTED, actualNumber, "Номер телефона на форме оплаты не совпадает!");
    }

    @Test
    @DisplayName("Проверка подписей полей в iframe формы оплаты")
    public void testFieldsIframe() {
        fillPaymentDetails();

        Assertions.assertEquals(Constants.CARD_NUMBER_EXPECTED, onlinePaymentPage.getFieldText("Номер карты"), "Неверная надпись у поля 'Номер карты'");
        Assertions.assertEquals(Constants.EXPIRY_DATE_EXPECTED, onlinePaymentPage.getFieldText("Срок действия"), "Неверная надпись у поля 'Срок действия'");
        Assertions.assertEquals(Constants.CVC_EXPECTED, onlinePaymentPage.getFieldText("CVC"), "Неверная надпись у поля 'CVC'");
        Assertions.assertEquals(Constants.NAME_EXPECTED, onlinePaymentPage.getFieldText("Имя и фамилия на карте"), "Неверная надпись у поля 'Имя держателя'");
    }

    @Test
    @DisplayName("Проверка отображения платежных логотипов и кнопок быстрых оплат")
    public void testLogos() {
        fillPaymentDetails();

        Assertions.assertTrue(onlinePaymentPage.isGooglePayButtonDisplayed(), "Кнопка Google Pay не отображена.");
        Assertions.assertTrue(onlinePaymentPage.isApplePayButtonDisplayed(), "Кнопка Apple Pay не отображена.");
        Assertions.assertTrue(onlinePaymentPage.isVisaLogoDisplayed(), "Логотип Visa не отображен.");
        Assertions.assertTrue(onlinePaymentPage.isMasterCardLogoDisplayed(), "Логотип MasterCard не отображен.");
        Assertions.assertTrue(onlinePaymentPage.isBelcardLogoDisplayed(), "Логотип Белкарт не отображен.");
        Assertions.assertTrue(onlinePaymentPage.isMirLogoDisplayed(), "Логотип Мир не отображен.");
    }

    private void fillPaymentDetails() {
        onlinePaymentPage.fillPhoneNumber(Constants.PHONE_NUMBER);
        onlinePaymentPage.fillEmail(Constants.EMAIL);
        onlinePaymentPage.fillSum(Constants.SUM);
        onlinePaymentPage.clickButtonContinue();
        onlinePaymentPage.switchToIframe();
    }
}