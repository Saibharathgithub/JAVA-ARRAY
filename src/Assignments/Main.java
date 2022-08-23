package Assignments;
	import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.stream.Collectors;

	//import java.lang.reflect.Field;
	public class Main {
		public static void main(String args[]) throws IOException,Exception{
			
			Employee employee = new Employee(356722,"SAI",123);
			Test1 test=new Test1();
			//String s=test.convert(employee);
			//System.out.println(s);
			//System.out.println(employee.getEmployeeId() + " " + employee.getEmployeeName() + " " + employee.getEmployeeSalary());
			Employee employee1=(Employee) Test1.jsonObjectToObject(new Employee());
			System.out.println(employee1.toString());
		}
		
	}
	 

