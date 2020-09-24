package simpleTests;


public class ExampleClass {
	
	//Return the factorial of n
    public int getFactorial(int n) {
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
    public int getFib(int n) {
    	if(n<1) {
    		throw new IllegalArgumentException("Value too big (" + n + ")");
    	}
    	n-=1;
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
      return "123";
   }   
} 