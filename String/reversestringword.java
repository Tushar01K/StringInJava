package String;

public class reversestringword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "you all studens are very very very good";
		String[] sa = s1.split(" ");

		for (int i = 0; i < sa.length; i++) {
			String s2 = sa[i];
			String s3 = "";
			for (int j = 0; j < s2.length(); j++) {
				s3 = s2.charAt(j) + s3;
			}
			sa[i]=s3;
		}
		for(String data :sa) {
			System.out.print(data+" ");
		}
	}

}
