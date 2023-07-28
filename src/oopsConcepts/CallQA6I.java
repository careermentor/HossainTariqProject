package oopsConcepts;

public class CallQA6I implements QA6I
{

	
	public void method3() {
	
		System.out.println("output of method1");
	}

	
	public void method4() {
		
	System.out.println("output of method2");	
	}

	public static void main(String[] args) {
		CallQA6I q6c = new CallQA6I();
		q6c.method3();
		q6c.method4();
	}
	
}



//class vs class - extends
//interface vs class - implements
// interface vs interface - extends
