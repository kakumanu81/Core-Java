package com.strings;

public class KeyWords_Methods {
	public static void main(String args[]) {
		 
		String s1 = "Hello";
		String s2 = "World";
		String concatnated= s1.concat(s2);
		System.out.println("Concat : " + concatnated);
		System.out.println();
		
		String s = "Hello";
		int len = s.length();
		System.out.println("Length :" +len);
		System.out.println();
		
		char ch = s.charAt(1);
		System.out.println("Char : "+ch);
		System.out.println();
		
		String s3 = "Boy";
		String s4 = "Box";
		int compareSort = s3.compareTo(s4);
		System.out.println("compare and sort : " + compareSort);
		System.out.println();
		
		String s5 = "hello";
		String s6 = "Hello";
		System.out.println("Equals : "+s5.equals(s6));
		System.out.println();
		
		String s7 = "hello";
		String s8 = "Hello";
		System.out.println("ingnore Equals: "+s7.equalsIgnoreCase(s8));
		System.out.println();
		
		String s9 = "Hello World";
		System.out.println("Start : "+s9.startsWith("World"));
		System.out.println();
		System.out.println("ends : " +s9.endsWith("World"));
		System.out.println();
		System.out.println("IndexOf : "+s9.indexOf("o"));
		System.out.println();
		System.out.println("Last index of :" + s9.lastIndexOf("o"));
		System.out.println();
		System.out.println("replace : "+s9.replace('o','x'));
		System.out.println();
		System.out.println("SubString : "+s9.substring(6));
		System.out.println();
		System.out.println("Substring : "+s9.substring(2,7));
		System.out.println();
		System.out.println("LowerCase : " +s9.toLowerCase());
		System.out.println();
		System.out.println("UpperCase : "+s9.toUpperCase());
		System.out.println();
		
		String s10 = "  Hello World   ";
		System.out.println(s10.trim());
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
