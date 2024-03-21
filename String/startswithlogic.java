package String;

public class startswithlogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="abcdef";
String s2="abcd";
//startwith
boolean s3=s1.startsWith(s2);
System.out.println(s3);

if(s1.length()>=s2.length())
{
int cnt=0;
for (int i = 0; i < s2.length(); i++) {
	if(s1.charAt(i)==s2.charAt(i))
		cnt++;
	
}
if(cnt==s2.length())
	System.out.println(true);
else
	System.out.println(false);
}
else
	System.out.println(false);
	}

}
