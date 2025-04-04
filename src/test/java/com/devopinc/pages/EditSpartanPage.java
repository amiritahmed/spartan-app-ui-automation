package com.devopinc.pages;

import com.devopinc.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditSpartanPage {

    public EditSpartanPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//tbody//a[contains(@id, 'edit_spartan')]")
    public WebElement edit_spartan;

    @FindBy(xpath = "//div/h3")
    public WebElement edit_spartan_title;


}
