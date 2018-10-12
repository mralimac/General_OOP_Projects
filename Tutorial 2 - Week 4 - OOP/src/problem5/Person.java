package problem5;

public class Person {
	private String personsName;
	protected String personsAddress;
	private int personsAge;
	
	public Person(String personsName, String personsAddress, int personsAge)	
	{
		this.personsName = personsName;
		this.personsAddress = personsAddress;
		this.personsAge = personsAge;
	}
	
	public String getPersonName()
	{
		return this.personsName;
	}
	
	public String getPersonAddress()
	{
		return this.personsAddress;
	}
	
	public int getPersonAge()
	{
		return this.personsAge;
	}
	
	public void changeAge(int newAge)
	{
		this.personsAge = newAge;
	}
	
	public void displayDetails()
	{
		System.out.println("Person's Name: " + this.personsName);
		System.out.println("Person's Address: " + this.personsAddress);
		System.out.println("Person's Age: " + this.personsAge);
	}
}
