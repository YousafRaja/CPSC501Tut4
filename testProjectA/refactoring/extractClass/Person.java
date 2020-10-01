package extractClass;

import testProjectA.ExtractMethod;

public class Person {
	String name;
	TelephoneNumber telephoneNumber= new TelephoneNumber();
	
	public String getNumber() {
		return telephoneNumber.getTelephoneNumber();
	}
	
}


