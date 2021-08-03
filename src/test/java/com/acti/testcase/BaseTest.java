package com.acti.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.acti.base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;

public class BaseTest extends DriverScript {
	
	LoginPage loginpage;
	EnterTimePage entertimepage;
	
	@BeforeMethod
	public void setUp()
	{
		initApplication();
		loginpage = new LoginPage();
		entertimepage = new EnterTimePage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		quitApplication();
	}

}
