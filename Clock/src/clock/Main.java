package clock;



public class Main {
	
	public static void main(String[] args) {		
		ClockDisplay clock = new ClockDisplay(true);
		while(true)
		{
			System.out.println(clock.displayClock());
			clock.timeTick();
		}
	}

}
