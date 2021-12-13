package com.kayaktest.selenium.basic;

import com.kayaktest.selenium.basic.config.PropertyKeys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class BasePage {
    private static final Logger log = LoggerFactory.getLogger (BasePage.class);
    private final WebDriverWait driverWait;

    protected BasePage(WebDriver webDriver) {
        PropertyKeys prop = new PropertyKeys ();
        this.driverWait = new WebDriverWait (webDriver, Duration.ofSeconds (prop.getBrowserWait ()));
        waitForJsLoad ();
        PageFactory.initElements (webDriver, this);
    }

    private void waitForJsLoad() {
        ExpectedCondition<Boolean> pageLoad = driver -> ((JavascriptExecutor) driver)
                        .executeScript ("return document.readyState").equals ("complete");
        driverWait.until (pageLoad);
    }
}
