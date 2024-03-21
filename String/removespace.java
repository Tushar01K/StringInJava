package String;

import java.util.Iterator;

public class removespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "   hii   welcome   ";
		String s2 = s1.trim();
		
		System.out.println(s2);

		int start = 0;
		for (int i = start; i <=s1.length(); i++) {
			if (s1.charAt(i) != ' ') {
				start = i;
				break;
			}
		}

		int end = s1.length();
		for (int i = s1.length() - 1; i >= 0; i--) {
			if (s1.charAt(i) != ' ') {

				end = i;
				break;
			}

		}
		
		String s3="";
		for (int i = start; i <= end; i++) {
			s3=s3+s1.charAt(i);
			
		}
		System.out.println(s3);
	}

}
