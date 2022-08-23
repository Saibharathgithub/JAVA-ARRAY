package java_array;

public class ThirdMinArray {

	public static void main(String[] args) {
		int a [] = {23,1,42,42,142,132};
		int min=a[0];
		int secondmin=a[0];
		int thirdmin=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			} 
			else if(secondmin>a[i]) {
				secondmin=a[i];
			}
			else if(thirdmin>a[i]) {
				thirdmin=a[i];
			}
		}
		System.out.println("THE FIRST  MIN NUMBER IN GIVEN ARRAY IS : "+min);
		System.out.println("THE SECOND MIN NUMBER IN GIVEN ARRAY IS : "+secondmin);
		System.out.println("THE THIRD MIN NUMBER IN GIVEN ARRAY IS : "+thirdmin);
	}

}
