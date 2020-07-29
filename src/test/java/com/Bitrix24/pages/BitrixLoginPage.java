package com.Bitrix24.pages;

import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Created by Serhat S

public class BitrixLoginPage
{
	//connection between the driver and object S
	public BitrixLoginPage()
	{
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	//Login username text field located S
	@FindBy (name = "USER_LOGIN")
	public WebElement username_field;
	
	//Login password text field located S
	@FindBy (name = "USER_PASSWORD")
	public WebElement password_field;
	
	//Login button located
	@FindBy (xpath = "//input[@value='Log In']")
	public WebElement login_button;
	
	
	//Method for easier coding in the future S
	public void logIn()
	{
		//Enter the chosen data to the username field - helpdesk15@cybertekschool.com S
		username_field.sendKeys(ConfigurationReader.getProperty("serhat_cred"));
		
		//Enter the chosen data to the password field - UserUser S
		password_field.sendKeys(ConfigurationReader.getProperty("serhat_pass"));
		
		//Clicks on the login button S
		login_button.click();
	}
	
}
