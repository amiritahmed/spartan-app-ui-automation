package com.devopinc.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeDriver {
    public static void main(String[] args) {

        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\am208\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64.chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");


    }
}
