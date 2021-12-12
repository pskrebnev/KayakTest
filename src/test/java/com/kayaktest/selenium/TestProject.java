package com.kayaktest.selenium;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.kayaktest.selenium.basic.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestProject extends BaseTest {

    private static final Logger logger = Logger.getLogger(TestProject.class.getName());

    @Test
    public void testProject01() {
        driver.get ("https://google.com");
        logger.log (Level.INFO, "test me!!!");
        Assert.assertTrue (true);
        Shutterbug.shootPage(driver, Capture.FULL_SCROLL).save();
    }
}
