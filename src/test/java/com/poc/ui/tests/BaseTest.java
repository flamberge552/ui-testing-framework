package com.poc.ui.tests;

import com.poc.ui.driver.DriverType;
import com.poc.ui.driver.WebDriverFactory;
import com.poc.ui.driver.core.DriverManager;
import com.poc.ui.utils.ReflectUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.*;

import java.sql.Time;
import java.time.Instant;
import java.util.logging.Logger;


public class BaseTest {
    protected DriverManager manager = WebDriverFactory.getManager(DriverType.CHROME);
    protected static ThreadLocal<EventFiringWebDriver> driver;

    @BeforeSuite
    public void setUp() {
        // could load environment stuff here
    }

    @BeforeMethod
    public void setUpMethod() {
        driver = manager.getDriver();
    }

    @AfterMethod
    public void tearDownMethod() {
        manager.quitDriver();
    }

    @AfterSuite
    public void tearDown() {
        // reporting should go here
    }

    protected WebDriver getDriver() {
        return driver.get();
    }
}
