package OopsConcept2;

public class TestCar {

	public static void main(String[] args) {
		
		//Static Polymorphism -- compile time polymorphism
		Audi A = new Audi();
		A.Start();
		A.Stop();
		A.thiefpro();
		A.refuel();
        A.engine();
		System.out.println("****");
		
		Car C = new Car();
		C.Start();
		C.Start();
		C.refuel();
		
		System.out.println("****");
		//top casting
Car C1 = new Audi();  // child class object can be referred by parent class reference variable -- dynamic polymorphism -- run time polymorphism
		C1.Start();
		C1.Stop();
		C1.refuel();
		
		//  down casting
	   //	Audi A1 = (Audi) new Car();   //ClassCastException
		
		
	}

	
	
	
	
}
