package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	

	
	@Test
	public void testLoginFunctionValidUser()
	{
		logger=report.createTest("Login Functionality");
		
		loginpage.enterUsername("admin");
		logger.info("entered username");
		loginpage.enterPassword("manager");
		logger.info("entered password");
		loginpage.clickLogin();
		logger.info("clicked loggin button");
		String actual = entertimepage.verifyUserLoggedIn();
		Assert.assertEquals(actual, "Shantosh"); //John Doe
		logger.pass("user logged in successfully");
		entertimepage.clickLogout();
		logger.info("clicked logout");
		
	}
	
//	@Test
//	public void testLoginFunctionInValidUser()
//	{
//		loginpage.enterUsername("admin");
//		loginpage.enterPassword("damager");
//		loginpage.clickLogin();
//		String errormessage = loginpage.verifyErrorMessage();
//		Assert.assertTrue(errormessage.contains("Username or Password is invalid"));
//	}

}
