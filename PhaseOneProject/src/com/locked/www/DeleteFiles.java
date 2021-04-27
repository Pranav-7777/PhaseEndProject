package com.locked.www;

import java.io.File;
import java.util.Scanner;

public class DeleteFiles {

	public void deleteFileFnc() {
		// TODO Auto-generated method stub
		Scanner deleteFileScan = new Scanner(System.in);
		System.out.print("Enter file name that you want to delete: ");
		String deleteFileName = deleteFileScan.nextLine();
		
		File myObj = new File("D:\\PhaseEndProject\\" + deleteFileName);
		if(myObj.delete()) {
			System.out.println("File deleted: " + myObj.getName());
		} else {
			System.out.println("Unable to delete file");
		}
		
	}
	}

