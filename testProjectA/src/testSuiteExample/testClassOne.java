package testSuiteExample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import simpleTests.ExampleClass;

public class testClassOne {

	ExampleClass myClass = new ExampleClass("abc");
	
		
   @Test
   public void testFib1() {	  
      assertEquals(0,myClass.getFib(1));
   }
   
   @Test
   public void testFib2() {	  
      assertEquals(1,myClass.getFib(2));
   }
   
   @Test
   public void testFib3() {	  
      assertEquals(1,myClass.getFib(3));
   }
   
   @Test
   public void testFib4() {	  
      assertEquals(2,myClass.getFib(4));
   }
   
   @Test
   public void testFib5() {	  
      assertEquals(3,myClass.getFib(5));
   }
   
   @Test
   public void testFib6() {	  
      assertEquals(5,myClass.getFib(6));
   }
   
   @Test
   public void testFib7() {	  
      assertEquals(8,myClass.getFib(7));
   }
		   

}
