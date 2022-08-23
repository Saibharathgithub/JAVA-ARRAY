package ControlStatements;
public class Vijay_Loop {

	public static void main(String[] args) {
		String str = "my name is vijay";
	 StringBuffer newStr=new StringBuffer(str); 
		int str1 = str.indexOf("v",0);
		System.out.println("INDEX OF V ELEMNET IN STRING IS "+str1);
		System.out.println("ORIGINAL STRING IS :" +str);
	     newStr.setCharAt(11,Character.toUpperCase(str.charAt(11)));
		System.out.println("NEW STRING AFTER CONVERISON IS :" +newStr);
		}
}
