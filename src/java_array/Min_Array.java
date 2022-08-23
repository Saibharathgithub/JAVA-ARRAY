package java_array;

public class Min_Array {

	public static void main(String[] args) {
		int a[]= {200,383,8,9,1,25};
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("THE MANIMUM VALUE PF ARRAYS IS :"+min);
		// TODO Auto-generated method stub

	}

}
