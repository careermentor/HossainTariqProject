package org.wipro.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.fb.utilityclasses.PropertiesUtilities;

public class LoginPage 
{

	WebDriver driver;  //global variable
	
	public LoginPage(WebDriver driver)   //local variable
	{
		this.driver=driver;
	}


	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(PropertiesUtilities.readElementProp("login_username_id"))).sendKeys(uname);
		
	}
	
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(PropertiesUtilities.readElementProp("login_password_name"))).sendKeys(pass);
		
	}
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.cssSelector(PropertiesUtilities.readElementProp("login_loginbttn_css"))).click();
		
	}
}
