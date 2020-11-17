package as3_json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
//link to gson jar 
//https://repo1.maven.org/maven2/com/google/code/gson/gson/2.6.2/gson-2.6.2.jar
//more detailed example
//https://mkyong.com/java/how-do-convert-java-object-to-from-json-format-gson-api/

public class Driver {
   public static void main(String[] args) throws FileNotFoundException {
	   String filePath = "src/as3_json/myObj.json";
	   SimpleObject myObj = new SimpleObject();
	   AnotherObject obj2 = new AnotherObject();
	   obj2.bField = true;
	   myObj.numField = 3;
	   myObj.friend = obj2;	   
	   
	   PrintWriter out = new PrintWriter(filePath);
	   out.println(Encoder.java2json(myObj));
	   out.close();
	   
	  
	  String content = new Scanner(new File(filePath)).useDelimiter("\\Z").next();
	  
	  SimpleObject readObj = (SimpleObject) Encoder.json2java(content, SimpleObject.class);
	   System.out.println(content);
   }
}
