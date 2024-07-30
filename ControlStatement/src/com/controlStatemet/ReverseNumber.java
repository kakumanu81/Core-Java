package com.controlStatemet;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		
		int reverseNumber = 0;
		int originalNumber = number;
		while (originalNumber != 0) {
			int reminder = originalNumber % 10;
			reverseNumber = reverseNumber * 10 + reminder;
			originalNumber = originalNumber / 10;
			
		}
		System.out.println("reversed of the given number " + number+ " is = "+ reverseNumber);

	}

}
