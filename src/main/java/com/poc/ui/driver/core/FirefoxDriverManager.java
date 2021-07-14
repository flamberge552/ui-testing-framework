package com.poc.ui.driver.core;

import com.poc.ui.utils.ReflectUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.net.URL;

public class FirefoxDriverManager extends DriverManager {
    @Override
    public void createDriver() {
        FirefoxOptions opts = new FirefoxOptions();
        try {
            WebDriver drv = new RemoteWebDriver(new URL("http://192.168.56.101:4444/wd/hub"), opts);
            EventFiringWebDriver eDrv = new EventFiringWebDriver(drv);
            eDriver.set(eDrv);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
