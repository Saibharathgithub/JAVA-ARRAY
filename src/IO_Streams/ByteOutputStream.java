package IO_Streams;
import java.io.*;
public class ByteOutputStream {
	public static void main(String args[])throws Exception{    
	      FileOutputStream fout1=new FileOutputStream("file1.txt");    
	      FileOutputStream fout2=new FileOutputStream("file2.txt");    
	        
	      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	      bout.write(65);    
	      bout.writeTo(fout1);    
	      bout.writeTo(fout2); 
	      bout.flush();    
	      bout.close();  
	      System.out.println("Success...");    
	     }    
}
