package com.devopinc.step_definitions;

import com.devopinc.pages.EditSpartanPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class UpdateSpartanStepDef {

    EditSpartanPage editSpartanPage = new EditSpartanPage();

    @Then("User clicks on the first spartan view icon")
    public void user_clicks_on_the_first_spartan_view_icon() {
        editSpartanPage.edit_spartan.click();
    }

    @Then("verify user lands on Spartan details screen")
    public void verify_user_lands_on_spartan_details_screen() {
        Assert.assertTrue(editSpartanPage.edit_spartan_title.isDisplayed());
    }
}
