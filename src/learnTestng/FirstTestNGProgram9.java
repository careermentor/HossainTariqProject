package learnTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGProgram9 
{

	@Test
	public static void first_testcase()
	{
		System.out.println("this is first test case");
	}
	
	
	@Test
	public static void second_testcase()
	{
		System.out.println("this is second test case");
		//Assert.assertEquals("Hello", "Hello1");
	}
	
	@Test
	public static void third_testcase()
	{
		System.out.println("this is third test case");
	}
	
	@Test(dependsOnMethods="third_testcase",groups="Sanity")
	public static void forth_testcase()
	{
		System.out.println("this is forth test case");
	}
	
	@Test
	public static void fifth_testcase()
	{
		System.out.println("this is fifth test case");
	}
	
	@Test(groups="Smoke")
	public static void sixth_testcase()
	{
		System.out.println("this is sixth test case");
	}
	
	
}
