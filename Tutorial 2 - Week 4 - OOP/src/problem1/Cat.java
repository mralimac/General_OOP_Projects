package problem1;
import java.io.*;

public class Cat
{	
	private String catName;
	private String catBreed;
	private int catAge;
	
	public Cat(String catName, String catBreed, int catAge)
	{
		getCatDetails(catName, catBreed, catAge);
	}
	public void getCatDetails(String catName, String catBreed, int catAge)
	{
		this.catName = catName;
		this.catBreed = catBreed;
		this.catAge = catAge;
	}
	
	public void displayDetails() throws IOException
	{
		System.out.println("Cats name is : "+this.catName);
		System.out.println("Cats breed is : "+this.catBreed);
		System.out.println("Cats age is : "+this.catAge);

	}

}
