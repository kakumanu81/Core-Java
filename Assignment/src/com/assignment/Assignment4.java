package com.assignment;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Celisus Temprature: ");
		double celisus = sc.nextDouble();
		
		double forigen = (celisus*9/5) + 32;
		
		System.out.println("The forigen temprature: "+forigen);

	}

}
