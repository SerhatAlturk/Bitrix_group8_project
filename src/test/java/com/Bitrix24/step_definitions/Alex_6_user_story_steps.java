package com.Bitrix24.step_definitions;

import com.Bitrix24.pages.Alex_6_user_story_pages;
import com.Bitrix24.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Alex_6_user_story_steps {

    Alex_6_user_story_pages alex6UserStoryPages = new Alex_6_user_story_pages();


    // Here I do log in)

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get("http://login2.nextbasecrm.com/");
    }

    @When("user puts correct name {string}")
    public void user_puts_correct_name(String name) {
        alex6UserStoryPages.userNameLoginElement.sendKeys(name);
    }

    @When("user puts correct pass {string}")
    public void user_puts_correct_pass(String password) {
        alex6UserStoryPages.passwordElement.sendKeys(password);
        alex6UserStoryPages.loginButtonElement.click();

    }

    @Then("user should see next page")
    public void user_should_see_next_page() {
        //Assert.assertEquals(Driver.getDriver().getTitle(), "(2) Portal");

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));

        Driver.closeDriver();
    }


    // Here I am trying to upload files
}
