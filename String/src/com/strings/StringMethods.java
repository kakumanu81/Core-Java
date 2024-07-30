package com.strings;

public class StringMethods {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Codegana").insert(4, "it solutions").delete(4, 7).reverse().append("solutions").insert(18, "abs");
		System.out.println(sb.toString());

	}

}
