package OOPs;

public class Test_Encapsulation {

	public static void main(String[] args) {
		Account sc = new Account();
		sc.setAcc_no(1451538135111l);
		sc.setName("SAI");
		sc.setAmount(1621.13f);
		System.out.println(sc.getAcc_no()+ " "+sc.getName()+ " "+sc.getAmount() );
	}
	

}
