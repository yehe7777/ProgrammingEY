public abstract class TheToyClass
{
	private String name;
	private int count;
	
	public TheToyClass()
	{
		this.name="";
		this.count= 1;
	}
	
	public TheToyClass(String n)
	{
		this.name= n;
		this.count= 1;
	}
	
	public abstract String getType();
	
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public String setName(String n)
	{
		
		return this.name= n;
	}
	
	public int setCount(int c)
	{
				return this.count=c;
	}
	
	public String toString()
	{
		return "" + name+  count ;
	}
}