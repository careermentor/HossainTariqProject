package javaBasics;

public class DemoClass 
{

	int i  = 50;  //global variable
	
	
	
	public void method1()
	{
		int i =20;  //local variable   //constant
		i=100;
		
		System.out.println(i);
		System.out.println("this is method1");
	}
	
	public void method2()
	{
		//int i  =30; //local variable
		
		System.out.println(i);  //50
	}
	
	public static void main(String[] args) 
	{
		DemoClass dc = new DemoClass();
		dc.method1();
		dc.method2();
		
		
	}

	
}
