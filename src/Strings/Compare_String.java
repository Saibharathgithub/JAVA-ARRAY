package Strings;

public class Compare_String {

	public static void main(String[] args) {
		String str1 = "sai bharath";
		String str2 = "sai bharath";
		String str3 = new String("sai bharath");
		String str4 = "sai bharath kumar";
		String str5 = "SAI BHARATH KUMAR";
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str4.equalsIgnoreCase(str5));
		
	}

}
