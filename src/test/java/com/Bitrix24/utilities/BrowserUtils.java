package com.Bitrix24.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class BrowserUtils
{
	
	
	public static void takeScreenshot()
	{
		TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
		byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
		
		Date date = new Date();
		String date_to_string = date.toString().replaceAll(":", ".");
		String path = System.getProperty("user.dir") + File.separator + "screenshots" + File.separator + date_to_string + "_image.png";
		
		try (FileOutputStream fileOutputStream = new FileOutputStream(path))
		{
			fileOutputStream.write(screenshot);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
