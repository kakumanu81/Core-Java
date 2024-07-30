package com.controlStatemet;

import java.util.Scanner;

public class WhileLoopEample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("waiting for bus arriving()");
		int waitTime= sc.nextInt();
		
		sc.close();
		System.out.println("Your waiting for the Bus: ");
		
		while(waitTime>0) {
			System.out.println("Approximately " +waitTime+ " minutes remaining....");
			break;
			
			
		}
		
		

	}

}
