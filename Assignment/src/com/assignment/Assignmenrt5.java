package com.assignment;

import java.util.Scanner;

public class Assignmenrt5 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter A Number: ");
		
		int enterNumber = sc.nextInt();
		
		if(enterNumber>30) {
			System.out.println(enterNumber + " weather is too hot take more water");			
		}
		if(enterNumber<10) {
			System.out.println(enterNumber + " weather is too cool wear the sweater");			
		}
		if(enterNumber>10 && enterNumber<30){
			System.out.println(enterNumber + "It is Normal Day");			
		}

	}

}
