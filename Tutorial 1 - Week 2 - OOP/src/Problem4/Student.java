package Problem4;

public class Student 
{
	private String studentNumber;
	private String studentName;	
	private Boolean result;
	
	Student()
	{
		this.studentNumber = "Unknown Student Number";
		this.studentName = "Unknown Student Name";
		
	}
	
	Student(String studentNumber, String studentName)
	{
		this.studentName = studentName;
		this.studentNumber = studentNumber;
	}	
		
	public void setResult(boolean result)
	{
		this.result = result;
	}
	
	public boolean getResult()
	{
		return this.result;
	}
	
	public String getName()
	{
		return this.studentName;
	}
	
	public String getNumber()
	{
		return this.studentNumber;
	}
	
	public void setName(String studentName)
	{
		this.studentName = studentName;
	}
	
	public void setNumber(String studentNumber)
	{
		this.studentNumber = studentNumber;
	}
		
	
	
}
