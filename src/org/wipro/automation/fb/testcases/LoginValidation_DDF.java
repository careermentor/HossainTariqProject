package org.wipro.automation.fb.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.fb.baseClass.InitiateBrowser;
import org.wipro.automation.fb.datagenerators.TestDataGen;
import org.wipro.automation.fb.pages.LoginPage;

public class LoginValidation_DDF extends InitiateBrowser
{

	@Test(dataProvider="data", dataProviderClass=TestDataGen.class)
	public void tc01_validateloginfunctiolaity(String uname, String pass) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username(uname);
		login.enter_password(pass);
		login.click_loginbttn();
		
	}
	
	
	
}
