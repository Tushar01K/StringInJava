package String;

import java.util.Arrays;

public class sortdictionarywise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "a aa ab abc hi welcome to hefshine";
		String[] sa = s1.split(" ");
		for (int i = 0; i < sa.length; i++) {
			for (int j = i + 1; j < sa.length; j++) {
				if (sa[i].compareTo(sa[j]) > 0) {

					String temp = sa[i];
					sa[i] = sa[j];
					sa[j] = temp;
				}

			}

		}
	System.out.println(Arrays.toString(sa));
	}

}
