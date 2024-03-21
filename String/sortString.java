package String;

import java.util.Arrays;

public class sortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="34521";
		char [] ca=s1.toCharArray();
		for (int i = 0; i < ca.length; i++) {
			for (int j = i+1; j < ca.length; j++) {
				if(ca[i]>ca[j]) {
					
					
					char temp=ca[i];
					ca[i]=ca[j];
					ca[j]=temp;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(ca));

		String s2 = new String(ca);
		System.out.println(ca);
	}

}
