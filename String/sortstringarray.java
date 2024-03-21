package String;

import java.util.Arrays;

public class sortstringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="hi welcome to hefshine";
String [] sa =s1.split(" ");
//System.out.print(Arrays.toString(sa));
for (int i = 0; i < sa.length; i++) {
	for (int j = i+1; j < sa.length; j++) {
		if(sa[i].length()>sa[j].length()) {
			
			String temp=sa[i];
			sa[i]=sa[j];
			sa[j]=temp;
			
		}
	}
	
}
System.out.print(Arrays.toString(sa));
	}

}
