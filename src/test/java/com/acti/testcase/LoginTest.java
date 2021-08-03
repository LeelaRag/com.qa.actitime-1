package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.acti.base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;

public class LoginTest extends BaseTest {
	

	
	@Test
	public void testLoginFunctionValidUser()
	{
		loginpage.enterUsername("admin");
		loginpage.enterPassword("manager");
		loginpage.clickLogin();
		String actual = entertimepage.verifyUserLoggedIn();
		Assert.assertEquals(actual, "John Doe");
		entertimepage.clickLogout();
		
	}
	
	@Test
	public void testLoginFunctionInValidUser()
	{
		loginpage.enterUsername("admin");
		loginpage.enterPassword("damager");
		loginpage.clickLogin();
		String errormessage = loginpage.verifyErrorMessage();
		Assert.assertTrue(errormessage.contains("Username or Password is invalid"));
	}

}
