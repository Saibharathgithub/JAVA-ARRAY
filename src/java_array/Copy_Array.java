package java_array;

public class Copy_Array {

	public static void main(String[] args) {
		char[] copyfrom ={'r','a','m','a','s','a','i','b','h','a','r','a','t','h'};
		char [] copyto = copyfrom;
		System.arraycopy(copyfrom,0,copyto,0,copyfrom.length);
		for(int i=0;i<copyfrom.length;i++) {
			System.out.print(copyfrom[i] +" ");
		}
		System.out.println();
		System.out.println("copyarray is : ");
		for(int i=0;i<copyto.length;i++) {
			System.out.print(copyto[i]+ " ");
		}

	}

}
