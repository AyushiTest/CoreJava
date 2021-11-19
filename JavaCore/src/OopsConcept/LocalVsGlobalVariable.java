
package OopsConcept;

public class LocalVsGlobalVariable {
  
	// Global Var who declare in class also called : Class Variable
	String name = "Ayu";
	int age = 25;
	

	public static void main(String[] args) {
 
	int i = 10;               // Local Variable for main method only
	System.out.println(i);
	
	
	LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
	System.out.println(obj.name);
	System.out.println(obj.age);
	obj.sum();
    obj.me();
	}

	public void sum() {      // Local Variable for sum method only
		int i =20;
		int j= 30;
		System.out.println(i+j);
	}
		
		public void me() {
		int l= 240;
		System.out.println(l);
		}
	}


