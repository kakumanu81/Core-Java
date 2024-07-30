package com.arrays;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a index values: ");
		int size = sc.nextInt();
		int[] number = new int[size];
		
		System.out.println("Enter arrya elements ");
		for(int i=0;i<size;i++) {
			number[i]=sc.nextInt();
			
		}
		for(int i=0;i<number.length;i++) {
			
			if (number[i] %2 == 0) {
				System.out.println("the Even numbers in array "+number[i]);
			}
			else {
				System.out.println("the odd number in array "+number[i]);
			}
		}

	}

}
