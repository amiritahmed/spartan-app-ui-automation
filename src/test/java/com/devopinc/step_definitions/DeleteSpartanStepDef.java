package com.devopinc.step_definitions;

import com.devopinc.pages.WebDataPage;
import com.devopinc.utils.BrowserUtils;
import com.devopinc.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DeleteSpartanStepDef {

    WebDataPage webDataPage = new WebDataPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    List<WebElement> elements;
    BrowserUtils browserUtils = new BrowserUtils();

    @When("user clicks on Web Data link text")
    public void user_clicks_on_web_data_link_text() {
        webDataPage.webData.click();
    }

    @Then("Verify user is on Spartan List page")
    public void verify_user_is_on_Spartan_List_page() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "http://3.147.55.173:8000/web/v2/spartans";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @And("User clicks on the first spartan delete icon")
    public void user_clicks_on_the_first_spartan_delete_icon() {

        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//tbody/tr/td"));

        String firstSpartanPhoneNumber = elements.get(2).getText();
        System.out.println("firstSpartanPhoneNumber before deletion = " + firstSpartanPhoneNumber);
        BrowserUtils.sleep(5);
        webDataPage.deleteFirstSpartan.click();
        System.out.println("firstSpartanPhoneNumber after deletion = " + firstSpartanPhoneNumber);




        for(int i = elements.size()-1; i > 0; i--) {
            String str = elements.get(elements.size()-6).getText();
            if(str.equals("Amir")){
                System.out.println("str = " + str);
                //webDataPage.deleteFirstSpartan.click();
                break;
            }
        }
    }

//    @Then("Verify user deletes the first spartan from the list successfully")
//    public void verify_user_deletes_the_first_spartan_from_the_list_successfully() {
//    }

}

