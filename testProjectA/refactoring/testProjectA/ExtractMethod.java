package testProjectA;

//https://refactoring.guru/extract-method

public class ExtractMethod {
	
	public void printOwing() {
		  String name = "John";
		  printBanner();
		  
		  printDetails(getOutstanding(), name);
		}
	
	public void printDetails(String outstanding, String name) {
		  System.out.println("name: " + name);
		  System.out.println("amount: " + outstanding);
	}
	
	private String getOutstanding() {
		return "1000";
	}

	void printBanner() {
		// do stuff
	}		
}
