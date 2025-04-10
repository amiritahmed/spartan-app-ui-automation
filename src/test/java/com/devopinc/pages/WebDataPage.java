package com.devopinc.pages;

import com.devopinc.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebDataPage {

    public WebDataPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Web Data")
    public WebElement webData;

//    public void click_on_web_data(){
//        webData.click();
//    }

    @FindBy(xpath = "//i[@class='fas fa-user-times ml-2']")
    public WebElement deleteFirstSpartan;

    @FindBy(xpath = "//tbody/tr/td[3]")
    public WebElement phoneFirstSpartan;

}
