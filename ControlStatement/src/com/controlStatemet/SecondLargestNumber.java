package com.controlStatemet;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		if (a > largest) {
			secondLargest = largest;
			largest = a;
		} else if (a > secondLargest && a != largest) {
			secondLargest = a;
		}

		if (b > largest) {
			secondLargest = largest;
			largest = b;
		} else if (b > secondLargest && b != largest) {
			secondLargest = b;
		}

		if (c > largest) {
			secondLargest = largest;
			largest = c;
		} else if (c > secondLargest && c != largest) {
			secondLargest = c;
		}

		System.out.println("Second largest number is: " + secondLargest);
	}

}
