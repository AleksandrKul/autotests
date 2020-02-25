package org.random.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomTests {

    @Test
    void randomNumbersAreNotRepeatedTest() {

        System.setProperty("webdriver.chrome.driver","libs/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://random.org");

        driver.findElement(By.id("true-random-integer-generator-button")).click();

        String firstRandomNumber = driver.findElement(By.id("true-random-integer-generator-button")).getText();

        assertTrue(firstRandomNumber != null);

    }

}
