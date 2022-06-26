package com.admin.application.AdminPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class DriverConfig {

    @Bean
    public WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--window-size=1920,1200");
//        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
//        WebDriverManager.edgedriver().setup();
//        return new ChromeDriver();
        WebDriver w = new ChromeDriver(options);
        return w;

    }
}

