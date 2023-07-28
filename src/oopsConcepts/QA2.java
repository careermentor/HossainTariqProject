package oopsConcepts;

public class QA2 extends QA1
{
	int i  = 100;

	
	public void sum(int a, int b)   //10+20    //declaration
	{
		int i = 50;
		
		System.out.println(this.i); //100
		System.out.println(i);  //50
		System.out.println(super.i);//20
		
		int c = a*a+b*b;     //body
		System.out.println("sum of 2 numbers: " + c);
		
		
	}
	
	public void callorigSum()
	{
		super.sum(20, 30);
	}
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("substraction of 2 numbers: " + c);
	}
	
	public static void main(String[] args) 
	{
		QA2 q2 = new QA2();
		q2.sum(20, 30);
		q2.sum(20, 30.5f);
		q2.sub(50, 30);
		
		//QA1 q1 = new QA1();
		//q1.sum(30, 40);

		q2.callorigSum();
		
	}

}
