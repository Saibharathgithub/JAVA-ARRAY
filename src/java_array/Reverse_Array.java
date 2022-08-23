package java_array;

public class Reverse_Array {

	public static void main(String[] args) {
		char name[] =new char [] {'s','a','i'};
		System.out.println("ORIGINAL NAME IS : ");
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println(" ");
		System.out.println("REVERSED NAME IS : ");
		for(int i=name.length-1;i>=0;i--) {
			System.out.print(name[i] +" ");
		}
		// TODO Auto-generated method stub

	}

}