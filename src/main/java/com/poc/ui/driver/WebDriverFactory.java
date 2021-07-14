package com.poc.ui.driver;

import com.poc.ui.driver.core.ChromeDriverManager;
import com.poc.ui.driver.core.DriverManager;
import com.poc.ui.driver.core.FirefoxDriverManager;

public class WebDriverFactory {
    private WebDriverFactory() {
    }

    public static DriverManager getManager(DriverType type) {
        DriverManager manager;
        if (type == DriverType.FIREFOX) {
            manager = new FirefoxDriverManager();
        } else {
            manager = new ChromeDriverManager();
        }
        return manager;
    }
}
