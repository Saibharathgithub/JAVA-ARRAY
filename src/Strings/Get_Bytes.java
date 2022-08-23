package Strings;

public class Get_Bytes {

	public static void main(String[] args) {
		String str = "abcdef";
		byte b[] = str.getBytes();
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
