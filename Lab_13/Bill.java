public class Bill extends Money
{
	
	private String face;
	
	
	public Bill()
	{
		super();
		face = "";
		
		
	}
	public Bill(String n, String f, double v)
	{
		super(n,v);
		face = f;
		
		
	}
	public String toString()
	{
		return "face" + face + "\n"+
			super.toString();
	}
	
}