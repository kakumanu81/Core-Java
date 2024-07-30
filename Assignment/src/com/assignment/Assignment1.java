package com. assignment;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// Enter Employee Details
		
		System.out.println("Enter Your Name: ");
		String a = sc.next();
		System.out.println("Enter Your Id-NO");
		String b = sc.next();
		System.out.println("Enter Your Dept");
		String c = sc.next();
		System.out.println("Enter Your Salary");
		int d = sc.nextInt();
		System.out.println("Enter Your WorkingDays");
		int e = sc.nextInt();
		
		System.out.println(" Name: "+a+" Id-No: "+b+" Dept: "+c+" Salary: "+d+" WorkingDays: "+e);
		
		
		
	}

}
