package com.filehandling;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class AlternateMerge {
	public static void main(String[] args) {

		// Change these paths to your actual file paths
		String file1Path = "file1.txt";
		String file2Path = "file2.txt";
		String outputFilePath = "output.txt";

		try (BufferedReader reader1 = new BufferedReader(new FileReader(file1Path));
				BufferedReader reader2 = new BufferedReader(new FileReader(file2Path));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
			String line1 = reader1.readLine();
			String line2 = reader2.readLine();
			boolean turn = true;

			while (line1 != null || line2 != null) {
				if (turn && line1 != null) {
					writer.write(line1);
					writer.newLine();
					line1 = reader1.readLine();
				} else if (!turn && line2 != null) {
					writer.write(line2);
					writer.newLine();
					line2 = reader2.readLine();
				}
				turn = !turn;
			}

			System.out.println("Files merged successfully into " + outputFilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
