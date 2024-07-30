package com.assignment;

import java.util.Scanner;

public class Assignment7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks: ");
		int marks = sc.nextInt();
		
		if(marks>90 && marks<100) {
			System.out.println("Your Grade is: 'O' " + marks);
		}
		else if(marks>80 && marks<90) {
			System.out.println("Your Grade is: 'S' " + marks);			
		}
		else if(marks>70 && marks<80) {
			System.out.println("Your Grade is: 'A' " + marks);			
		}
		else if(marks>60 && marks<70) {
			System.out.println("Your Grade is: 'B' " + marks);			
		}
		else if(marks>50 && marks<60) {
			System.out.println("Your Grade is: 'c' " + marks);			
		}
		else if(marks>40 && marks<50) {
			System.out.println("Your Grade is: 'D' " + marks);			
		}
		else {
			System.out.println("Your Fail");
		}
	}
	

}
