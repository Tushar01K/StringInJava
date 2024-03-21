package String;

import java.util.Arrays;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 =" you all are very very good student";
String [] sa =s1.split(" ");
 int start=0;
 int end=sa.length-1;
while(start<=end){
	
	String temp=sa[start];
	sa[start]=sa[end];
	sa[end]=temp;
	start++;
	end--;
	
} 
String s2="";
for (int i = 0; i < sa.length; i++) {
	s2=s2+sa[i]+" ";
}

System.out.println(s2.substring(0, s1.length()));
System.out.println(Arrays.toString(sa));
	}

}
