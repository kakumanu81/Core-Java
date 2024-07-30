package com.assignment;

public class Pratice {
	

	public static void main(String[] args) {
		int number = 156;
		int original = number;
		int reverse = 0;
		int sum = 0;
		
		while(number != 0) {
			int digit = number % 10;
			sum += digit;
			reverse = reverse * 10 + digit;
			number /=10;
		
			
		}
		System.out.println(sum);
		System.out.println(reverse);
		

	}

}
