package testSuiteExample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import simpleTests.ExampleClass;

public class testClassTwo {
	ExampleClass myClass = new ExampleClass("abc");

	   @Test
	   public void testFib() {	  
	      assertEquals(1,myClass.getFib(2));
	   }
	   
       @Test(expected=IllegalArgumentException.class)
       public void expectedIllegalArgumentException() {
           myClass.getFib(-1);
       }
}
