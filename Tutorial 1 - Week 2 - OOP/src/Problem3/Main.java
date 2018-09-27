package Problem3;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{		
		Scanner selectedCard = new Scanner(System.in);
		Card cardOfDeck[] = new Card[52];
		String cardPatterns[] = {"Hearts", "Tiles", "Clovers", "Pikes"};
		int numOfCars = 0;		
		
		int value = 0;
		
		for(int i = 0; i < 4; i++)
		{			
			for(int e = 0; e < 13; e++)
			{
				//cardOfDeck[numOfCars][];
				cardOfDeck[numOfCars] = new Card(cardPatterns[i], e); 
				numOfCars++; 
			}			
		}
		
		value = selectedCard.nextInt();
		System.out.println("First Random Number generated was " + value);
		cardOfDeck[value].setCard(true);
		
		for(int i = 0; i < cardOfDeck.length; i++)
		{
			cardOfDeck[i].displayCard();
		}
		
		selectedCard.close();
	}
}
