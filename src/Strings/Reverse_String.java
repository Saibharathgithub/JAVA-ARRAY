package Strings;

public class Reverse_String {

	public static void main(String[] args) {
		String str = "1441";
		int len = str.length();
		String temp = str;
		String revstr="";
		for(int i=len-1;i>=0;i--) {
			revstr = revstr + str.charAt(i);
		}
		System.out.println("ORIGINAL STRING IS : "+str);
		System.out.println(" REVERSED STRING IS : "+revstr);
	if(revstr.equals(temp )) {
		System.out.println(" GIVEN STRING IS A PALINDROME ");
	}
	else {
		System.out.println("GIVEN STRING IS NOT  A PALINDROME ");
	}
	}
}
