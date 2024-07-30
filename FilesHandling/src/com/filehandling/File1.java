package com.filehandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class File1 {

	public static void main(String[] args) {
		String fileName = "abc.txt";
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
		    bw.write(65);
		    bw.newLine();
		    
		    char[] ch = {'A','B','C','D','E'};
		    bw.write(ch);
		    bw.newLine();
		    
		    bw.write("class is too enjoy");
		    bw.flush();
		    bw.close();
		    System.out.println("data has written to : "+ fileName);
		    
		    
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}

}
