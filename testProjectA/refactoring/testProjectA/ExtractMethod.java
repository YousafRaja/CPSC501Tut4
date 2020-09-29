package testProjectA;

//https://refactoring.guru/extract-method

public class ExtractMethod {
	
	public void printOwing() {
		  String name = "John";
		  printBanner();
		  // Print details.
		  System.out.println("name: " + name);
		  System.out.println("amount: " + getOutstanding());
		}
	
	private String getOutstanding() {
		return "1000";
	}

	void printBanner() {
		// do stuff
	}		
}
