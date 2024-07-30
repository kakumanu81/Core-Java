package com. arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array index:");
		int size = sc.nextInt();
		int[] number = new int[size];
		System.out.println("Enter array elements:");
		int i=0;
		
		for( i=0;i<size;i++) {
			number[i] = sc.nextInt();
		}
		for( i=size-1;i<number.length;i--) {
			System.out.println("elements in array: "+number[i]);
		}
		

	}

}
