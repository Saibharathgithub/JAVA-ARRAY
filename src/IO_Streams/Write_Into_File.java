package IO_Streams;
import java.io.*;
public class Write_Into_File {

	   public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("testout.txt");  
             FileOutputStream fout2=new FileOutputStream("testout1.txt");  
             String s="2";
             byte b[]=s.getBytes(); 
             fout2.write(b);
             fout.write(b);
             fout.close(); 
             fout2.close();
             System.out.println("success...");    
            }
           catch(Exception e){
        	   System.out.println(e);
            }  
	}
	   
}
