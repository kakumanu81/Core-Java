package com.packages.exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exception_Handling_Try_Catch  {

	public static void main(String[] args) throws FileNotFoundException {
		/*System.out.println("Statement_1");
		System.out.println("Statement_2");
		System.out.println("Statement_3");
		
		try {
		//System.out.println(10/0);
		}
		catch(ArithmeticException e){
			//e.printStackTrace();
			System.out.println("Statement_4");
		}
		
		
		System.out.println("Statement_5");
		//--------------------------------
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}*
		//------------------------------------
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		 
		// finally block
		try {
			System.out.println("Statement_1");
			System.out.println("Statement_2");
			System.out.println(10/0);
			System.out.println("Statement_3");
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Statement_4");
		}
		finally {
			System.out.println("Statement_5");
			System.out.println("Statement_6");
		}
		System.out.println("Statement_7");
	
		throw new ArithmeticException("/by zero");
		try {
		PrintWriter pw =new PrintWriter("codegnan.txt");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Hai");
		}*/
		
		PrintWriter pw =new PrintWriter("codegnan.txt");
		System.out.println("Hello");
		
		}
	}


