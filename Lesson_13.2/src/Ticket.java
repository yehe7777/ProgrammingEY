public abstract class Ticket
{
	public int serialNum;
	
	public double price;
	
	public Ticket()
	{
		serialNum = (int)(Math.random() * 10000000) + 1;
	}
	
	public int getSerialNum()
	{
		return serialNum;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return " Serial #: " + serialNum + "\n price: " + getPrice();
	}
}
