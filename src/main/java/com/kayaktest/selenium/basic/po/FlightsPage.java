package com.kayaktest.selenium.basic.po;

import com.kayaktest.selenium.basic.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlightsPage extends BasePage {

    protected FlightsPage(WebDriver webDriver) {
        super (webDriver);
    }

    @FindBy(how = How.XPATH, using = "//div[@class='zcIg']")
    private WebElement tripType;

    public void setTripType(String st) {

    }








}
