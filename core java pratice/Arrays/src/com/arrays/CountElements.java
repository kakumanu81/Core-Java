package com.arrays;

import java.util.Scanner;

public class CountElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Arrays size: ");

		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("enter the array elements");

		for (int i = 0; i < size; i++) {
			System.out.println("Element at index: " + i + " ");
			array[i] = sc.nextInt();

		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("element in array : " + i);
		}

	}

}
