package foreach_loop;

public class basic_program {

	public static void main(String[] args) {
		int a[] = {23,30,43,89,90};
		 int Total =0;
		for(int i:a) {
			Total = Total +i;
		}
		System.out.println(Total);
		// TODO Auto-generated method stub

	}

}
