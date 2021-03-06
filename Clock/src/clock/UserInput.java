package clock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput
{
	//Attributes Section
	Scanner inputScanner = new Scanner(System.in);
	//End Attributes
	
	//Constructor Section
	
	//A non-constructor just to make the object non-static
	public UserInput()
	{
		
	}
	//End Constructor
	
	//Method Section
	
	//This method gets the hour to start the clock at
	public int getHour()
	{
		System.out.println("Which hour to start at?");
		while(true)
		{
			try
			{
				return inputScanner.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Not a valid number, please try again");
			}
		}
				
	}
	
	//This method asks if the user wishes to use userinput to set the clocks time
	public boolean useUserInput()
	{
		System.out.println("Do you wish to use User Input? y/n");
		if(inputScanner.next().equals("y"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//This method asks if the user wants to use 12hr time or not
	public boolean use12Hr()
	{
		System.out.println("Do you wish to use 12 Hour time? y/n");
		if(inputScanner.next().equals("y"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//This method asks the user for which minute to start at	
	public int getMin()
	{
		System.out.println("Which minute to start at?");
		while(true)
		{
			try
			{
				return Integer.parseInt(inputScanner.next());
			}
			catch(NumberFormatException e)
			{
				System.out.println("Not a valid number, please try again");
				
			}
		}
	}
	
	//This method asks the user for which second to start at
	public int getSec()
	{
		System.out.println("Which second to start at?");
		while(true)
		{
			try
			{
				return Integer.parseInt(inputScanner.next());
			}
			catch(NumberFormatException e)
			{
				System.out.println("Not a valid number, please try again");
			}
		}
	}
	//End Method
	
}
