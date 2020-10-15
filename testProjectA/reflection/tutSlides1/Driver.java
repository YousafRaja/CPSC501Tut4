
/*
 * Exercise: Simple non-recursive inspection.
 * 
 * Write a piece of code in Java using reflection, that takes an object as an argument, 
 * and converts the class object (including it’s fields and methods if available) to a String. 
 * Don't worry about arrays, interfaces or inheritance (yet). 
 * Time: 10-15 mins
 * BONUS: Also print the type for each field value (i.e int, char, etc.)
 * 
 *  
 public class Driver {
	
	public static void inspectObj(Object obj ){
		// Print the class Name
		// Print all the class Methods
		// Print all the class Fields				
	}
	
	public static void main(String[] args){		
		ClassA myClass = new ClassA();
		inspectObj(myClass);
	}
}
 */































package tutSlides1;



import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Driver {

	
	public static void inspectObj(Object obj ) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println("The class name is " + obj.getClass().getSimpleName());
		System.out.print("Methods: ");
		
		// 
		for (Method method : obj.getClass().getDeclaredMethods()) {
			method.setAccessible(true);
			System.out.print(method.getName()+" ");
		}
		System.out.println();
		System.out.print("Fields: ");
		for (Field field : obj.getClass().getDeclaredFields()) {
			System.out.print(field.getType().toString()+":");
			System.out.print(field.getName()+" ");
		}						
		
		Method testMethod = obj.getClass().getDeclaredMethod("run2", null);
		testMethod.setAccessible(true); // necessary when inspecting class has insufficient permissions, i.e when invoking private methods
		testMethod.invoke(obj, null);
					
		
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {		
		ClassA2 myClass = new ClassA2();
		inspectObj(myClass);
	}
}

/**NOTE: 
 * For interfaces you can use getInterfaces()
 * For parents you can use getSuperclass()
 * Next tutorial I'll cover how to handle Arrays 
 */

