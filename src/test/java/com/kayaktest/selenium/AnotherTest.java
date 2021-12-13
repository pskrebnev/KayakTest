package com.kayaktest.selenium;

import com.kayaktest.selenium.basic.BaseTest;
import org.testng.annotations.Test;

public class AnotherTest extends BaseTest {
    @Test(groups = "Integration")
    public void testMe() {
        System.out.println ("Run test 'Another Test'");
    }
}
