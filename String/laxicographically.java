package String;

public class laxicographically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcd";
		String s2="axyz";
		int compare=s1.compareTo(s2);
		System.out.println(compare);
		
		
		//hef logic
		int cnt=0;
		for (int i = 0; i < s1.length() && i<s2.length(); i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				System.out.println(s1.charAt(i)-s2.charAt(i));
				cnt++;
				break;
			}
			
		}
		if(cnt==0) {
			
			System.out.println(s1.length()-s2.length());
		}

	}

}
