package String;

public class replaceAlphabetes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 ="hefshine";
//		String s2=s1.replace('e', 'z');
//		System.out.println(s1);
//		System.out.println(s2);
		
		String s1="hefshine";
		String s2 = "hEfshine";
		int compareTo=s1.compareTo(s2);
		System.out.println(compareTo);
		
		boolean s=s1.equals(s2);
	System.out.println(s);
		
		
		int comparetoignore=s1.compareToIgnoreCase(s2);
		System.out.println(comparetoignore);
		
		
		
		int codepoint=s1.codePointAt(4);
		System.out.println(codepoint);
		
		
		char ch=s1.charAt(4);
		System.out.println(ch);
		String s3="hef";
		boolean startwith=s1.startsWith("hef");
		System.out.println(startwith);
		
		
		
		boolean endwith=s1.endsWith("shi");
		System.out.println(endwith);
		
		
		boolean contains = s1.contains("hef");
		System.out.println(contains);
		
		String s4="software";
		 String s5=s1.concat(s4);
		 System.out.println(s5);
		 
		 String s6="hefshinehefshinehefshine";
		 int lastindex=s6.lastIndexOf("shine");
		 System.out.println(lastindex);
		 
		 
		 boolean blank=s6.isBlank();
		 System.out.println(blank);
		 
		 boolean empty=s6.isEmpty();
         System.out.
         println(empty);		



           int indexof=s6.indexOf("hello");
           System.out.println(indexof);
           
           String s7=s4.toLowerCase();
           System.out.println(s7);
           
           
           
           String s8 = s4.toUpperCase();
           System.out.println(s8);
           
           String s9=s4.repeat(4);
           System.out.println(s9);
           
           String s10=s4.substring(0,4);
           System.out.println(s10);
           
           String [] s11=s4.split("t");
           System.out.println(s11);
           
           
           String s12="Tejashri";
           char [] ca = {'T' , 'j','r'};
           String s13=new String(ca);
           System.out.println(s13);
           
           
           char[] ca1 =s12.toCharArray();
           System.out.println(ca1);
           
           
           String s14 = s12.trim();
           System.out.println(s14);
	
	}

}
