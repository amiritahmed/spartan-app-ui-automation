package com.devopinc.utils;

import com.github.javafaker.Faker;
import org.junit.Assert;

public class BrowserUtils {

    public String phoneNumber = "";

    public static void verifyTitle(String expectedTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    public void phoneNumber(){
        Faker faker = new Faker();
        Long longNumber = faker.number().numberBetween(1000000000, 9999999999L);
        phoneNumber = String.valueOf(longNumber);

    }

    public static void sleep(int second){
        second *= 1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }



}
