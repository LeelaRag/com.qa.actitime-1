package com.acti.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import com.acti.base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;
import com.acti.pages.TaskListPage;
import com.acti.utils.ExcelReader;

public class BaseTest extends DriverScript {
	
	LoginPage loginpage;
	EnterTimePage entertimepage;
	TaskListPage tasklistpage;
	
	@BeforeMethod
	public void setUp()
	{
		initApplication();
		loginpage = new LoginPage();
		entertimepage = new EnterTimePage();
		tasklistpage = new TaskListPage();
	}
	
	@AfterMethod
	public void tearDown()
	{
//		quitApplication();
	}
	
	@DataProvider(name="actidata")
	public Object[][] testData()
	{
		ExcelReader excel = new ExcelReader("./attestdata/actidata.xlsx");
		int row = excel.getRowCount(0);
		Object[][] data = new Object[row][2];
		
		for(int i=0;i<row;i++)
		{
			data[i][0]=excel.getCellData(0, i, 0);
			data[i][1]=excel.getCellData(0, i, 1);
		}
		
		return data;
	}

}
