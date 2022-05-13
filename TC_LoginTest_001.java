package com.adevi.testCases;

//import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.adevi.pageObjects.LoginPage;
public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest()
	{
	driver.get (baseURL);
	//Logger.info("URl is opened");
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	lp.setPassword(password);
	lp.clickSubmit();
	
	if(driver.getTitle().equals("Editor"))
	{
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertTrue(false);
	}
	}
	
}
