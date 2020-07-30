package com.Bitrix24.step_definitions;

import com.Bitrix24.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks
{

    @After
    public void tearDownScenario(Scenario scenario){

        // #1 we need to take a screen shot using SELENIUM
        // getScreenshotAs: to be able to use this method we need to cast our driver type to TakesScreenchot

        //#2 we are going to attach it intro our report: using attach method
        //attach method accepts 3 arguments. #1: Screenshot itself #2: image type #3: current scenario's name

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

            // I added this line just only for practice. Serhat, can you check it? Are you gonna create happy hours this Sunday?
        }
    }
}
