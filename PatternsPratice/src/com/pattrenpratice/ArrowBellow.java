package com.pattrenpratice;

import java.util.Scanner;

public class ArrowBellow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number of rows : ");
		int rows = sc.nextInt();
		for (int i = rows; i >= 1; i--) {
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
