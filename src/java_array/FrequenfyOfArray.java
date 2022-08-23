package java_array;

public class FrequenfyOfArray {

	public static void main(String[] args) {
		char name [] = {'g','o','o','d'};
		int Fname[] = new int  [name.length];
		int visited = -1;
		for(int i=0;i<name.length;i++) {
			char count = 1;
			for(int j=i+1;j<name.length;j++) {
				if(name[i]==name[j]) {
					count++;
					Fname[j]=visited;
				}
			}
			if(Fname[i]!=visited) {
				Fname[i]=count;
			}
		}
		for(int i=0;i<Fname.length;i++) {
			if(Fname[i]!=visited) {
				System.out.println("Frequency of "+name[i]+" : "+Fname[i]);
			}
		}
		// TODO Auto-generated method stub

	}

}
