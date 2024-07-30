package com.arrays;

import java.util.Scanner;

public class SumElemnts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array index: ");

		int size = sc.nextInt();
		int[] number = new int[size];
		int sum = 0;
		System.out.println("Enter array elemnets");

		for (int i = 0; i < size; i++) {
			number[i] = sc.nextInt();
		}
		for (int i = 0; i < number.length; i++) {
			sum = sum + number[i];
		}
		System.out.println("Total number of array: " + sum);

	}

}
