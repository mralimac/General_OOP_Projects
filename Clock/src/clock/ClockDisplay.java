package clock;

public class ClockDisplay
{
	//Attributes Section	
	private NumberDisplay numberDisplay1;
	//End Attributes
	
	//Constructors Section
	public ClockDisplay()
	{		
		
		this.numberDisplay1 = new NumberDisplay();
	}
	
	public ClockDisplay(boolean is12hr) 
	{

		this.numberDisplay1 = new NumberDisplay(true);
	}
	//End Constructors
	
	//Method Section
	public String displayClock()
	{
		return stringFormatter(numberDisplay1.getHour()) + ":"
				+ stringFormatter(numberDisplay1.getMinute()) + ":"
				+ stringFormatter(numberDisplay1.getSecond());
	}
	
	public String stringFormatter(int inputNumber)
	{
		String format = String.format("%%0%dd", 2);
		return String.format(format, inputNumber);
	}
	
	
	public void timeTick()
	{
		numberDisplay1.increment();
	}
	
	//End Methods
}
