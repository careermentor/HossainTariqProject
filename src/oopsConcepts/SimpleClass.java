package oopsConcepts;

public class SimpleClass 
{

	static int i  =10;
	
	public static void method1()
	{
		System.out.println(i);
		System.out.println("this is simple method");
	}
	
	public void method2()
	{
		System.out.println("this is direct method");
	}
	
	public static void main(String[] args)
	{
		SimpleClass sc = new SimpleClass();
		sc.method2();
	
		SimpleClass.method1();
	}
	
}
