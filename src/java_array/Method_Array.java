package java_array;

public class Method_Array {
	static void m1(int a[]) {
		int min = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		int a[] = {29,28,980,1,2,3,};
		m1(a);
		// TODO Auto-generated method stub

	}

}
