package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskPageTest extends BaseTest {
	

	@Test(dataProvider="actidata")
	public void testCreateCustomer(String username, String password)
	{
		logger=report.createTest("Creating New Customer");
		
		loginpage.enterUsername(username);
		logger.info("entered username");
		loginpage.enterPassword(password);
		logger.info("entered password");
		loginpage.clickLogin();
		logger.info("clicked login button");
		entertimepage.clickTaskMenu();
		logger.info("clicked task menu");
		tasklistpage.clickAddNew();
		logger.info("clicked addnew button");
		tasklistpage.clickOptionNewCustomer();
		logger.info("clicked option new customer");
		tasklistpage.enterCustomerName("Dummy Customer");
		logger.info("entered customer name");
		tasklistpage.enterCustomerDescription("Testing Create Customer");
		logger.info("entered customer description");
		tasklistpage.clickCreateCustomer();
		logger.info("clicked create customer");
		String message = tasklistpage.validateSuccessMessage();
		System.out.println(message);
		Assert.assertTrue(message.contains("created"));
		logger.pass("customer created successfully");
	}
	
//	@Test(dataProvider="actidata")
//	public void testDeleteCustomer(String username, String password)
//	{
//		loginpage.enterUsername(username);
//		loginpage.enterPassword(password);
//		loginpage.clickLogin();
//		entertimepage.clickTaskMenu();
//		tasklistpage.enterStartTyping("Test Customer");
//		tasklistpage.clickSearchedCustomer();
//	}
	
	

}
