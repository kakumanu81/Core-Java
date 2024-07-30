package com.controlStatemet;

public class WithoutTemVarialble {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("the X number is : " + x + " the y number is : "+y);

	}

}
