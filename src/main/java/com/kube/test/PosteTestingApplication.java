package com.kube.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
class PosteTestingApplication {
    @Test
    void contextLoads() throws MalformedURLException {
        ChromeOptions c = new ChromeOptions();
        c.setCapability("platformName", "Linux");
        WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:62280"), c);
        driver.get("https://www.google.com/");
        driver.quit();
    }}