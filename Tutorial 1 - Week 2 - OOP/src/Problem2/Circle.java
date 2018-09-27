package Problem2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle 
{
	DecimalFormat df = new DecimalFormat("#.##");
	double radius;
	Scanner inputScanner = new Scanner(System.in);
	
	Circle()
	{
		this.getRadius();
	}
	
	public void getRadius()
	{
		System.out.println("Please Enter Radius");
		this.radius = inputScanner.nextDouble();
	}
	
	public double calculateArea()
	{
		return (Math.PI*(this.radius*this.radius));
	}
	
	public void displayAll()
	{
		System.out.println("Radius: " + radius);
		System.out.println("Area: " + calculateArea());
	}
}
