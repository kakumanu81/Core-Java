package com.controlStatemet;

public class WithoutArithmetic {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("the numberin  a : "+a+ " the number in b: "+b);

	}

}
