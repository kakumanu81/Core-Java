package com.arrays;

public class TargetArray {

	public static void main(String[] args) {
		int[] number = { 10, 20, 30, 40, 50, 10, 10, 10 };
		int target = 10;
		int count = 0;

		for (int i = 0; i < number.length; i++) {
			if (target == number[i]) {
				count++;
			}
		}
		System.out.println(count);

	}

}
