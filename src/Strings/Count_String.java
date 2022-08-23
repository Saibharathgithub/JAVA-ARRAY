package Strings;
import java.util.Scanner;
public class Count_String {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);  
       System.out.println("ENTER THE STRING : ");
       String string=sc.nextLine();
        int count = 0;    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }   
        System.out.println("Total number of characters in a string: " + count);    
    } 
}
