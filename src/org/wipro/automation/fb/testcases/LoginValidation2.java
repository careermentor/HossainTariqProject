package org.wipro.automation.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.fb.baseClass.InitiateBrowser;
import org.wipro.automation.fb.pages.LoginPage;

public class LoginValidation2 extends InitiateBrowser
{

	@Test
	public void tc01_validateloginfunctiolaity() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username("user1");
		login.enter_password("pass1");
		login.click_loginbttn();
		
	}
	
	@Test
	public void tc02_validateloginfunctiolaity() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username("user2");
		login.enter_password("pass2");
		login.click_loginbttn();
		
	}
	
}
