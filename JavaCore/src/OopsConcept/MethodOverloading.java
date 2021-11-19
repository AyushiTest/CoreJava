package OopsConcept;

public class MethodOverloading {

	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(5);
		obj.sum(10.5);
		obj.sum(10, 7);	

	}
	
	// When can overload main method also
	// We can not create a method within the method
	// Duplicate method:-  same method name with same arguments/input are not allowed
	// Method overloading :- when method name are same with different arguments/input and different data type within the class
	
	public void sum() {
		System.out.println("Method-with 0 input");
	}
	
	public void sum(int i) {
		System.out.println("Method-with 1 input");
		System.out.println(i);
	}
	
	public void sum(double d) {
		System.out.println("Method-with 1 input when having different data type");
		System.out.println(d);
	}
	
	
	public void sum(int j, int k) {
		System.out.println("Method-with 2 input when having same data type");
		System.out.println(j*k);
	}
	
	
	
	
	
	
	
	
	
}
