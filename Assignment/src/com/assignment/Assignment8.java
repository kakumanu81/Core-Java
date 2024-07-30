package com.assignment;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age: ");
		int Age = sc.nextInt();
		
		if(Age>=18) {
			 
			System.out.println("Your Eligible for Test");
			
			if(Age>18) {
				
				System.out.println("Your Pass Your Eligibe for Licence");
			}
			else {
				System.out.println("Your Fail Try Next Time");
			}
			
		}
		else if(Age<18) {
			System.out.println("Your Not Eligible for Driving Test");
			
			
		}

	}

}
