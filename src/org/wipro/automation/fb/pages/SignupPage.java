package org.wipro.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.fb.utilityclasses.PropertiesUtilities;

public class SignupPage 
{

	WebDriver driver;  //global variable
	
	public SignupPage(WebDriver driver)   //local variable
	{
		this.driver=driver;
	}

	
	public void click_createnewaccountbttn() throws Exception
	{
		driver.findElement(By.xpath(PropertiesUtilities.readElementProp("signup_createnewaccountbtn_xpath"))).click();
		
	}
	

	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(PropertiesUtilities.readElementProp("signup_firstname_name"))).sendKeys(fname);
		
	}
	
	
	public void enter_lastname(String lname) throws Exception
	{
		driver.findElement(By.name(PropertiesUtilities.readElementProp("signup_lastname_name"))).sendKeys(lname);
		
	}
	
	public void click_signupbttn() throws Exception
	{
		driver.findElement(By.name(PropertiesUtilities.readElementProp("signup_signupbtn_name"))).click();
		
	}
}
