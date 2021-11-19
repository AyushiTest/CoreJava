package TestCases;

public class FinallyConcept {

	public static void main(String[] args) {
		test1();
	//	test2();
	//	divison();
	}
	
	// Finally is the block type 
	
	public static void test1() {
	try{
		System.out.println("Inside test1 method");
		throw new RuntimeException ("test");
	} 
	catch(Exception e){
		System.out.println("Inside catch block");	
	}
	finally 
	{
		System.out.println("**Inside Finally Block**");
	}
		
}
	public static void test2() {
		try{
			System.out.println("Inside test2 method");
			throw new RuntimeException ("test2");
		} 
		finally 
		{
			System.out.println("**Inside Finally test2 Block**");	
		}
		
	}
	
	public static void divison() {
		int i = 10;
		try {
			System.out.println("*inside try block under division method*");
			int k = i/0;
		} 
		catch (NullPointerException e) {
			System.out.println("Inside catch block");
			System.out.println("Divide by zero");
		}
		finally 
		{
			System.out.println("Excute it after any expection");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	

