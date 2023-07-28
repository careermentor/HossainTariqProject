package oopsConcepts;

public class QA4 extends QA2 implements QA3I
{

	public void mul(int a, int b)
	{
		int c = a*b;
		System.out.println("multiplcation of 2 numbers: " + c);
	}
	
	public static void main(String[] args) 
	{
		QA4 q4 = new QA4();
		q4.sum(20, 30);
		//q3.sub(50, 30);
		q4.mul(10, 20);
		//QA1 q1 = new QA1();
		//q1.sum(30, 40);

	}

	
	public void QA3IM() {
		System.out.println("this is interface method of QA3I");
		
	}

	
	public void QA1IM() {
	System.out.println("thi is interface method of QA1I");
		
	}

}
