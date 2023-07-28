package oopsConcepts;

public class KeywordsDemo 
{

	int i  =20; //global variable
	
	public static void printvar()
	{
		final int i  =30;  //local variable
		//i=50;
		
		System.out.println(i);  //30 //local member
		//System.out.println(this.i); //20  //global member
	}
	
	public void meth1()
	{
		System.out.println("this is not static method");
	}
	
	public static void main(String[] args) 
	{
		KeywordsDemo kd = new KeywordsDemo();
		kd.meth1();
		
		KeywordsDemo.printvar();
		
	}
	
}
