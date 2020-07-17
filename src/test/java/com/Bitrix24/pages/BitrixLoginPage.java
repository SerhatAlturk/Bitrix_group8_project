package com.Bitrix24.pages;

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BitrixLoginPage
{
	public BitrixLoginPage()
	{
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
}
