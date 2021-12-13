package com.kayaktest.selenium.basic.config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyKeys {

    private Properties properties;
    private final String browserPropertyFilePath = "src/test/resources/browser.properties";

    public PropertyKeys(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader (browserPropertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("File browser.properties is not found at "
                    + browserPropertyFilePath);
        }
    }

    public String getApplicationUrl() {
        String url = properties.getProperty("base.url");
        if(url != null) return url;
        else throw new RuntimeException("url is not specified");
    }
}
