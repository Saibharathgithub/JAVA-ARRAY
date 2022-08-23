package java_array;

public class AscendingOrder_Array {

	public static void main(String[] args) {
		int a [] = {1,23,45,2,34,21,2};
		int temp = 0;
		System.out.println("ORIGINAL ORDER OF ARRAY IS : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		for(int i =0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("ASCENDING ORDER OF ARRAY IS : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	

	}

}
