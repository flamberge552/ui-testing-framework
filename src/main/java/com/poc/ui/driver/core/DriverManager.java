package com.poc.ui.driver.core;

//import com.poc.ui.driver.listeners.EventHandler;
import com.poc.ui.utils.ReflectUtils;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public abstract class DriverManager {
    protected static ThreadLocal<EventFiringWebDriver> eDriver = new ThreadLocal<>();
//    EventHandler handler = new EventHandler();

    protected abstract void createDriver();

    public void quitDriver() {
        // should not keep this. no reason to destroy a WebDriver object
        // just because we finished a test
        //TODO use browser cache clearing methods instead, and rename method
        if (eDriver.get() != null) {
            eDriver.get().quit();
            eDriver.remove();
        }
    }

    public ThreadLocal<EventFiringWebDriver> getDriver() {
        if (eDriver.get() == null) {
            createDriver();
//            eDriver.get().register(handler);
        }
        return eDriver;
    }

    public void clearBrowser() {
        if (eDriver.get() != null)
            eDriver.get().manage().deleteAllCookies();
    }
}
