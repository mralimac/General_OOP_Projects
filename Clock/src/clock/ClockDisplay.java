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
	
	public ClockDisplay(int hour, int min)
	{
		this.numberDisplay1 = new NumberDisplay(hour, min);
	}
	
	public ClockDisplay(int hour, int min, int second)
	{
		this.numberDisplay1 = new NumberDisplay(hour, min, second);
	}
	
	public ClockDisplay(int hour, int min, boolean is12Hr)
	{
		this.numberDisplay1 = new NumberDisplay(hour, min, is12Hr);
	}
	
	public ClockDisplay(int hour, int min, int second, boolean is12Hr)
	{
		this.numberDisplay1 = new NumberDisplay(hour, min, second, is12Hr);
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
