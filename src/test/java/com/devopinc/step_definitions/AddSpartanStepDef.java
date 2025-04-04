package com.devopinc.step_definitions;

import com.devopinc.pages.AddSpartanPage;
import com.devopinc.utils.BrowserUtils;
import com.devopinc.utils.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AddSpartanStepDef {

    AddSpartanPage addSpartanPage = new AddSpartanPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    Faker faker = new Faker();
    String phoneNumber;

    @Given("user enters a valid name")
    public void user_enters_a_valid_name() {
        addSpartanPage.inputName();
    }

    @When("user selects male for gender")
    public void user_selects_male_for_gender() {
        addSpartanPage.selectGender();
    }

    @And("user enters a valid phone number")
    public void user_enters_a_valid_phone_number() {
        Long number = faker.number().numberBetween(1000000000, 9999999999L);
        phoneNumber = String.valueOf(number);
        //phoneNumber = number.toString();
        addSpartanPage.inputPhoneNumber(phoneNumber);
    }

    @And("user clicks on the save button")
    public void user_clicks_on_the_save_button() {
        addSpartanPage.clickSaveButton();
    }

    /*
     TODO:
      Spartan list contains the latest added spartan
     */
    @Then("verify user added a spartan to the list successfully")
    public void verify_user_added_a_spartan_to_the_list_successfully() {
        wait.until(ExpectedConditions.visibilityOf(addSpartanPage.spartanList));
        BrowserUtils.verifyTitle("All Spartan");

        //Assert.assertTrue(phoneNumber.describeConstable().isPresent());
        // assert list contains latest partan
    }


}
