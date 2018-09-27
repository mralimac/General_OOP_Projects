package Problem4;

import java.util.Scanner;

public class Menu 
{
	Scanner inputScanner = new Scanner(System.in);
	Menu()
	{
		System.out.println("Please select an option");
		System.out.println("1 - Create new Student");
		System.out.println("2 - Create new Subject");
		System.out.println("3 - Get Student Record");
		System.out.println("4 - Get students in subject");
		System.out.println("5 - Change Student's name");
		System.out.println("6 - Add Student to Subject");
		System.out.println("7 - Remove Student from Subject");
		System.out.println("8 - Exit Program");		
	}	
	
	public int dialogOption()
	{
		return inputScanner.nextInt();
	}
	
	public Student createNewStudent()
	{
		return new Student(this.setStudentNumber(), this.setStudentName());
	}
	
	public Subject createNewSubject()
	{
		return new Subject(this.setCourseName());
	}
	
	public String setStudentName()
	{
		System.out.println("Please Enter Student Name");	
		return inputScanner.next();
	}
	
	public String setStudentNumber() 
	{
		System.out.println("Please Enter Student Number");
		return inputScanner.next();
	}
	
	public String setCourseName()
	{
		System.out.println("Please Enter course name");
		return inputScanner.next(); 
	}
	
	

}
