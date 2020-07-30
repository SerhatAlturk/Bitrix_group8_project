package com.Bitrix24.step_definitions;

import com.Bitrix24.pages.BitrixActivityStreamPage;
import com.Bitrix24.pages.BitrixLoginPage;
import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class Serhat_CreatingPoll_UserStory4StepDefinitions
{
    //Create the object of BitrixLoginPage to access the WebElements (POM) S
    BitrixLoginPage bitrixLoginPage = new BitrixLoginPage();
    //Create the object of BitrixActivityStreamPage to access the Poll section WebElements -s
    BitrixActivityStreamPage bitrixActivityStreamPage = new BitrixActivityStreamPage();
    
    //Background steps - Logging in to the app S
    //First step coding part -s
    @Given("User is on the login page")
    public void user_is_on_the_login_page()
    {
        //Gets the website link from configuration file and takes the browser to that site -s
        Driver.getDriver().get(ConfigurationReader.getProperty("website"));
    }
    
    //Second step coding part S
    @Then("user logs in")
    public void user_logs_in()
    {
        //Easier coding part. Used the method created before. S
        bitrixLoginPage.logIn();
        
        //Verification of the part
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Portal"));
    }
    
    //Background end -s
    
    //Scenario User should be able to upload file start -s
    //step 1 coding part -s
    
    //Used multiple waits to achieve good synchronization -s
    @Then("User clicks on the poll section")
    public void userClicksOnThePollSection()
    {
        //Click on Poll section -s
        bitrixActivityStreamPage.poll_section_button.click();
    }
    
    @Then("Users enters a message title with {string}")
    public void usersEntersAMessageTitle(String str)
    {
        //added wait to achieve synchronization -s
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
        //Chanage to Iframe -s
        Driver.getDriver().switchTo().frame(bitrixActivityStreamPage.message_title_iframe);
        
        //enter text to title -s
        bitrixActivityStreamPage.message_title_field.sendKeys();
        
        //change back to ParentFrame -s
        Driver.getDriver().switchTo().parentFrame();
    }
    
    @And("User fills out Question text field with {string}")
    public void userFillsOutQuestionTextField(String str)
    {
        //added wait to achieve synchronization -s
        Driver.getDriver().manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        
        //entered text to question field -s
        bitrixActivityStreamPage.question_text_field.click();
        bitrixActivityStreamPage.question_text_field.sendKeys(str);
    }
    
    @And("User fills out Answer1 text field with {string}")
    public void userFillsOutAnswer1TextField(String str)
    {
        //Entered answer 1 to field -s
        bitrixActivityStreamPage.answer1_text_field.sendKeys(str);
    }
    
    @And("User fills out Answer2 text field")
    public void userFillsOutAnswer2TextField(String str)
    {
        //Entered answer 2 to field -s
        bitrixActivityStreamPage.answer2_text_field.sendKeys(str);
    }
    
    @Then("Click Send button")
    public void clickSendButton()
    {
        //Clicked on send to create the poll -s
        bitrixActivityStreamPage.send_button.click();
    }
    
}

