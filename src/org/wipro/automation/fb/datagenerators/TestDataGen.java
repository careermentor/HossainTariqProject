package org.wipro.automation.fb.datagenerators;

import org.testng.annotations.DataProvider;

public class TestDataGen 
{


	@DataProvider(name="data")
	public Object[][] testdatagenerator() throws Exception
	{
		//Object[] testdata = {"user1","pass1"};     //1-dimensional data
		Object[][] testdata = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};     //2-dimensional data
		
		return testdata;
	}
	
}
