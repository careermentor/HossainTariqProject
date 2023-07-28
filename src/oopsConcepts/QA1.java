package oopsConcepts;

public class QA1 {

	int i  =20;
	
	public void sum(int a, int b)   //10+20    //declaration
	{
		int i  =30;
		
		int c = a+b;     //body
		System.out.println("sum of 2 numbers: " + c);
		System.out.println(i);  //30
		System.out.println(this.i);  //20
	}
	
	public void sum(int a, float b)  //10+20.5 = 30.5
	{
		float c = a+b;
		System.out.println("sum of 2 numbers: " + c);
	}
	

	public void sum(int a, float b, int c)   // 10+20+30
	{
		float d = a+b+c;
		System.out.println("sum of 3 numbers: " + d);
	}
	
	
	
	public static void main(String[] args) 
	{
		QA1 q1 = new QA1();
		q1.sum(10, 20.5f);   

	}

}
