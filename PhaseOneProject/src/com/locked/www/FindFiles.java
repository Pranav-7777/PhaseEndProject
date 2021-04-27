package com.locked.www;

import java.io.File;
import java.util.Scanner;

public class FindFiles {

	public void searchFiles() {
		Scanner searchScan = new Scanner(System.in);
		System.out.print("Enter file name to search: ");
		String searchFileName = searchScan.nextLine();
		File searchObj = new File("D:\\PhaseEndProject\\" + searchFileName);
		
		
			if(searchObj.exists()) {
				System.out.println("Found the file: " + searchFileName);
			} else {
				System.out.println("File Not Found");
			}
			
		}
		
	}


