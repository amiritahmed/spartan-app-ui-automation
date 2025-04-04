package com.devopinc.step_definitions;

import com.devopinc.pages.SpartanHomePage;
import com.devopinc.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandOnAddSpartanStepDef {

    SpartanHomePage spartanHomePage = new SpartanHomePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Given("User is on Spartan home page")
    public void user_is_on_spartan_home_page() {
        Driver.getDriver().get("http://3.147.55.173:8000/");
        Driver.getDriver().manage().window().maximize();
        String actualHomeTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Spartan Home", actualHomeTitle);
    }

    @When("User clicks on Add Spartan linkText")
    public void user_clicks_on_add_spartan_linkText() {
        spartanHomePage.addSpartan.click();
    }

    @Then("Verify the user is on Add Spartan page")
    public void verify_the_user_is_on_add_spartan_page() {
        String actualTitle = Driver.getDriver().getTitle();
        wait.until(ExpectedConditions.titleIs(actualTitle));
        String expectedTitle = "Add New Spartan";
        Assert.assertEquals(expectedTitle, actualTitle);
    }


}
