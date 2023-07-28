package oopsConcepts;

public class QA3 extends QA1
{

	public void mul(int a, int b)
	{
		int c = a*b;
		System.out.println("multiplcation of 2 numbers: " + c);
	}
	
	public static void main(String[] args) 
	{
		QA3 q3 = new QA3();
		q3.sum(20, 30);
		//q3.sub(50, 30);
		q3.mul(10, 20);
		//QA1 q1 = new QA1();
		//q1.sum(30, 40);

	}

}
