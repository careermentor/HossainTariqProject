package org.wipro.automation.fb.utilityclasses;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{

	public static void TestResults(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot screenshot = (TakesScreenshot) driver;  //printscreen
		File f = screenshot.getScreenshotAs(OutputType.FILE);
		
		int i  =20;
		System.out.println("value of i: " + i + "is integer" );
		
		File fd = new File("./Results/" + name + ".png");
		
		FileUtils.copyFile(f, fd);
		
	}
	
}
