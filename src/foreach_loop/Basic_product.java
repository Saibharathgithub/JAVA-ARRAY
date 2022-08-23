package foreach_loop;

public class Basic_product {

	public static void main(String[] args) {
		int a[] = {20,30,40,50,60,70};
		int Product = 1;
		for(int i :a) {
			Product = Product * i;
		}
		System.out.println(Product);

	}

}
