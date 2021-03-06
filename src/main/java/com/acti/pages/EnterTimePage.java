package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.base.DriverScript;

/*
 * Tester: Pooja
 * Date Create: 8/2/2021
 * Verified By: Rhumania
 * Verified Date: 8/2/2021
 */

public class EnterTimePage extends DriverScript {
	
//**************************************** Page Elements ***********************************************************//
	
	@FindBy(id="logoutLink") WebElement linkLogout;
	@FindBy(xpath="//a[@class='userProfileLink username ']") WebElement textUserloggedIn;
	@FindBy(id="container_tasks") WebElement menuTask;
	
//**************************************** Page Initialization ******************************************************//
	
	public EnterTimePage()
	{
		PageFactory.initElements(driver, this);
	}
	
//**************************************** Page Actions ******** ******************************************************//
	
	public void clickLogout()
	{
		linkLogout.click();
	}
	
	public String verifyUserLoggedIn()
	{
		return textUserloggedIn.getText();
	}
	
	public void clickTaskMenu()
	{
		menuTask.click();
	}
	

}
