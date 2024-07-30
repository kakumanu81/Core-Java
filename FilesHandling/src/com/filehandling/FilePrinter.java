package com.filehandling;

import java.io.IOException;
import java.io.PrintWriter;

public class FilePrinter {

	public static void main(String[] args) {
		String filename = "abc.txt";
		try {
			PrintWriter out = new PrintWriter(filename);
			out.print(false);
			out.print("Hello Mova");
			out.print(10.5);
			char[] ch = {'A','b','c'};
			out.println(ch);
			out.println("maya");
			out.println(10.5f);
			out.println(false);
			out.flush();
			out.close();
			System.out.println("data has retrived sucessfully from a file is : " + filename);
			
		
			
		}catch(IOException e) {
			System.out.println("an error occured while writeing to file "+ e.getMessage());
		}

	}

}
