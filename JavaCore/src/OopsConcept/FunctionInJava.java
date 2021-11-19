
package OopsConcept;

public class FunctionInJava {

	
	//Main Method --> starting point of execution 
	public static void main(String[] args) {
		
		
	
		// void does not return any value, & main methods void , return type void.
		
     FunctionInJava obj = new FunctionInJava();
		// one object is being created, obj is reference variable, referring to this object
		// after create the object , the all copy of the non-static method will be given to this object
     
     obj.test();   
     int m =  obj.pqr();
     System.out.println(m);
     
     String s1=  obj.qa();
     System.out.println(s1);
   
     int D= obj.div(50, 10);
     System.out.println(D);
     
}	
		
		//Non Static Methods
   // 	return type :- void
		public void test() {  //no input no output
			System.out.println("test methods");
		}
	// return type int	
		public int pqr() {  // no input but some output	
			System.out.println("pqr method");
			int a= 10;
			int b= 20;
			int c= a+b;
			return c;
		}
    // return type string  
		public String qa() { // no input but some output	
			System.out.println("qa method");
		    String s="selenium";
		    return s;	
		}
	// return type int	
		public int  div(int x, int y) {   // some input and some output  , x,y input parameters/arguments
			System.out.println("Division Method");
		int	d= x/y;
		    return d;	
		}
		
		
		
		
		
		
}

