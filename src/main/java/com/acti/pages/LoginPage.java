package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.base.DriverScript;

/*
 * Tester: Gayathri
 * Date Create: 8/2/2021
 * Verified By: Shantosh
 * Verified Date: 8/2/2021
 */

public class LoginPage extends DriverScript {
	
//**************************************** Page Elements ***********************************************************//
	
	@FindBy(id="username") WebElement textboxUsername;
	@FindBy(name="pwd") WebElement textboxPassword;
	@FindBy(xpath="//div[text()='Login ']") WebElement buttonLogin;
	@FindBy(xpath="//span[@class='errormsg']") WebElement textLoginErrorMessage;
	
//**************************************** Page Initialization ******************************************************//
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//**************************************** Page Actions ******** ******************************************************//
	
	public void enterUsername(String username)
	{
		textboxUsername.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		textboxPassword.sendKeys(password);
	}
	
	public void clickLogin()
	{
		buttonLogin.click();
	}
	
	public String verifyErrorMessage()
	{
		return textLoginErrorMessage.getText();
	}

}
