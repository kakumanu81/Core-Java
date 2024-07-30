package com.strings;

public class StringDemo {

	public static void main(String[] args) {
		String s = new String("Codegnan");
		s.concat("Software");
		System.out.println(s);
		
		//append method
		StringBuffer s1 = new StringBuffer("Codegnan");
		s1.append(" solution");
		System.out.println(s1);
		
		String s2 = new String("Codegnan");
		String s3 = new String("Codegnan");
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		
		StringBuffer s4 = new StringBuffer("Codegnan");
		StringBuffer s5 = new StringBuffer("Codegnan");
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
	    System.out.println();
		
		String s6 = new String("Codegnan");
		String s7 = new String("Codegnan");
		String s8 = "codegnan";
		String s9 = "codegnan";
		System.out.println(s6==s7);
		System.out.println(s6==s8);
		System.out.println(s8==s9);
		
		System.out.println();
		String s10 = new String("Codegnan");
		s10.concat("Software");
		s10=s10.concat(" solutions");
		System.out.println(s10);
		s10="Codegnan_it";
		System.out.println(s10);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
