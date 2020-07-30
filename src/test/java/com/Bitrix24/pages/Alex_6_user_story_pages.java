package com.Bitrix24.pages;

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alex_6_user_story_pages {

    public Alex_6_user_story_pages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Login Page

    @FindBy(css = "input[name='USER_LOGIN']")
    public WebElement userNameLoginElement;

    @FindBy(css = "input[placeholder='Password']")
    public WebElement passwordElement;

    @FindBy(xpath = "input[type='checkbox']")
    public WebElement rememberMeOnThisComputerCheckBox;

    @FindBy(css = "input[value='Log In']")
    public WebElement loginButtonElement;

    @FindBy(linkText = "Forgot your password?")
    public WebElement forgotPasswordLink;

    // Main Portal Page

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreButton;

    @FindBy(xpath = "(//*[.='Appreciation'])[2]")
    public WebElement appreciationButton;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesButton;
}
