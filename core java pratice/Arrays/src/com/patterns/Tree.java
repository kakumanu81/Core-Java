package com.patterns;

public class Tree {

	public static void main(String[] args) {

		int n = 5; // Number of levels in the tree (adjust as needed)

		// Loop to print the tree pattern
		for (int i = 0; i < n; i++) {
			// Print spaces before the stars
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			// Print stars
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}

			// Move to the next line after each row is printed
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			// Print spaces before the stars
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			// Print stars
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}

			// Move to the next line after each row is printed
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			// Print spaces before the stars
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			// Print stars
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}

			// Move to the next line after each row is printed
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			// Print spaces before the stars
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			// Print stars
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}

			// Move to the next line after each row is printed
			System.out.println();
		}


		// Printing the trunk of the tree
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < n - 1; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}

}
