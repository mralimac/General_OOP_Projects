package clock;



public class Main
{	
	public static void main(String[] args) 
	{	
		//userInterface is an object that is used to mostly gather user input in regards to the clock time		
		UserInput userInterface = new UserInput();
				
		if(userInterface.useUserInput()){
			
			//This generates a new clock with parameters
			ClockDisplay clock = new ClockDisplay(userInterface.getHour(),userInterface.getMin(),userInterface.getSec(), userInterface.use12Hr());
			while(true)
			{
				//Once the clock has been created, these two lines will display the time in console
				//and then tick the clock on to the next second
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
