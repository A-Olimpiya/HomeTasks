package ru.aston.lesson2_10.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.aston.lesson2_10.driver.Locators;

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
            WebElement CookiesButton = waitForElementToBeClickable(By.xpath(Locators.BUTTON_PRINYT_XPATH));
            if (CookiesButton.isDisplayed()) {
                CookiesButton.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Кнопка для принятия куки не найдена. Продолжаем выполнение теста.");
        } catch (TimeoutException e) {
            System.out.println("Время ожидания для кнопки принятия куки истекло. Продолжаем выполнение теста.");
        }
    }

    public void fillPhoneNumber(String number) {
        WebElement phoneNumber = waitForElementToBeClickable(By.xpath(Locators.PHONE_NUMBER_XPATH));
        phoneNumber.sendKeys(number);
    }

    public void fillSum(String sum) {
        WebElement sumElement = waitForElementVisibility(By.xpath(Locators.SUM_XPATH));
        sumElement.sendKeys(sum);
    }

    public void fillEmail(String email) {
        WebElement inputEmail = waitForElementVisibility(By.xpath(Locators.EMAIL_XPATH));
        inputEmail.sendKeys(email);
    }

    public void clickButtonContinue() {
        WebElement continueButton = waitForElementToBeClickable(By.xpath(Locators.BUTTON_CONTINUE_XPATH));
        continueButton.click();
    }

    public void switchToIframe() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locators.IFRAME_XPATH)));
        driver.switchTo().frame(driver.findElement(By.xpath(Locators.IFRAME_XPATH)));
    }

    public void selectServiceOption(String optionText) {
        waitForElementToBeClickable(By.xpath(Locators.SERVICE_OPTION_XPATH)).click();
        waitForElementToBeClickable(By.xpath("//p[text()='" + optionText + "']")).click();
    }

    public String[] getPlaceholders(String optionName, By[] fieldLocators) {
        selectServiceOption(optionName);

        String[] placeholders = new String[fieldLocators.length];
        for (int i = 0; i < fieldLocators.length; i++) {
            placeholders[i] = getPlaceholderText(fieldLocators[i]);
        }
        return placeholders;
    }

    public String getPlaceholderText(By by) {
        return waitForElementVisibility(by).getAttribute("placeholder");
    }

    public String checksum() {
        WebElement sumElement = waitForElementVisibility(By.xpath(Locators.SUM_DISPLAY_XPATH));
        return sumElement.getText();
    }

    public String checkSumButton() {
        WebElement sumButtonElement = waitForElementVisibility(By.xpath(Locators.SUM_BUTTON_XPATH));
        return sumButtonElement.getText();
    }

    public String checkNumber() {
        WebElement numberElement = waitForElementVisibility(By.cssSelector(Locators.NUMBER_DISPLAY_CSS));
        return numberElement.getText();
    }

    public boolean isGooglePayButtonDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Locators.GOOGLE_BUTTON_ID))).isDisplayed();
    }

    public boolean isApplePayButtonDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Locators.APPLE_PAY_BUTTON_ID))).isDisplayed();
    }

    public boolean isVisaLogoDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locators.VISA_LOGO_XPATH))).isDisplayed();
    }

    public boolean isMasterCardLogoDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locators.MASTERCARD_LOGO_XPATH))).isDisplayed();
    }

    public boolean isBelcardLogoDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locators.BELCARD_LOGO_XPATH))).isDisplayed();
    }

    public boolean isMirLogoDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locators.MIR_LOGO_XPATH))).isDisplayed();
    }

    public String getFieldText(String fieldName) {
        String xpath = String.format("//label[text()='%s']", fieldName);
        return waitForElementVisibility(By.xpath(xpath)).getText();
    }
}