package java_array;

public class Frequency_Array_Program {

	public static void main(String[] args) {
		char name[] = {'k','a','n','e','r','i','k','a'};
		for(int i=0; i< name.length - 1;i++) {
			for(int j= i+1;j<name.length;j++ )
			if(name[j] < name[i]) {
				char temp = name[i];
				name[i] = name[j];
				name[j] = temp;
			}
		}
		int []FreName = new int[name.length];
		int visited = -1;
		for(int i=0;i<name.length;i++) {
			char count =1;
			for(int j=i+1;j<name.length;j++) {
			    if(name[i]==name[j]) {
			    	count++;
			    	FreName[j]=visited;
			    }
			}
			if(FreName[i]!=visited) {
				FreName[i]=count;
			}
		}
		for(int i=0;i<FreName.length;i++) {
			if(FreName[i]!=visited) {
				System.out.println("Frequency of "+name[i]+" : "+FreName[i]);
			}
		}
		
	}

}
