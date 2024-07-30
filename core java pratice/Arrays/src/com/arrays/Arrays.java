package com.arrays;

public class Arrays {

	public static void main(String[] args) {
	
		/*String[] fruits = {"banana","apple","guava","orange","pinapple"};
		System.out.println(fruits.length);
		
		for(String fruit:fruits) {
			System.out.print(fruit+" ");
		}
		*/
		/*
		int [][] a = {{10,20,30},{40,50}};
		
		for (int i = 0; i<a.length;i++) {
			for (int j = 0; j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
		}*/
		int [][] a = {{10,20,30},{40,50,60}};	
		for (int [] i:a) {
			for(int j:i) {
				System.out.print(j+" ");
			}
		}
		}

}
