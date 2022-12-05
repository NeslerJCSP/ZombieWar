/*
	North Seelinger 
*/

package zombiewar;

import java.util.Scanner;  // Import the Scanner class

public class Application {

	public Manager thisBattle = new Manager();
	public static boolean running = true;
	public static Scanner in;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doLogo();
		doStartUp();
		while(running) {
			menu();
		}
		System.out.println("System Exited!");
	}
	
	
	private static void doStartUp() {
	    //initializes all objects for program.
		in = new Scanner(System.in);  // creates scanner. 

	}
	
	
	
	private static void menu() {
		doMenuText();
		switch(doScanner()) {
		  case -1:
			System.out.println("Not a valid input! Please Try Again!");
		    break;
		  case 0:
				System.out.println("Not a valid input! Please Try Again!");
		  case 1:
				System.out.println("Begining a Zombie War!");
				doBattle();
		    break;
		  case 2:
				System.out.println("Exiting Zombie War!");
				running = false;
				return;
		  default:
				System.out.println("Not a valid input! Please Try Again!");
		}
		
		
	}
	
	private static void doBattle() {
		//runs the battle through the Manager object.
		thisBattle.createCombatantsArray();
	}
	
	
	private static int doScanner() {
		//returns an integer based on scanner input. -1 is error. 
		try {
			return Integer.parseInt(in.nextLine());
		}catch(Exception e) {
			return -1;
		}
		
	}
	
	private static void doMenuText() {
		//Displays text options for menu
		//NOTE: choices are NOT final!
		System.out.println("What would you like to do?");
		System.out.println("1. Simulate Survivor Escape");
		System.out.println("2. Exit");

	}
	
	
	
	
	private static void doLogo() {
		//Displays logo for project.
		//leave indents as is, it should display fine in console window. 
		System.out.print(""
				+ 
				"        _____                   __    _         _       __          \n" + 
				"       /__  /  ____  ____ ___  / /_  (_)__     | |     / /___ ______\n" + 
				"         / /  / __ \\/ __ `__ \\/ __ \\/ / _ \\    | | /| / / __ `/ ___/\n" + 
				"        / /__/ /_/ / / / / / / /_/ / /  __/    | |/ |/ / /_/ / /    \n" + 
				"       /____/\\____/_/ /_/ /_/_.___/_/\\___/     |__/|__/\\__,_/_/   ");
	
		System.out.println("\n"+"\n");
		System.out.println(" ===== By Jacob Nesler, Eric Oliphant, and North Seelinger =====");
	}

}
