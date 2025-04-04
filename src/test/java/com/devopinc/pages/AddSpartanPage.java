package com.devopinc.pages;

import com.devopinc.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class AddSpartanPage {

    public AddSpartanPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input#name")
    private WebElement nameInputBox;

    public void inputName(){
//        Faker faker = new Faker();
//        String name = faker.name().firstName();
        nameInputBox.sendKeys("Amir");
    }

    @FindBy(css = "select#genderSelect")
    public WebElement genderInputBox;

    public void selectGender(){
        Select select = new Select(genderInputBox);
        select.selectByValue("MALE");
    }

    @FindBy(css = "input#phone")
    private WebElement phoneInputBox;

    public void inputPhoneNumber(String phoneNumber){
        phoneInputBox.sendKeys(phoneNumber);
    }

    @FindBy(xpath = "//button[text()='Save']")
    private WebElement saveButton;

    public void clickSaveButton(){
        saveButton.click();
    }

    @FindBy(xpath = "//a[@class='navbar-brand']/i[@class='fa fa-unlock']")
    public WebElement spartanList;











}
