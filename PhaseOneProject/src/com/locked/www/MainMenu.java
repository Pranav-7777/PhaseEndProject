package com.locked.www;

import java.util.Scanner;



public class MainMenu {
	void mainMenuMethod() {
		Scanner mainMenuScan = new Scanner(System.in);
		System.out.println("Users Menu:");
		System.out.println("1. Show current file names in diretory");
		System.out.println("2. Show options to Create, Delete, Search file");
		System.out.println("3. Exit App");
		System.out.println(" ");
		System.out.print("Enter a Valid Option: ");
		
		int mainMenuOpt = mainMenuScan.nextInt();
		ShowFiles showFiles = new ShowFiles();
		
		MainMenu mainMenu = new MainMenu();
		
		switch(mainMenuOpt) {
		
		case 1 :
			showFiles.showAllFiles();
			mainMenu.mainMenuMethod();
			System.out.println("");
			break;
			
		case 2 :
			SubMenu subMenu = new SubMenu();
			subMenu.subMenuFnc();
			System.out.println("");
			break;
		case 3 :
			System.out.println("You Exited the App");
			System.exit(0);
			break;
			
		default:
			System.out.print("Enter Valid Input: ");
			mainMenu.mainMenuMethod();
			System.out.println("");
			
		}
		mainMenuScan.close();
		
	}
	
}
