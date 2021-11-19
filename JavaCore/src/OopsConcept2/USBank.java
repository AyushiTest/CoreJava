package OopsConcept2;

public interface USBank {
int min_bal = 100;
	public void credit(); 
	
	public void debit();
	
	public void trasfermoney();
	
	//only method declaration 
	//no method body - only method prototype
	// in interface, we can declar the variable, vars are by default static in nature
	// vars value will not ne changed, its final /constant in nature
	// no static method in Interface
	// no mail method in interface
	// we can not create the object of interface
	// interface is abstract in nature
}
