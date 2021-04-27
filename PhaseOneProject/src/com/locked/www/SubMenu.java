package com.locked.www;

import java.util.Scanner;


public class SubMenu {
	void subMenuFnc() {
		System.out.println("Welcome to file manager");
		System.out.println("1. Create a file in  directory");
		System.out.println("2. Search a file from  directory");
		System.out.println("3. Delete  file from  directory");
		System.out.println("4. Back to main menu");
		Scanner subMenuScan = new Scanner(System.in);
		System.out.print("Enter a Valid Option: ");
		int subMenuOpt = 0;
		subMenuOpt = subMenuScan.nextInt();
		SubMenu subMenu = new SubMenu();
		switch(subMenuOpt) {
		case 1 :
			CreateFiles createFile = new CreateFiles();
			createFile.createFilesFnc();
			subMenu.subMenuFnc(); 
			System.out.println("");
			break;
		case 2 :
			FindFiles findFile = new FindFiles();
			findFile.searchFiles();
			subMenu.subMenuFnc();
			System.out.println("");
			break;
			
		case 3 :
			DeleteFiles deleteFile = new DeleteFiles();
			deleteFile.deleteFileFnc();
			subMenu.subMenuFnc();
			System.out.println("");
			break;
		
		case 4 :
			MainMenu mainMenu = new MainMenu();
			mainMenu.mainMenuMethod();
			System.out.println("");
			break;
		}
		
	}
}
