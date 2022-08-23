package java_array;

public class Array_Copy {

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,6};
		int b[] = new int [a.length];
		b=a;
		System.out.println("ORIGINAL ARRAY IS :");
		for(int i=0;i<a.length;i++) {
					System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		System.out.println("COPY OF ARRAY IS : ");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+ " ");
		}
	}

}
