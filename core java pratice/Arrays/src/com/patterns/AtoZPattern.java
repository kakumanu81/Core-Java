package com.patterns;

public class AtoZPattern {

	public static void main(String[] args) {

		int rows = 10, columns = 10;

		/*for (int i = 0; i < 10; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print((char) (97 + j) + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print((char) (106 - j) + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print((char) (97 + i) + " ");
			}
			System.out.println();
		}*/
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print((char) (106- i) + " ");
			}
			System.out.println();
		}

	}

}
