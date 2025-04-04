package com.devopinc.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    private Driver(){
    }

    private static WebDriver driver;

    public  static WebDriver getDriver(){

        if(driver == null){
            String browser  = ConfigurationReader.getProperty("browser");

            switch(browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "chrome-remote":
                    try{
                        //To request grid to run test on chrome
                        ChromeOptions chromeOptions = new ChromeOptions();
                        URL url = new URL("http://54.146.79.189:4444/wd/hub");  //http://18.206.13.27:4444/wd/hub
                        driver = new RemoteWebDriver(url, chromeOptions);

                    }catch (MalformedURLException e){
                        e.printStackTrace();
                    }
                    break;

                case "firefox-remote":

                    try{
                        //To request grid to run test on firefox
                        FirefoxOptions firefoxOptions = new FirefoxOptions();
                        URL url = new URL("http://54.146.79.189:4444/wd/hub ");
                        driver = new RemoteWebDriver(url, firefoxOptions);

                    }catch(MalformedURLException e){
                        e.printStackTrace();
                    }

                    break;

                default:
                    throw new RuntimeException("Wrong browser " + browser);
            }

        }

        return driver;
    }

    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver=null;
        }
    }



}
