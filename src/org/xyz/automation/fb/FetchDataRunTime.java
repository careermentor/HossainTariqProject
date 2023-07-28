package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataRunTime 
{

	
	
	@Test
	public void testsignup()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();   //launch the chrome browser
		
		//Step 1
		
		String ExpURL = "https://www.facebook.com/";
		
			
		driver.get(ExpURL);  
		String ActURL = driver.getCurrentUrl();
		
		System.out.println(ActURL);
		
	//	Assert.assertEquals(ActURL, ExpURL);  //failed  - Hard Assertion
		
		SoftAssert sa = new SoftAssert();  //soft assertain
		sa.assertEquals(ActURL, ExpURL);   //compare but wont take decision whether it is pass or fail
		
		
		System.out.println("this test case got failed");
		
		//Step #2
		
		String ExpTitle = "Facebook – log in or sign up";
			
		String ActTitle = driver.getTitle();
		
		System.out.println(ActTitle);
		
		sa.assertEquals(ActTitle, ExpTitle);
		
		String ExpUsernameTestBox = "Email address or phone number"; 
		
		String ActUsernameTextBoxx = driver.findElement(By.id("email")).getAttribute("placeholder");
		
		System.out.println(ActUsernameTextBoxx);
		
		sa.assertEquals(ActUsernameTextBoxx, ExpUsernameTestBox);
		
		System.out.println(driver.findElement(By.id("email")).getAttribute("class"));
		
		System.out.println(driver.findElement(By.name("login")).getText());
		
		String expfbmsg = "Facebook helps you connect and share with the people in your life.";
		String actfbmsg = driver.findElement(By.cssSelector("._8eso")).getText();
		sa.assertEquals(actfbmsg, expfbmsg);
		
		int i  =20;
		
		Point loc = driver.findElement(By.name("login")).getLocation();
		System.out.println(loc);
		
		System.out.println(driver.getPageSource());
		
		
		sa.assertAll();
		
	}
	
	}
