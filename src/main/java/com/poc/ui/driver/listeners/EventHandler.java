//package com.poc.ui.driver.listeners;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.events.WebDriverEventListener;
//
//import java.util.logging.Logger;
//
//public class EventHandler implements WebDriverEventListener {
//    private static final Logger logger = Logger.getLogger(EventHandler.class.getName());
//
//    @Override
//    public void beforeAlertAccept(WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void afterAlertAccept(WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void afterAlertDismiss(WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void beforeAlertDismiss(WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void beforeNavigateTo(String s, WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void afterNavigateTo(String s, WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void beforeNavigateBack(WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void afterNavigateBack(WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void beforeNavigateForward(WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void afterNavigateForward(WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void beforeNavigateRefresh(WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void afterNavigateRefresh(WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void beforeScript(String s, WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void afterScript(String s, WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void beforeSwitchToWindow(String s, WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void afterSwitchToWindow(String s, WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void onException(Throwable throwable, WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void beforeGetText(WebElement webElement, WebDriver webDriver) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//
//    @Override
//    public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        logger.info("I'm in: " + methodName);
//    }
//}
