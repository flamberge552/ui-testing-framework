package com.poc.ui.tests;

import com.poc.ui.driver.listeners.PriorityInterceptor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

@Listeners(PriorityInterceptor.class)
public class LoginPage extends BaseTest {
    @Test
    public void verify_that_all_page_elements_are_present() {
        getDriver().get("https://guest.dev.app.hd.digital/login");
        //Checks if App Title is present
        Assert.assertTrue(getDriver().findElement(By.id("Ebene_1")).isDisplayed());
        //Checks if Page Title is present
        Assert.assertTrue(getDriver().findElement(By.cssSelector("div > app-login > div > h1")).isDisplayed());
        //Checks if Email field is present
        Assert.assertTrue(getDriver().findElement(By.id("mat-input-0")).isDisplayed());
        //Checks is Password field is present
        Assert.assertTrue(getDriver().findElement(By.id("mat-input-1")).isDisplayed());
        //Checks if the View password button is present
        Assert.assertTrue(getDriver().findElement(By.cssSelector("div > span.floating-icon.material-icons")).isDisplayed());
        //Checks if the Forgot password page link is present
        Assert.assertTrue(getDriver().findElement(By.linkText("Forgot Your Password?")).isDisplayed());
        //Checks if the Sign In button is present
        Assert.assertTrue(getDriver().findElement(By.cssSelector("app-login > div > form > button")).isDisplayed());
        //Checks if the "New Customer?" text is present
        Assert.assertTrue(getDriver().findElement(By.xpath("//div[text()[contains(.,'New Customer?')]]")).isDisplayed());
        //Checks if the CREATE AN ACCOUNT link is present
        Assert.assertTrue(getDriver().findElement(By.cssSelector("app-login > div > div > a")).isDisplayed());
        //Checks if the Privacy page's link is present
        Assert.assertTrue(getDriver().findElement(By.cssSelector("app-footer-links > div > div > a:nth-child(1)")).isDisplayed());
        //Checks if the Imprint page's link is present
        Assert.assertTrue(getDriver().findElement(By.cssSelector("app-footer-links > div > div > a:nth-child(2)")).isDisplayed());
        //Checks if the Terms & Conditions page's link is present
        Assert.assertTrue(getDriver().findElement(By.cssSelector("app-footer-links > div > div > a:nth-child(3)")).isDisplayed());
        //Checks if Contact Us page's link is present
        Assert.assertTrue(getDriver().findElement(By.cssSelector("app-footer-links > div > div > a:nth-child(4)")).isDisplayed());
        //Checks if the Language select dropdown is present
        Assert.assertTrue(getDriver().findElement(By.cssSelector("app-language-selection > div > div > button > span")).isDisplayed());
    }

    @Test
    public void login_works(){
        getDriver().get("https://guest.dev.app.hd.digital/login");
        getDriver().findElement(By.id("mat-input-0")).sendKeys("utestcasn@gmail.com");
        getDriver().findElement(By.id("mat-input-1")).sendKeys("Test12345!");
        getDriver().findElement(By.cssSelector("app-login > div > form > button")).click();

        Assert.assertTrue(getDriver().findElement(By.xpath("//app-business-details/div/div/h1[text()[contains(.,'BUSINESS DETAILS')]]")).isDisplayed());
    }

    @Test
    public void error_displayed_if_email_invalid(){
        getDriver().get("https://guest.dev.app.hd.digital/login");
        getDriver().findElement(By.id("mat-input-0")).sendKeys("utestcasn@");
        getDriver().findElement(By.id("mat-input-1")).sendKeys("Test12345!");
        getDriver().findElement(By.cssSelector("app-login > div > form > button")).click();

        Assert.assertTrue(getDriver().findElement(By.cssSelector("notifier-notification")).isDisplayed());
    }

    @Test
    public void error_displayed_if_password_incorrect(){
        getDriver().get("https://guest.dev.app.hd.digital/login");
        getDriver().findElement(By.id("mat-input-0")).sendKeys("utestcasn@gmail.com");
        getDriver().findElement(By.id("mat-input-1")).sendKeys("Test345!");
        getDriver().findElement(By.cssSelector("app-login > div > form > button")).click();

        Assert.assertTrue(getDriver().findElement(By.cssSelector("notifier-notification")).isDisplayed());
    }

