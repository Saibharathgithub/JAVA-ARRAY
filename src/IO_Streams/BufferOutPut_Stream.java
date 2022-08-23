package IO_Streams;
import java.io.*;
public class BufferOutPut_Stream {
		public static void main(String args[])throws Exception{    
		     FileOutputStream FOS=new FileOutputStream("testout1.txt");    
		     BufferedOutputStream BOS=new BufferedOutputStream(FOS);    
		     String s="RAMA SAI BHARATH KUMAR";    
		     byte b[]=s.getBytes();    
		     BOS.write(b);    
		     BOS.flush();    
		     BOS.close();    
		     FOS.close();    
		     System.out.println("success");    
		} 
}
