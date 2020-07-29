package com.Bitrix24.step_definitions;

import com.Bitrix24.pages.BitrixLoginPage;
import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Serhat_CreatingPoll_UserStory4StepDefinitions
{
    //Create the object of BitrixLoginPage to access the WebElements (POM) S
    BitrixLoginPage bitrixLoginPage = new BitrixLoginPage();
    
    //Background steps - Logging in to the app S
    //First step coding part
    @Given("User is on the login page")
    public void user_is_on_the_login_page()
    {
        //Gets the website link from configuration file and takes the browser to that site
        Driver.getDriver().get(ConfigurationReader.getProperty("website"));
    }
    
    //Second step coding part S
    @Then("user logs in")
    public void user_logs_in()
    {
        //Easier coding part. Used the method created before. S
        bitrixLoginPage.logIn();
    }
}
