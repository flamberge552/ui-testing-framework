package com.poc.ui.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class SeleniumUtils {
    private static final int TIMEOUT_IN_SECONDS = 10;

    private SeleniumUtils() {
    }

    public static void waitForElementToLoad(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT_IN_SECONDS);
        wait.until(drv -> drv.findElement(locator));
    }

    public static void waitForPageLoadComplete(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT_IN_SECONDS);
        wait.until(drv -> ((JavascriptExecutor) drv).executeScript("return document.readyState").equals("complete"));
    }

    public static String returnMethodName() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste[ste.length - (ste.length - 3)].getMethodName();
    }

    public static String returnPackageName(Object object) {
        return object.getClass().getPackage().toString().replaceFirst(".*\\.", "");
    }

    // returns a random string of alphanumeric characters of a given char size
    public static String getAlphaNumericString(int n) {
        String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = (alphaNumericString.length() * new Random().nextInt());
            sb.append(alphaNumericString.charAt(index));
        }
        return sb.toString();
    }
}