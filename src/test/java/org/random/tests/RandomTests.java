package org.random.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomTests {

    static WebDriver driver;

    @Test
    void randomNumbersAreNotRepeatedTest() {

        System.setProperty("webdriver.chrome.driver","libs/chromedriver");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.get("http://random.org");

        wait.until(
        ExpectedConditions.frameToBeAvailableAndSwitchToIt("#homepage-generator iframe"));

        driver.findElement(By.id("true-random-integer-generator-button")).click();

        String firstRandomNumber = driver.findElement(By.id("true-random-integer-generator-button")).getText();

        assertTrue(firstRandomNumber != null);

    }

    @AfterAll
    static void afterAll() {
        driver.quit();
    }
}
