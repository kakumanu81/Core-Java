package com.arrays;

public class Average {

	public static void main(String[] args) {
		int []numbers = {10,20,30,40,50};
		double average;
		double sum=0;
		
		for(int number:numbers) {
			sum = sum+number;
		}
		average = sum/numbers.length;
		System.out.println("average elements of an array: "+average);
		

	}

}
