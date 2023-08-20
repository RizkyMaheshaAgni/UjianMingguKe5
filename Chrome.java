package com.juaracoding.drivers.strategies;

import com.juaracoding.drivers.strategies.DriverStrategyImplementer;
import com.juaracoding.drivers.strategies.DriverStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Chrome implements DriverStrategy {
    @Override
    public WebDriver setStrategy() {
        String path = "D:\\MyTools\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver","C:\\MyTools\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--no-sandbox");
        return new ChromeDriver(options);
    }
}
