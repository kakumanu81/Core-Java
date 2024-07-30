package com.patterns;

public class Rombhus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 10;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <10-i; k++) {
				System.out.print(" * ");
			}
			System.out.println();

		}

	}
}
