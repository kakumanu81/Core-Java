package com.pattrenpratice;

import java.util.Scanner;

public class ArrowPattern {

	public static void main(String[] args) {
		// Arrow pattern
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of rows: ");
		int rows = sc.nextInt();

		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
