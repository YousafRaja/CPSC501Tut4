
/*
 * Exercise (Optional): Loading an array.
 * 
 * Fill in the missing code snippets.
 * The code below should take in an object of type ClassA3 and introspect the myNums integer array. 
 * 
 * Time: 10-15 mins
 * 
 *  
 public class Driver {
	
	public static void inspectObj(Object obj ){
		// ...				
	}
	
	public static void inspectField(Field f, Object obj, int depth){
		// ... 			
	}
	
	
	public static void main(String[] args){		
		ClassA myClass = new ClassA();
		inspectObj(myClass);
	}
}
 */
















package tutSlides2;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.Arrays;

public class Driver {

	static char indentChar = '\t';
	
	
	public static void inspectObj(Object obj ) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for (Field field : obj.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			inspectField(field, obj, 0);
		}									
	}
	
	private static void inspectField(Field f, Object obj, int depth) throws IllegalArgumentException, IllegalAccessException {
        Object fval = f.get(obj);
        if (fval == null) return;
        if (fval.getClass().isArray()){
            Object[] arr = null;
            if (fval.getClass().getComponentType().isPrimitive()) {
                arr = new Object[Array.getLength(fval)];
                for(int i = 0; i < arr.length; ++i)
                    arr[i] = Array.get(fval, i);
            } else arr = (Object[]) fval;
            String tabs = "";
            for(int i = 0; i<depth; i++)tabs += indentChar;
            System.out.println(MessageFormat.format("array\n{0}\n{1}\n{2}", tabs+"Length: "+arr.length, tabs+"Component Type: "+f.getType().getTypeName(), tabs+"Array Values:"+Arrays.toString(arr))); 
        }
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {		
		ClassA3 myClass = new ClassA3();
		inspectObj(myClass);
	}
	
	/*
	 *  Notes: 
	 *  - Remember that your initial object could also be an array.   
	 *  
	 */
	
}

