package String;

public class findfreqofcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		String s1 = "abcadabaaacabc";
		char ch=0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < s1.length(); i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					cnt++;
				}
			}
			if (cnt == 0) {
				int fre = 0;
				for (int j1 = 0; j1 < s1.length(); j1++) {
					if (s1.charAt(i) == s1.charAt(j1))
						fre++;

				}
				if (fre > max) {
					max = fre;
				 ch = s1.charAt(i);

					System.out.println(ch + " " + max);

				}
			}

		}

	}

}
