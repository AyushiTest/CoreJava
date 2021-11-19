
package OopsConcept;

public class StaticAndNonStaticConcept {

	String name = "Ayu";   // non-static Global variable
	static int age = 101;      // Static Global variable
	
	public static void main(String[] args) {
		// how to call static main method and variable ?
		
		// 1st Direct calling
		mail();                     //method
		System.out.println(age);    //variable
		
		// 2nd calling by class name
		StaticAndNonStaticConcept.mail();                     //method
		System.out.println(StaticAndNonStaticConcept.age);    //variable
		
		// How to call non static method and variables 
		StaticAndNonStaticConcept obj= new StaticAndNonStaticConcept();
		obj.sendmail();
		System.out.println(obj.name);
		
		// can i access static methods by using object reference ? yes   
	    // obj.mail();      //but it is not a good practice 
		
	}

	
	public void sendmail() {
		System.out.println("send mail method");
	}
	
	
	public static void mail() { 
		System.out.println("mail method");
	}
	
	
	
	
	
	
	
	
	
}
