package com.filehandling;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Combine_To_Files {

	public static void main(String[] args) {

		try (PrintWriter pw1 = new PrintWriter(new FileWriter("file1.txt"))) {
			pw1.println("aaa");
			pw1.println("bbb");
			pw1.println("ccc");
		} catch (IOException e) {
			System.out.println("an error occured while writing to a file a file.txt " + e.getMessage());
		}
		try (PrintWriter pw2 = new PrintWriter(new FileWriter("file2.txt"))) {
			pw2.println(111);
			pw2.println(222);
			pw2.println(333);
		} catch (IOException e) {
			System.out.println("an error occured while writing to a file a file.txt " + e.getMessage());
		}
		try (BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
				BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
				PrintWriter pw3 = new PrintWriter(new FileWriter("file3.txt"))) {
			String lines;
			while ((lines = br1.readLine()) != null) {
				pw3.println(lines);
			}
			while ((lines = br2.readLine()) != null) {
				pw3.println(lines);
			}
			System.out.println("merge contents of file1.txt and file2.txt into file3.txt");
		} catch (IOException e) {
			System.out.println("an error occured while writing to a file a file.txt " + e.getMessage());
		}

	}

}
