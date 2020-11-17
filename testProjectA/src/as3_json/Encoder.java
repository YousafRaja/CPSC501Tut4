package as3_json;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Encoder {
	
	public static String java2json(Object obj) {		 
		  return new GsonBuilder().create().toJson(obj);		  
	}
	
	public static Object json2java(String json, Class objClass) {		
        // Convert JSON File to Java Object        
		return new Gson().fromJson(json, objClass);		  
	}

}
