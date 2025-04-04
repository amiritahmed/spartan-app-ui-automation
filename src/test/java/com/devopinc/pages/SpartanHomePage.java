package com.devopinc.pages;

import com.devopinc.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpartanHomePage {

    public SpartanHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[text()='Add Spartan']")
    private WebElement addSpartan;

    public void addSpartan(){
        addSpartan.click();
    }


}
