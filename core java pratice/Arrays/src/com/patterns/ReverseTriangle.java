package com.patterns;

public class ReverseTriangle {

	public static void main(String[] args) {

		/*for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10 - i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < 10; i++) {

			for (int j = 0;j<i; j++) {

				System.out.print("");
			}
			for (int k = 0; k < 10 - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		int rows =10;
		for(int i=10;i<rows;i++) {
			for(int j=0; j<=i;j++) {
				System.out.print("");
			}
			for(int k=0; k<10-i;k++) {
				System.out.print("*");
			}
		System.out.println();	
		}

	}

}
