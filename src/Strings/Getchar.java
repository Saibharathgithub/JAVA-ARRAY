package Strings;

public class Getchar {

	public static void main(String[] args) {
		String str = "Sai bharath kumar";
		char ch[] = new char[10];
		try {
			str.getChars(4,11,ch,0);
			System.out.println(ch);
		}catch(Exception ex) {System.out.println(ex);}
	}

}
