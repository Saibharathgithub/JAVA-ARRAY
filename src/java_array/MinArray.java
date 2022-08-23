package java_array;

public class MinArray {

	public static void main(String[] args) {
		int a [] = {1,2,3,45,67,3,};
		int min =a[0];
		System.out.println("THE MINIMUN NUMBER IN GIVEN ARRAY IS : ");
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);


	}

}
