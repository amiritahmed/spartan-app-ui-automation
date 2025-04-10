package com.devopinc.pages;

import com.devopinc.utils.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class AddSpartanPage {

    public AddSpartanPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input#name")
    public WebElement nameInputBox;

    public void inputName(){
        Faker faker = new Faker();
        String name = faker.name().firstName();
        nameInputBox.sendKeys(name);
    }

    @FindBy(css = "select#genderSelect")
    public WebElement genderInputBox;

    public void selectGender(){
        Select select = new Select(genderInputBox);
        int n = new Random().nextInt(2);
        String gen = (n==1)? "MALE" : "FEMALE";
        select.selectByValue(gen);

    }

    @FindBy(css = "input#phone")
    public WebElement phoneInputBox;


    @FindBy(xpath = "//button[text()='Save']")
    private WebElement saveButton;

    public void clickSaveButton(){
        saveButton.click();
    }

    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement spartanList;











}
