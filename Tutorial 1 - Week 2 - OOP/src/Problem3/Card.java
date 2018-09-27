package Problem3;

public class Card 
{
	private String pattern;
	private int value;
	private boolean drawn;
	
	Card(String pattern, int value)
	{
		this.pattern = pattern;
		this.value = value;
		this.drawn = false;
		
	}
	
	public void displayCard()
	{
		System.out.print("Card drawn was " + this.value + " of " + this.pattern);
		if(!this.drawn)
		{
			System.out.println( " and has not been picked");
		}
		else
		{
			System.out.println( " and has been picked");
		}	
	}
	
	public boolean returnCard()
	{
		return(this.drawn);
	}
	
	public void setCard(boolean setCard)
	{
		this.drawn = setCard;
	}
}
