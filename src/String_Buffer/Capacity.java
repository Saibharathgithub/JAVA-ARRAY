package String_Buffer;

public class Capacity {
	public static void main(String [] args) {
		StringBuffer s= new StringBuffer();
		System.out.println(s.capacity());
		s.append("SAI");
		System.out.println(s.capacity());
		s.append("SAI BHARATH KUMAR");
		System.out.println(s.capacity());
	}

}
