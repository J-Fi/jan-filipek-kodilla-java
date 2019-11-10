package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DAY = "//div[contains(@id, \"birthday_wrapper\")]/div/span/span/select[1]";
    public static final String XPATH_MONTH = "//div[contains(@id, \"birthday_wrapper\")]/div/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@id, \"birthday_wrapper\")]/div/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_DAY)).isDisplayed());

        WebElement selectCombo1 = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(selectCombo1);
        selectDay.selectByIndex(20);

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(selectCombo2);
        selectMonth.selectByIndex(1);

        WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(selectCombo3);
        selectYear.selectByValue("1973");
    }
}
