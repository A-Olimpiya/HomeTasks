package ru.aston.lesson2_9;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.aston.lesson2_9.driver.Constants;
import ru.aston.lesson2_9.driver.Driver;
import ru.aston.lesson2_9.pages.OnlinePaymentPage;

import java.time.Duration;

public class BaseTest {
    protected OnlinePaymentPage onlinePaymentPage;
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeEach
    public void startFromHome() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(Constants.BASE_URL);
        onlinePaymentPage = new OnlinePaymentPage(driver, wait);
        onlinePaymentPage.acceptCookies();
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}