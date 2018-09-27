package Problem2;

import java.util.Scanner;

public class Rectangle
{
	int width;
	int height;
	Scanner inputScanner = new Scanner(System.in);
	Rectangle()
	{
		this.setWidth();
		this.setHeight();
	}
	
	public void setWidth()
	{
		System.out.println("Please Enter Width");
		this.width = inputScanner.nextInt();
	}
	
	public void setHeight()
	{
		System.out.println("Please Enter Height");
		this.height = inputScanner.nextInt();		
	}
	
	public int calculateArea()
	{
		return this.width * this.height;
	}
	
	public boolean isSquare()
	{
		if(this.width == this.height)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void displayAll()
	{
		System.out.println("Width: " + this.width);
		System.out.println("Height: " + this.height);
		System.out.println("Area: " + calculateArea());
		System.out.println("Square?: " + isSquare());
	}
}
