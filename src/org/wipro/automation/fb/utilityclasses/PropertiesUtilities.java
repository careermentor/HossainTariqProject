package org.wipro.automation.fb.utilityclasses;


import java.io.FileReader;
import java.util.Properties;

public class PropertiesUtilities 
{

	public static String readConfigProp(String name) throws Exception
	{

		FileReader fr = new FileReader("./TestData/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);  
		return prop.get(name).toString();
		
	}

	public static String readElementProp(String name) throws Exception
	{

		FileReader fr = new FileReader("./TestData/element.properties");
		
		Properties prop = new Properties();
		prop.load(fr);  
		return prop.get(name).toString();
		
	}
	
}
