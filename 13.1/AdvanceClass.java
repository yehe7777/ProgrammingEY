public abstract class AdvanceClass extends Ticket
{
	public int daysleft;
	
	public AdvanceClass()
	{
		super();
	}
	
	public AdvanceClass(int d)
	{
		super();
		daysleft = d;
	}
	
	public double getprice()
	{
		if(daysleft >= 10)
		{
			return 30;
		}
		else
		{
			return 40;
		}
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}