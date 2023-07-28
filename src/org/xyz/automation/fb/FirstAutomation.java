package org.xyz.automation.fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation 
{

	WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();   //launch the chrome browser
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);  //70 secs
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //upto wait
		
	}
	
	@AfterMethod
	public void closebrowser()
	{
		//driver.close();
	}
	
	@Test(enabled=false)
	public void loginfunctionality() throws Exception
	{
		
		driver.findElement(By.id("email")).sendKeys("modisantosh@gmail.com");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("user1");
		//driver.findElement(By.name("pass")).sendKeys("pass1234");
		//driver.findElement(By.cssSelector("[type='submit']")).click();
		//Thread.sleep(5000);
		
	}
	
	
	@Test(enabled=true)
	public void signupfunctionality() throws Exception
	{
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//Thread.sleep(5000);  //fixed wait - 5 seconds
		driver.findElement(By.name("firstname")).sendKeys("Java");
		
	}
	
}
