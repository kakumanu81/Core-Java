package com.pattrenpratice;

import java.util.Scanner;

public class ChrismasPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no rows : ");
		int rows = sc.nextInt();
		
		for(int i = 0;i<rows;i++) {
			for(int  j = 0;j < rows - i - 1;j++) {
				System.out.print(" ");
			}
			for(int k = 0;k < 2 * i + 1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<3;i++) {
			for(int j = 0;j<rows-1;j++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}

	}

}
