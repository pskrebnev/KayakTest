package com.kayaktest.selenium;

import com.kayaktest.selenium.basic.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AnotherPage extends BasePage {

    protected AnotherPage(WebDriver webDriver) {
        super (webDriver);
    }

    @Test(groups = "Integration")
    public void testMe() {
        System.out.println ("Run test 'Another Test'");
    }
}
