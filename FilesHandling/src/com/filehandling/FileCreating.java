package com.filehandling;

import java.io.IOException;
import java.io.File;

public class FileCreating {

	public static void main(String[] args) throws IOException {
		String directoryPath = "D:\\JavaEclipse\\FilesHandling";
		File directory = new File(directoryPath);
		if(directory.exists() && directory.isDirectory()) {
			String[] filesAndDirs = directory.list();
			if(filesAndDirs != null) {
				System.out.println("Files and Directory in : "+directoryPath);
				for(String name : filesAndDirs) {
					System.out.println(name);
				}
			}
			File[] filesList = directory.listFiles();
			if(filesList != null) {
				System.out.println("\n files and directories(absolute path: ");
				for(File file : filesList) {
					System.out.println(file.getAbsolutePath());
				}
			}
			else {
				System.out.println("Directory not found or is not a directory");
			}
			
		}

	}

}
