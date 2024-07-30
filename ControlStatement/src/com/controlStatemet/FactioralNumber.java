package com.controlStatemet;

import java.util.Scanner;

public class FactioralNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Factorial number");
		int number = scanner.nextInt();
		if (number < 0) {
		System.out.println("cannot find the factorial number with negative ");
		}else {
			int factorial = 1;
			for(int i = 1; i <= number; i++) {
				factorial = factorial * i;
				if (number < 0) {
					System.out.println("cannot find factorial of negative number");
					break;
				}
			}
			System.out.println("factorial of a given "+ number +"is = "+factorial);
		}
	}

}
