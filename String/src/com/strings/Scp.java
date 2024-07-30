package com.strings;

public class Scp {

	public static void main(String[] args) {
		String  s1 = new String("Codegnan");
		String s2 = s1.intern();
		System.out.println(s1 == s2);
		String s3  = "Codegnan";
		System.out.println(s2 == s3);
		
		System.out.println();
		String  s4 = new String("bhaskar");
		String s5 = s4.concat("Software");
		String s6  = s5.intern();
		String s7 = "bhaskarSoftware";
		System.out.println(s6 == s7);

		
		

	}

}
