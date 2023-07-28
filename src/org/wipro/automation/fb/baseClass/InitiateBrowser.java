package org.wipro.automation.fb.baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.fb.utilityclasses.PropertiesUtilities;

public class InitiateBrowser
{
	public WebDriver driver;

	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		
		if(PropertiesUtilities.readConfigProp("browser_name").equalsIgnoreCase("Chrome"))
		{

			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();  
		}
		
		else if(PropertiesUtilities.readConfigProp("browser_name").equalsIgnoreCase("Edge"))
		{

			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();  
		}
		
		else if(PropertiesUtilities.readConfigProp("browser_name").equalsIgnoreCase("IE"))
		{

			System.setProperty("webdriver.ie.driver", "./Drivers/iedriver.exe");
			driver = new InternetExplorerDriver();  
		}
		
		else if(PropertiesUtilities.readConfigProp("browser_name").equalsIgnoreCase("Firefox"))
		{

			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();  
		}
		
		else
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver(); 
		}

		
		driver.get(PropertiesUtilities.readConfigProp("application_url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
