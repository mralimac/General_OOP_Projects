package Problem4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<Subject> subjects = new ArrayList<Subject>();
	Scanner inputScanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Menu menu = new Menu();
		Student student1 = menu.createNewStudent();
		Subject subject1 = menu.createNewSubject();
		subject1.addToClass(student1);
		subject1.displayClass();		
	}
	
	public int getInt()
	{
		return inputScanner.nextInt();
	}

}
