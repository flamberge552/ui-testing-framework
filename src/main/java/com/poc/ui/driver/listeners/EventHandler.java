package com.poc.ui.driver.listeners;

import org.openqa.selenium.*;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.util.logging.Logger;

public class EventHandler implements WebDriverEventListener {
    private static final Logger logger = Logger.getLogger(EventHandler.class.getName());
    private WebDriver driver;

    public EventHandler(WebDriver driver) {
        this.driver = driver;
    }

    private void waitForAngular() {
        waitForAngular(1, "body");
    }

    private void waitForAngular(int runTimes, String rootSelector) {
        //TODO use/attach it in the window object
        //check what does waitSec do actually, the timeout is not specified in the JS script at all, argument 1 is used as sb
//        String sb = "var waitforLoad=function(n,rootSelector,callback){if(isLoadingDing()&&n>0){setTimeout(function(){waitforLoad(n-1,rootSelector,callback)},1000)}else{if(window.angular){var el=document.querySelector(rootSelector);if(window.getAngularTestability){window.getAngularTestability(el).whenStable(callback);return}if(angular.getTestability){angular.getTestability(el).whenStable(callback)}else{if(!angular.element(el).injector()){throw new Error(\"root!ng-app.\")}angular.element(el).injector().get(\"$browser\").notifyWhenNoOutstandingRequests(callback)}}else{if(n<1){callback(\"!window.angular.\")}else{setTimeout(function(){waitforLoad(n-1,rootSelector,callback)},1000)}}}};var isLoadingDing=function(){var ele=document.querySelectorAll(\".loading\");i=0;for(;i<ele.length;i++){if(isVisable(ele[i])){return!0}}var ele=document.querySelector(\"body div.ng-isolate-scope.prevent-scroll-layer\");return isVisable(ele)};var isVisable=function(elem){if (elem==null) return false; return!!(elem.offsetWidth||elem.offsetHeight||elem.getClientRects().length)}";
//        sb = sb + ";waitforLoad(arguments[0],arguments[1],arguments[arguments.length-1]);";
//        ((JavascriptExecutor) driver).executeAsyncScript(sb, runTimes, rootSelector);
    }

    @Override
    public void beforeAlertAccept(WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        waitForAngular();
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        waitForAngular();
    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void beforeSwitchToWindow(String s, WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void afterSwitchToWindow(String s, WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {
        waitForAngular();
    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {
        waitForAngular();
    }

    @Override
    public void beforeGetText(WebElement webElement, WebDriver webDriver) {
        waitForAngular();
    }

    @Override
    public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {
        waitForAngular();
    }
}
