package Problem4;

import java.util.ArrayList;

public class Subject
{
	String subjectName;
	ArrayList<Student> membersOfClass = new ArrayList<Student>();
	Subject(String subjectName)
	{
		this.subjectName = subjectName;
	}
	
	public void displayClass()
	{
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		for(int i = 0; i < membersOfClass.size(); i++)
		{
			System.out.println("Student Name: " + membersOfClass.get(i).getName());
			System.out.println("Student number: " + membersOfClass.get(i).getNumber());
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}
	}
	
	public void removeFromClass(Student studentObject)
	{
		this.membersOfClass.remove(studentObject);
	}
	
	public void addToClass(Student studentObject)
	{
		this.membersOfClass.add(studentObject);
	}
}
