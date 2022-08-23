package java_array;

public class ThridMaxArray {

	public static void main(String[] args) {
		int a [] = {12,23,1,42,42,142,132};
		int max=0;
		int secondmax=0;
		int thirdmax=0;
		for(int i:a) {
			if(max<i) {
				thirdmax=secondmax;
				secondmax=max;
				max=i;
			} 
			else if(secondmax<i) {
				thirdmax=secondmax;
				secondmax=i;
			}
			else if(thirdmax<i) {
				thirdmax=i;
			}
		}
		System.out.println("THE THIRD MAX NUMBER IN GIVEN ARRAY IS : "+thirdmax);
		// TODO Auto-generated method stub

	}

}
