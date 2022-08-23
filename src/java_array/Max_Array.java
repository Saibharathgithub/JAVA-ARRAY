package java_array;

public class Max_Array {

	public static void main(String[] args) {
		int a [] = {20,50,200,900,578,};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("THE MAXIMUM VALUE IN ARRAY ELEMNETS IS :" +max);
		// TODO Auto-generated method stub

	}

}
