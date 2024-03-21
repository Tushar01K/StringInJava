package String;

public class endswithlogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdef";
		String s2 = "ef";
		boolean s3 = s1.endsWith(s2);
		System.out.println(s3);

		if (s1.length() >= s2.length()) {
			int s1index = s1.length() - 1;
			int s2index = s2.length() - 1;
			int cnt = 0;
			while (s2index >= 0) {

				if (s2.charAt(s2index) == s1.charAt(s1index)) 
					cnt++;
				
				s1index++;
				s2index--;
			
			}
			if (cnt == s2.length())
				System.out.println(true);
			else
				System.out.println(false);

		} else
			System.out.println(false);

	
}}
