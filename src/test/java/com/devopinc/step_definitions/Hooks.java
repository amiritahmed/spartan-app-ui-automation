package com.devopinc.step_definitions;


import com.devopinc.utils.BrowserUtils;
import com.devopinc.utils.ConfigurationReader;
import com.devopinc.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @Before(value = "@spartan")
    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("spartan.url"));
        Driver.getDriver().manage().window().maximize();
        //Driver.getDriver().navigate().refresh();
    }

    @After
    public void teardownMethod(Scenario scenario){
        BrowserUtils.sleep(2);
        byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
        Driver.closeDriver();
    }

}
