package com.acti.testcase;

import org.testng.annotations.Test;

public class TaskPageTest extends BaseTest {
	

//	@Test(dataProvider="actidata")
//	public void testCreateCustomer(String username, String password)
//	{
//		loginpage.enterUsername(username);
//		loginpage.enterPassword(password);
//		loginpage.clickLogin();
//		entertimepage.clickTaskMenu();
//		tasklistpage.clickAddNew();
//		tasklistpage.clickOptionNewCustomer();
//		tasklistpage.enterCustomerName("Dummy Customer");
//		tasklistpage.enterCustomerDescription("Testing Create Customer");
//		tasklistpage.clickCreateCustomer();
//	}
	
	@Test(dataProvider="actidata")
	public void testDeleteCustomer(String username, String password)
	{
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickLogin();
		entertimepage.clickTaskMenu();
		tasklistpage.enterStartTyping("Test Customer");
		tasklistpage.clickSearchedCustomer();
	}
	
	

}
