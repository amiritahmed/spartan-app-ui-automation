package com.devopinc.step_definitions;

import com.devopinc.pages.AddSpartanPage;
import com.devopinc.utils.BrowserUtils;
import com.devopinc.utils.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddSpartanStepDef {

    AddSpartanPage addSpartanPage = new AddSpartanPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    BrowserUtils browserUtils = new BrowserUtils();

    @Given("user enters a valid name")
    public void user_enters_a_valid_name() {
        wait.until(ExpectedConditions.titleIs("Add New Spartan"));
        //addSpartanPage.inputName();
        addSpartanPage.nameInputBox.sendKeys("Amir");
    }

    @When("user selects gender for gender")
    public void user_selects_gender_for_gender() {
        //addSpartanPage.selectGender();
        Faker faker = new Faker();
        String gender = faker.options().option("Male", "Female");
        addSpartanPage.genderInputBox.sendKeys(gender);
    }

    @When("user enters a valid phone number")
    public void user_enters_a_valid_phone_number() {
        //addSpartanPage.phoneInputBox.sendKeys(browserUtils.phoneNumber);
        addSpartanPage.phoneInputBox.sendKeys("4032648094");
    }

    @When("user clicks on the save button")
    public void user_clicks_on_the_save_button() {
        addSpartanPage.clickSaveButton();
    }

    @Then("verify user added a spartan to the list successfully")
    public void verify_user_added_a_spartan_to_the_list_successfully() {
        wait.until(ExpectedConditions.visibilityOf(addSpartanPage.spartanList));
        BrowserUtils.verifyTitle("All Spartan");
    }




}
