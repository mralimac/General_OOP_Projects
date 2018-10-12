package problem5;

public class Degree extends Student
{
	private int yearOfStudy;
	private String tutorName;

	public Degree(String personsName, String personsAddress, int personsAge, int martiNumber, String courseTitle,int yearOfStudy, String tutorName)
	{
		super(personsName, personsAddress, personsAge, martiNumber, courseTitle);
		this.yearOfStudy = yearOfStudy;
		this.tutorName = tutorName;
	}

}
