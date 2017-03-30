public class Money
{
	
	private String name;
	private double value;
	
	public Money()
	{
		 this.name = "";
		 this.value = 0;
	}
	public Money(String n, double v)
	{
		this.name = n;
		this.value = v;
		
	}
	public String toString()
	{
		return "Your" + name + "is worth S" + value + ".\n";
	}
}