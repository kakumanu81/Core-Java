package com.controlStatemet;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Day Feb : ");
		
		int a = sc.nextInt();
		
		if(a>28) {
			System.out.println("It is leap Year");
		}
		else {
			System.out.println("It is not a leap year");
		}

	}

}
