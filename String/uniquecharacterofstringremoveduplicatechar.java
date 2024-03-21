package String;

public class uniquecharacterofstringremoveduplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="abcdabcaba";
char [] s3=s1.toCharArray();
//System.out.println(s3);
for (int i = 0; i < s3.length; i++) {
	int cnt=0;
	for (int j = 0; j < i; j++) {
		if(s3[i]==s3[j])
			cnt++;
		//logi ne rahilay
	}
	if(cnt==0)
		System.out.print(s3[i]+" ");
	
}
	
}
	}

