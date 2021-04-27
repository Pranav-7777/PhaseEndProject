package com.locked.www;

import java.io.File;
import java.util.TreeSet;

public class ShowFiles {
	void showAllFiles() {
		File myObj = new File("D:\\PhaseEndProject\\");
		
		String[] names =  myObj.list();
		TreeSet<String> mySet = new TreeSet<>();
		if(names.length < 1) {
			System.out.println("No files Exists exists or is not a directory");
			} else {
			 for (String name : names) {
		         // Print the names of files and directories
		        mySet.add(name);
		     }
			 
			 for(String set : mySet) {
				 System.out.println(set);
			 }
		}
		
	}

}
