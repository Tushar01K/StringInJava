package String;

public class classcontainsdigitsornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="12345678";
int cnt=0;
for (int i = 0; i < s1.length(); i++) {
	if(s1.charAt(i)>='0' && s1.charAt(i)<='9') {
		
		cnt++;
	}
	
}

if(cnt==s1.length())
	System.out.println("All digits");
else
	System.out.println("Not all digits");
	}

}
