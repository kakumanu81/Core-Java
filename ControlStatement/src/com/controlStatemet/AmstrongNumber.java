package com.controlStatemet;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int a = sc.nextInt();
		int tem=a;
		int rev=0;
		
		while(a != 0) {
			int reminder = a%10;
			rev = rev+reminder*reminder*reminder;
			a /=10;
		}
		if (tem == rev) {
			System.out.println("It is an amstrong Number: "+ tem);
		}
		else {
			System.out.println("It is not a amstrong Number: "+ tem);
		}
		

		

	}

}
