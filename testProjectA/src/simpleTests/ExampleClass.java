package simpleTests;


public class ExampleClass {
	
	//Return the factorial of n
    int getFactorial(int n) {
	if(n==0){
		return 1; 
	}
	int res = 1;
	
    while(n>0) {
    	res*=n;
    	n-=1;
    }
    return res;
    }
    
	//Return the nth Fibonacci number
    int getFib(int n) {
        int a = 0, b = 1, c; 
        if (n == 0) 
            return a; 
        for (int i = 2; i <= n; i++) 
        { 
            c = a + b; 
            a = b; 
            b = c; 
        } 
        return b; 
    }
           
   private String message;

   //Constructor
   //@param message to be printed
   public  ExampleClass(String message){
      this.message = message;
   }
      
   // prints the message
   public String printMessage(){
      System.out.println(message);
      return message;
   }   
} 