package OopsConcept;

public class CarClass {

	// class vars
	
	int model;
	int wheel;
	
	
	public static void main(String[] args) {
	
	// New car() :- this is object of car class
	// New keyword use to create the object 
	// a,b,c are object reference variables
		

  CarClass a = new CarClass();
  CarClass b = new CarClass();
  CarClass c = new CarClass();	
  
  a.model = 2014;   a.wheel = 6;
  b.model = 2015;   b.wheel = 5;
  c.model = 2016;   c.wheel = 4;
 
 System.out.println("**Before assigning the refrenece**"); 
 
  System.out.println(a.model);
  System.out.println(a.wheel);	
  System.out.println(b.model);
  System.out.println(b.wheel);
  System.out.println(c.model);
  System.out.println(c.wheel);

  System.out.println("**After assigning the refrenece**"); 
  
  a=b;
  b=c;
  c=a;
  
  a.model = 11;
  System.out.println(a.model);   //11
  
  c.model = 20;
  System.out.println(a.model); // 20
  System.out.println(c.model); 
  
  
  
  
  
	}

}
