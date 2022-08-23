package java_array;

public class MaxArray {

	public static void main(String[] args) {
		int a[] = {1,256,989,282,92928,98};
		System.out.println("THE MAXIMUM NUMBER IN GIVEN ARRAY IS : ");
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
		// TODO Auto-generated method stub

	}

}
