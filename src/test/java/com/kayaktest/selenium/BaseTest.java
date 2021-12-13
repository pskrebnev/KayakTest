package com.kayaktest.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    private WebDriver driver;
    private static final Logger log = LoggerFactory.getLogger (PageProject.class.getName ());

    @BeforeClass
    public void before() {
        WebDriverManager.chromedriver ().setup ();
        ChromeOptions options = new ChromeOptions ();
        options.setHeadless (false);
        driver = new ChromeDriver (options);
        driver.manage ().window ().maximize ();

//        WebDriverManager.edgedriver ().setup ();
//        EdgeOptions options = new EdgeOptions ();
//        options.setHeadless (false);
//        driver = new EdgeDriver (options);

        log.info ("Driver has been initialized");
    }

    @AfterClass
    public void tierDown() {
        driver.quit ();
    }
}
