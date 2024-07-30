package com.assignment;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a amount");
		
		int enterAmount = sc.nextInt();
		
		int totalAmount = 40000;
		
		
		
		if(enterAmount<totalAmount) {
			totalAmount=totalAmount-enterAmount;
			System.out.println("Your withdraw Amount: " + enterAmount );
			System.out.println("remaing balance: "+ totalAmount);
		}
		else {
			System.out.println("Your Transaction denied check Balance ");
		}
		   
	}

}
