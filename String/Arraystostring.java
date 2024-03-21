package String;

import java.util.Arrays;
import java.util.Iterator;

public class Arraystostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char [] ca = {'H','E','F','S','H','I','N','E'};
String s1 = new String(ca);
System.out.println(s1);


System.out.println("**************************");
String s2="";
for (int i = 0; i < ca.length; i++) {
	s2 = s2+ca[i];
}
System.out.println(s2);
	}

}
