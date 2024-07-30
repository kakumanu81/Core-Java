package com.assignment;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		
		//leap year
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day: ");
		int feb = sc.nextInt();
		
		String result = (feb>=29)? "it is a leap year":"it is not a leap year";
		System.out.println(result);
		
	}

}
