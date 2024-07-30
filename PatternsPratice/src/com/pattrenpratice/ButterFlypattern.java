package com.pattrenpratice;

import java.util.Scanner;

public class ButterFlypattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows : ");

		int size = sc.nextInt();

		// Upper part of the butterfly
		for (int i = 1; i<= size; i++) {
			for (int j = 1; j<= i; j++) {
				System.out.print("* ");
			}
			int spaces = 2 * (size - i);
			for (int j = 1; j<= spaces; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j<= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// Lower part of the butterfly
		for (int i = size; i>= 1; i--) {
			for (int j = 1; j<= i; j++) {
				System.out.print("* ");
			}
			int spaces = 2 * (size - i);
			for (int j = 1; j<= spaces; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j<= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}



	}

}
