package learnTestng;

import org.testng.annotations.Test;

public class FirstTestNGProgram 
{

	@Test(priority=1)
	public static void first_testcase()
	{
		System.out.println("this is first test case");
	}
	
	
	@Test(priority=2)
	public static void second_testcase()
	{
		System.out.println("this is second test case");
	}
	
	@Test(priority=-2)
	public static void third_testcase()
	{
		System.out.println("this is third test case");
	}
	
	@Test(enabled=false)
	public static void forth_testcase()
	{
		System.out.println("this is forth test case");
	}
	
	@Test
	public static void fifth_testcase()
	{
		System.out.println("this is fifth test case");
	}
	
	@Test(priority=-1)
	public static void sixth_testcase()
	{
		System.out.println("this is sixth test case");
	}
	
	
}
