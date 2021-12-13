package com.kayaktest.selenium;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.kayaktest.selenium.basic.BasePage;
import com.kayaktest.selenium.basic.config.PropertyKeys;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageProject extends BasePage {
    private PropertyKeys prop = new PropertyKeys ();

    private static final Logger log = LoggerFactory.getLogger(PageProject.class.getName());
    private WebDriver driver;

    protected PageProject(WebDriver webDriver) {
        super (webDriver);
    }

    @Test
    public void testProject01() {
        String url = prop.getApplicationUrl ();
        driver.get (url);
        Assert.assertTrue (true);
        Shutterbug.shootPage(driver, Capture.FULL_SCROLL).save();
    }
}
