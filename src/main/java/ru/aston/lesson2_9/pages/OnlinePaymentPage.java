package ru.aston.lesson2_9.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.aston.lesson2_9.driver.Constants;

import java.util.NoSuchElementException;

public class OnlinePaymentPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public OnlinePaymentPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement waitForElementVisibility(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    private WebElement waitForElementToBeClickable(By by) {
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void acceptCookies() {
        try {
            WebElement CookiesButton = waitForElementToBeClickable(By.xpath(Constants.BUTTON_PRINYT_XPATH));
            if (CookiesButton.isDisplayed()) {
                CookiesButton.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Кнопка для принятия куки не найдена. Продолжаем выполнение теста.");
        } catch (TimeoutException e) {
            System.out.println("Время ожидания для кнопки принятия куки истекло. Продолжаем выполнение теста.");
        }
    }

    public void clickOnButton() {
        WebElement button = waitForElementVisibility(By.xpath(Constants.BUTTON_PODROBNEE_XPATH));
        button.click();
    }

    public String getNameTitle() {
        WebElement nameTitle = waitForElementVisibility(By.xpath(Constants.NAME_TITLE_XPATH));
        return nameTitle.getText().replaceAll("\\s+", " ").trim();
    }

    public boolean isLogosDisplay(String logoName) {
        try {
            return driver.findElement(By.xpath("//img[@alt='" + logoName + "']")).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void fillPhoneNumber(String number) {
        WebElement phoneNumber = waitForElementToBeClickable(By.xpath(Constants.PHONE_NUMBER_XPATH));
        phoneNumber.sendKeys(number);
    }

    public void fillSum(String sum) {
        WebElement sumElement = waitForElementVisibility(By.xpath(Constants.SUM_XPATH));
        sumElement.sendKeys(sum);
    }

    public void fillEmail(String email) {
        WebElement inputEmail = waitForElementVisibility(By.xpath(Constants.EMAIL_XPATH));
        inputEmail.sendKeys(email);
    }

    public void clickButtonContinue() {
        WebElement continueButton = waitForElementToBeClickable(By.xpath(Constants.BUTTON_CONTINUE_XPATH));
        continueButton.click();
    }

    public boolean isPaymentWidgetDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constants.IFRAME_XPATH))).isDisplayed();
    }
}




