package String;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method
	int [] a= {11,54,99,33,66,88,55};
	for (int i = 0; i < a.length; i++) {
		int cnt=0;
		for (int j = i+1; j < a.length; j++) {
			if(a[j]>a[i]) {
				cnt++;
			}
			
		}
		
	
	if(cnt==0) {
		System.out.println("leader not"+a[i]);
		
	}
	}
	}

}
