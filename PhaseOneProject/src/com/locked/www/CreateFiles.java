package com.locked.www;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFiles {

	public void createFilesFnc() {
		// TODO Auto-generated method stub
		Scanner createFileScan = new Scanner(System.in);
		System.out.print("Enter name of the file that you want to create: ");
		String createFileName = createFileScan.nextLine();
	File myObj = new File("D:\\PhaseEndProject\\" + createFileName);
	try {
	if(myObj.createNewFile()) {
		System.out.println("New File Created: " + myObj.getName());
	} else {
		System.out.println("Failed To Create File: " + myObj.getName());
	}
	}
	catch(IOException e){
		System.out.println("An Error Occured");
		e.printStackTrace();
	}

	}
	}


