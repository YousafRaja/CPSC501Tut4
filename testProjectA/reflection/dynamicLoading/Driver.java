/*
 * Up until now we've hard coded the instances of the classes we wish to inspect.
 * i.e
 *  		
 * 	ClassA3 myClass = new ClassA3();
	inspectObj(myClass);
 *
 * But what if we wanted to load the class at runtime?
 * 
 *
 */





















package dynamicLoading;

import java.lang.reflect.*;
import java.util.Scanner;

public class Driver {
	//Reflective Dynamic Loading 
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException  {
		
	    Scanner scan = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter class name"); //use package-qualified names i.e dynamicLoading.ClassA4 
	    String className = scan.nextLine();  // Read user input
				
		Class classReference = Class.forName(className);//loads class into memory and returns reference 
		Object classObject = classReference.newInstance();//creates the instance from the provided reference 		
		
		Method inspect = Class.forName(className).getMethod("print",new Class[] {});
		inspect.setAccessible(true);
		inspect.invoke(classObject, new Object[]{});
	}		
}