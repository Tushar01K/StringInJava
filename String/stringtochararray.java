package String;

import java.util.Arrays;

public class stringtochararray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hefshine";
		char[] ca = s1.toCharArray();
		System.out.println(Arrays.toString(ca));

		System.out.println("********************************");

		char[] ca2 = new char[s1.length()];
		for (int i = 0; i < s1.length(); i++) {
			ca2[i] = s1.charAt(i);
		}
		System.out.println(Arrays.toString(ca2));

	}

}
