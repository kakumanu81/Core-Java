package com.filehandling;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileReaders{
	public static void main(String[] args) {
		String fileName="\"D:\\JavaEclipse\\FilesHandling\\abc.txt\"";
		
		try {
			FileReader fr = new FileReader(fileName);
			int i = fr.read();
			while(i!=-1) {
				System.out.print((char)i);
				i = fr.read();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
		