package com.poc.ui.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage extends BaseTest {
    @Test
    public void verify_that_all_page_elements_are_present() {
        getDriver().get("https://guest.dev.app.hd.digital/login");
        //Checks if App Title is present
        Assert.assertTrue(getDriver().findElement(By.id("Ebene_1")).isDisplayed());
        //Checks if Page Title is present
//        Assert.assertTrue(getDriver().findElement(By.cssSelector("div > app-login > div > h1")).isDisplayed());

        boolean pageTitle = getDriver().findElement(By.cssSelector("div > app-login > div > h1")).isDisplayed();
        Assert.assertTrue(pageTitle, "Page Title not found");

//        //Checks if Email field is present
//        Assert.assertTrue(getDriver().findElement(By.id("mat-input-0")).isDisplayed(), "");
//        //Checks is Password field is present
//        Assert.assertTrue(getDriver().findElement(By.id("mat-input-1")).isDisplayed());
//        //Checks if the View password button is present
//        Assert.assertTrue(getDriver().findElement(By.cssSelector("div > span.floating-icon.material-icons")).isDisplayed());
//        //Checks if the Forgot password page link is present
//        Assert.assertTrue(getDriver().findElement(By.linkText("Forgot Your Password?")).isDisplayed());
//        //Checks if the Sign In button is present
//        Assert.assertTrue(getDriver().findElement(By.cssSelector("app-login > div > form > button")).isDisplayed());
//        //Checks if the "New Customer?" text is present
//        Assert.assertTrue(getDriver().findElement(By.xpath("//div[text()[contains(.,'New Customer?')]]")).isDisplayed());
//        //Checks if the CREATE AN ACCOUNT link is present
//        Assert.assertTrue(getDriver().findElement(By.cssSelector("app-login > div > div > a")).isDisplayed());
//        //Checks if the Privacy page's link is present
//        Assert.assertTrue(getDriver().findElement(By.cssSelector("app-footer-links > div > div > a:nth-child(1)")).isDisplayed());
//        //Checks if the Imprint page's link is present
//        Assert.assertTrue(getDriver().findElement(By.cssSelector("app-footer-links > div > div > a:nth-child(2)")).isDisplayed());
//        //Checks if the Terms & Conditions page's link is present
//        Assert.assertTrue(getDriver().findElement(By.cssSelector("app-footer-links > div > div > a:nth-child(3)")).isDisplayed());
//        //Checks if Contact Us page's link is present
//        Assert.assertTrue(getDriver().findElement(By.cssSelector("app-footer-links > div > div > a:nth-child(4)")).isDisplayed());
//        //Checks if the Language select dropdown is present
//        Assert.assertTrue(getDriver().findElement(By.cssSelector("app-language-selection > div > div > button > span")).isDisplayed());
//    }

//    @Test
//    public void login_works(){
//        getDriver().get("https://guest.dev.app.hd.digital/login");
//        getDriver().findElement(By.id("mat-input-0")).sendKeys("");
//        getDriver().findElement(By.id("mat-input-1"));
//    }
    }
}
