package com.arrays;

public class Copyarray {

	public static void main(String[] args) {
		int []sourceArray = {10,20,30,40,50};
		int []destinationArray=new int[sourceArray.length];
		
		for(int i=0;i<sourceArray.length;i++) {
			destinationArray[i]=sourceArray[i];
		}
		System.out.println("copied elemnet are: ");
		for(int number:destinationArray) {
			System.out.print(number+" ");
		}
		System.out.println();

	}

}
