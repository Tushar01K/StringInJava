package String;

public class convertlowertoupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="ABcdEF";
		String upper=s1.toUpperCase();
		System.out.println(upper);
		
		String s2="";
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
			{
				char ch=(char)(s1.charAt(i)-32);
				s2=s2+ch;
			}
			else {
				
				s2=s2+s1.charAt(i);
				
			}
		}
		System.out.println(s2);
	}

}
