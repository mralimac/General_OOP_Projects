package problem5;

public class Student extends Person
{
	private int martiNumber;
	private String courseTitle;
	
	public Student(String personsName, String personsAddress, int personsAge, int martiNumber, String courseTitle)
	{
		super(personsName, personsAddress, personsAge);
		this.martiNumber = martiNumber;
		this.courseTitle = courseTitle;		
	}

	public void changeAddress(String newAddress)
	{
		personsAddress = newAddress;
	}
	
	public void changeCourse(String newCourse)
	{
		this.courseTitle = newCourse;
	}
}
