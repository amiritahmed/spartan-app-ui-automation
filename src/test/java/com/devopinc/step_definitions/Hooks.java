package com.devopinc.step_definitions;

import com.devopinc.utils.Driver;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
