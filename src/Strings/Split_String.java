package Strings;

public class Split_String {

	public static void main(String[] args) {
		String str = "SAI BHARATH KUMAR";
		String[] str1=str.split("\\s");
		for(String i:str1) {
			System.out.println(i);
		}
	}

}
