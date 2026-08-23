package ru.aston.lesson2_9;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.aston.lesson2_9.driver.Constants;

public class MtsTests extends BaseTest {

    @Test
    @DisplayName("Проверка работы ссылки 'Подробнее о сервисе'")
    @Description("Тест проверяет, что ссылка 'Подробнее о сервисе' ведет на ожидаемую страницу.")
    public void testLink() {
        onlinePaymentPage.clickOnButton();
        wait.until(ExpectedConditions.urlContains(Constants.URL_PODROBNEE));
        Assertions.assertTrue(driver.getCurrentUrl().contains(Constants.URL_PODROBNEE));
    }

    @Test
    @DisplayName("Проверка названия блока «Онлайн пополнение без комиссии»")
    @Description("Тест проверяет, что фактические название блока соответсует ожидаемому")
    public void testNameBlock() {
        Assertions.assertTrue(onlinePaymentPage.getNameTitle().contains(Constants.NAME_TITLE_EXPECTED), "Текст заголовка не совпадает");
    }

    @Test
    @DisplayName("Проверка конкретного логотипа платёжных систем;")
    @Description("Тест проверяет наличие логотипа на странице")
    public void testLogo() {
        Assertions.assertTrue(onlinePaymentPage.isLogosDisplay(Constants.LOGO_BELKART),
                "Логотип '" + Constants.LOGO_BELKART + "' не отображается на странице");
        Assertions.assertTrue(onlinePaymentPage.isLogosDisplay(Constants.LOGO_MASTERCARD),
                "Логотип '" + Constants.LOGO_MASTERCARD + "' не отображается на странице");
        Assertions.assertTrue(onlinePaymentPage.isLogosDisplay(Constants.LOGO_VISA),
                "Логотип '" + Constants.LOGO_VISA + "' не отображается на странице");
        Assertions.assertTrue(onlinePaymentPage.isLogosDisplay(Constants.LOGO_MASTERCARD_SECURE),
                "Логотип '" + Constants.LOGO_MASTERCARD_SECURE + "' не отображается на странице");
        Assertions.assertTrue(onlinePaymentPage.isLogosDisplay(Constants.LOGO_VERIFIED_BY_VISA),
                "Логотип '" + Constants.LOGO_VERIFIED_BY_VISA + "' не отображается на странице");
    }

    @Test
    @DisplayName("Проверка работы кнопки Продолжить, если заполнены все поля")
    @Description("Тест проверяет, что при заполнении всех полей кнопка 'Продолжить' работает корректно")
    public void testButtonContinue() {
        onlinePaymentPage.fillPhoneNumber(Constants.PHONE_NUMBER);
        onlinePaymentPage.fillEmail(Constants.EMAIL);
        onlinePaymentPage.fillSum(Constants.SUM);
        onlinePaymentPage.clickButtonContinue();
        Assertions.assertTrue(onlinePaymentPage.isPaymentWidgetDisplayed(), "Модальное окно не отображается.");
    }
}
