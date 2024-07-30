package com.controlStatemet;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		/*
		System.out.println("Enter a Number: ");
		int enterNumber = sc.nextInt();
		
		if (enterNumber > 0) {
			System.out.println("Your Enterd Number " + enterNumber + " Positive Number");
		}else {
			System.out.println("Your Enter Number "+ enterNumber+ " Negative Number");
		}*/
		
		System.out.println("Enter your favo Brand");
		String brand = sc.next();
		
		if(brand.equalsIgnoreCase("kf")) {
			System.out.println("It is Strong");
		}
		else if(brand.equalsIgnoreCase("kc")) {
			System.out.println("It is Weak");
		}
		else if(brand.equalsIgnoreCase("fc")) {
			System.out.println("It is children");
		}
		else {
			System.out.println("It is not available ");
		}
		
		

	}

}
