package org.wipro.automation.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.fb.baseClass.InitiateBrowser;
import org.wipro.automation.fb.pages.SignupPage;
import org.wipro.automation.fb.utilityclasses.PropertiesUtilities;

public class SignupValidation extends InitiateBrowser
{

	@Test
	public void tc02_validatesignupfunctiolaity() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
	
		sign.click_createnewaccountbttn();
		sign.enter_firstname(PropertiesUtilities.readConfigProp("firstname"));
		sign.enter_lastname(PropertiesUtilities.readConfigProp("lastname"));
		sign.click_signupbttn();
	}
	
	
}
