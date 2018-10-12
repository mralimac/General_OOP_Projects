package problem3;

public class Stock
{	
	private long stockNumber;
	private String stockDescription;
	private int amountInStock;	
	
	public Stock(long stockNumber, String stockDesc, int stockAmount)
	{
		this.stockNumber = stockNumber;
		this.stockDescription = stockDesc;
		this.amountInStock = stockAmount;
	}
	
	
	public int displayAmountInStock()
	{
		return this.amountInStock;
	}
	
	public void displayAllDetails()
	{
		System.out.println("Stock Number: "+stockNumber);
		System.out.println("Stock Desc: "+stockDescription);
		System.out.println("Stock Amount: "+amountInStock);
	}
	
	public void updateStockAmount(int amountChanged, boolean removing)
	{
		if(removing)
		{
			if(this.amountInStock > amountChanged)
			{
				this.amountInStock = this.amountInStock - amountChanged;
			}
			else
			{
				System.out.println("Cannot update stock");
			}	
		}
		else
		{
			this.amountInStock = this.amountInStock + amountChanged;
		}
	}
}
