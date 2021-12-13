package com.kayaktest.selenium;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.kayaktest.selenium.basic.BaseTest;
import com.kayaktest.selenium.basic.config.PropertyKeys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestProject extends BaseTest {
    private PropertyKeys prop = new PropertyKeys ();

    private static final Logger log = LoggerFactory.getLogger(TestProject.class.getName());

    @Test
    public void testProject01() {
        String url = prop.getApplicationUrl ();
        driver.get (url);
        Assert.assertTrue (true);
        Shutterbug.shootPage(driver, Capture.FULL_SCROLL).save();
    }
}