    @Test
    public void sign_in_empty_fields(){
        getDriver().get("https://guest.dev.app.hd.digital/login");
        getDriver().findElement(By.cssSelector("app-login > div > form > button")).click();

        Assert.assertTrue(getDriver().findElement(By.xpath("//div[contains(@class,'ng-tns-c52-1')]/input[contains(@class,'ng-invalid')]")).isDisplayed());
        Assert.assertTrue(getDriver().findElement(By.xpath("//div[contains(@class,'ng-tns-c52-2')]/input[contains(@class,'ng-invalid')]")).isDisplayed());
    }

    @Test
    public void view_password_button_works(){
        getDriver().get("https://guest.dev.app.hd.digital/login");
        getDriver().findElement(By.id("mat-input-1")).sendKeys("Test12345!");
        getDriver().findElement(By.cssSelector("div > span.floating-icon.material-icons")).click();

        Assert.assertTrue(getDriver().findElement(By.xpath("//div[contains(@class,'ng-tns-c52-2')]/input[@type='text']")).isDisplayed());

        getDriver().findElement(By.cssSelector("div > span.floating-icon.material-icons")).click();

        Assert.assertTrue(getDriver().findElement(By.xpath("//div[contains(@class,'ng-tns-c52-2')]/input[@type='password']")).isDisplayed());
    }

    @Test
    public void forgot_password_link_works(){
        getDriver().get("https://guest.dev.app.hd.digital/login");
        getDriver().findElement(By.linkText("Forgot Your Password?")).click();

        Assert.assertTrue(getDriver().findElement(By.xpath("//h1[text()[contains(.,'FORGOT PASSWORD')]]")).isDisplayed());
    }

    @Test
    public void sign_in_change_state_when_hovered(){
        getDriver().get("https://guest.dev.app.hd.digital/login");
//        getDriver().findElement(By.cssSelector("")).action.moveToElement(ele).perform();

        WebElement sign_in_btn = getDriver().findElement(By.xpath("/html/body/app-root/div/div/app-login/div/form/button"));

//Creating object of an Actions class
        Actions action = new Actions(getDriver());

//Performing the mouse hover action on the target element.
        action.moveToElement(sign_in_btn).perform();

        Assert.assertTrue(getDriver().findElement(By.cssSelector("app-login > div > form > button:hover")).isDisplayed());
    }

    @Test
    public void create_acc_link_works(){
        getDriver().get("https://guest.dev.app.hd.digital/login");
        getDriver().findElement(By.cssSelector("app-login > div > div > a")).click();

        Assert.assertTrue(getDriver().findElement(By.xpath("//h1[text()[contains(.,'Create your ')]]")).isDisplayed());
    }

    @Test
    public void privacy_link_works(){
        getDriver().get("https://guest.dev.app.hd.digital/login");
        getDriver().findElement(By.cssSelector("app-footer-links > div > div > a:nth-child(1)")).click();

        Assert.assertTrue(getDriver().findElement(By.xpath("//h1[text()[contains(.,'DIGITAL GMBH – DISH GUEST APP')]]")).isDisplayed());
    }

    @Test
    public void imprint_link_works(){
        getDriver().get("https://guest.dev.app.hd.digital/login");
        getDriver().findElement(By.cssSelector("app-footer-links > div > div > a:nth-child(2)")).click();

        Assert.assertTrue(getDriver().findElement(By.xpath("//h2[text()[contains(.,'Imprint')]]")).isDisplayed());
    }

    @Test
    public void terms_and_conditions_link_works(){
        getDriver().get("https://guest.dev.app.hd.digital/login");
        getDriver().findElement(By.cssSelector("app-footer-links > div > div > a:nth-child(3)")).click();

        Assert.assertTrue(getDriver().findElement(By.xpath("//h1[text()[contains(.,'DIGITAL GMBH – DISH GUEST APP')]]")).isDisplayed());
    }

    @Test
    public void contact_us_link_works(){
        getDriver().get("https://guest.dev.app.hd.digital/login");
        getDriver().findElement(By.cssSelector("app-footer-links > div > div > a:nth-child(4)")).click();

        Assert.assertTrue(getDriver().findElement(By.xpath("//h2[text()[contains(.,'CONTACT US!')]]")).isDisplayed());
    }

    @Test
    public void language_dropdown_works(){
        getDriver().get("https://guest.dev.app.hd.digital/login");
        getDriver().findElement(By.cssSelector("app-language-selection > div > div > button > span")).click();

        List<WebElement> languages = getDriver().findElements(By.cssSelector("#mat-menu-panel-0 > div > button"));

        Assert.assertEquals(languages.size(), 14, "amount of languages is incorrect");

        for (WebElement el : languages) {
            Assert.assertTrue(el.isDisplayed());
        }
    }
}

