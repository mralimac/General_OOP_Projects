package Problem1;

import java.util.Scanner;

public class Person
{
	String forename;
	String surname;
	String email;
	int age;
	String telNo;
	Scanner inputScanner = new Scanner(System.in);
	Person()
	{
		
		this.setForename();
		this.setSurname();
		this.setEmail();
		this.setAge();
		this.setTelNo();
		this.closeScanner(inputScanner);
	}
	
	Person(String forename, String surname)
	{
		this.forename = forename;
		this.surname = surname;		
	}
	
	Person(String forename, String surname, int age)
	{
		this.forename = forename;
		this.surname = surname;
		this.age = age;
	}
	
	public void displayPerson()
	{
		System.out.println(this.forename);
		System.out.println(this.surname);
		System.out.println(this.email);
		System.out.println(this.age);
		System.out.println(this.telNo);
	}
	
	public void setForename()
	{
		this.forename = inputScanner.next();		
	}
	
	public void setSurname()
	{		
		this.surname = inputScanner.next();
	}
	
	public void setEmail()
	{
		this.email = inputScanner.next();		
	}
	
	public void setAge()
	{
		age = inputScanner.nextInt();
		while(!checkAge(age))
		{
			System.out.println("this Person isn't old enough. Please reenter age");
			age = inputScanner.nextInt();
		}
		
	}
	
	public void setTelNo()
	{
		
		this.telNo = inputScanner.next();
		
	}
	
	public void closeScanner(Scanner inputScanner)
	{
		inputScanner.close();
	}
	
	private boolean checkAge(int age)
	{
		if(age>=18)
		{
		return true; 
		}
		else 
		{
		return false;
		}
	}
	
	
}
