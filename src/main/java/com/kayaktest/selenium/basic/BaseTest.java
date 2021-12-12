package com.kayaktest.selenium.basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void before() {
        WebDriverManager.chromedriver ().setup ();
        ChromeOptions options = new ChromeOptions ();
        options.setHeadless (false);
        driver = new ChromeDriver(options);
        driver.manage ().window ().maximize ();

//        WebDriverManager.edgedriver ().setup ();
//        EdgeOptions options = new EdgeOptions ();
//        options.setHeadless (false);
//        driver = new EdgeDriver (options);
    }

    @AfterClass
    public void tierDown() {
        driver.quit ();
    }
}
