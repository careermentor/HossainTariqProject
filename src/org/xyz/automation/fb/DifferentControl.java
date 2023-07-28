package org.xyz.automation.fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DifferentControl 
{

	
	
	@Test
	public void testsignup()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();   //launch the chrome browser
		driver.get("https://thetestingworld.com/testings/");  //60 secs  
		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);  //70 secs
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("fld_username")).sendKeys("java");
		driver.findElement(By.cssSelector("[value='office']")).click();
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());  //false
		
		driver.findElement(By.name("terms")).click();
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());  //true
		//driver.findElement(By.className("displayPopup")).click();
		
		System.out.println(driver.findElement(By.cssSelector("[type='submit']")).isEnabled());  //true
		System.out.println(driver.findElement(By.cssSelector("[type='submit']")).isDisplayed());//true
				
		WebElement abc = driver.findElement(By.name("sex"));
		Select gen = new Select(abc);
		gen.selectByVisibleText("Male");
		
		Select con = new Select(driver.findElement(By.name("country")));
		//con.selectByVisibleText("United States");
		//con.selectByIndex(1);
		//con.selectByValue("18");
		
		//con.deselectByIndex(1);
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver,30);
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Iowa"));
		
		st.selectByVisibleText("Alaska");
		
		Select ct = new Select(driver.findElement(By.name("city")));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("cityId")), "Homer"));
		
		ct.selectByVisibleText("Nome");
		
		con.deselectAll();
		
	}
	
	public void testdropdown()
	{
		WebDriver driver = new ChromeDriver();
		
	}
	
	}
