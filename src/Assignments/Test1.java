package Assignments;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Properties;
import java.util.stream.Collectors;

public class Test1 {
	    public String convert(Object object) throws IllegalAccessException, IOException{
	        Class<?> clapp = object.getClass();
	        HashMap<String, String> variables = new HashMap<>();
	        for(Field field: clapp.getDeclaredFields()){
	        	field.setAccessible(true);
	            if(field.isAnnotationPresent(ChangeValue.class)){
	                variables.put(getValue(field), field.get(object).toString());
	            }else{
	                variables.put(field.getName(), field.get(object).toString());
	            }
	        }

	        String str = variables.entrySet().stream().map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"").collect(Collectors.joining(","));
	        FileWriter fw = new FileWriter("C:\\Users\\Admin\\eclipse-workspace\\JAVA ARRAY\\src\\Assgnments\\Employee");
	        fw.write(str);
	        fw.close();
	        return str;
	    }
	    
	    private String getValue(Field field) {
			return field.getAnnotation(ChangeValue.class).value();
		}
	    
		public static Object jsonObjectToObject(Object object) throws IOException, IllegalArgumentException, IllegalAccessException	 {
	    	Class<?> class2 = object.getClass();
	    	FileReader reader=new FileReader("C:\\Users\\Admin\\eclipse-workspace\\JAVA ARRAY\\src\\Assignments\\Reader_Employee");
	    	Properties property=new Properties();	
	    	property.load(reader);	
	    	reader.close();
	    	for(Field field :class2.getDeclaredFields()){
	    		field.setAccessible(true);
	    		if(field.isAnnotationPresent(ChangeValue.class)) {
	    			Class<?> type=field.getType();
		    		if(type.equals(int.class)){
		    			String name=field.getAnnotation(ChangeValue.class).value();
		    			int temp=Integer.parseInt(property.getProperty(name));
		    			field.set(object, temp);}
		    		
		    		else 
		    			if(type.equals(String.class)){
		    			String name=field.getAnnotation( ChangeValue.class).value();
		    			String value = property.getProperty(name);
		    			field.set(object,value);}
	    		}
	    		else{
	    			String value = property.getProperty(field.getName());
	    			field.set(object, Integer.parseInt(value));
	    		}
	    	}
	    	return object;
		}
}

