package simpleTests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestJunit {
	
	   String message = "Hello World123";	
	   ExampleClass myClass = new ExampleClass(message);

	   @Before
	   public void initialize() {
		   System.out.println("Starting tests");
	   }
	   
	   @Test
	   public void testPrintMessage() {	  
	      assertEquals(message,myClass.printMessage());
	   }
	   
	   @Test
	   public void testFib() {	  
		   assertEquals(-1,myClass.getFactorial(0));
	      assertEquals(1,myClass.getFactorial(1));
	      assertEquals(2,myClass.getFactorial(2));
	      assertEquals(6,myClass.getFactorial(3));
	   }
	   
	   //Enter your factorial test function here
	}