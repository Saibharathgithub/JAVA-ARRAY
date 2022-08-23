package java_array;

public class Duplicate_Array {

	public static void main(String[] args) {
		int [] a  =new int [] {1,2,3,3,34,4,4,5,5,6,6,7,7,8,9,0};
		System.out.println("DUPLICATE VALUES ARE :");
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}
		
		// TODO Auto-generated method stub

	}

}
