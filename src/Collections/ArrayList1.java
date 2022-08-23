package Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(100);
		a.add("SAI");
		a.add("True");
		a.add(134.78);
		a.add('C');
	System.out.println(a);
	System.out.println("NO.OF ELEMENTS IN ARRAY IS : "+a.size());
	a.remove(3);
	System.out.println("AFTER REMOVING THE ELEMENT IN ARRAY LIST IS : "+a);
	
	a.add(2,"BHARATH KUMAR ");
	System.out.println(a);
	
	System.out.println("reading of the elements in arraylist by using for loop");
	for(int i=0;i<a.size();i++) {
		   System.out.println(a.get(i));
	}
	
     System.out.println("reading of the elements in arraylist by using for each  loop");
     for(Object e:a) {
    	 System.out.println(e);
     }
     
     System.out.println("reading of the elements in arraylist by using iterator loop");
     Iterator it = a.iterator();
     while(it.hasNext()) {
    	 System.out.println(it.next());
     }
     
     ArrayList b = new ArrayList();
     b.add('a');
     b.add('x');
     b.add('c');
     b.add('z');
     b.add('y');
     b.add('b');
     System.out.println("ORIINAL ELEMENTS IN ARRAYLIST IS : ");
     System.out.println(b);
     Collections.sort(b);
     System.out.println(" AFTER SORTING IN ARRAYLIST ELEMENTS ARE : "+b);
     Collections.sort(b,Collections.reverseOrder());
     System.out.println("AFTER REVERSING THE ELEMENTS IN ARRAYLIST ARE :"+b);
    
    //converting of array into array list
     String [] s = {"SAI","BHARATH","KUMAR"};
     for(String i:s) {
    	   System.out.println(i);
 	}
     ArrayList x = new ArrayList(Arrays.asList(s));
     System.out.println(x);
     }
  

}
