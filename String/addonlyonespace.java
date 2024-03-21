package String;

public class addonlyonespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="   hi  welcome  to hefshine   ";
		s1=s1.trim();
		System.out.println(s1);

		String ans="";
		for (int i = 0; i <s1.length(); i++) {
			if (s1.charAt(i)==' ' && s1.charAt(i+1)==' ') 
				continue;
				else 
			ans=ans+s1.charAt(i);
		}
		System.out.println(ans);
	}

}
