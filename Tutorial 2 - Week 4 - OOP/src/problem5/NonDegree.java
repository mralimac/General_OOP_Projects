package problem5;

public class NonDegree extends Student
{
	private String levelOfStudy;
	private String courseSuperName;
		
	public NonDegree(String personsName, String personsAddress, int personsAge, int martiNumber, String courseTitle, String levelOfStudy, String supervisorName) 
	{
		super(personsName, personsAddress, personsAge, martiNumber, courseTitle);
		this.levelOfStudy = levelOfStudy;
		this.courseSuperName = supervisorName;
	}
	
}
