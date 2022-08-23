package java_array;

public class SecondMinArray {
	public static int getSecondSmallest(int[]a, int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[1];
	}

	public static void main(String[] args) {
		int a[]= {1,3,45,32,42};
		int b[] = {2,4,131,312,1};
		System.out.println("THE SECOND SMALLEST NUMBER IS :"+getSecondSmallest(a,5));
		System.out.println("THE SECOND SMALLEST NUMBER IS :"+getSecondSmallest(b,5));
	}

}
