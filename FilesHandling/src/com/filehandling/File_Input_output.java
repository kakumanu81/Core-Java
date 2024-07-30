package com.filehandling;

import java.io.File;
import java.io.IOException;

public class File_Input_output {

	public static void main(String[] args) throws IOException {

		/*
		 * File f = new File("Codegana2018"); //File f = new File("abc.txt");
		 * 
		 * // method exit System.out.println(f.exists());
		 * 
		 * //f.createNewFile(); f.mkdir(); System.out.println(f.exists());
		 * 
		 * File file1 = new File("test.text");
		 * System.out.println("File 1 Exists : "+file1.exists());
		 * 
		 * File parentdir = new File("users/username"); File file2 = new
		 * File(parentdir,"documents/report.doc");
		 * System.out.println("File 2 Exists : "+file2.exists());
		 * 
		 * File file3 = new File("users/username","documents/report.doc");
		 * System.out.println("File 3 excist : "+file3.exists());
		 * 
		 * file1.createNewFile(); System.out.println("");
		 */

		String directoryName = "codegnan123";
		String fileName = "abc.txt";
		String workingDirectory = System.getProperty("user.dir");

		File directory = new File(workingDirectory, directoryName);

		if (!directory.exists()) {
			boolean created = directory.mkdir();
			if (created) {
				System.out.println("Directory created " + directory.getAbsolutePath());
			} else {
				System.out.println("Failed to created Directory");
			}
			return;
		}
		File file = new File(directory, fileName);
		try {
			boolean created = file.createNewFile();
			if (created) {
				System.out.println("file created : " + file.getAbsolutePath());
			} else {
				System.out.println("File alredy Exists");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
