package com.patterns;

import java.util.Scanner;

public class RigthTriangle {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char)(97+(j))+" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char)(97+(9-j))+" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char)(97+(i))+" ");
			}
			System.out.println();
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char)(97+(9-i))+" ");
			}
			System.out.println();
		}

	}

}
