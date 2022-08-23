package java_array;

public class ArrayFrequency {

	public static void main(String[] args) {
	char arr []= {'s','a','i','b','h','a','r','a','t','h','k','u','m','a','r'};
	int [] visitedarr = new int[arr.length];
	int visited=-1;
	for (int i=0;i<arr.length;i++) {
		char count =1;
		for (int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				visitedarr[j]=visited;
			}
		}
		if(visitedarr[i]!=visited) {
			visitedarr[i]=count;
		}
	}
	for(int i=0;i<visitedarr.length;i++) {
		if(visitedarr[i]!=visited) {
			System.out.println("Frequency of "+arr[i]+" : "+visitedarr[i]);
		}
	}

	}

}
