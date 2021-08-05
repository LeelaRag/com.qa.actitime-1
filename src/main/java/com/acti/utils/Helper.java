package com.acti.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	public static String captureScreenshot(WebDriver driver)
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dest="C:\\Users\\User\\git\\com.qa.actitime\\atreports\\screenshots\\screen.png";
		
		try 
		{
			FileHandler.copy(src, new File(dest));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return dest;
	}

}
