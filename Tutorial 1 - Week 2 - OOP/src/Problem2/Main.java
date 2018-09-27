package Problem2;

import java.util.Scanner;

public class Main 
{
	
	
	public static void main(String[] args) 
	{
		//This program displays a simple menu where it asks the user to draw a circle, a rectangle or to just exit the program
		//If the Rectangle option is picked, the program will further ask for the width and height of the rectangle
		//If the Circle option is picked, the program will only ask for the radius
		//The program will then do further math to work out the area, and in the case of rectangle, determine if its a square
		//Then the program will display the stats before returning back to the main menu
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Please select an option. 1 - Rectangle | 2 - Circle | 3 - Exit");
		int option = inputScanner.nextInt();
		while(option != 3)
		{
			switch(option) 
			{
				case 1: getRect();
				break;
				case 2: getCircle();
				break;
				case 3: break;				
			}
			System.out.println("Please select an option. 1 - Rectangle | 2 - Circle | 3 - Exit");
			option = inputScanner.nextInt();
		}
		System.out.println("Exiting...");
		inputScanner.close();
	}
	
	public static void getRect()
	{
		Rectangle rect = new Rectangle();
		rect.displayAll();
	}

	public static void getCircle()
	{
		Circle cir = new Circle();
		cir.displayAll();
	}	
}
