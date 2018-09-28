package clock;



public class Main
{	
	public static void main(String[] args) 
	{	
		UserInput userInterface = new UserInput();
		if(userInterface.useUserInput()){
			ClockDisplay clock = new ClockDisplay(userInterface.getHour(),userInterface.getMin(),userInterface.getSec(), userInterface.use12Hr());
			while(true)
			{
				System.out.println(clock.displayClock());
				clock.timeTick();
			}
		}
		else
		{
			ClockDisplay clock = new ClockDisplay();
			while(true)
			{
				System.out.println(clock.displayClock());
				clock.timeTick();
			}
		}
		
	}

}
