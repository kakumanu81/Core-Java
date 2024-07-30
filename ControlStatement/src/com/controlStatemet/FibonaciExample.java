package com.controlStatemet;

import java.util.Scanner;

public class FibonaciExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of fibnoci series");
		int numOfTerms = scanner.nextInt();
		int firstTerm=0;
		int secondTerm=1;
		System.out.println("fibnoci series");
		System.out.print(firstTerm+" "+secondTerm);
		for(int i=1;i<=numOfTerms;i++) {
			int nextTerm = firstTerm+secondTerm;
			System.out.println(" "+nextTerm+" ");
			firstTerm=secondTerm;
			secondTerm=nextTerm;
			nextTerm=firstTerm;
		}
		

	}

}
