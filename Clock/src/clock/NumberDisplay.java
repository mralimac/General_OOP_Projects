package clock;

public class NumberDisplay 
{
	
	//Attributes Section
	private int hours;
	private int minutes;
	private int seconds;
	private boolean is12Hr;
	//End Attributes
	
	//Constructor Section
	public NumberDisplay()
	{
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
		this.is12Hr = false;
	}
	
	public NumberDisplay(boolean is12Hr)
	{
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
		this.is12Hr = is12Hr;
	}
	
	public NumberDisplay(int hours, int minutes)
	{
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = 0;
	}
	
	public NumberDisplay(int hours, int minutes, int seconds)
	{
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	//End Constructor
	
	//Method Section
	public void setHour(int hour)
	{
		this.hours = hour;
	}
	
	public void setMinute(int minute)
	{
		this.minutes = minute;
	}
	
	public void setSecond(int second)
	{
		this.seconds = second;
	}
	
	public int getHour()
	{
		return this.hours;
	}
	
	public int getMinute()
	{
		return this.minutes;
	}
	
	public int getSecond()
	{
		return this.seconds;
	}
	
	public int maximumHourAllowed()
	{
		if(this.is12Hr)
		{
			return 12;
		}
		else
		{
			return 24;
		}
	}
	
	public void set12Hr(boolean is12Hr)
	{
		this.is12Hr = is12Hr;
	}
	
	public void increment()
	{
		this.seconds++;
		if(this.seconds > 59)
		{
			this.seconds = 0;
			this.minutes++;
			if(this.minutes > 59)
			{
				this.minutes = 0;
				this.hours++;
			}if(this.hours > maximumHourAllowed())
			{
				this.hours = 0;
			}
		}
	}
	//End Method
}
