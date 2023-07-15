package org.example.utils;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiters {
    public static void waitForVisibility(WebElement element, long seconds) {
        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(seconds))
                .until(ExpectedConditions.visibilityOf(element));
    }

    public static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
