package javaBasics;

public class LearnConstructor 
{
	public int method1()  // no arguments/parameter
	{
		System.out.println("this is simple method");
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println(c);
		return c;
		
	}
	
	
	
	public LearnConstructor()   // no argument/parameter
	{
		System.out.println("this is constructor");
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println(c);
		
	}
	
	
	public int sum(int a, int b)  //having arugments/parameters
	{
		int c = a+b;
		System.out.println(c);
		return c;
	}
	
	public LearnConstructor(int a, int b)  //take arguments/parameters
	{
		int c = a*b;
		System.out.println("thisis conctrictor output" + c);
		
	}
	
	
	
	public static void main(String[] args) 
	{
		LearnConstructor lc = new LearnConstructor();   //constrctor will be automatically called
		
		LearnConstructor lc1 = new LearnConstructor(10,20); 
		
		lc1.method1();
		
		int x = lc1.sum(100, 200);
		lc1.sum(x, 300);
		
	}
	
}
