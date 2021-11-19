package OopsConcept2;

public class HDBank implements USBank,BrazilBank{  // we are acheiving multiple inheritance 
	// Is a Relationship
	
   //if a class is implements any interface then its mandatory to define/override all the methods of interface	
	
	// Overriding from US bank
public void credit() {
	System.out.println("Credit HDBank");
}
	
	public void debit(){
		System.out.println("Debit HDBank");
	}
	
	public void trasfermoney(){
		System.out.println("Transfer money HDBank");
	}
	
	
	// seprate method of HDbank
	public void EducationLoan() {
		System.out.println("Education load HDBank");
	}
	
	public void CarLoan() {
		System.out.println("Car Loan HDBank");
	}
	
	//BrazilBank method, over riden from brazil 
	
	public void mutualfund() {
		System.out.println("mutual fund in brazil bank");
	}
	
	
	
}
