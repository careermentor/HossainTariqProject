package javaBasics;

public class DifferentTypesOfMethod 
{

	//type 1 method
	public void add() //method without parameter/arguments
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		
		System.out.println("value of c: "+ c );
		
	}
	

	public int add1() //method without parameter/arguments
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		
		System.out.println("value of c: " + c );
		return c;
		
	}
	
	//type 2 method
	
	public void sum(int a, int b)  //method with parameter/arguments
	{
		int c = a+b;
		System.out.println("value of c: " + c );
		
	}
	
	public void subs(int a, int b)     //method with parameter/arguments
	{
		int x = a-b;
		System.out.println("value of c: " + x );
		
	}
	
	public int sum1(int a, int b)  //method with parameter/arguments
	{
		int c = a+b;
		System.out.println("value of c: " + c );
		return c;
	}
	
	//20,30,40
	//sum(int a, int b, int c)
	
	


	public static void main(String[] args) 
	{
		DifferentTypesOfMethod abc = new DifferentTypesOfMethod();
		abc.add();
		abc.sum(50, 100);
		abc.sum(500, 1000);
		int x = abc.sum1(20, 30);
		abc.sum1(x, 40);
		
		
	}
	
}
