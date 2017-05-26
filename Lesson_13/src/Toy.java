public abstract class Toy
{
	private String name;
	private int count;
	
	public Toy()
	{
		this.name = " ";
		this.count = 1;
	}
	
	public Toy(String n)
	{
		this.name = n;
		this.count = 1;
		
	}
	
	public abstract String getType();
	
	public void setname(String n)
	{
		this.name = n;
	}
	
	public String getname()
	{
		return this.name;
	}
	
	public void setcount(int c)
	{
		this.count = c;
	}
	
	public int getcount()
	{
		return this.count;
	}
	
	public String toString()
	{
			return this.name + ": " + this.count;
	}
	
}